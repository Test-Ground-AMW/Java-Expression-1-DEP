public class Demo4 {
    public static void main(String[] args) {
        byte myByte = 10; //0000 1010
        int myInt = ~myByte; // after ~ operation assignment context converted to int type
        System.out.println(Integer.toBinaryString(myInt));

        byte myByte2 = -5;
        myByte2 = (byte)~myByte2;
        System.out.println(myByte2);
        int result = myByte2++ + ~++myByte2;
        System.out.printf("result = %s, myByte2 = %s\n", result,myByte2);



    }
}
