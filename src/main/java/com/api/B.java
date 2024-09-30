package com.api;
import java.util.Scanner;
// 1) Debugging by breakpoint either by debug button or by right click

// 2) step over -> It helps us to move to the next line from the current line in the current method (next line)
//Used in Method calling statement or Constructor calling statement

// 3) step into-> It will take u that method where u stopped that a method calling statement will jump to that method
// It goes to that method.

// 4) Evaluate Expression -> If we want to know to analyze that this method returning what select the method and
//click on 3 dots and evaluate expressions.It dont work on void method

// 5) Step out->It is a feature that the current method will completely run and goes back to the method calling
// statement

// 6) we have a feature called frame where we can see all our executions of stepOver and stepInto and stepOut

// 7) when it returns back the stack is empty It works like a stack.Last method in first method out.when It
// return back that method is been removed. When we are calling it started loading into it.

//public class B {
//    public static void main(String[] args) {
//        B b1=new B();
//        int val=b1.test();
//        System.out.println(val);
//    }
//        public int  test() {
//            System.out.println("Hello");
//            return 100;
//        }

// PROGRAM FOR PALINDROME IN JAVA

//    public class B {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String input = scanner.nextLine();
//
//        if (isPalindrome(input)) {
//            System.out.println(input + " is a palindrome.");
//        } else {
//            System.out.println(input + " is not a palindrome.");
//        }
//    }
//
//    public static boolean isPalindrome(String str) {
//        int left = 0;
//        int right = str.length() - 1;
//
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//}

//Take even or odd programs
//Take Removing duplicates element from an array
//Take sorting an array

//Logic to sort an array using bubble sort

public class B {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, break the loop
            if (!swapped) break;
        }
    }
}



