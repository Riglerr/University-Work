/**
 * Created by Rob on 23/10/2014.
 */
public class StarSquare {

    public String ast = "*";
    public static void main(String[] args){

        StarSquare sSquare = new StarSquare();
        sSquare.writeSquare(10);

    }


    public void writeSquare(int size){

        for(int i =0; i<size;i++){
            for(int j = 0;j<size;j++){
                System.out.print(ast);

            }
            System.out.println();
        }
    }
}
