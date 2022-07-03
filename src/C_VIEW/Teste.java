package C_VIEW;


import java.util.Scanner;


public class Teste {
    private  static  final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        {   System.out.println("***********************************************************");
            System.out.println("         BEM VINDO AO ALMOXARIFADO VIRTUAL IFPE            ");
            System.out.println("***********************************************************");
            System.out.println("ELEMENTOS DE DESPESAS PARA REALIZAR MOVIMENTAÇÕES LOGISTICAS");
            System.out.println("***********************************************************");


        }
       int x;
       while (true){
           Menu.descriçãoED();
           x = Integer.parseInt(sc.nextLine());
           if(x == 0) break;
           Menu.Interface(x);
       }

    }
}
