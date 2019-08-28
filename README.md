public class Conta {

	private String Nome;
	
	private double saldo;
	
	private double limite;
	
	private StringBuilder t = new StringBuilder();

	public StringBuilder getT() {
		return t;
	}
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void depositar(double saldo) {
		if(saldo > 0) {
		t.append("\n======= Extrato Deposito ======\n");
		t.append("Nome: " + this.Nome +'\n');
		t.append("Saldo Atual: R$ "+ (this.saldo)+'\n');
		t.append("Valor do Depósito: R$ "+ (saldo)+ '\n');
		t.append("Saldo Após o Depósito: R$ "+( saldo + this.saldo)+'\n');
		this.saldo = saldo + this.saldo;
		}else {
			System.out.println("Valor não Aceitável");
		}
	}
	
	public void sacar(double saldo) {
		if ( saldo > 0) {
			if(this.saldo >= saldo) {
				t.append("\n======= Extrato Saque ======\n");
				t.append("Nome: " + this.Nome +'\n');
				t.append("Saldo Atual: R$ "+ (this.saldo)+'\n');
				t.append("Valor do Saque: R$ "+ (saldo)+ '\n');
				t.append("Saldo Após o Saque: R$ " + (this.saldo - saldo));
				this.saldo = this.saldo - saldo;
			} else if(this.saldo == 0) {
				if (saldo <= this.limite) {
					t.append("\n======= Extrato Saque ======\n");
					t.append("Nome: " + this.Nome +'\n');
					t.append("Saldo Atual: R$ "+ (this.saldo)+'\n');
					t.append("Saldo Atual Limite: R$ " + (this.limite) + '\n');
					this.saldo = -saldo;
					this.limite = this.limite - saldo;
					t.append("Valor do Saque: R$ "+ (saldo)+ '\n');
					t.append("Saldo Após o saque do Limite: R$ " + (this.limite) + '\n');
					t.append("Saldo Após o Saque:" + ( this.saldo = -saldo));
			
				}else {
					System.out.println("Valor Inválido");
				}
				}
		} else {
				System.out.println("Valor Invalido");
	}
	}
	
	
	public String pegarSaldo() {
		
		return ""+ getSaldo()+"";
	}
	
	public String pegarNome() {
		
		return ""+ getNome() +"";
	}
	
	
}
