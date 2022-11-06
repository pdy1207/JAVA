package Java5;

import java.util.Scanner;

public class Study1_while2 { //while문을 이용한 구구단

	public static void main(String[] args) {
		
		int i=2,  k=1;
		while(i<10)
		{
			while(k<10)
			{
				System.out.println( i + " x " + k +" = "+ i*k);
				k++;
			}
			i++;
			k=1;
		}
	}
}
			
	


