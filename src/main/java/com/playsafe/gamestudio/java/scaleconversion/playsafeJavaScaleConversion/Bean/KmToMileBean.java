package com.playsafe.gamestudio.java.scaleconversion.playsafeJavaScaleConversion.Bean;

public class KmToMileBean {
    private double convertedDistanceInMiles;

    public KmToMileBean(double distanceKms) {
        double miles = distanceKms/1.609;
        this.convertedDistanceInMiles = miles;
    }

    public double getConvertedDistanceInMiles() {
        return convertedDistanceInMiles;
    }

    public void setConvertedDistanceInMiles(double convertedDistanceInMiles) {
        this.convertedDistanceInMiles = convertedDistanceInMiles;
    }
}