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

        for (User u : users) {
            System.out.printl(u.getName());
        }
    }
        // Consumer é uma interface funcional,que recebe um argumento e não retorna nada.
        //é uma prática comum criar classes anonimas(classes internas)
        //para tarefas simples
        class Mostrador implements Consumer<User> {
            public void accept(User u){
                System.out.println(u.getName());
            }
        };

        //a classe acima pode ser simplificada
        Consumer<User> mostrador = new Consumer<User>(){
            public void accept(User u){
                System.out.println(u.getName());
            }
        };

        //utilizando lambda
        Consumer<User> mostrador1 =
                (User u) -> {System.out.println(u.getName());};

        // pode-se ir além, o compilador consegue inferir o tipo
        // sem a necessidade de utilizar User, nem parenteses
        Consumer<User> mostrador2 =
                u -> {System.out.println(u.getName());};

        // escrevendo em apenas uma linha
        Consumer<User> mostrador3 = u -> System.out.println(u.getName());


}