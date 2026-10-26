package Task2;

public class Main {
    public static void main(String[] args) {

        CarWithLombok car1 = new CarWithLombok("Corolla", "Toyota", 2022,
                25000.0, "Red", 10);

        CarWithLombok car2 = new CarWithLombok("Civic", "Honda", 2023,
                28000.0, "Blue", 5);


        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.getColor());

        int year = car1.getYear();

        car1.setColor("White");

        car2.setModel("Corolla");
        car2.setBrand("Toyota");
        car2.setYear(2022);
        car2.setPrice(25000.0);
        car2.setColor("White");
        car2.setQuantity(10);

        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("The HashCode of this object is : "+ car1.hashCode());
        System.out.println("The HashCode of this object is : "+ car2.hashCode());
    }
}
