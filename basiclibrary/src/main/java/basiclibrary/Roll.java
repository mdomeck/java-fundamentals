package basiclibrary;


import java.util.Arrays;

public class Roll {

    public  int[] roll(int rolls) {
        int[] diceArr = new int[rolls];
        for (int i = 0; i < rolls; i++) {
            diceArr[i] = dice();
        }
        System.out.println(Arrays.toString(diceArr));
        return diceArr;
    }

    public int dice(){
        int diceRoll = (int) (Math.random() * 6 + 1);
        return diceRoll;
    }


    public boolean containsDuplicates(int[] array){

        for(int i = 0; i < array.length; i++){
           for(int j = i + 1; j < array.length; j++){
               if(array[i] == array[j]){
                   System.out.println(true);
                   return true;
               }
           }
        }
        System.out.println(false);
        return false;
    }


    public double calcAvg(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println(sum / array.length);
        return sum / array.length;
    }

    public int[] arrayAvg(int[][] array){

        int index = 0;
        double lowAvg = calcAvg(array[0]);

        for(int i = 1; i < array.length; i++){

            double tempAvg = calcAvg(array[i]);
            if(tempAvg < lowAvg){
                lowAvg = tempAvg;
                index = i;
            }
        }
        System.out.println(Arrays.toString(array[index]));
        return array[index];
    }



}
