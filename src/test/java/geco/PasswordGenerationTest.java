package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    @Test
    public void getRandomPassword() {
        String s1 = PasswordGeneration.getRandomPassword();
        String s2 = PasswordGeneration.getRandomPassword();
        String s3 = PasswordGeneration.getRandomPassword();

        assertNotEquals(s1,s2);
        assertNotEquals(s2, s3);
        assertNotEquals(s1, s3);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}