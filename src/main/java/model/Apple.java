package model;
import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        this.isVegetarian = true;
    }
    @Override
    public double getDiscount() {
        if (colour == "red"){
            return Discount.DISCOUNT_RED;
        }
        return Discount.NO_DISCOUNT;
    }
}
