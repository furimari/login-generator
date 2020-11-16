package geco;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    @Test
    public void loginExists() {
        //GIVEN un nouveau login service avec UN login
        String[] s = {"Audrey"};
        LoginService l = new LoginService(s);
        //WHEN on vérifie que cet identifiant existe
        boolean check = l.loginExists("Audrey");
        //THEN on doit avoir true
        assertTrue(check);
        //WHEN on vérifie qu'un autre identifiant existe
        check = l.loginExists("Thomas");
        //THEN on doit avoir false
        assertFalse(check);


    }

    @Test
    public void addLogin(){
        String[] s = {"Jean", "John", "Marie"};
        LoginService l = new LoginService(s);
        l.addLogin("Joris");
        assertTrue(l.loginExists("Jean"));
    }

    @Test
    public void findAllLoginsStartingWith() {
        String[] s = {"Jean", "John", "Marie"};
        String[] res = {"Jean", "John"};
        LoginService l = new LoginService(s);
        List<String> ll = l.findAllLoginsStartingWith("J");
        for(int i = 0; i<ll.size(); i++){
            assertEquals(ll.get(i), res[i]);
        }
    }

    @Test
    public void findAllLogins() {
        String[] s = {"Jean", "John", "Marie"};
        LoginService l = new LoginService(s);
        List<String> ll = l.findAllLogins();
        for(int i = 0; i<ll.size(); i++){
            assertEquals(ll.get(i), s[i]);
        }
    }
}