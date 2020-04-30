package com.playsafe.gamestudio.java.scaleconversion.playsafeJavaScaleConversion.Bean;

public class KelvinToCelciusBean {
    private float convertedtemperatureInCelcius;

    public KelvinToCelciusBean(float tempInKelvin) {
        float celcius =tempInKelvin - 273.15F;
        this.convertedtemperatureInCelcius = celcius;
    }

    public float getConvertedtemperatureInCelcius() {
        return convertedtemperatureInCelcius;
    }

    public void setConvertedtemperatureInCelcius(float convertedtemperatureInCelcius) {
        this.convertedtemperatureInCelcius = convertedtemperatureInCelcius;
    }
}