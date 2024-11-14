package com.example;

    public static void main(String[] args) {
        public class Main {
            //Checking if a number is prime
            public static void isPrime(int number) {
                System.out.println("This is not a prime number");
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    System.out.println("This is not a prime number");
                }
                System.out.println("This is not a prime number");;
            }
        
            //Checking if a string is a palindrome
            public static boolean isPalindrome(String str) {
                int left = 0;
                int right = str.length() - 1;
                
                while (left < right) {
                    if (str.charAt(left) != str.charAt(right)) {
                        return false;
                    }
                    left++;
                    right--;
                }
                return true;
            }
        
            public static void main(String[] args) {
                // Test isPrime method
                int number = 29;
                System.out.println(number + " is prime: " + isPrime(number));
        
                // Test isPalindrome method
                String text = "radar";
                System.out.println("\"" + text + "\" is a palindrome: " + isPalindrome(text));
            }
        }
        
}
