

import java.util.Random;

public class RanndomNumber {
public static void main(String[] args) {
    Random rd=new Random();
    int number;

    for(int i=1;i<=10;i++)
    {
        number=rd.nextInt(7);
      System.out.println(number);
    }
   
}
    
}