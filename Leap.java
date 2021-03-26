


public class Main {

  public static void main(String[] args) {


    int y = 1841;
    boolean l = false;

    if (y % 4 == 0) {

     
      if (y % 100 == 0) {

        
        if (y% 400 == 0)
          l = true;
        else
          l = false;
      }
      
      
      else
        l = true;
    }
    
    else
      l = false;

    if (l)
      System.out.println(y + " is a leap year.");
    else
      System.out.println(y + " is not a leap year.");
  }
}