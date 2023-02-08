package entities;

/*Está classe sera outra sublasse de conta poupança que é 
 * uma subclasse que estende da superclasse Accornt.
 */
public class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	/* Método construtor herdado da superclasse Accont */
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	/*
	 * Neste método vou ter uma operação para atualizar o saldo com base na taxa de
	 * juros
	 */
	public void updateBalance() {

		// O saldo recebe ele mesmo mais o saldo multiplicado pelo valor do juros
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw (double amount) {
		balance -= amount;
	}
	
}
