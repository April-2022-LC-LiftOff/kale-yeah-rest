package kaleyearest.project.controllers;

import kaleyearest.project.Validation.ValidationError;
import kaleyearest.project.Validation.ValidationErrorBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

    @ControllerAdvice(assignableTypes = AuthenticationController.class)
    public class AuthenticationControllerAdvice extends ResponseEntityExceptionHandler {

        @Override
        protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exception, HttpHeaders headers, HttpStatus status, WebRequest request) {
            ValidationError error = ValidationErrorBuilder.fromBindingErrors(exception.getBindingResult());
            return super.handleExceptionInternal(exception, error, headers, status, request);
        }
    }

