public class User {

    private String name;
    private String password;

    //constructor fara parametrii
    public User() {
        this.name = "";
        this.password = "";
    }

    //constructor cu parametrii
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }


    //functii get si set
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}