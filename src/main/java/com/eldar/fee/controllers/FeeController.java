package com.eldar.fee.controllers;

import com.eldar.fee.models.FeeModel;
import com.eldar.fee.models.OperatioModel;
import com.eldar.fee.services.FeeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fee")
public class FeeController {
    FeeService feeService = new FeeService();

    @GetMapping()
    public FeeModel getFee(@RequestBody OperatioModel operatioModel) {
        try {
            return this.feeService.getFee(operatioModel.getName(), operatioModel.getAmount());
        } catch (Exception e) {
            return new FeeModel("The Credit Card is invalid", 0);
        }
    }
}
