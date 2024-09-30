/*Write a Java program to check if a given number is an Armstrong number or not.

Here's an example of the expected input and output:

Input number: 153
Output: "Yes, the number is an Armstrong number."

*/

import java.util.Scanner;
//* This method is for 3 digit numbers /
// public class Armstrong {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         int a = number % 10;
//         int b = (number/10) % 10;
//         int c = number / 100;

//         int result = a * a * a + b * b * b + c * c * c;
//         if(result == number){
//             System.out.println("Yes, the number is an Armstrong number.");
//         }else{
//             System.out.println("Number is not an armstrong number");
//         }

//         sc.close();
//     }
// }
public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numDigits = 0;
        int temp = number;
        while(temp != 0){
            temp = temp/10;
            numDigits++;
        }
        temp = number;
        int result = 0;
        while(temp > 0){
            int digit = temp % 10;
            result += Math.pow(digit, numDigits);
            temp /= 10;
        }

        if(result == number){
            System.out.println("Yes, the number is an Armstrong number.");
        }else{
            System.out.println("Number is not an armstrong number");
        }

        sc.close();
    }
}

