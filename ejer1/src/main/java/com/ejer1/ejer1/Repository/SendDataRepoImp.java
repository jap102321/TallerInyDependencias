package com.ejer1.ejer1.Repository;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class SendDataRepoImp implements SendDataRepository{

    //"mock" de DB emails
    ArrayList<String> emails = new ArrayList<>();
    //"mock" de DB numero de tel
    ArrayList<String> numbers = new ArrayList<>();
    //Mock de insert a la DB de email
    @Override
    public void addNewEmail(String email) {
        emails.add(email);
    }
    //Mock de insert a la DB de numero
    @Override
    public void addNewPhone(String phone) {
        numbers.add(phone);
    }

    //Metodo que se encarga de hacer la ejecución de los elementos, como es con un Mock pensé en hacerlo así.
    public String sendMessage(){
        StringBuilder result = new StringBuilder();

        for(String e : emails){
            result.append("Se ha envíado el correo exitosamente a ").append(e).append("\n");
        }

        for(String t : numbers){
            result.append("Se ha enviado el SMS exitosamente a ").append(t).append("\n");
        }

        result.append("Se envió la información a los ").append(emails.size() + numbers.size()).append(" contactos.");

        return result.toString();
    }
}
