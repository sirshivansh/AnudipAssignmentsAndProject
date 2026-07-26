-- Online Food Plaza Database Schema

CREATE DATABASE IF NOT EXISTS online_food_plaza;
USE online_food_plaza;

-- Table for User details
CREATE TABLE IF NOT EXISTS tbl_user (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL
);

-- Table for Food items
CREATE TABLE IF NOT EXISTS tbl_food (
    food_id INT AUTO_INCREMENT PRIMARY KEY,
    food_name VARCHAR(100) NOT NULL,
    food_type VARCHAR(20) NOT NULL, -- Veg / Non-Veg
    category VARCHAR(50) NOT NULL, -- Starter, Main Course, Dessert, Beverage, etc.
    price DOUBLE NOT NULL
);

-- Table for Cart items
CREATE TABLE IF NOT EXISTS tbl_cart (
    cart_id INT AUTO_INCREMENT PRIMARY KEY,
    food_id INT NOT NULL,
    user_email VARCHAR(100) NOT NULL,
    quantity INT NOT NULL DEFAULT 1,
    FOREIGN KEY (food_id) REFERENCES tbl_food(food_id) ON DELETE CASCADE,
    FOREIGN KEY (user_email) REFERENCES tbl_user(email) ON DELETE CASCADE
);

-- Table for Orders
CREATE TABLE IF NOT EXISTS tbl_order (
    order_id INT AUTO_INCREMENT PRIMARY KEY,
    user_email VARCHAR(100) NOT NULL,
    total_amount DOUBLE NOT NULL,
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    order_status VARCHAR(30) DEFAULT 'PLACED',
    FOREIGN KEY (user_email) REFERENCES tbl_user(email) ON DELETE CASCADE
);

-- Sample Initial Data
INSERT INTO tbl_user (first_name, last_name, email, password) 
VALUES ('John', 'Doe', 'user@gmail.com', '123')
ON DUPLICATE KEY UPDATE email=email;

INSERT INTO tbl_food (food_name, food_type, category, price) VALUES
('Paneer Butter Masala', 'Veg', 'Main Course', 250.00),
('Chicken Biryani', 'Non-Veg', 'Main Course', 320.00),
('Veg Spring Rolls', 'Veg', 'Starter', 180.00),
('Gulab Jamun', 'Veg', 'Dessert', 90.00),
('Mango Lassi', 'Veg', 'Beverage', 70.00);
