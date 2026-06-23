package moto;
public class atributos {
    public static void main(String[] args) {
        Banco b1 = new Banco();
        b1.setDono("Lucas");
        b1.abrirConta("CP");
        b1.estadoConta();
        b1.depositar(500);
        b1.sacar(650);
        b1.estadoConta();
    }
}
