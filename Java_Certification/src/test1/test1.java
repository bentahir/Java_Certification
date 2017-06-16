package test1;

import java.util.*;

public class test1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number =0;
		for (int i=0; i<20; i++){
			
			System.out.println(i+"%10  = " + (i%10));

		}
	}

static boolean isNumberPrime(int nb){

	if (nb < 1){
		System.out.println("nb must be >= 1");
		return (false);
	}
	for(int i=2; i < nb ; i++)
		if(nb%i == 0){
				return false;
		}
	return true;
}
}
