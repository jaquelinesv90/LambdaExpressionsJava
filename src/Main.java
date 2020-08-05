import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("John", 150);
        User user2 = new User("Lauren", 120);
        User user3 = new User("Marie", 190);

        // Arrays.asList é uma maneira simples de criar uma
        // List imutável.(que não se pode alterar, sem possibilidade de mudança).
        List<User> users = Arrays.asList(user1, user2, user3);

        for(User u : users){
            System.out.printl(u.getName());
        }



    }
}