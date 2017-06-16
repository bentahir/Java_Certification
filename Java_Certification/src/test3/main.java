package test3;

import java.util.Random;



//import java.util.*;

/**
 * @author ibentahi
 *
 */

public class main
{
	/**
	 * main : main program
	 * @param args
	 */
	
    public static int q2(int[] array) {
  	  
        int index = 0;
      
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) index = i;
        }
      
        return index;
      
    }
    public static void change(char[] array, int index1, int index2) { 
    	  
        char temp = array[index2];
        array[index1] = array[index2];
        array[index2] = temp;
      
    }
	public static void main(String [] args){
		
		int[] array1 = {22, 99, 11, 99, 33};
	
		char[] array = {'O', 'M', 'A', 'R', ' ', 'B', 'E', 'N', 'T', 'A', 'H', 'I', 'R'};
		//change(array, 0, 2);
		//change(array, 1, 3 );
		
		for (int i=0;i<array.length;i++)
			System.out.print(array[i]);
		
		System.out.println("");
    	Random rn = new Random();
    	int randomNum = rn.nextInt(3);
    	

	}
	/**
	 * isNegative : method checking if number is negative
	 * @param nb
	 * @return
	 */
	static boolean isNegative(int nb){ 
		return ((nb < 0) ? true: false);
	}


        public main(int x) {
  
                x = x;
        }

}

