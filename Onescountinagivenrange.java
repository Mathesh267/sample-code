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
	    Scanner sc=new Scanner(System.in);
		int startrange=sc.nextInt();
		int endrange=sc.nextInt();
		int onescount=0;
		for(int i=startrange;i<=endrange;i++){
		    String str=Integer.toString(i);
		    for(int j=0;j<str.length();j++){
		        if(str.charAt(j)=='1'){
		            onescount++;
		        }
		    }
		    
		}
		System.out.println(onescount);
	}
}
