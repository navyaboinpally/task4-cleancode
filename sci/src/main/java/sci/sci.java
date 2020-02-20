package sci;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.PrintStream;


public class sci 
{
	
	    public  static void main(String args[])
	    {
	    double pr, rate, t, sim,com;
	    Scanner sc=new Scanner(System.in);
        PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
	    myOutput.print("Enter the amount:");
	    pr=sc.nextDouble();
	    myOutput.print("Enter the No.of years:");
	    t=sc.nextDouble();
	    myOutput.print("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    sim=(pr * t * rate)/100;
	    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
	    myOutput.print("Simple Interest="+sim);
	    myOutput.print('\n');
	    myOutput.print("Compound Interest="+com);
	    }

		
}
