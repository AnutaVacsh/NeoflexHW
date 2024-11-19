package factory;

public class CoffeeFactory {

    public Coffee createCoffee(CoffeeType type){
        return switch (type) {
            case AMERICANO -> new Americano();
            case ESPRESSO -> new Espresso();
        };
    }
}
