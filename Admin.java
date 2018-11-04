import java.util.Scanner;

public class Admin extends User {

    public Admin() {
        super();
    }


    public Admin(String userAdmin, String passAdmin) {
        super(userAdmin, passAdmin);
    }

    public void deleteUser(User user) {
        user = null;
    }

    public void modifyAdmin(Admin admin) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti un nume pt admin: ");
        String name = input.next();
        admin.setName(name);

        System.out.println("Introduceti o parola pt admin: ");
        String password = input.next();
        admin.setPassword(password);
    }

    public void modifyUser(User user) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti un nume pt user: ");
        String name = input.next();
        user.setName(name);

        System.out.println("Introduceti o parola pt user: ");
        String password = input.next();
        user.setPassword(password);
    }

}
