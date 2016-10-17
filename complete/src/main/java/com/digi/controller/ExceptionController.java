package com.digi.controller;

import com.digi.entity.response.ExceptionResponse;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@SuppressWarnings("UnusedDeclaration")
@Slf4j
@Api
@Order(value = 99)
public class ExceptionController {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<ExceptionResponse> handleAllException(Exception ex) {
        return  ResponseEntity.ok().body(new ExceptionResponse(ex));
    }
}
