package com.hcl.exp;
import java.util.Scanner;
public class New
{
public static void main(String[] args)
{
String u[] =new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
String t[] =new String[]{" ","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
int i, a, b, c, d,ch;
do{
Scanner  sc=new Scanner(System.in);
i=sc.nextInt();
if(i>0&&i<10&&i<20&&i<9999){
System.out.println("too much for me\n");
}
else{
d = i%10;
c = (i%100)/10;
b = (i%1000)/100;
a = i/1000;
if(a>0) System.out.println(u[a]+" thousand " );
if(b>0) System.out.println(u[b]+" hundred and " );
if(i>10&&i<20){
	switch(i){
	case 11 :
		System.out.println("eleven");
		break;
	case 12 :
		System.out.println("Twelve");
		break;
	case 13 :
		System.out.println("Thirteen");
		break;
	case 14 :
		System.out.println("Fourteen");
		break;
	case 15:
		System.out.println("Fifteen");
		break;
	case 16 :
		System.out.println("Sixteen");
		break;
	case 17 :
		System.out.println("Seventeen");
		break;
	case 18 :
		System.out.println("Eighteen");
		break;
	case 9 :
		System.out.println("Nineteen");
		break;
	default :
		System.out.println(" ");
		break;
	}
if(c>1) System.out.println(t[c]);
if(d>0) System.out.println(u[d]);	
}}
}while(i>0);
}
}




