public class Demo9 {
    public static void main(String[] args) {
        String myStr = "Hello";
        String myStr2 = "Java";
        int myInt = 10;
        int myInt2 = 5;
        char myChar = '!';

        String myStr3 = myStr + myStr2 + myInt + myInt2 + myChar;          
        System.out.println(myStr3);                                        // prints HelloJava105!

        System.out.println(myInt + myInt2 + myChar + "");                  // prints 48
        System.out.println("" + myInt + myInt2 + myChar);                  // prints 105!
        System.out.println(myInt + myInt2 + myChar + "" + 10 + 20);        // prints 481020

        System.out.println(".................................");
        
        System.out.println("" + (myInt + myInt2 + myChar));                // prints 48
        System.out.println((myInt + myInt2 + myChar) + "" + (10 + 20));    // prints 4830

        System.out.println("...................................");

        System.out.println(myStr.concat(" ")
                                .concat(myStr2)
                                .concat(" ")
                                .concat(myInt + "")
                                .concat(" ")
                                .concat(myInt2 + ""));// data type consider  // prints Hello Java 10 5

    
    }
}
