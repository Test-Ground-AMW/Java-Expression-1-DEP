public class Demo6 {
    public static void main(String[] args) {
        float myFloat = 2.23f;
        myFloat = myFloat++;  // myFloat = 2.23 (assign the current value)
        myFloat++;            // myFloat = 3.23

        
        float myFloat2 = 20.25f;
        // myFloat2 = (float) ~myFloat2;  // float, double doesn't contributes to complements

        

        int x = 10;
        
        // ~x;    // can't stand alone    
        // -x;    // can't stand alone    
        // +x;    // can't stand alone  
        ++x;      // can stand alone
        --x;      // can stand alone
        x++;      // can stand alone
        x--;      // can stand alone

        // but
        System.out.println(~x);   // can stand alone inside a statement




    }
}
