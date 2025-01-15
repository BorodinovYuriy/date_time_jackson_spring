package com.example.date_time.controller;

import com.example.date_time.data.TimeData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TimeController {
    //     http://localhost:8080/time
    @GetMapping("/time")
    public TimeData getTime() {
        return new TimeData(LocalDateTime.now());
    }

}
