
package lv.marmog.rocketshop.ecommerce.controller;

import com.sun.istack.NotNull;
import lv.marmog.rocketshop.ecommerce.model.Order;
import lv.marmog.rocketshop.ecommerce.model.Product;
import lv.marmog.rocketshop.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/api/products")
    public class ProductController {

        private ProductService productService;

        public ProductController(ProductService productService) {
            this.productService = productService;
        }

        @GetMapping(value = { "", "/" })
        public @NotNull Iterable<Product> getProducts() {
            return productService.getAllProducts();
        }
    }