public class Main {
    public static void main(String[] args) throws Exception {
       
        Cliente Maria = new Cliente();
        Maria.setNome(("Maria"));

        Conta cc = new ContaCorrente(Maria);
        Conta cp = new ContaPoupanca(Maria);

        cc.depositar(100);
        cc.transferir(75, cp);

        cc.imprimirExtrato();
        cc.imprimirInfoComuns();

        cp.imprimirExtrato();
        cp.imprimirInfoComuns();

    }
}
