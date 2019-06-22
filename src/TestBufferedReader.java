import java.io.*;
public class TestBufferedReader {
    public static void main(String args[])throws IOException
    {
        FileReader fr=new FileReader(args[0]);
        BufferedReader buf = new BufferedReader(fr);
        String line="";
        int count=0;
        while(true)
        {
            try
            {


                line=buf.readLine();


            }
            catch(Exception e )
            {
                e.printStackTrace();
                break;


            }
            if(line==null) break;
            System.out.println("line number "+ count+"  is :- "+line);
            count++;
        }
    }
}