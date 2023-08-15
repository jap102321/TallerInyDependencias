package com.ejer1.ejer1.Controller;

import com.ejer1.ejer1.DTO.ErrorDTO;
import com.ejer1.ejer1.exceptions.InvalidContactException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorDTO> WrongContactInfo(InvalidContactException ex){
        ErrorDTO error = ErrorDTO.builder().code("P-400").message(ex.getMessage()).build();
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
