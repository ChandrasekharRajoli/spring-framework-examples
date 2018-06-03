package com.chandra.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chandra.springboot.entities.Transactions;

@Repository
public interface TransactionRepository extends CrudRepository<Transactions, Long> {

    List<Transactions> findAll();
    
    Transactions saveAndFlush(Transactions txn);
    
    void deleteByTxnId(Long txnId);
    
}
