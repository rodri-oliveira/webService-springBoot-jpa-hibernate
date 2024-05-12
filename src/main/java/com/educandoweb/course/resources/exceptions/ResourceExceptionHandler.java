package com.educandoweb.course.resources.exceptions;

import java.time.Instant;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.educandoweb.course.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<StandardError> handleDataIntegrityViolation(DataIntegrityViolationException ex, HttpServletRequest request) {
        String errorMessage = "Não é possível excluir o usuário devido a restrições de integridade referencial.";
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        StandardError err = new StandardError(Instant.now(), status.value(), errorMessage, ex.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<StandardError> handleEmptyResultDataAccessException(EmptyResultDataAccessException ex, HttpServletRequest request) {
        String errorMessage = "ID não encontrado";
        HttpStatus status = HttpStatus.NO_CONTENT;
        StandardError err = new StandardError(Instant.now(), status.value(), errorMessage, ex.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
