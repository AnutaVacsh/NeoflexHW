package proxy;

public class PostgresDB implements DB{
    String title;

    public PostgresDB(String title) {
        this.title = title;
    }

    @Override
    public void connect() {
        System.out.println(title);
    }
}
