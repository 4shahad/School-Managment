package com.example.schoolmanagment.Exption;

import lombok.AllArgsConstructor;


public class Apiexception extends RuntimeException{
    public Apiexception(String message) {
        super(message);
    }
}
