public class pre2{
    
    
    
    public static void main(String[] args){
        Boolean[] b = {true,true,false,true};
        System.out.println(b[2]);
        System.out.println(func(b));
        
        
    }
    
    public static int func(Boolean[] list){
        int total = 0;
        int len = list.length;
        
        for(int i = len-1; i>-1; i-- ){
            if (list[i]==true)
                total+= Math.pow(2,i);
        }
        
        return total;
    }
}

