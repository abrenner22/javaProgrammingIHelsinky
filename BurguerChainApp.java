import java.util.Scanner; // importando o utilitário scanner padrão do java

public class BurguerChainApp { 

    public static void main(String args[]) { // ponto de entrada do software

        Scanner scan = new Scanner(System.in); // iniciando o objeto scanner

        while (true) { // loop para manter a usabildiade do programa 
            
            System.out.println("Insert a initial customer number: "); // insira um número inicial de cliente
            int customerNumber = Integer.valueOf(scan.nextLine()); // salva o número inicial;
            int smallGiftCard = 0;
            int bigGiftCard = 0;
            
            for (int i = customerNumber; i < 10000; i++) { // laço for para gerar interatividade e teste
 
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
