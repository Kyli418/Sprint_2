package service;

import model.Food;

public class ShoppingCart {
    private Food[] items;
    public ShoppingCart(Food[] items) {
        this.items = items;
    }
    public double getAmountWithDiscount(){
        double price = 0.0;
        for (int i = 0; i < items.length; i++){
            price += items[i].getAmount() * items[i].getPrice();
        }
        return price;
    }
    public double getTotalPriceWithDiscount() {
        double price = 0.0;
        for (int i = 0; i < items.length; i++) {
            double discount = items[i].getDiscount();
            price += items[i].getAmount() * items[i].getPrice() * (1 - discount / 100);
        }
        return price;
    }
    public double getTotalVegetarianPriceWithoutDiscount() {
        double price = 0.0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].isVegetarian()) {
                price += items[i].getAmount() * items[i].getPrice();
            }
        }
        return price;
    }
}

