import model.Apple;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;
import model.Food;

public class main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApples = new Apple(8, 60, Colour.GREEN);

        Food[] products = {meat, redApple, greenApples};
        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки: " + cart.getAmountWithDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getTotalVegetarianPriceWithoutDiscount());
    }
}




