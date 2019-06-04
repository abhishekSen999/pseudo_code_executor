import java.io.*;
import java.util.ArrayList;
public class ReadFile {


    private String code[];
    private String fileName;
    private int count;
    private final int maxNumberOfLines=10;
    private FileReader fr=null;
    private ArrayList<String> bufferLines;

    ReadFile(String fileName) throws IOException
    {
        count=0;
        this.fileName=fileName;
        code=new String[this.maxNumberOfLines];
        for (int i=0;i<this.maxNumberOfLines;i++) code[i]=null;
        bufferLines=new ArrayList<String>();
        try
        {
            fr = new FileReader(this.fileName);
        }

        catch(FileNotFoundException e)
        {
            System.out.println(this.fileName+" file not found(remember to specify extension as well)");
        }
    }


    /*
    read() reads "maxNumberOfLines" java interpreted lines to array code[]
    in a file a single line might contain multiple java lines in the given format
        int i=0;b=0;c=a+b;
    in such a case this would be considered as 3 separate lines for java hence would be split
    so even though we will only read "maxNumberOfLines"  from the file that might result into more lines, in that case extra lines would be stored in bufferLines arraylist

     */
    int read()//reads "maxNumberOfLines" lines at a time
    {
        BufferedReader buf = new BufferedReader(fr);
        int codeIterator=0,bufferIterator=0;

        while(!this.bufferLines.isEmpty() && codeIterator<this.maxNumberOfLines ) // if buffer is nonempty then copying it into code[]
        {
            this.code[codeIterator++]=this.bufferLines.get(0);
            this.bufferLines.remove(0);
        }


    }
}
