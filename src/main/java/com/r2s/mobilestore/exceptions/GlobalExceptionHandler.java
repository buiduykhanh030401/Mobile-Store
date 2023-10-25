package com.r2s.mobilestore.exceptions;

import com.r2s.mobilestore.dtos.ResponseDTO;
import com.r2s.mobilestore.enums.Response;
import com.r2s.mobilestore.product.controllers.ProductController;
import com.r2s.mobilestore.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Locale;

/**
 * Represents validation exception
 *
 * @author KhanhBD
 * @since 2023-10-23
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    private final ResponseDTO body = ResponseDTO.getInstance();

    /**
     * Logging in Spring Boot
     */
    Logger logger = LoggerFactory.getLogger(ProductController.class);

    /**
     * Validation Exception
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        return ResponseEntity.badRequest().body(messageSource.getMessage(
                Constants.VALIDATION_FAILED, null, Locale.ENGLISH) + " " + ex.getFieldError().getDefaultMessage());
    }

    /**
     * Unauthorized exception
     */
    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<?> handleBadCredentialsException(BadCredentialsException ex) {
        logger.info(ex.getMessage());

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    /**
     * Global exception
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGlobalException(Exception ex) {
        logger.info(ex.getMessage());

        body.setResponse(Response.Key.STATUS, Response.Value.FAILURE);
        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}