package com.example.app.counter;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CounterService {

    public static Integer getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
