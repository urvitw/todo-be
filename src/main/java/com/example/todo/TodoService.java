package com.example.todo;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class TodoService {

    public static Integer getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
