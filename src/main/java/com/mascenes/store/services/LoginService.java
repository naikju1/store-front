package com.mascenes.store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mascenes.store.repository.UsersRepo;
import com.mascenes.store.model.Users;

@Service
@Transactional
public class LoginService {
    @Autowired
    private UsersRepo repo;

    public List<Users> listAll() {
        return repo.findAll();
    }

    public void save(Users user) {
        repo.save(user);
    }

    public Users userAuthentication(String username, String Password) {
            Users loginUser = repo.findByUserName(username);
            if(loginUser == null) {throw new RuntimeException("User doesn't exist");}
            if(!loginUser.getPassword().equals(Password)){
                throw new RuntimeException("Password doesn't match");
            }
        return loginUser;
    }

    public Users get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
