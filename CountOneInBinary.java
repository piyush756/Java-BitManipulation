import java.util.*;
public class CountOneInBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        int count = 0;
        for(int i=0;i<(Integer.toBinaryString(num)).length();i++) {
            int bitmask = 1<<i;
            int result = bitmask & num;
            if(result != 0) {
                count++;
            }
        }System.out.println("total one's in binary representation : "+count);
    }
}
