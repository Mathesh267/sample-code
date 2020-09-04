/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		int num=9829;
		while((num%100)/10!=0){
		    String str=Integer.toString(num);
		    int sum=0;
		    for(int i=0;i<str.length();i++){
		        sum+=Character.getNumericValue(str.charAt(i));
		    }
		    num=sum;
		}
		System.out.println(num);
	}
}
