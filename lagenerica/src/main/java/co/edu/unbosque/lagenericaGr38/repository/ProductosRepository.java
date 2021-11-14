package co.edu.unbosque.lagenericaGr38.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.lagenericaGr38.model.Producto;

public interface ProductosRepository extends MongoRepository<Producto, String>{

	List<Producto> findByCodigo(String codigo);
	
}
