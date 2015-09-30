package com.a3m.controller;


import com.a3m.controller.converter.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public abstract class AbstractRestController {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleNotFound() {
        return notFound();
    }

    public ResponseEntity<?> notFound() {
        return errorResponse(null, HttpStatus.NOT_FOUND);
    }

    public <T> ResponseEntity<T> response(T body, HttpStatus status) {
        return new ResponseEntity<T>(body, status);
    }

    public <T extends Throwable> ResponseEntity errorResponse(T throwable, HttpStatus status) {

        return response(String.format("{\"status\":\"%s\", \"errorMessage\":\"%s\"}",
                status, throwable == null ? "Not Found" : throwable.getMessage()), status);
    }
}
