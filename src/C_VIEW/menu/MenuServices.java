package C_VIEW.menu;

import A_MODEL.Produtos;
import B_CONTROLLER.CRUD_MENU.*;
import B_CONTROLLER.Crud_ElementoDeDespesa_16;

import java.util.Scanner;

public class MenuServices {
    private static final Crud_ElementoDeDespesa_16 elementoDeDespesa_16 = new Crud_ElementoDeDespesa_16();
    private static final Scanner sc = new Scanner(System.in);
    private static final Produtos p = new Produtos();




    public static void MenuElementoDeDespesa_16() throws Exception {
        System.out.println("1 - Cadastro");
        System.out.println("2 - Update");
        System.out.println("3 - Saida");
        System.out.println("4 - Produtos ");
        System.out.println("5 - Produto Especifico");
        int start = sc.nextInt();
        switch (start) {
            case 1 -> Produtos16.Cadastro();
            case 2 -> Produtos16.Update();
            case 3 -> Produtos16.Saida();
            case 4 -> Produtos16.Produtos();
            case 5 -> Produtos16.Tipo_Produtos();
            default -> throw new IllegalArgumentException("VOCE DIGITOU O NUMERO ERRADO!! ");


        }

    }

    public static void MenuElementoDeDespesa_17() throws Exception {
        System.out.println("1 - Cadastro");
        System.out.println("2 - Update");
        System.out.println("3 - Saida");
        System.out.println("4 - Produtos ");
        System.out.println("5 - Produto Especifico");
        int start = sc.nextInt();
        switch (start) {
            case 1 -> Produtos17.Cadastro();
            case 2 -> Produtos17.Update();
            case 3 -> Produtos17.Saida();
            case 4 -> Produtos17.Produtos();
            case 5 -> Produtos17.Tipo_Produtos();
            default -> throw new IllegalArgumentException("VOCE DIGITOU O NUMERO ERRADO!! ");


        }


    }
    public static void MenuElementoDeDespesa_22() throws Exception {
        System.out.println("1 - Cadastro");
        System.out.println("2 - Update");
        System.out.println("3 - Saida");
        System.out.println("4 - Produtos ");
        System.out.println("5 - Produto Especifico");
        int start = sc.nextInt();
        switch (start) {
            case 1 -> Produtos22.Cadastro();
            case 2 -> Produtos22.Update();
            case 3 -> Produtos22.Saida();
            case 4 -> Produtos22.Produtos();
            case 5 -> Produtos22.Tipo_Produtos();
            default -> throw new IllegalArgumentException("VOCE DIGITOU O NUMERO ERRADO!! ");


        }
    }
    public static void MenuElementoDeDespesa_23() throws Exception {
        System.out.println("1 - Cadastro");
        System.out.println("2 - Update");
        System.out.println("3 - Saida");
        System.out.println("4 - Produtos ");
        System.out.println("5 - Produto Especifico");
        int start = sc.nextInt();
        switch (start) {
            case 1 -> Produtos23.Cadastro();
            case 2 -> Produtos23.Update();
            case 3 -> Produtos23.Saida();
            case 4 -> Produtos23.Produtos();
            case 5 -> Produtos23.Tipo_Produtos();
            default -> throw new IllegalArgumentException("VOCE DIGITOU O NUMERO ERRADO!! ");


        }
    }
    public static void MenuElementoDeDespesa_27() throws Exception {
        System.out.println("1 - Cadastro");
        System.out.println("2 - Update");
        System.out.println("3 - Saida");
        System.out.println("4 - Produtos ");
        System.out.println("5 - Produto Especifico");
        int start = sc.nextInt();
        switch (start) {
            case 1 -> Produtos27.Cadastro();
            case 2 -> Produtos27.Update();
            case 3 -> Produtos27.Saida();
            case 4 -> Produtos27.Produtos();
            case 5 -> Produtos27.Tipo_Produtos();
            default -> throw new IllegalArgumentException("VOCE DIGITOU O NUMERO ERRADO!! ");


        }
    }
    public static void MenuElementoDeDespesa_NewEntrada() throws Exception {
        System.out.println("1 - Cadastro");
        System.out.println("2 - Update");
        System.out.println("3 - Saida");
        System.out.println("4 - Produtos ");
        System.out.println("5 - Produto Especifico");
        int start = sc.nextInt();
        switch (start) {
            case 1 -> PRODUTOSNEW.Cadastro();
            case 2 -> PRODUTOSNEW.Update();
            case 3 -> PRODUTOSNEW.Saida();
            case 4 -> PRODUTOSNEW.Produtos();
            case 5 -> PRODUTOSNEW.Tipo_Produtos();
            default -> throw new IllegalArgumentException("VOCE DIGITOU O NUMERO ERRADO!! ");


        }
    }
}
