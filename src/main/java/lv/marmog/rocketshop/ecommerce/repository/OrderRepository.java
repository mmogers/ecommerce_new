package lv.marmog.rocketshop.ecommerce.repository;

import lv.marmog.rocketshop.ecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
