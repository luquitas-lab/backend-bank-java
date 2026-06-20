package moto;
import java.util.Scanner;
class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    Scanner teclado = new Scanner(System.in);


    public void abrirConta(String t){
        System.out.println("Digite o nome do usuário: ");
        String nomeCliente = teclado.nextLine();
        this.setDono(nomeCliente); 
        setStatus(true);
        System.out.println("Olá " + getDono() + "!");
        System.out.println("Deseja abrir uma conta corrente(CC) ou conta poupança(CP)?");
        t = teclado.nextLine();
        this.setTipo(t);
        if (this.getTipo().equalsIgnoreCase("CC")){
            this.setSaldo( 50);
            System.out.println("Você escolheu conta corrente! Seu saldo é de " + this.getSaldo());      
        } else if (getTipo().equalsIgnoreCase("CP")) {
            this.setSaldo(150);
            System.out.println("Você escolheu Conta poupança! Seu saldo é de " + this.getSaldo());
        }
        System.out.println("Conta criada com sucesso");
    }

    public void fecharConta(){
        System.out.println("Tem certeza que deseja fechar sua conta? [S/N]");
        String opcao = teclado.nextLine();
        if (opcao.equalsIgnoreCase("S")){
            if (this.getSaldo() < 0){
                System.out.println("ERRO! Você tem débitos pendentes!");
            } else if (this.getSaldo() > 0){
                System.out.println("ERRO! Você deve retirar todo seu dinheiro primeiro");
            } else {
                this.setStatus(false);
                System.out.println("Conta fechada! Até logo.");
            }
        } else {
            System.out.println("Reinicie o programa para voltar ao começo.");
    } 
        
    }

    public void depositar(float v){
        if (this.getStatus()){
        this.setSaldo(getSaldo() + v);
        System.out.println("Depósito realizado! Seu saldo agora é de R$" + this.saldo );
        } else {
            System.out.println("Você precisa abrir uma conta antes de realizar o depósito");
        }
    }

    public void sacar(float v){
        if (this.getStatus()){
        if (v <= this.getSaldo()){
            this.setSaldo(getSaldo() - v);
            System.out.println("Saque realizado! Seu saldo agora é de R$" + this.saldo );
        } else {
            System.out.println("Saldo insuficiente!");
        }
    } else {
        System.out.println("Você precisa abrir uma conta antes de realizar o saque");
    }
    }

    public void pagarMensal(){
        int v;
        System.out.println("Tem certeza que deseja pagar a mensalidade? [S/ N]");
        String opcaoMensal = teclado.nextLine();
        if (opcaoMensal.equalsIgnoreCase("S" && this.getSaldo() > v)){
             if (this.getTipo().equalsIgnoreCase("cc")){
                 v = 12;
                 System.out.println("Pagamento mensal de R$"+ v + "realizado com sucesso, seu saldo agora é de R$" + this.getSaldo());
             } else if (this.getTipo().equalsIgnoreCase("cp")){
                v = 20;
                System.out.println("Pagamento mensal de R$"+ v + "realizado com sucesso, seu saldo agora é de R$" + this.getSaldo());
             } else {
                System.out.println("Erro no pagamento. Seu saldo de R$" + this.getSaldo() + "não é suficiente para pagar R$"+v);
             }
        } else {
            System.out.println("Reinicie o programa para voltar ao MENU.");
        }
}  //System.out.println("Pagamento mensal de R$"+ v + "realizado com sucesso, seu saldo agora é de R$" + this.getSaldo());

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }


   
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public int getNumConta() {
        return numConta;
    }




    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }






}