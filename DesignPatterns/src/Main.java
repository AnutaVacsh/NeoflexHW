import adapter.*;
import factory.Coffee;
import factory.CoffeeFactory;
import factory.CoffeeType;
import proxy.DB;
import proxy.PostgresDB;
import proxy.ProxyDB;
import singleton.Logger;

public class Main {
    public static void main(String[] args) {
        //Singleton
        Logger log = Logger.getLog();
        log.ClassLog(log, "реализует алгоритм Singleton");

        //Factory
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.createCoffee(CoffeeType.AMERICANO);
        coffee.brew();

        //Adapter
        Card card = new MemoryCard();
        USB usb = new MemoryCardAdapter(card);

        Computer comp = new Computer();
        comp.readFromUsb(usb);

        //Proxy
        DB db = new PostgresDB("TestDB");
        DB dbProxy = new ProxyDB(db);
        dbProxy.connect();
    }
}