package com.example.demo.exception.exceptionuser;

import com.example.demo.exception.ExceptionErrors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionControllerUser {
    private final ExceptionErrors exceptionErrors = new ExceptionErrors();
    @ExceptionHandler(value = ExceptionNotFoundUser.class)
    @ResponseBody
    public ResponseEntity handlerExceptionNotFoundUser(ExceptionNotFoundUser ex){
        exceptionErrors.setErrorMassage(
                exceptionErrors.getErrorMassage()
        );
        return new ResponseEntity(
          exceptionErrors , HttpStatus.NOT_FOUND
        );
    }
}
