package Java2;

import java.util.Scanner;

public class Study5_평균구하기 {

	public static void main(String[] args) {
		  //입력받는값 
		Scanner sc = new Scanner(System.in);   
		    
		 
		  System.out.print("국어 : ");
		  int a = sc.nextInt();
		  System.out.print("영어 : ");
		  int b = sc.nextInt();
		  System.out.print("수학 : ");
		  int c = sc.nextInt();
		  
		  
		  System.out.println("총점 : " + (a+b+c) +" / "+"평균 : " + ((a+b+c)/3) );
		  
		  //변수 3개로 인하여 총점과 평균점수 구하기 
		//print 그냥 그대로 println 은 한줄 띄어서 나오기.   
		  
		  
		  //int kor,eng,mat,tot, avg; 국영수 총점 평균
		  //System.out.print("국어 : "); kor = sc.nextint();
		//System.out.print("영어 : "); eng = sc.nextint();
		//System.out.print("수학 : "); mat = sc.nextint();
		  //tot = kor + eng + mat;
		  // avg = tot / 3; 
		  //System.out.print("총점: " +tot +" / 평균: " +avg);
		  
		  //int kor,eng,mat,tot,avg
		  //System.out.print("국어 : " ); kor = sc.nextInt(); // 대소문자 구분 
		 //System.out.print("영어 : " ); eng = sc.nextint();
		  //System.out.print("수학 : " ); mat = sc.nextint();
		  //tot = kor + eng + mat;
		  //avg = tot / 3 
		  //System.out.print("총점 : " + tot +" / 평균 : " + avg);
				
			
	}
}
