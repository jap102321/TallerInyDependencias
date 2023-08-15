package com.ejer1.ejer1.Repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface SendDataRepository {

    void addNewEmail(String email);
    void addNewPhone(String phone);
}
