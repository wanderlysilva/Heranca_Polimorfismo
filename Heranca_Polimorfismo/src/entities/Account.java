package entities;

/*Esta classe sera a super classe onde os atribudos definidos nela serão
 * herdados para a sub-classe BusunessAccount 
 */
public class Account {

	private Integer number;
	private String holder;
	protected Double balance;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance) {

		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}

	
	public void deposit(double amount) {
		balance += amount;
	}

}
