package spring.hibernate.utility;

import java.util.HashMap;
import java.util.Map;

import spring.hibernate.exception.InsufficientBalanceError;

public class AccountInfo {
	
	public static Map<String, Double> accountInfo = new HashMap<>();
	
	static {
		accountInfo.put("acc1", 1200.00);
		accountInfo.put("acc2", 1500.39);
		accountInfo.put("acc2", 800.00);
		accountInfo.put("acc2", 900.36);
	}
	
	public static boolean validateCreditLimit(String accNo, double paidAmount) {
		
		if(paidAmount > accountInfo.get(accNo)) {
			throw new InsufficientBalanceError("Insufficient balance!!");
		}else {
			return true;
		}
		
	}

}
