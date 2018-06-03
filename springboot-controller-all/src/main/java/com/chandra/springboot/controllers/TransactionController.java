package com.chandra.springboot.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chandra.springboot.entities.Transactions;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Transactions Controller
 * @author Chandras
 *
 */
@RestController
@RequestMapping("/account")
@Api(value = "transactionController", description = "Transactions Operations", tags = "transactions")
public class TransactionController {

    @Autowired
    private TransactionService txnService;

    @RequestMapping(value = "/transactions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "View a list of transactions.", response = List.class)
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
    public @ResponseBody List<Transactions> transactions() {
        return txnService.findAll();
    }

    @RequestMapping(value = "/transaction", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Save Transaction.", response = List.class)
    @ApiResponses(value = { 
            @ApiResponse(code = 201, message = "Transaction Saved Successfully "),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
    public @ResponseBody Transactions transactions(
            @ApiParam(value="Transaction Account Number", example="12345") @RequestParam("txnAccountNo") Long txnAccntNo,
            @ApiParam(value="Transaction Amount", example="50.55") @RequestParam("txnAmount") BigDecimal txnAmount, 
            @ApiParam(value="Transaction Account Name", example="Chandrasekhar") @RequestParam("txnAccountName") String accountName,
            @ApiParam(value="Transaction Source Country.", example="IND") @RequestParam("txnSourceCountry") String txnSrcCtry,
            @ApiParam(value="Transaction Destination Country.", example="USA") @RequestParam("txnDestinationCountry") String txnDestCtry) {
        return txnService.saveTransaction(txnAccntNo, txnAmount, accountName, txnSrcCtry, txnDestCtry);
    }
    
    @RequestMapping(value = "/transaction", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Save Transaction.", response = List.class)
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Transaction Record Deleted Successfully "),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
    public void transactions(@ApiParam(value="Transaction Identifier", example="12345") @RequestParam("txnId") Long txnId) {
        txnService.deleteTxnById(txnId);
    }
}
