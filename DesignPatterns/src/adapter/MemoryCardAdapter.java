package adapter;

public class MemoryCardAdapter implements USB{
    private Card card = new MemoryCard();

    public MemoryCardAdapter(Card card) {
        this.card = card;
    }

    @Override
    public void readData() {
        card.readDataFromCard();
    }
}
