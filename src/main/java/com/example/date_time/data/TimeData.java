package com.example.date_time.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class TimeData {

    @JsonProperty("formattedTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy:MM:dd'##':HH:mm:ss:SSS")
    private LocalDateTime time;

    public TimeData(LocalDateTime time){
        this.time = time;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}