package com.miles.service.imp;

import com.miles.dto.SpecialtyDTO;
import com.miles.entity.Specialty;
import com.miles.repository.ISpecialtyRepository;
import com.miles.service.interfaces.ISpecialtyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service    // <-- Le ponemos la Anotacion para indicar que es un servicio
public class SpecialtyServiceImpl implements ISpecialtyService {

    @Autowired
    private ISpecialtyRepository specialtyRepository; /* <-- Inyectamos el repositorio de Specialty (Se usa la clase
    ISpecialtyRepository la cual HEREDA de JpaRepository y asi podemos acceder a los metodos de CRUD ) */
    @Autowired
    private ModelMapper modelMapper; /* <-- Inyectamos el ModelMapper para poder mapear los objetos de Specialty a SpecialtyDTO
    (Convertir los tipos de datos de una clase a otra) */

    @Override
    public List<SpecialtyDTO> findAll() {

        return specialtyRepository.findAll()
                .stream() //  convierte esta lista en un flujo de datos.
                .map(specialty -> modelMapper.map(specialty, SpecialtyDTO.class)) /* aplica una transformación a cada entidad
        Specialty en el flujo, convirtiéndola en un SpecialtyDTO usando ModelMapper. */
                .collect(Collectors.toList()); /*  aplica una transformación a cada entidad Specialty en el flujo, convirtiéndola
                en un SpecialtyDTO usando ModelMapper. */
    }

    @Override
    public SpecialtyDTO findById(long id) {

        Optional<Specialty> specialty = specialtyRepository.findById(id);

        //Si la especialidad existe, la convierte en un SpecialtyDTO y la devuelve.
        if(specialty.isPresent()){
            Specialty currentSpecialty = specialty.get();
            return modelMapper.map(currentSpecialty, SpecialtyDTO.class); //Convierte la entidad currentSpecialty en un SpecialtyDTO.
        }

        return new SpecialtyDTO();
    }


    public SpecialtyDTO findByName(String name) {

        // Recupera una lista de especialidades con el nombre dado del repositorio.
       List<Specialty> specialties = specialtyRepository.findByName(name);

        // Si la lista de especialidades no está vacía, mapea la primera especialidad a un SpecialtyDTO y la devuelve.
         if(!specialties.isEmpty()){
            Specialty currentSpecialty = specialties.stream().toList().get(0);
            return modelMapper.map(currentSpecialty, SpecialtyDTO.class);
        }
        // Si no se encuentran especialidades, devuelve un SpecialtyDTO vacío.
        return new SpecialtyDTO();
    }


    @Override
    public SpecialtyDTO save(SpecialtyDTO specialtyDTO) {

        try {
           Specialty specialty = modelMapper.map(specialtyDTO, Specialty.class); //Convierte el SpecialtyDTO en una entidad Specialty.
              specialty = specialtyRepository.save(specialty); //Guarda la entidad Specialty en el repositorio.
            return modelMapper.map(specialty, SpecialtyDTO.class); //Convierte la entidad Specialty en un SpecialtyDTO y la devuelve.

        }catch (Exception e){
            throw new UnsupportedOperationException("Could not save the specialty.");
        }
    }

    @Override
    public SpecialtyDTO update(SpecialtyDTO specialtyDTO, long id) {

       Optional<Specialty> specialty = specialtyRepository.findById(id); //Busca la especialidad en el repositorio.
        if (specialty.isPresent()){

        }


        return null;
    }

    @Override
    public String delete(long id) {
        return null;
    }
}
