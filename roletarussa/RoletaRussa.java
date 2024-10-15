package roletarussa;

import java.util.Random;
import java.util.Scanner;

public class RoletaRussa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int bullet = random.nextInt(6)+1;
        int contador = 1;
        boolean death = false;
        String decision = "S";

        System.out.print("Qual valor você deseja apostar?: ");
        Double aposta = scanner.nextDouble();
        scanner.nextLine();


        while (contador<=6) {
            System.out.println();
            System.out.println("Voce está na bala "+contador+", atirar? (S/N)");
            decision = scanner.nextLine();
            if (decision.equals("S") && bullet == contador) {
                System.out.println("Você morreu");
                death=true;
                System.out.println("A bala estava na posição "+bullet);
                break;
            } else if (decision.equals("S") && bullet != contador){
                System.out.println("A bala não estava aqui, o valor do prêmio subiu.");
                aposta = aposta*2;
                System.out.println("Valor atual: R$"+aposta);
            } else if (decision.equals("N") && bullet == contador){
                System.out.println("A bala estava aqui, você se salvou. Jogo finalizado.");
                System.out.println("Valor recebido: R$"+aposta);
                break;
            } else if (decision.equals("N") && bullet != contador){
                System.out.println("A bala não estava aqui!");
            } else {
                System.out.println("Erro no jogo.");
                break;
            }
            contador+=1;
        }
        if(!death){
            System.out.println("Você passou por todas as balas, premio recebido: R$"+aposta);
        }
    }
}
