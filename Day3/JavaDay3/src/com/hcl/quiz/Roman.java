package com.hcl.quiz;
import java.util.Scanner;
public static void main(String[] args)
{

String u[] =new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
String t[] =new String[]{" ","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
int i, a, b, c, d;
do{
Scanner  sc=new Scanner(System.in);
i=sc.nextInt();
if(i>9999)
System.out.println("too much for me\n");
else{
d = i%10;
c = (i%100)/10;
b = (i%1000)/100;
a = i/1000;
if(a>0) System.out.println(u[a]+" thousand " );
if(b>0) System.out.println(u[b]+" hundred and " );
if(c>1) System.out.println(t[c]);

if(d>0) System.out.println(u[d]);
System.out.println("\n");
}
}while(i>0);
}
 


