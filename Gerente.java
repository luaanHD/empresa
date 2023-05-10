public class Gerente extends Empregado {

    private float percentualComissao; 

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    public float getPercentualComissao() {
        return percentualComissao;
    }

    public String toString(){

        return  "O nome do Gerente é: " +  this.getNome() + "\n" + 
        "O seu salário com a sua comissão de 20% foi de: R$" + this.salario + ", para: R$" + (percentualComissao * this.salario) + "\n";

    }

    public Gerente(String nome, float salario, float percentualComissao){
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }
    public Gerente(){

    }
    
}
