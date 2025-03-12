package gr.eshop.productly;

import gr.eshop.productly.model.Product;
import gr.eshop.productly.repository.ProductRepository;
import gr.eshop.productly.controller.ProductController;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class ProductControllerTest {

    private MockMvc mockMvc;

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductController productController;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
    }

    @Test
    void testShowAddForm() throws Exception {
        mockMvc.perform(get("/products/add"))
                .andExpect(status().isOk())
                .andExpect(view().name("add-product"))
                .andExpect(model().attributeExists("products"));
    }

    @Test
    void testAddProduct() throws Exception {
        when(productRepository.save(any(Product.class))).thenReturn(new Product("Product3", "Description3", 30.0));

        mockMvc.perform(post("/products/add")
                .param("name", "Product3")
                .param("description", "Description3")
                .param("price", "30.0"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/products"));
    }

    @Test
    void testShowEditForm() throws Exception {
        Product product = new Product("Product1", "Description1", 10.0);
        product.setId(1L);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        mockMvc.perform(get("/products/edit/1"))
                .andExpect(status().isOk())
                .andExpect(view().name("edit-product"))
                .andExpect(model().attributeExists("product"));
    }

    @Test
    void testEditProduct() throws Exception {
        Product product = new Product("Product1", "Description1", 10.0);
        product.setId(1L);
        when(productRepository.save(any(Product.class))).thenReturn(product);

        mockMvc.perform(post("/products/edit/1")
                .param("name", "UpdatedProduct")
                .param("description", "UpdatedDescription")
                .param("price", "15.0"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/products"));
    }

    @Test
    void testDeleteProduct() throws Exception {
        mockMvc.perform(get("/products/delete/1"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/products"));

        Mockito.verify(productRepository).deleteById(1L);
    }
}
