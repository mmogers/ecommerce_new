package lv.marmog.rocketshop.ecommerce.repository;

import lv.marmog.rocketshop.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}