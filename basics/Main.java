import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// import java.time.*;

public class Main {
  public static void main(String[] args) {

    int dogCount = 2;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    
    //Worked with David and Paul

    int n = 5;
    int flipped = flipNHeads(n);
    System.out.println("It took " + flipped + " flips to flip " + n + " heads in a row.");

    clock();
    

  }


public static String pluralize(String word, int num){
  
  if (num > 1 || num == 0) {
    return word + 's';
  } else 
    return word;
  }


public static int flipNHeads(int num){
  int timesFlipped = 0;
  int inARow = 0;
  while(num > inARow){
    int flip = (Math.random() <= 0.5) ? 0 : 1;


    if(flip == 0){
      System.out.println("heads");
      inARow++;
      timesFlipped++;
    } else {
      System.out.println("tails");
      inARow = 0;
      timesFlipped++;
    }
  }
  

  return timesFlipped;
}

//Bade came to help

public static void clock(){
  int num = 0;
    LocalDateTime now = LocalDateTime.now();
    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    String newTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

  while(num == 0){
    now = LocalDateTime.now();
    newTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    if (!time.equals(newTime)){
     time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
     System.out.println(time);
    }  
    



  }

}


}    


