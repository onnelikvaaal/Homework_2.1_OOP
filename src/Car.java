public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;

        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        }
        if (model == null || model.isBlank()) {
            this.model = "default";
        }
        if (country == null || country.isBlank()) {
            this.country = "default";
        }
        if (color == null || color.isBlank()) {
            this.color = "white";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (year <= 0) {
            this.year = 2000;
        }
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + year + " " + country + " " + color + " " + engineVolume;
    }
}