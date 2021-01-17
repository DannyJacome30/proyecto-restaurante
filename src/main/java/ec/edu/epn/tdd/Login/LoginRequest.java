package ec.edu.epn.tdd.Login;

public class LoginRequest {
    private String user,cont;


    public LoginRequest(String user, String cont) {
        this.user = user;
        this.cont = cont;
    }

    public String getUser() {
        return user;
    }
}
