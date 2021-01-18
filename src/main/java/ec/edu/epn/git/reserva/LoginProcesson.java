package ec.edu.epn.git.reserva;

public class LoginProcesson {
    private Login log;

    public LoginProcesson(Login log) {
        this.log = log;
    }

    public boolean makeLogin(String user, String cont) {
        LoginResponse response = log.requestLogin(new LoginRequest(user,cont));
        if(response.getStatus() == LoginResponse.LoginStatus.OK)
            return true;
        else
            return false;
    }
}
