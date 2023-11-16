package com.br.histogram.opentelemetry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/sleep_hello")
public class ControllerSleep {

    @GetMapping
    public String sleep(){
        Random random = new Random();

        int minDuration = 500;
        int maxDuration = 5000;
        int Duration = minDuration + random.nextInt(maxDuration - minDuration +1);
        try {
            Thread.sleep(Duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Why does it take so long?";
    }
}
