package com.ComIT.CellCity.Service;

import com.ComIT.CellCity.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    private LoginRepository loginRepository;

    @Autowired
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public void savePerson (Person person) {
        loginRepository.save(person);
    }

    public Optional<Person> findPersonByID(Long id) {
        return loginRepository.findById(id);
    }
}
