/*
package com.mascenes.store;

import com.mascenes.store.repository.ProductsRepo;
import com.mascenes.store.repository.UsersRepo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SqlGroup({
        @Sql(scripts = "/schema-mysql.sql",
                config = @SqlConfig(transactionMode = SqlConfig.TransactionMode.ISOLATED)),
        @Sql("/data-mysql.sql")})
public class StoreApplicationInitialLoadIntegrationTest {

    @Autowired
     private UsersRepo users;
    @Autowired
    private ProductsRepo product;

    @Test
    public void testLoadDataForUserClass()
    {   //check if table Users has 3 rows in it
        assertEquals(3,users.findAll().size());
    }
    @Test
    public void testLoadDataForProductClass()
    {   //check if table product has 12 rows in it
        assertEquals(12,product.findAll().size());
    }

*/