package waffles.data;

import org.springframework.data.repository.CrudRepository;

import waffles.Waffle;

public interface WaffleRepository 
         extends CrudRepository<Waffle, Long> {

}
