package Task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString(exclude = {"quantity"})
@EqualsAndHashCode(exclude = {"model","year","price","color","quantity"})
public class CarWithLombok {

    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

}
