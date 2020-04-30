package com.playsafe.gamestudio.java.scaleconversion.playsafeJavaScaleConversion.Bean;

public class MilesToKmBean {
    private double convertedDistanceInKms;

    public MilesToKmBean(double distanceMiles) {
        double kms = distanceMiles*1.609;
        this.convertedDistanceInKms = kms;
    }

    public double getConvertedDistanceInKms() {
        return convertedDistanceInKms;
    }

    public void setConvertedDistanceInKms(double convertedDistanceInKms) {
        this.convertedDistanceInKms = convertedDistanceInKms;
    }
}
