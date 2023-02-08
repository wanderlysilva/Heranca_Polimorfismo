package entities;

/*Fazendo o extends eu digo para o compilador que a classe BusinessAccount 
 * irá herdar os atributos da superclasse Account.
 */
public class BusinessAccount extends Account {

	private Double loanLimit;

	/*
	 * No construtor padrão da subclasse podemos passar a palavra super caso haja
	 * uma nova implementação eu posso repetir a lógica implementada na superclasse
	 * Account.
	 */
	public BusinessAccount() {
		super();
	}

	/*
	 * Na hora de fazer o construtor na minha subclasse podemos escolher o
	 * construtor da classe super classe Account com todos os seus atributos.
	 */
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	/*
	 * Aqui estou sobrescrevendo o método da superclasse chamando o método pelo
	 * super e acrescentando um novo valor de 2.0 que irá descontar nesta conta o
	 * valor atribuída na superclasse com o valor desta operação que será a cada vez
	 * que que este método for chamado irá descontar R$ 7,00 reais.
	 */
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

	/*
	 * Este método para depositar tem o if para indicar que não posso emprestar um
	 * valor acima do limite ele tem que ser menor ou igual o limite da quantia do
	 * empréstimo.Para ter acesso ao atributo da superclasse Account mudei o acesso
	 * do atributo balance para protected.
	 */
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10;
		}

	}
}
