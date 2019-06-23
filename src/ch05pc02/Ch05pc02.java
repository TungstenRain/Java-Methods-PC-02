package ch05pc02;
import java.util.Scanner;
/**
 *
 * @author frank.olson
 * date 11/8/2017
 * purpose: to calculate an item's retail price
 */
public class Ch05pc02 {

    public static void main(String[] args) {
        //variables
        double cost, markUp, retailPrice;
        
        //create keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Request input
        System.out.print("Please enter the whole sale cost of the item: ");
        cost = keyboard.nextDouble();
        System.out.print("Please enter the mark up percentage: ");
        markUp = keyboard.nextDouble();
        
        markUp /= 100;
        
        retailPrice = calculateRetail(cost, markUp);
        
        System.out.printf("The retail price for this item is: $%.2f\n", retailPrice);
    }
    
    public static double calculateRetail (double wholeSaleCost, double markUp)
    {
        //variables
        double result;
        
        result = wholeSaleCost + (wholeSaleCost * markUp);
        
        return result;
    }
}
