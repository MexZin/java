package week2.project3;

import java.util.Random;

public class B {
    public void ex1(){
        Random rand= new Random();
        int[] masivi = new int[12];
        for (int i=0; i< masivi.length; i++){
            masivi[i] = rand.nextInt(16);
            if (i>7){
                System.out.println(i);
          }
            //System.out.println(masivi[i]);
        }
    }
}
