import transport.Bus;
import transport.Car;

public class Main {

    public static void main(String[] args) {

        Car.Key ladaKey = new Car.Key(false, false);

        Car lada = new Car("Lada", "Granta", 2010, "Russia",
                "white", 150, 1.6, "manual", "sedan",
                "A321HK154", 4, false, ladaKey);

        Car.Key audiKey = new Car.Key(true, true);

        Car audi = new Car("Audi", "50 L TDI Quattro", 2020, "Germany",
                "black", 250, 3.0, "automatic", "sedan",
                "A555AA55", 4, false, audiKey);

        Car.Key bmwKey = new Car.Key(true, true);

        Car bmw = new Car("BMW", "Z8", 2021, "Germany",
                "black", 250, 3.0, "automatic", "roadster",
                "K567AK65", 2, false, bmwKey);

        Car.Key kiaKey = new Car.Key(false, true);

        Car kia = new Car("Kia", "Sportage 4th generation", 2018, "South Korea",
                "red", 220, 2.4, "automatic", "crossover",
                "M897TK197", 4, false, kiaKey);

        Car.Key hyundaiKey = new Car.Key(false, false);

        Car hyundai = new Car("Hyundai", "Avante", 2016, "South Korea",
                "orange", 200, 2.2, "automatic", "sedan",
                "X112OX54", 4, false, hyundaiKey);

        Bus nefaz = new Bus("Nefaz", "5299-0000011-52", 2020,
                "Russia", "white", 140);

        Bus scania = new Bus("Scania", "OmniLink", 2020,
                "Sweden", "black", 160);

        Bus daewoo = new Bus("Daewoo", "Royal Cruiser", 2020,
                "null", "yellow", 150);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println(nefaz);
        System.out.println(scania);
        System.out.println(daewoo);

    }
}