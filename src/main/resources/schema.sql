
CREATE DATABASE IF NOT EXISTS storefront;

USE storefront;

DROP TABLE IF EXISTS Users;

CREATE TABLE Users (
                       id BIGINT AUTO_INCREMENT,
                       userName VARCHAR(250) NOT NULL,
                       password VARCHAR(250) NOT NULL,
                       role char(1)  NOT NULL,
                       PRIMARY KEY(id)
);

DROP TABLE IF EXISTS Products;

CREATE TABLE Products (
                          productID BIGINT AUTO_INCREMENT,
                          title VARCHAR(150) NOT NULL,
                          color VARCHAR(100) NOT NULL,
                          barCodeNumber VARCHAR(250) NOT NULL,
                          size VARCHAR(10) NOT NULL,
                          stock INT NOT NULL,
                          price DECIMAL NOT NULL,
                          description VARCHAR(250) NOT NULL,
                          reason VARCHAR(250) DEFAULT NULL,
                          PRIMARY KEY(productID)
);

DROP TABLE IF EXISTS Order;

CREATE TABLE Order (
                          orderID BIGINT AUTO_INCREMENT,
                          orderDate DATE NOT NULL,
                          grandTotal DECIMAL NOT NULL,
                          PRIMARY KEY(orderID)
);

DROP TABLE IF EXISTS OrderDetails;

CREATE TABLE OrderDetails (
                       orderDetailID BIGINT AUTO_INCREMENT,
                       orderID BIGINT NOT NULL,
                       productID BIGINT NOT NULL,
                       itemTotal DECIMAL NOT NULL,
                       PRIMARY KEY(orderDetailID),
                       FOREIGN KEY (orderID) REFERENCES Order(orderID),
                       FOREIGN KEY (productID) REFERENCES Products(productID)
);
