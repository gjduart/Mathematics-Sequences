package exercicio;

import java.util.Scanner;

public class SequenciasMatematicas {
	int fat;
	
	int  k,i;
	float h= 0f; 
	long o;
	private Scanner entrada1;

//
	///Questão 1***********************************************************************************
	//
	
public void fatorial() { 
		
		int n= 10;
		for(fat = 1; n > 1; n = n - 1) {
		    fat = fat * n;
		    System.out.println(fat);
		}
	}
	
	//Questão 2
	
public void harmonica()
	{
		entrada1 = new Scanner(System.in);
		int m=(int) entrada1.nextInt();
		
		for (k = m; k >= 1; k = k - 1) 
		      h = (float) (h + 1.0 / k);
			  System.out.println(h);
	}
	
 //Questão 4*******************************************************
	
	
public void piramide() 
	{
		entrada1 = new Scanner(System.in);
		int m=(int) entrada1.nextInt();
		
	for (i=1;i<=m;i++) {
		System.out.println();
		System.out.print(i+" ");
		for (int j =2;j<=i;j++) {
			o=(long) Math.pow(i,j);
			System.out.print(o+"  ");
			}
		}
			
	}
	int x=5,y;
   
	
	////Questão 3 **************************************************

public void metade() 
	{
		
		entrada1 = new Scanner(System.in);
		int x=(int) entrada1.nextInt();
		
	while (x!=1) {
		 if (x%2==0) {
			 y=x/2;
			 System.out.println(y);
			 x=y;
		 } 
		 else {
			 y=x*3+1;
			 System.out.println(y);
			 x=y;
		 }
		 
		 }
	}	
	}

