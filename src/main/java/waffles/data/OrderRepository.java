package waffles.data;

import org.springframework.data.repository.CrudRepository;

import waffles.Order;

public interface OrderRepository 
         extends CrudRepository<Order, Long> {

}
