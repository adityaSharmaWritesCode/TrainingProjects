package com.project.pt.transaction;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TransactionService {

	@Autowired
	TransactionRepository trepo;
	
	public List<TransactionEntity> getAllTransactions() {
		try {
			return trepo.findAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public String createTransaction(TransactionEntity details) {
		try {
			trepo.save(details);
			return "Transaction Completed Successfully!";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "Transaction Failed";
		}
	}
	
	public List<TransactionEntity> getTransactionByCategory(int c_id) {
		try {
			return trepo.findByCid(c_id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public List<TransactionEntity> getTransactionByDate(Date date) {
		try {
			return trepo.findByDate(date);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
