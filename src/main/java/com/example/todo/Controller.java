package com.example.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    private TodoService todoService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path = "/new",produces = {"application/json"})
    public ResponseEntity<Object>  index() {
        return new ResponseEntity<>(todoService.getRandomNumber(), HttpStatus.OK);

    }

}