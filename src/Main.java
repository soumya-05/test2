import dto.user;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        user user1 = new user("user-1");
        user1.setName("user11");
        System.out.println(user1.getName());
    }
}