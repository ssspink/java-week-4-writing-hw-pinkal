package java_week4_writing_hw;

import java.util.Scanner;

/****
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme_10_ArmStrongNumber
{
    public static void isArmStrongNumber(int num)
    {
        int number , temp, total =0;
        number=num;
        while(num!=0){
            temp=num %10;
            total=total+temp * temp* temp;

            num/=10;

    }
        if (total ==number){
            System.out.println(number+ " is an Armstrong number");

        }else {
            System.out.println(number+" is not Armstrong number");
        }


    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter any number");
        int a =scanner.nextInt();
        isArmStrongNumber(a);
        //closing the scanner
        scanner.close();
    }
}
