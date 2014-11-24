/**
 * Created by Rob on 23/10/2014.
 */
public class StarSquare {

    public char ast = '*';  //Create variable to hold asterisk character.
    public static void main(String[] args){

        StarSquare sSquare = new StarSquare(); /*Create Object*/
        sSquare.writeSquare(10); /*Use object to call writeSquare() method*/

    }


    public void writeSquare(int size){

        for(int i =0; i<size;i++){ /*OuterLoop 'size' times*/
            for(int j = 0;j<size;j++){ /*InnerLoop 'size' times*/
            
                System.out.print(ast); /*Print line of asterisks*/
 
            }
            System.out.println(); /* Start new line when inner loop finishes*/
        }
    }
}
