package C_VIEW;

import A_MODEL.Produtos;
import B_CONTROLLER.Crud_ElementoDeDespesa_16;
import C_VIEW.menu.MenuServices;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Menu {
    private  static  final Scanner scanner = new Scanner(System.in);
    protected static void descriçãoED() {
        System.out.println("DIGITE 0 PARA FINALIZAR ");
        System.out.println("ELEMENTO DE DESPESA 16");
        System.out.println("ELEMENTO DE DESPESA 17");
        System.out.println("ELEMENTO DE DESPESA 22");
        System.out.println("ELEMENTO DE DESPESA 23");
        System.out.println("ELEMENTO DE DESPESA 27");
        System.out.println("ELEMENTO DE DESPESA MATERIAS ADICONADOS RECENTEMENTE");

    }
    public static  void Interface (int x ) throws Exception {

        switch (x){
            case 1 -> MenuServices.MenuElementoDeDespesa_16();
            case 2 -> MenuServices.MenuElementoDeDespesa_17();
            case 3 -> MenuServices.MenuElementoDeDespesa_22();
            case 4 -> MenuServices.MenuElementoDeDespesa_23();
            case 5 -> MenuServices.MenuElementoDeDespesa_27();
            case 6 -> MenuServices.MenuElementoDeDespesa_NewEntrada();
            default -> throw new IllegalArgumentException("VOCE DIGITOU O NUMERO ERRADO!! ");


        }


    }


}
