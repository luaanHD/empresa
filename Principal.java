public class Principal {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("José Benedito Campos Miguel", 3450.85f);
        Gerente gerente = new Gerente("Isaque Katahira Franco Melo", 14850.85f,1.15f);
        Vendedor vendedor = new Vendedor("Josefina Filé dos Reis", 4575.75f, "Finanças");

        System.out.println(empregado.toString());
        System.out.println(gerente.toString());
        System.out.println(vendedor.toString());

    }
}
