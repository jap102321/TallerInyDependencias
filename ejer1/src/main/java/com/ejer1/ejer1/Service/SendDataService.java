package com.ejer1.ejer1.Service;


import com.ejer1.ejer1.Repository.SendDataRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class SendDataService {
    @Autowired
    SendDataRepoImp imp;

    //Tomar datos y enviarlos al repo para chequear.
    public void addContactForm(Map<String, String> data){
        if(data.containsKey("email")){
            String email = data.get("email");
            imp.addNewEmail(email);
        } else if (data.containsKey("number")) {
            String phone = data.get("number");
            imp.addNewPhone(phone);
        }
    }

    //Método para envíar los datos.
    public String sendMessage(){
       return imp.sendMessage();
    }


}
