public class harms{
    
    public static void main(String[] args){
        /**/
        System.out.println(f(0,3));
        
    }
    
    public static float f(float t, float n){
        /*
        t always starts with a value of 0.
        n is the nth term, which decreases by 1 each recursive call.
        
        When n = 0, stop recursive calling and return the value t.
        */
        while (n>0) 
        {
            t+= (1/n);
            f(t,--n);
        }
        return t;
    }
    
    
}