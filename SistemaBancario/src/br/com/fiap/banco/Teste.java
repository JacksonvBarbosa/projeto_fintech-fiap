package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		//dados da conta
		System.out.println("Seja bem vindo(a) a sua Conta Fintech");
		conta.setAgencia(1111);
		conta.setNumero(2345);
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		System.out.println("_____________________________________________________________________________________________________");
		
		//movimentações da conta poupança
		System.out.println("Conta Poupança");
		cp.setDeposito(2000);
		cp.efetuarDeposito();
		System.out.printf("Saldo Inicial: R$ %.2f\n", cp.getSaldo());
		cp.setSaque(50);
		System.out.printf("Saque Realizado: R$ %.2f\n", cp.getSaque());
		//cp.efetuarSaque();
		System.out.printf("Saldo Atual: R$ %.2f\n", cp.getSaldo());
		//cp.setDeposito(380);
		//cp.efetuarDeposito();
		cp.setAnos(3);
		
		System.out.printf("Rendimento de %d anos: R$ %.2f\n",cp.getAnos(), cp.getRendimento());
		System.out.printf("Saldo Atual: R$ %.2f\n", cp.exibirSaldoRendimento());
		System.out.println("_____________________________________________________________________________________________________");
		
		
		//movimentações da conta corrente
		System.out.println("Conta Corrente");
		cc.setDeposito(5000);
		cc.efetuarDeposito();
		System.out.printf("Saldo: R$ %.2f\n", cc.getSaldo());
		cc.setSaque(500);
		
		System.out.printf("Cobrança Cheque Especial: R$ %.2f\n", cc.getChequeEspecial());
		System.out.printf("Saldo Atual: R$ %.2f\n", cc.getSaldo());
		System.out.println("_____________________________________________________________________________________________________");
	}

}
