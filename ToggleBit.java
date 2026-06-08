import java.util.*;
public class ToggleBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        System.out.println("enter the position of bit to toggle : ");
        int pos = sc.nextInt();
        int bitmask = 1<<pos;
        int result = bitmask^num;
        System.out.println("the result : "+result);
    }
}
