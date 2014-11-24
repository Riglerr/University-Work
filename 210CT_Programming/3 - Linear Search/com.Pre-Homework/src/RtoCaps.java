/**
 * Created by Rob on 23/10/2014.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RtoCaps {

    public static void main(String[] args)throws FileNotFoundException {
        File inFile = new File("C:\\Users\\Rob\\Documents\\2nd Year\\210CT\\" +
                "Week 3 linear search\\com.Pre-Homework\\input.txt");
        RtoCaps obj = new RtoCaps();
        obj.rInput(inFile);
    }

    public void rInput(File inFile) throws FileNotFoundException{


        Scanner in = new Scanner(inFile);

        while(in.hasNextLine())
        {
            String line = in.nextLine();
            System.out.println(line.toUpperCase());
        }

    }


}
