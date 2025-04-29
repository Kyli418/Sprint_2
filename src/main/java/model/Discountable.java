package model;

import model.constants.Discount;

public interface Discountable {
    default double getDiscount(){
        return Discount.NO_DISCOUNT;
    }

}