package co.grandcircus.springlab;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel,String>{
    List<Hotel> findAll();
}
