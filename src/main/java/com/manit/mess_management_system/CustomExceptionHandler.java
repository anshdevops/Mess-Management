package com.manit.mess_management_system;


import com.manit.mess_management_system.exceptions.ResidentAlreadyExistsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(ResidentAlreadyExistsException.class)
    public String handleException(ResidentAlreadyExistsException ex, HttpServletResponse response) {




        response.setStatus(409);
        return "Resident Already Registered";


    }
}
