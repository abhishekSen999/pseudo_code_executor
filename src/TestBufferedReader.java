import java.io.*;
public class TestBufferedReader {
    public static void main(String args[])throws IOException
    {
        FileReader fr=new FileReader(args[0]);
        BufferedReader buf = new BufferedReader(fr);
        String line="";
        char ch;
        int count=0;
        do
        {
            try
            {


                //line=buf.readLine();
                ch=(char)fr.read();
            }
            catch(EOFException e )
            {
                System.out.println("exception caught");
                break;


            }
            System.out.println("line number "+ count+"  is :- "+ch);
            count++;
        }while(line!=null);
    }
}
