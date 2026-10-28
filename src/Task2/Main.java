package Task2;

public class Main {
    public static void main(String[] args) {

        CarWithLombok car1 = new CarWithLombok("Corolla", "Toyota", 2022,
                25000.0, "Red", 10);

        CarWithLombok car2 = new CarWithLombok("Corolla", "Toyota", 2022,
                25000.0, "Red", 10);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("The HashCode of car1 is : " + car1.hashCode());
        System.out.println("The HashCode of car2 is : " + car2.hashCode());
    }
}
