package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    @Test
    public void generateLoginForNomAndPrenom() {
        //GIVEN this cas
        LoginService l = new LoginService(new String[] {"JROL","BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        LoginGenerator lg = new LoginGenerator(l);
        //WHEN on génère le login pour Paul Durand
        String login = lg.generateLoginForNomAndPrenom("Durand", "Paul");
        //THEN on vérifie que le login est bien PDUR
        assertEquals("PDUR", login);
        login = lg.generateLoginForNomAndPrenom("Ralling", "Jean");
        assertEquals("JRAL2", login);
        login = lg.generateLoginForNomAndPrenom("Rolling", "Jean");
        assertEquals("JROL1", login);
    }

    @Test
    public void newTest() {
        String[] s = {};
        LoginService l = new LoginService(s);
        LoginGenerator lg = new LoginGenerator(l);
        String login = lg.generateLoginForNomAndPrenom("Du", "Paul");
        assertEquals("PDU", login);
    }
}