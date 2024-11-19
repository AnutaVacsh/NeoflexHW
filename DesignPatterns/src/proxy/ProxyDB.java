package proxy;

public class ProxyDB implements DB{
    private final DB db;

    public ProxyDB(DB db) {
        this.db = db;
    }

    @Override
    public void connect() {
        System.out.print("localhost:5432/");
        db.connect();
    }
}
