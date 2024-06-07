package spring.hibernate.exception;

public class InsufficientBalanceError extends RuntimeException{

	public InsufficientBalanceError(String msg) {
		super(msg);
	}
}
