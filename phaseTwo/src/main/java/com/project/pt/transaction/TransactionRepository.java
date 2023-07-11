package com.project.pt.transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Integer> {

	public List<TransactionEntity> findByCid(int cid);
	public List<TransactionEntity> findByDate(Date date);
	
}
