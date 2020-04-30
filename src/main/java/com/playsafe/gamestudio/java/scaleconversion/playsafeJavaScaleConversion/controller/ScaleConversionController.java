package com.playsafe.gamestudio.java.scaleconversion.playsafeJavaScaleConversion.controller;

import com.playsafe.gamestudio.java.scaleconversion.playsafeJavaScaleConversion.Bean.KelvinToCelciusBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScaleConversionController {
    @GetMapping(path ="/conversions/ktoc")
    public KelvinToCelciusBean kelvinToCelciusBean(@RequestParam(value = "temperatureKelvin") float temperatureKelvin){
        return new KelvinToCelciusBean(temperatureKelvin);
    }
}
