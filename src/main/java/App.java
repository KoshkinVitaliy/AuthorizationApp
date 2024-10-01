public class App {
    public static void main(String[] args) {
        DbConnectionImpl connection = new DbConnectionImpl();

        //connection.insert(new User("user", "1234"));

        connection.select();
    }
}
