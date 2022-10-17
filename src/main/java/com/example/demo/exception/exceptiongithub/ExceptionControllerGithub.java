package com.example.demo.exception.exceptiongithub;

import com.example.demo.exception.ExceptionErrors;
import com.example.demo.exception.exceptioncontact.ExceptionNotFoundContact;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionControllerGithub {
    private final ExceptionErrors exceptionErrors = new ExceptionErrors();
    @ExceptionHandler(value = ExceptionNotFoundContact.class)
    @ResponseBody
    public ResponseEntity handelExceptionNotFoundGithub(ExceptionNotFoundGithub exceptionNotFoundGithub){
        exceptionErrors.setErrorMassage(
                exceptionErrors.getErrorMassage()
        );
        return new ResponseEntity(exceptionErrors , HttpStatus.NOT_FOUND);
    }
}
