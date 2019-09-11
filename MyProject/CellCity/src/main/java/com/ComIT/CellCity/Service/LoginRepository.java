package com.ComIT.CellCity.Service;

import com.ComIT.CellCity.Model.Person;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Person, Long> {
}
