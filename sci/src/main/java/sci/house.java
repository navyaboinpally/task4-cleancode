package sci;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class house extends area
{
	public static void main(String args[]) throws IOException
	{
        Scanner sc=new Scanner(System.in);
        PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
	    myOutput.print("Enter requried material name from list below \n");
	    myOutput.print("1.standardmaterial\n");
	    myOutput.print("2.abovestandardmaterial\n");
	    myOutput.print("3.highstandardmaterial\n");
	    myOutput.print("4.highstandardmaterialandfullyautomatedhome\n");
	    myOutput.print("enter material type name");
	    String materialtype=sc.next();
	    myOutput.print("enter the area of  house");
	    int housearea=sc.nextInt();
	    area a=new area();
	    if(materialtype.equals("standardmaterial"))
	    {
	    	a.standardmaterial(housearea);
	    }
	    else if(materialtype.equals("abovestandardmaterial"))
	    {
	    	a.abovestandardmaterial(housearea);
	    }
	    else if(materialtype.equals("highstandardmaterial"))
	    {
	    	a.highstandardmaterial(housearea);
	    }
	    else if(materialtype.equals("highstandardmaterialandfullyautomatedhome"))
	    {
	    	a.highstandardmaterialandfullyautomatedhome(housearea);
	    }
	    
	   

	}

}
