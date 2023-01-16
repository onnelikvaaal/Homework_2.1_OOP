package transport;

public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String carBody;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean winterTires = false;

    private final Key key;

    public Car(String brand, String model, int year, String country,
               String color, double engineVolume, String transmission, String carBody,
               String registrationNumber, int numberOfSeats, boolean winterTires, Key key) {

        this.key = key;

        if (brand == null || brand.isBlank()) {//марка
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {//модель
            this.model = "default";
        } else {
            this.model = model;
        }

        if (year <= 0) {//год
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country == null || country.isBlank()) {//страна
            this.country = "default";
        } else {
            this.country = country;
        }

        this.color = color;//цвет
        if (color == null || color.isBlank()) {
            this.color = "white";
        }

        this.engineVolume = engineVolume;//мощность двигателя
        this.transmission = transmission;//трансмиссия

        if (carBody == null || carBody.isBlank()) {//кузов
            this.carBody = "default";
        } else {
            this.carBody = carBody;
        }

        this.registrationNumber = registrationNumber;//регистрационный номер

        if (numberOfSeats <= 0) {//количество сидений
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        this.winterTires = winterTires;//резина


        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }

        if (transmission == null || transmission.isBlank()) {
            this.transmission = "default";
        }

        if (registrationNumber == null || registrationNumber.isBlank()) {
            this.registrationNumber = "default";
        }

    }


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

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getCarBody() {
        return carBody;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    @Override
    public String toString() {
        String tires = winterTires ? "winter tires" : "summer tires";
        String remoteEngineStart = key.remoteEngineStart ? "remote engine start" : "manual engine start";
        String keylessAccess = key.keylessAccess ? "keyless access" : "no keyless access";

       /* if (winterTires) {
            tires = "winter tires";
        } else {
            tires = "summer tires";
        }*/

        return brand + " " + model + ", " + year + ", " + country + ", "
                + color + ", " + engineVolume + ", " + transmission + ", " + carBody + ", "
                + registrationNumber + ", " + numberOfSeats + ", " + tires + ", " + remoteEngineStart + ", "
                + keylessAccess;
    }

    /*Добавьте функциональность: метод «сменить шины на сезонные».
    Подсказка
    Метод может принимать текущий месяц целым числом
    и в зависимости от месяца устанавливать признак “Зимняя или летняя резина”
    в true и false соответственно.*/

    public void changeTiresForSeason(int monthNumber) {
        switch (monthNumber) {
            case 11: case 12: case 1: case 2: case 3: case 4:
                setWinterTires(true);
                break;
            case 5: case 6: case 7: case 8: case 9: case 10:
                setWinterTires(false);
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }

    public void changeTiresForSeasonV2(int monthNumber) {//второй вариант этого же метода
        if (monthNumber == 5 || monthNumber == 6 || monthNumber == 7
                || monthNumber == 8 || monthNumber == 9 || monthNumber == 10 ) {
            setWinterTires(true);
        } else if (monthNumber == 11 || monthNumber == 12 || monthNumber == 1
                || monthNumber == 2 || monthNumber == 3 || monthNumber == 4) {
            setWinterTires(false);
        } else {
            System.out.println("Такого месяца не существует!");
        }
    }

    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }
   /* проверку данных к полям вложенного класса Key я не стала писать, потому что переменные типа boolean (следовательно,
    они не могут быть пустыми, null, и значения в них могут быть только true или false*/


}