package learning;
class Bank{
    String name;
    protected String email;
    private String password;

    public void setPass(String pass){
       this.password = pass;
    }
    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}

public class encapsulation {
    public static void main(String[] args){
        Bank b1 = new Bank();
        b1.name = "Modumoti";
        b1.email = "modumoti@gmail.com";
        b1.setPass("abcd");
        b1.getInfo();
    }
}
