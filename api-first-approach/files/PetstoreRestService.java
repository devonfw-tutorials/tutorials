package com.devonfw.quarkus.petstore.rest.v1;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import com.devonfw.quarkus.openapi.petstore.domain.Pet;
import com.devonfw.quarkus.openapi.petstore.rest.v1.PetsApi;

public class PetstoreRestService implements PetsApi {

  private Set<Pet> pets = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

  @Override
  public void createPets(@Valid Pet pet) {

    pet.setId(Long.valueOf(this.pets.size()));
    this.pets.add(pet);
  }

  @Override
  public List<Pet> listPets(Integer limit) {

    if (limit == null)
      return this.pets.stream().collect(Collectors.toList());
    return this.pets.stream().limit(limit).collect(Collectors.toList());
  }

  @Override
  public Pet showPetById(String petId) {

    List<Pet> petList = this.pets.stream().filter(pet -> pet.getId() == Long.valueOf(petId))
        .collect(Collectors.toList());
    if (petList.size() == 0)
      return null;
    return petList.get(0);
  }

}
