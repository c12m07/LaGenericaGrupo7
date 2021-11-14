package co.edu.unbosque.lagenericaGr38.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.lagenericaGr38.model.Proveedores;

public interface ProveedoresRepository extends MongoRepository<Proveedores, String>{
	
	List<Proveedores> findByNit(String nit);
	
}
