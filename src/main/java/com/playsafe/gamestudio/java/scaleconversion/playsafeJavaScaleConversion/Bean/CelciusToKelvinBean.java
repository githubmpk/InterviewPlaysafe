package com.playsafe.gamestudio.java.scaleconversion.playsafeJavaScaleConversion.Bean;

public class CelciusToKelvinBean {

    private float convertedtemperatureInKelvin;

    public CelciusToKelvinBean(float tempInCelcius) {
        float kelvin =tempInCelcius + 273.15F;
        this.convertedtemperatureInKelvin = kelvin;
    }

    public float getConvertedtemperatureInKelvin() {
        return convertedtemperatureInKelvin;
    }

    public void setConvertedtemperatureInKelvin(float convertedtemperatureInKelvin) {
        this.convertedtemperatureInKelvin = convertedtemperatureInKelvin;
    }
}
