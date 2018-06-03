package com.chandra.springboot.controllers;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandra.springboot.entities.Transactions;
import com.chandra.springboot.repository.TransactionRepository;

@Service
@Transactional
public class TransactionService {

    @Autowired
    private TransactionRepository txnRepository;

    public List<Transactions> findAll() {
        return txnRepository.findAll();
    }

    public Transactions saveTransaction(Long txnAccntNo, BigDecimal txnAmount,
            String accountName, String txnSrcCtry, String txnDestCtry) {
        return txnRepository.saveAndFlush(new Transactions(txnAmount, txnAccntNo, accountName, txnSrcCtry, txnDestCtry));
    }
    
    public void deleteTxnById(Long txnId) {
        txnRepository.deleteByTxnId(txnId);
    }
}
