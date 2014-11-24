/**
 * Created by Rob on 23/10/2014.
 */
public class NameRepeat {

    public static void main(String[] args){

        NameRepeat myObject = new NameRepeat();  /*Create Object*/
        myObject.PrintName("Rob");      /*Use object to call PrintName() method*/
    }

    public void PrintName(String _name){

        for (int i = 0; i<10;i++){  /* Loop 10 times*/
            System.out.println((i+1) + " " + _name); 

		/*, print the number && _name parameter each time.*/

        }


    }
}
