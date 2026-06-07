import java.util.*;
public class UpdateBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        System.out.println("enter the position : ");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;
        System.out.println("enter either want to set zero or one : ");
        int value = sc.nextInt();
        int newnum = 0;
        if(value == 0) {
            int bit = ~(bitmask);
            newnum = bit & num;
            System.out.println("new number : "+newnum);
        }else if(value == 1) {
            newnum = bitmask | num;
            System.out.println("new number : "+newnum);
        }else { 
            System.out.println("either enter 0 or 1  for choice");
        }
    }  
}
