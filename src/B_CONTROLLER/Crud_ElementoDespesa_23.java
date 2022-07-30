package B_CONTROLLER;

import A_MODEL.ConexaoJDBC;
import A_MODEL.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Crud_ElementoDespesa_23 implements  CRUD{
    private Scanner sc = new Scanner(System.in);

    @Override
    public void Cadastro(Produtos produtos) throws SQLException {
        String sql = "INSERT INTO elemento23 VALUES (?,?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConexaoJDBC.createConnectionToMySQL();
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, produtos.getElemento_de_Despesa());
            preparedStatement.setString(2, produtos.getDescricao());
            preparedStatement.setInt(3, produtos.getSaldo());
            preparedStatement.execute();
            if (preparedStatement != null) {
                System.out.println("cadastro realizado ");
            } else {
                System.out.println("erro!");
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }

        }
    }

    @Override
    public void Update() throws SQLException {
        System.out.println(" ELEMENTO DE DESPESA ");
        String ed = sc.nextLine();
        System.out.println("DESCRICAO ");
        String Descricao = sc.nextLine();
        System.out.println("SALDO");
        int saldo = sc.nextInt();
        if (ed == null) {
            System.out.println("erro");
        }

        String sql = "UPDATE elemento23 SET descricao = ?, saldo = ? WHERE elemento_de_despesa = '" + ed + "'";
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = ConexaoJDBC.createConnectionToMySQL();
            pstm = conn.prepareCall(sql);
            pstm.setString(1, Descricao);
            pstm.setInt(2, saldo);

            if (pstm.executeUpdate() > 0) {
                System.out.println("Update relizado ");
            } else {
                System.out.println("Erro!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
            if (pstm != null) {
                pstm.close();
            }

        }

    }

    public Optional<List<Produtos>> PesquisarPeloElementodeDespesaDoProduto() throws SQLException {

        List<Produtos> lista = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = ConexaoJDBC.createConnectionToMySQL();
            System.out.println("ELEMENTO DE DESPESA ");
            String ed = sc.nextLine();
            preparedStatement = connection.prepareStatement("SELECT * FROM elemento23 WHERE elemento_de_despesa LIKE'" + ed + "'");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Produtos produtos = new Produtos();
                produtos.setElemento_de_Despesa(resultSet.getString(1));
                produtos.setDescricao(resultSet.getString(2));
                produtos.setSaldo(resultSet.getInt(3));
                lista.add(produtos);
            }

            return Optional.ofNullable(lista);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        }

        return Optional.empty();
    }

    public Optional<List<Produtos>> PesquisarPeloElementodeDespesa() throws SQLException {

        List<Produtos> lista = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = ConexaoJDBC.createConnectionToMySQL();
            preparedStatement = connection.prepareStatement("SELECT * FROM elemento23");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Produtos produtos = new Produtos();
                produtos.setElemento_de_Despesa(resultSet.getString(1));
                produtos.setDescricao(resultSet.getString(2));
                produtos.setSaldo(resultSet.getInt(3));
                lista.add(produtos);
            }

            return Optional.ofNullable(lista);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        }

        return Optional.empty();


    }

    @Override
    public void SaidadeMaterial() throws Exception {
        System.out.println(" ELEMENTO DE DESPESA ");
        String ed = sc.nextLine();
        System.out.println("QUANTIDADE SAIDA ");
        int saida = sc.nextInt();
        Connection concect = null;
        PreparedStatement preparedStatement = null;
        try {
            concect = ConexaoJDBC.createConnectionToMySQL();
            preparedStatement = concect.prepareStatement
                    ("UPDATE elemento23 SET saldo = saldo - (?) WHERE elemento_de_despesa = '" + ed + "'");
            preparedStatement.setInt(1, saida);
                        preparedStatement.closeOnCompletion();

            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("Saida relizada ");
            } else {
                System.out.println("Erro!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (concect != null) concect.close();
            if (preparedStatement != null) preparedStatement.close();
        }


    }
    }

