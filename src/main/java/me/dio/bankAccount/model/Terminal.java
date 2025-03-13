package src.main.java.me.dio.bankAccount.model;

import java.util.Scanner;
import src.main.java.me.dio.bankAccount.resources.Colors;

public class Terminal {

    private Account account;
    
    public Terminal() {

    }

    public void openAccount() {

        account = new Account();
        Scanner scan = new Scanner(System.in);

        System.out.println(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "Por favor, digite o número da agência." + Colors.ANSI_RESET);
        account.setAgency(scan.nextLine());
    
        while (true) {
            System.out.println(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "Por favor, digite o número da conta.\n - apenas números - " + Colors.ANSI_RESET);
            try {
                account.setNumber(scan.nextInt());
                scan.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(Colors.ANSI_RED_BACKGROUND + Colors.ANSI_WHITE + "Número inválido de conta." + Colors.ANSI_RESET);
                scan.nextLine();
            }
        }

        System.out.println(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "Por favor, digite o nome do cliente." + Colors.ANSI_RESET);
        account.setClient(scan.nextLine());

        while (true) {
            System.out.println(Colors.ANSI_WHITE_BACKGROUND + Colors.ANSI_BLACK + "Por favor, digite o saldo da conta.\n- apenas números e virgulá - " + Colors.ANSI_RESET);
            try {
                account.setBalance(scan.nextBigDecimal());
                break;
            } catch (Exception e) {
                System.out.println(Colors.ANSI_RED_BACKGROUND + Colors.ANSI_WHITE + "Número inválido de conta." + Colors.ANSI_RESET);
                scan.next();
            }
        }

        scan.close();
        account.success();
        
    }
    
}
