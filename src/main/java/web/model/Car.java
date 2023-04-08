package web.model;

public class Car {
    private String brand;
    private String color;
    private String series;

    public Car() {
    }

    public Car(String brand, String color, String series) {
        this.brand = brand;
        this.color = color;
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
