package factory;

public class Americano implements Coffee {

    @Override
    public void brew() {
        System.out.println("Brewing an Americano");
    }
}
