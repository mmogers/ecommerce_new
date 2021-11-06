
package lv.marmog.rocketshop.ecommerce.service;

import lv.marmog.rocketshop.ecommerce.exception.ResourceNotFoundException;
import lv.marmog.rocketshop.ecommerce.model.Order;
import lv.marmog.rocketshop.ecommerce.model.Product;
import lv.marmog.rocketshop.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}