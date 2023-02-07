package edu.miu.lab11.advice;

import java.util.HashMap;
import java.util.Map;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author Daniel Tsegay Meresie
 */

@RestControllerAdvice
public class EregistrarWebApiExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(EmptyResultDataAccessException.class)
    public Map<String, String> handleDeleteError() {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", "unable to delete because user doesn't exitst");
        return errorMap;
    }

}