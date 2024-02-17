package org.example.springrestv2.exceptions;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandling {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<Object> exceptionhandling(ProductNotFoundException.class){
        public ResponseEntity<Object> exceptionhandling(ProductNotFoundException ex){
            return new ResponseEntity<>("Not able to find the product")
        }
    }
}
