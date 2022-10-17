package com.example.demo.exception.exceptionphonebook;

import com.example.demo.exception.ExceptionErrors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionControllerPhoneBook {
    private final ExceptionErrors exceptionErrors = new ExceptionErrors();
    @ExceptionHandler(value = ExceptionNotFoundPhoneBook.class)
    @ResponseBody
    public ResponseEntity handlerNotFoundPhonBookException(ExceptionNotFoundPhoneBook ex){
        exceptionErrors.setErrorMassage(
                exceptionErrors.getErrorMassage()
        );
        return new ResponseEntity(
                exceptionErrors , HttpStatus.NOT_FOUND
        );
    }

}
