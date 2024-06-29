package com.miles.service.interfaces;

//Esta interfaz es para definir los servicios que voy a ofrecer en mi aplicacion (En este caso para Specialty)
//Service: Contiene la lógica de negocio de la aplicación. Utiliza repositorios para interactuar con la base de datos.
import com.miles.dto.SpecialtyDTO;

import java.util.List;

public interface ISpecialtyService {

    List<SpecialtyDTO> findAll();
    SpecialtyDTO findById(long id);

    SpecialtyDTO save(SpecialtyDTO specialtyDTO);
    SpecialtyDTO update(SpecialtyDTO specialtyDTO, long id);
    String delete(long id);
}
