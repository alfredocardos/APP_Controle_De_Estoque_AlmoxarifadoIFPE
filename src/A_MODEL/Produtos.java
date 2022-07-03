package A_MODEL;

public class Produtos {
    private String Descricao;
    private int Saldo;
    private String Elemento_de_Despesa;


    public Produtos() {

    }

    @Override
    public String toString() {
        return
                "ELEMENTO DE DESPESA: "
                        + this.Elemento_de_Despesa  + "\n"+
                        "DESCRIÇÃO: "
                        +  this.Descricao + "\n"+
                        "SALDO: "
                        +  this.Saldo + "\n"+
                        "----------------------------";
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo) {
        Saldo = saldo;
    }

    public String getElemento_de_Despesa() {
        return Elemento_de_Despesa;
    }

    public void setElemento_de_Despesa(String elemento_de_Despesa) {
        Elemento_de_Despesa = elemento_de_Despesa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static final class ProdutosBuilder {
        private String Descricao;
        private int Saldo;
        private String Elemento_de_Despesa;

        private ProdutosBuilder() {
        }

        public static ProdutosBuilder aProdutos() {
            return new ProdutosBuilder();
        }

        public ProdutosBuilder Descricao(String Descricao) {
            this.Descricao = Descricao;
            return this;
        }

        public ProdutosBuilder Saldo(int Saldo) {
            this.Saldo = Saldo;
            return this;
        }

        public ProdutosBuilder Elemento_de_Despesa(String Elemento_de_Despesa) {
            this.Elemento_de_Despesa = Elemento_de_Despesa;
            return this;
        }

        public Produtos build() {
            Produtos produtos = new Produtos();
            produtos.setDescricao(Descricao);
            produtos.setSaldo(Saldo);
            produtos.setElemento_de_Despesa(Elemento_de_Despesa);
            return produtos;
        }
    }
}
