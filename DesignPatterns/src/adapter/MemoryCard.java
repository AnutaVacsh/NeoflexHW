package adapter;

public class MemoryCard implements Card{

    @Override
    public void readDataFromCard() {
        System.out.println("Reading data from Memory card...");
    }
}
