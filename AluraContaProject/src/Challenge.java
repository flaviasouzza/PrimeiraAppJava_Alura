import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String name = "Flávia Souza";
        String accountType = "Savings";
        double balanceAvailable = 2000.00;
        int option = 0;


        System.out.println("*************************************");
        System.out.println("\nWelcome customer" + name);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance Available= " + balanceAvailable);
        System.out.println("\n ***********************************");


        String menu = """
                ** Inform the option
                1- Check Balance
                2- Transfer Value
                3- Receive Value
                4- Exit
                """;

        Scanner leitura = new Scanner(System.in);
        while (option !=4){
            System.out.println(menu);
            option = leitura.nextInt();

            if (option == 1){
                System.out.println("Your account balance is: " + balanceAvailable);
            } else if (option == 2){
                System.out.println("What is the amount to be transferred?");
                double value = leitura.nextDouble();

                if (value > balanceAvailable){
                        System.out.println("You don't have enough balance");
                    }
                else  {
                            balanceAvailable = balanceAvailable - value;
                System.out.println("Your account balance after the transfer is:" + balanceAvailable);
                 }
             }
            else if (option == 3){
                System.out.println("What value do you want to receive?");
                double value = leitura.nextDouble();
                balanceAvailable = balanceAvailable + value;
                System.out.println("Your account balance after the receive is:" + balanceAvailable);
                }

            if (option == 4 ) {
                System.out.println("Closed Operation");
            }
        }
    }
}
