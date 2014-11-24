/**
 * Created by Rob on 23/10/2014.
 */
public class ExForDupes {

    public static int[] _iList =  {1,2,3,9,4,5,6,7,8,4,0};

    public static void main(String[] args){



        ExForDupes obj = new ExForDupes();

        if (obj.DoTheThing(_iList))
            System.out.println("JAJA");

    }

   /* ExForDupes(){

        for(int i = 0; i< _iList.length ;i++){
            _iList[i] = 0;

        }

    }
*/
    public boolean DoTheThing(int[] _list){

        for(int i = 0; i <_list.length;i++){
            for(int j= i+1; j < _list.length; j++){

            if(_list[i] == _list[j]) {

                return true;
            }

            }


        }
return false;

    }
}
