package com.example.project;
abstract class Product {
        protected String warranty;
        protected String price;
        protected String model;
        protected String brand;

        public Product(String warranty, String price, String model, String brand) {
            this.warranty = warranty;
            this.price = price;
            this.model = model;
            this.brand = brand;
        }

        public String getWarranty() {
            return warranty;
        }

        public String getPrice() {
            return price;
        }

        public String getModel() {
            return model;
        }

        public String getBrand() {
            return brand;
        }
        abstract String specs();
        abstract String getData();

        public Product() {}
}


