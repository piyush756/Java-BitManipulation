import java.util.*;
class ClearBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number-");
        int num = sc.nextInt();
        System.out.println("enter the position of bit you want to clear : ");
        int pos = sc.nextInt();
        int BitMask = 1<<pos;
        int Bit = ~(BitMask);

        int newnum = num & Bit;
        System.out.println("your new number : "+ newnum);
        
    }
}