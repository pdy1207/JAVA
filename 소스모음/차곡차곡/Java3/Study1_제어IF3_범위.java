package Java3;

import java.util.Scanner;

public class Study1_����IF3_���� {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);   //if ~ else Ȱ�� ���
		  
		  int score;
		  System.out.print("1~100�������� ���Է� : ");
		  score = sc.nextInt();
		  if(score >= 100 )                                   { System.out.println("�����Դϴ�!"); }
		  else if (score < 100 && score >= 90) { System.out.println("90���̻� 100���̸�"); }
		  else if (score < 90 && score >= 80)  { System.out.println("80���̻� 90���̸�"); }
		  else if (score < 80 && score >= 70)  { System.out.println("70���̻� 80�̸�"); }
		  else                                                     { System.out.println("70�� �̸� �����Դϴ�"); }
		 
		  
		  }
	}

                          
            









