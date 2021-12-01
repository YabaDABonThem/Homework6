// Allen Bao
// 11/30/21
// A program that takes in user input to generate an array of doubles with the specified amount of random items, 
// then prints out the sum, num of items, average, maximum, and minimum
// Inputs that break code: non integer values

// import used libraries
import java.util.Scanner;
import java.util.Random;

public class Homework6 {
   public static void main(String[] args) {
      
      // get user input
      Scanner keyboard = new Scanner(System.in);
      System.out.println("How many double numerical entries do you have? ");
      int sizeOfArray = keyboard.nextInt();
      
      // create double array with specified length that user specified
      double[] doubles = new double[sizeOfArray];
      
      // create random object and fill up array with random doubles
      Random random = new Random();
      
      for (int i = 0; i < doubles.length; ++i) {
         doubles[i] = random.nextDouble();
      }
      
      // call the two methods that we write
      printArraySum(doubles);
      
      printAverageMaxMin(doubles);
   }
   
   public static void printArraySum(double[] doubles) {
      // initialize sum
      double sum = 0;
      
      for(double d : doubles) {
         sum += d; // go thorugh every item in the array and add them together
      }
      
      // print out the sum
      System.out.println("There are " + doubles.length + " items in the array and the sum of those items is " + sum);
   }
   
   public static void printAverageMaxMin(double[] doubles) {
      
      // initialize variables
      double average = 0;
      double max = 0; // The nextDouble() method only generates doubles between 0 and 1
      double min = 1;
      
      // loop through every item
      for(double d : doubles) {
         average += d; // sum needed to find average
         if (d > max)
            max = d; // compare the number to the current maximum, if larger, then set the current max to the new max
         if (d < min)
            min = d; // compare the number to the current minimum, if smaller, then set the current min to the new min
      }
      // The average value is the sum divided by the number of items
      average /= doubles.length;
      
      // print out the average, max, and min
      System.out.println("The average of the array is " + average + ", the maximum value is " + max + ", and the minimum value is " + min);
   }
}