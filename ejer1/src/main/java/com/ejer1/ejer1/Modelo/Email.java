package com.ejer1.ejer1.Modelo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Email {

    private String emailDir;
    private String body;

}
