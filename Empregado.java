public class Empregado {
    
    private String nome;
    protected float salario;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public String toString(){
        return "\n" + "O nome do empregado é: " + this.getNome() + "\n" + "O salário de um empregado é: R$" + this.salario + "\n";
    }

    public Empregado(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }
    public Empregado(){

    }
}
