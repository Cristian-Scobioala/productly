package gr.eshop.productly.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

        /**
         * Product's id.
         */
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        /**
         * Product's name.
         */
        private String name;

        /**
         * Product's description.
         */
        private String description;

        /**
         * Product's price.
         */
        private double price;

        /**
         * Default constructor declaration.
         */
        public Product() {
        }

        /**
         * Core constructor.
         * 
         * @param name        The name of the product
         * @param description A short description of the product
         * @param price       The price of the product
         * 
         */
        public Product(String name, String description, double price) {
                this.name = name;
                this.description = description;
                this.price = price;
        }

        /**
         * Gets the id of the product.
         * 
         * @return The product id.
         */
        public Long getId() {
                return id;
        }

        /**
         * Sets the id of the product.
         * 
         * @param id product's id
         */
        public void setId(Long id) {
                this.id = id;
        }

        /**
         * Gets the product's name.
         * 
         * @return product's name
         */
        public String getName() {
                return name;
        }

        /**
         * Sets the name of the product.
         * 
         * @param name
         */
        public void setName(String name) {
                this.name = name;
        }

        /**
         * Gets the product description.
         * 
         * @return product's description
         */
        public String getDescription() {
                return description;
        }

        /**
         * Sets the product description.
         * 
         * @param description product's description
         */
        public void setDescription(String description) {
                this.description = description;
        }

        /**
         * Gets the product's price.
         * 
         * @return product's price
         */
        public double getPrice() {
                return price;
        }

        /**
         * Sets product's price.
         * 
         * @param price product's price
         */
        public void setPrice(double price) {
                this.price = price;
        }
}
