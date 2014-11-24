/**
 * Created by Rob on 23/10/2014.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RtoCaps {

    public static void main(String[] args)throws FileNotFoundException {
        File inFile = new File("input.txt");
                /*Create a file object */
        RtoCaps obj = new RtoCaps(); /*Create class object*/
        obj.rInput(inFile); /*Use Class object to call rInput() method*/
    }

    public void rInput(File inFile) throws FileNotFoundException{


        Scanner in = new Scanner(inFile); /*Create a new scanner to read from the file*/

        while(in.hasNextLine()) /*Loop WHile there is still lines left in the document*/
        {
            String line = in.nextLine(); /* Place the next line in a strin varibale*/
        
            System.out.println(line.toUpperCase()); /* Print the line in uppercase*/
        }

    }


}
