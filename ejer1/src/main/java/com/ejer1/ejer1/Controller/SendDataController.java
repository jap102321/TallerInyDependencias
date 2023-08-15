package com.ejer1.ejer1.Controller;

import com.ejer1.ejer1.Service.SendDataService;
import com.ejer1.ejer1.exceptions.InvalidContactException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/")
public class SendDataController {

    @Autowired
    SendDataService service;

    @GetMapping("/send-message")
    public String seeContactsAvailable(){
        return service.sendMessage();
    }


    //Método POST para añadir un contacto.
    @PostMapping("/add-contact")
    public ResponseEntity<String> sendMessage(@RequestBody Map<String, String> data){
        if(data.containsKey("email") || data.containsKey("number")){
            service.addContactForm(data);
        }else {
            throw new InvalidContactException("P-400", "Contact form not valid");
        }
        return new ResponseEntity<>("New contact info added correctly",HttpStatus.CREATED);
    }
}
