package com.ejer1.ejer1.Modelo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Textmsg {

    private String phoneNumber;
    private String body;

}
