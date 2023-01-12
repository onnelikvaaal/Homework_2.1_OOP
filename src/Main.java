public class Main {

    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 2015, "Russia", "yellow", 1.7);
        Car audi = new Car("Audi", "50 L TDI Quattro", 2020, "Germany", "black", 3.0);
        Car bmw = new Car("BMW", "Z8", 2021, "Germany", "black", 3.0);
        Car kia = new Car("Kia", "Sportage 4th generation", 2018, "South Korea", "red", 2.4);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "South Korea", "orange", 1.6 );

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}