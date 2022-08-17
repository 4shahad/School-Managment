package com.example.schoolmanagment.Advise;


import com.example.schoolmanagment.Dto.ApiResponse;
import com.example.schoolmanagment.Exption.Apiexception;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvise {
    @ExceptionHandler(value = Apiexception.class)
    public ResponseEntity apiException(Apiexception apiexception){
        return ResponseEntity.status(400).body(new ApiResponse(apiexception.getMessage(),400));
    }
}
