package gr.eshop.productly.controller;

import gr.eshop.productly.model.Product;
import gr.eshop.productly.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/products")
public class ProductController {

        /**
         * Product repository.
         */
        @Autowired
        private ProductRepository productRepository;

        /**
         * Shows all products.
         * 
         * @param model
         * @return products
         */
        @GetMapping
        public String showProducts(Model model) {
                model.addAttribute("products", productRepository.findAll());
                return "products";
        }

        /**
         * Shows form to add a product.
         * 
         * @param model 
         * @return view containing the form for adding a product
         */
        @GetMapping("/add")
        public String showAddForm(Model model) {
                model.addAttribute("product", new Product());
                return "add-product";
        }

        /**
         * Processes adding a product.
         * 
         * @param product
         * @return redirection after adding the product.
         */
        @PostMapping("/add")
        public String addProduct(@ModelAttribute Product product) {
                productRepository.save(product);
                return "redirect:/products";
        }

        /**
         * Shows edit form to edit a product.
         * 
         * @param id
         * @param model
         * @return view of the edit form for editing the product.
         */
        @GetMapping("/edit/{id}")
        public String showEditForm(@PathVariable Long id, Model model) {
                Product product = productRepository.findById(id)
                                .orElseThrow(() -> new IllegalArgumentException("Invalid product ID"));
                model.addAttribute("product", product);
                return "edit-product";
        }

        /**
         * Processes editing a product.
         * 
         * @param id
         * @param product
         * @return redirection after editing the product.
         */
        @PostMapping("/edit/{id}")
        public String editProduct(@PathVariable Long id, @ModelAttribute Product product) {
                product.setId(id);
                productRepository.save(product);
                return "redirect:/products";
        }

        /**
         * Deletes a product.
         * 
         * @param id
         * @return redirection after deleting the product.
         */
        @GetMapping("/delete/{id}")
        public String deleteProduct(@PathVariable Long id) {
                productRepository.deleteById(id);
                return "redirect:/products";
        }
}
