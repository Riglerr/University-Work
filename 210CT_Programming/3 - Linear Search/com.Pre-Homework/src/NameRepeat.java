/**
 * Created by Rob on 23/10/2014.
 */
public class NameRepeat {

    public static void main(String[] args){

        NameRepeat name = new NameRepeat();
        name.DoTheThing("Rob");
    }

    public void DoTheThing(String _name){

        for (int i = 0; i<10;i++){
            System.out.println((i+1) + " " + _name);

        }


    }
}
