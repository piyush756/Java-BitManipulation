import java.util.*;
class BitManipulation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number-");
        int num = sc.nextInt();
        System.out.println("enter the position of bit you want to knoe : ");
        int pos = sc.nextInt();
        int BitMask = 1<<pos;
        if((BitMask & num)==0) {
            System.out.println("the bit is zero");
        }else {
            System.out.println("bit was one");
        }
    }
}