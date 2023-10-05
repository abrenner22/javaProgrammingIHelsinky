/* 
A friend of yours was hired to create an application for a new burger restaurant chain that arrived in town. 
It should calculate whether a customer should be given a gift card. The intention is that after the first 1000 customers, every 25th 
should receive a gift card. In addition, every 2000th customer gets a larger gift card. 
Others receive nothing (expect for the chance to buy the restaurant's servings, of course!).

Currently, the code looks like this:

Scanner x = new Scanner(System.in);
System.out.print("Customer number: ");
int y = Integer.valueOf(x.nextLine());

if (y >= 1000 && y % 25 == 0) {
    System.out.println("Gets a gift card!");
} else if (y % 2000 == 0) {
    System.out.println("Gets a large gift card!");
} else {
    System.out.println("Gets nothing.");
}
There are a few issues with it. Explain what problems exist in the code and what causes them. Also give suggestions to fix those.

Your answer should be at least 20 words
*/ 

import java.util.Scanner; 

public class BurguerChainApp { 

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in); 

        while (true) { 
            
            System.out.println("Insert a initial customer number: "); 
            int customerNumber = Integer.valueOf(scan.nextLine());
            int smallGiftCard = 0;
            int bigGiftCard = 0;
            
            for (int i = customerNumber; i < 10000; i++) {
 
            if (customerNumber > 1000 && customerNumber % 25 == 0) {
                System.out.println("Congratulations, cliente number " + customerNumber + ", you won a gift-card!");
                smallGiftCard++;
                customerNumber++;
            } else {
                System.out.println("Current client number: " + customerNumber);
                customerNumber++; 
            }
            
            if (customerNumber % 2000 == 0 ) {
                System.out.println("Congratulations, cliente number " + customerNumber + ", you won a HUGE gift-card!");
                bigGiftCard++; 
                customerNumber++;
            }
            
            
                System.out.println("Small gift-cards: " + smallGiftCard);
                System.out.println("Big gift-cards: " + bigGiftCard);
            
            }
        }
    }
}
