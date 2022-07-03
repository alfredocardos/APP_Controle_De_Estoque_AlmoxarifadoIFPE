package B_CONTROLLER.CRUD_MENU;

import A_MODEL.Produtos;
import B_CONTROLLER.Crud_ElementoDeDespesaNewProdutos;


import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class PRODUTOSNEW {
    private static final Scanner sc = new Scanner(System.in);
    private static final Crud_ElementoDeDespesaNewProdutos crud_elementoDeDespesaNewProdutos = new Crud_ElementoDeDespesaNewProdutos();

    public static void Cadastro() throws SQLException {
        System.out.println("INSIRA O ELEMENTO DE DESPESA; DESCRIÇÃO E SALDO");
        Produtos p1 = Produtos.ProdutosBuilder.aProdutos()
                .Elemento_de_Despesa(sc.nextLine())
                .Descricao(sc.nextLine()).
                Saldo(sc.nextInt()).
                build();

        crud_elementoDeDespesaNewProdutos.Cadastro(p1);

    }

    public static void Update() throws SQLException {
        crud_elementoDeDespesaNewProdutos.Update();
    }

    public static void Saida() throws Exception {
        crud_elementoDeDespesaNewProdutos.SaidadeMaterial();
    }

    public static void Produtos() throws SQLException {
        Optional<List<Produtos>> produtos = crud_elementoDeDespesaNewProdutos.PesquisarPeloElementodeDespesa();
        produtos.stream().forEach(s -> System.out.println(s));

    }

    public static void Tipo_Produtos() throws SQLException {
        Optional<List<A_MODEL.Produtos>> Tprodutos = crud_elementoDeDespesaNewProdutos.PesquisarPeloElementodeDespesaDoProduto();
        Tprodutos.stream().forEach(s -> System.out.println(s));
    }
}
