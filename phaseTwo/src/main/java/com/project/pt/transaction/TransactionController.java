package com.project.pt.transaction;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	TransactionService ts;
	
	@GetMapping("/get")
	public List<TransactionEntity> getAllTransactions() {
		return ts.getAllTransactions();
	}
	
	@PostMapping("/create")
	public String createTransaction(@RequestBody TransactionEntity details) {
		return ts.createTransaction(details);
	}
	
	@GetMapping("/get/category/{id}")
	public List<TransactionEntity> getTransactionByCategory(@PathVariable int id){
		return ts.getTransactionByCategory(id);
	}
	
	@GetMapping("/get/date/{odate}")
	public List<TransactionEntity> getTransactionByDate(@PathVariable Date odate){
		return ts.getTransactionByDate(odate);
	}
}
