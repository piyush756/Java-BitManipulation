import java.util.*;
public class CoversionToBinaryOrDecimal {
    public static void DecimalToBinary(int n) {
        StringBuilder binari = new StringBuilder(); 
        for(int i=0;i<Integer.toBinaryString(n).length();i++) {
            int bitmask = 1<<i;
            int result = n & bitmask;
            if(result!=0) {
                binari.append(1);
            }else { 
                binari.append(0);
            }
        }for(int i =0;i<binari.length();i++) {
            System.out.print(binari.charAt(i));
        }
    }
    public static void BinaryToDecimal(String b) {
        int decimalvalue = 0;
        int power = 0;
        for(int i=0;i<b.length();i++) {
            char bit = b.charAt(i);
            if(bit == '1') {
                decimalvalue += Math.pow(2,power);
            }else if(bit!='0') {
                throw new IllegalArgumentException("invalid binary string");
            }power++;
        }System.out.println("decimal value : "+decimalvalue);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter choices : \n"+ "1.Decimal to Binary \n"+ "2. Binary to Decimal");
        int choice = sc.nextInt();
        if(choice==1) {
            System.out.println("enter the number:");
            int n = sc.nextInt();
            DecimalToBinary(n);
        }else if(choice == 2) {
            System.out.println("enter the binary string : ");
            String binary= sc.next();
            BinaryToDecimal(binary);
        }else {
            System.out.println("envalid choice!!");
        }
    }
}
