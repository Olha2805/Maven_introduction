package main.java.app;

public class Invoke {
    public static void main(String[] args) {
        Server server = new Server();
        System.out.println(server.getUsers());

        String actual = server.getUsers();
        String expected = "Vova, Andry, Oleksander";
        if (!actual.equals(expected)){
            System.out.println("Test faled");

        }
        System.out.println("After error");
    }
}

