package bank;

class acc {

    public String name;
    protected String email;
    private String pass;

    public String getpass() {
        return this.pass;
    }

    public String setpass(String p) {
       return this.pass = p;
    }
}

public class bank {

    public static void main(String[] args) {
        acc newacc = new acc();
        newacc.name = "Zaib";
        newacc.email = "zaib@gmai.com";
        newacc.setpass("123455");
        System.out.println(newacc.getpass());
    }
}
