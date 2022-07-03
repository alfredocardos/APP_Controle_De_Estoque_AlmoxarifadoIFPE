package B_CONTROLLER;


import A_MODEL.Produtos;

import java.sql.SQLException;


public interface CRUD {
  void Cadastro(Produtos produtos) throws SQLException;
 void Update() throws SQLException;
void SaidadeMaterial () throws Exception;

}

