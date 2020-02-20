package sci;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class area
{
	int i;
	int j;
	PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
    public void standardmaterial(int n)
    {
    	i=n;
    	int k=1200*i;
        myOutput.print("total area is:"+k);
    }
    public void abovestandardmaterial(int n)
    {
    	i=n;
    	int k=1500*i;
    	myOutput.print("total area is:"+k);
    	
    }
    public void highstandardmaterial(int n)
    {
    	i=n;
    	int k=1800*i;
    	myOutput.print("total area is:"+k);
    	
    }
    public void highstandardmaterialandfullyautomatedhome(int n)
    {
    	i=n;
    	int k=2500*i;
    	myOutput.print("total area is:"+k);

    }
}
