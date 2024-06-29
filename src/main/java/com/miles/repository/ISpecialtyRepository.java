package com.miles.repository;

import com.miles.entity.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/* La interfaz IEspecialtyRepository extiende de JpaRepository, que es una interfaz de Spring Data JPA que nos proporciona
 métodos para realizar operaciones CRUD en la base de datos. (Proporcionamos Specialty como tipo de entidad y Long como tipo de ID) */
public interface ISpecialtyRepository extends JpaRepository<Specialty, Long>{
  List <Specialty> findByName(String name);


}
