package geco;

import java.util.Random;

public class PasswordGeneration {


    public static String getRandomPassword(){
        Random rand = new Random();
        String s = "";
        for(int i=0; i<8; i++){
            char c = (char) ('0' + rand.nextInt(75));
            s = s + c;
        }
        return s;

    }
}
