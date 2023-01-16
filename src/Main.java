import transport.Car;

public class Main {

    public static void main(String[] args) {

        Car.Key ladaKey = new Car.Key(false, false);

        Car lada = new Car("Lada", "Granta", 2015, "Russia",
                "yellow", 1.7, "manual", "sedan",
                "A001MP99", 4, false, ladaKey);

        Car.Key audiKey = new Car.Key(true, true);

        Car audi = new Car("Audi", "50 L TDI Quattro", 2020, "Germany",
                "black", 3.0, "automatic", "sedan",
                "O549TT54", 4, false, audiKey);

        Car.Key bmwKey = new Car.Key(true, true);

        Car bmw = new Car("BMW", "Z8", 2021, "Germany",
                "black", 3.0, "automatic", "roadster",
                "A333AA33", 2, false, bmwKey);

        Car.Key kiaKey = new Car.Key(false, true);

        Car kia = new Car("Kia", "Sportage 4th generation", 2018, "South Korea",
                "red", 2.4, "automatic", "crossover",
                "M670AO38", 4, true, kiaKey);

        Car.Key hyundaiKey = new Car.Key(false, false);

        Car hyundai = new Car("Hyundai", "Avante", 2016, "South Korea",
                "orange", 1.6, "automatic", "sedan",
                "X112OX54", 4, false, hyundaiKey);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

    }
}