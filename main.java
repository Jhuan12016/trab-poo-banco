public class Main {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNome("Lowgan");
		conta.depositar(450);
		conta.sacar(450);
		System.out.println(conta.getT());
		
		
		Conta conta1 = new Conta();
		conta1.setNome("Lowgan");
		conta1.setLimite(450);
		conta1.sacar(450);
		System.out.println(conta1.getT());
	
		
		
		
	}

}
