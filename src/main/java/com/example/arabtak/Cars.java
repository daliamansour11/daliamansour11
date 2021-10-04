package com.example.arabtak;

public class Cars {
   private int image;
   private int year;
   private String brand;
  private String status;

    public Cars(int image) {
        this.image = image;
    }

    public static Cars get(int position) {

        return null;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cars(int image, int year, String brand, String status) {
        this.image = image;
        this.year = year;
        this.brand = brand;
        this.status = status;
    }

    public Cars(String brand) {
        this.brand = brand;
    }

}



