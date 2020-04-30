package com.playsafe.gamestudio.java.scaleconversion.playsafeJavaScaleConversion.controller;

import com.playsafe.gamestudio.java.scaleconversion.playsafeJavaScaleConversion.Bean.CelciusToKelvinBean;
import com.playsafe.gamestudio.java.scaleconversion.playsafeJavaScaleConversion.Bean.KelvinToCelciusBean;
import com.playsafe.gamestudio.java.scaleconversion.playsafeJavaScaleConversion.Bean.KmToMileBean;
import com.playsafe.gamestudio.java.scaleconversion.playsafeJavaScaleConversion.Bean.MilesToKmBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScaleConversionController {
    @GetMapping(path ="/conversions/ktoc")
    public KelvinToCelciusBean kelvinToCelciusBean(@RequestParam(value = "temperatureKelvin") float temperatureKelvin){
        return new KelvinToCelciusBean(temperatureKelvin);
    }

    @GetMapping(path ="/conversions/ctok")
    public CelciusToKelvinBean celciusToKelvinBean(@RequestParam(value = "temperatureCelcius") float temperatureCelcius){
        return new CelciusToKelvinBean(temperatureCelcius);
    }


    @GetMapping(path ="/conversions/mtok")
    public MilesToKmBean milesToKmBean(@RequestParam(value = "distanceinMiles") float distanceinMiles){
        return new MilesToKmBean(distanceinMiles);
    }

    @GetMapping(path ="/conversions/ktom")
    public KmToMileBean kmToMileBean(@RequestParam(value = "distanceinKms") float distanceinKms){
        return new KmToMileBean(distanceinKms);
    }
}
