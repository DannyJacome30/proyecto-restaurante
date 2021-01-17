package ec.edu.epn.tdd.Login;

import ec.edu.epn.tdd.Login.Login;
import ec.edu.epn.tdd.Login.LoginProcesson;
import ec.edu.epn.tdd.Login.LoginResponse;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class LoginTest {
    @Test
    public void given_login_when_is_correct_then_ok(){
        Login log = Mockito.mock(Login.class);
        LoginProcesson processor = new LoginProcesson(log);

        Mockito.when(log.requestLogin(Mockito.any()))
                .thenReturn(new LoginResponse(LoginResponse.LoginStatus.OK));

        assertTrue(processor.makeLogin("Danny","123"));

    }

    @Test
    public void given_login_when_is_incorrect_then_error(){
        Login log = Mockito.mock(Login.class);
        LoginProcesson processor = new LoginProcesson(log);

        Mockito.when(log.requestLogin(Mockito.any()))
                .thenReturn(new LoginResponse(LoginResponse.LoginStatus.ERROR));

        assertFalse(processor.makeLogin("Johanna","123"));

    }
}