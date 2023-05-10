public class Vendedor extends Empregado {

    private String departamento;

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }

    public String toString(){
        return "O nome do Vendedor é: " + this.getNome() + "\n" + "O salário do Vendedor é: " + this.salario + "\n" + "O Vendedor trabalha no departamento de: " + this.departamento + "\n";
    }

    public Vendedor(String nome, float salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }
    public Vendedor(){
        
    }
    
}
