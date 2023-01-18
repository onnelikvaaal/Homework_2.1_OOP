package transport;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        if (brand.isBlank() || brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model.isBlank() || model == null) {
            this.model = "default;";
        } else {
            this.model = model;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country.isBlank() || country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (color.isBlank() || color == null) {
            this.color = "default";
        } else {
            this.color = color;
        }

        if (maxSpeed <= 0) {
            this.maxSpeed = 150;
        } else {
            this.maxSpeed = maxSpeed;
        }

    }
}
