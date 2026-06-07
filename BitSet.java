import java.util.*;
class BitSet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number-");
        int num = sc.nextInt();
        System.out.println("enter the position of bit you want to set : ");
        int pos = sc.nextInt();
        int BitMask = 1<<pos;
        int newnum = num | BitMask;
        System.out.println("your new number : "+ newnum);
        
    }
}