/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str="Any Content about Beezlabs";
		System.out.println(str);
		int charcount=0;
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)!=' '){
		        charcount++;
		    }
		}
		System.out.println(charcount);
	}
}
