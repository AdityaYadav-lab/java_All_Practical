package practical9;
import java.io.*;
public class P6random {
public static void main(String args[])
{
RandomAccessFile file=null;
try
{
file=new RandomAccessFile("random.txt","rw");
file.writeChar('X');
file.writeInt(555);
file.writeDouble(2.4534);
file.seek(0);//Goto begining

//Reading from file

System.out.println("\n\nReading From Random File..................");
System.out.println(file.readChar());
System.out.println(file.readInt());
System.out.println(file.readDouble());

file.seek(2);//Goto  Second item
System.out.println("\n\nThe Second Item in a File..................");
System.out.println(file.readInt());

file.seek(file.length());
file.writeBoolean(false);

file.seek(4);
System.out.println("\n\nThe Fourth Item in a File..................");
System.out.println(file.readBoolean());

file.seek(file.length());
file.writeBytes("MUMBAI MIRROR\n");

file.close();
}
catch(IOException e)
{
System.out.println(e);
}}}