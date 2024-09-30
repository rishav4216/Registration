package com.api.controller;

import com.api.entity.Registration;
import com.api.payload.RegistrationDto;
import com.api.service.RegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/registration")
public class RegistrationController {
    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping
    public ResponseEntity<List<RegistrationDto>> getAllRegistrations(){
//    public List<RegistrationDto> getAllRegistrations() {

        List<RegistrationDto> registrations = registrationService.getRegistrations();
        return new ResponseEntity<>(registrations,HttpStatus.OK);
//return new ResponseEntity<>(registration,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<RegistrationDto> createRegistration(
            @RequestBody RegistrationDto registrationDto
    ){
        RegistrationDto regDto = registrationService.createRegistration(registrationDto);
//       return reg;
        return new ResponseEntity<>(regDto, HttpStatus.CREATED);
    }




    @DeleteMapping
    public ResponseEntity<String> deleteRegistration(
           @RequestParam long id
    ){
    registrationService.deleteRegistration(id);
    return new ResponseEntity<>("Deleted" ,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Registration>updateRegistration(
            @PathVariable long id,
            @RequestBody Registration registration
    )
    {
    Registration updateReg=registrationService.updateRegistration(id,registration);
    return new ResponseEntity<>(updateReg,HttpStatus.OK);
    }

    @GetMapping("/{id}")
        public ResponseEntity<RegistrationDto> getRegistrationById(
                @PathVariable long id
        ){
           RegistrationDto dto= registrationService.getRegistrationById(id);
            return new ResponseEntity<>(dto,HttpStatus.OK);
    }
}
//http://localhost:8090/api/v1/registration