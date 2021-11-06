package lv.marmog.rocketshop.ecommerce.repository;

import lv.marmog.rocketshop.ecommerce.model.OrderProduct;
import lv.marmog.rocketshop.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}