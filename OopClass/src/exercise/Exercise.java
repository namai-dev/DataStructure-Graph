package exercise;

import java.util.Arrays;

public class Exercise {
  public static  void  getPosiveInArray(int [] orig_Array) {
      int [] my_array = new  int[orig_Array.length];
      for(int i = 0; i<orig_Array.length; i++){
          if(orig_Array[i] >= 0){
              my_array[i] = orig_Array[i];
          }
      }

  }

    public static void main(String args []){
     int [] arrayy = {10,10,10,10,10};
       getPosiveInArray(arrayy);

    }
}
