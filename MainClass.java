public class MainClass {
    public static void main(String[] args) {
        //obiect de tip User
        User user = new User();
        user.setName("aser");
        user.setPassword("parola");

        System.out.println("Nume utilizator: " + user.getName() + "; Parola utilizator: " + user.getPassword());

        //obiect de tip Book
        Book book = new Book();
        book.setBook_name("Amintiri din copilarie");
        book.setAuthor("Creanga");
        book.setLiterary_genre("epic");
        book.setPrice(14.8);
        book.setBook_status("Disponibila");

        System.out.println("Nume carte: " + book.getBook_name() + "; autor carte: "
                + book.getAuthor() + "; gen:" + book.getLiterary_genre() + "; pret: "
                + book.getPrice() + "; statusul cartii: " + book.getBook_status());

        //obiect de tip Admin
        Admin admin = new Admin();
        admin.setName("administrator");
        admin.setPassword("1234");
        System.out.println("Nume administrator: " + admin.getName() + "; " +
                "Parola administrator: " + admin.getPassword());

        //modificare nume+parola admin
        admin.modifyAdmin(admin);
        System.out.println("Administratorul a modificat contul \"administrator\", cu parola \"1234\". Noul nume: "
                + admin.getName() + "; Noua parola: " + admin.getPassword());

        //modificare nume+parola user
        admin.modifyUser(user);
        System.out.println("Administratorul a modificat contul \"user\", cu parola \"parola\". Noul nume: "
                + user.getName() + "; Noua parola: " + user.getPassword());

        //admin-ul sterge user-ul creat anterior
        admin.deleteUser(user);
        System.out.println("Administratorul a sters user-ul creat anterior." + user);

    }
}
