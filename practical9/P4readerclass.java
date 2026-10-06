package practical9;


    
import java.io.*;

public class P4readerclass {
public static void main(String args[])
{
File FI =new File("practical9/input.txt");
File FO=new File("practical9/output.txt");

FileReader fr=null;
FileWriter fw=null;

try
{
fr=new FileReader(FI);
fw=new FileWriter(FO);
int ch;
while((ch=fr.read())!=-1)
{
fw.write(ch);
System.out.print(" "+ch);
}
fr.close();
fw.close();
}
catch(IOException e)
{
System.out.println(e);
System.exit(-1);
}
finally
{
System.out.println("\n\n.............Its Done.............\n");
System.out.println("....See input.txt and output.txt files...\n\n");
}}}
