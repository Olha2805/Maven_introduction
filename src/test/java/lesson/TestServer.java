package test.java.lesson;

import main.java.app.Server;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestServer {


    @Test
    public static void getUsersShouldReturnProperAmount() {
        Server server = new Server();
        String usersNames = server.getUsers();
        int actualUsersAmount = usersNames.split(", ").length;
        int expectedUsersAmount = 3;
        assertEquals(actualUsersAmount,
                expectedUsersAmount,
                "Expected amount of users to be" + expectedUsersAmount + "but got" + actualUsersAmount
        );

    }

    @Test
    public static void getUsersShouldReturnAllNameInUpperase (){
        Server server = new Server();
        String usersNames = server.getUsers();
        String[] names = usersNames.split(", ");
        for (String name: usersNames){
            String actualFirstChar = String.valueOf(name.charAt(0));
            String expectedFirstChar = String.valueOf(name.charAt(0)).toUpperCase();
            assertTrue(
                    actualFirstChar.equals(expectedFirstChar),
                    "Expected first char" + actualFirstChar + "in name" + name + "to be apper case");

        }
    }

}
