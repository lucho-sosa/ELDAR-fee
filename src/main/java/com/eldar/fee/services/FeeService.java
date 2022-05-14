package com.eldar.fee.services;

import java.time.LocalDate;

import com.eldar.fee.models.FeeModel;

public class FeeService {

    public FeeModel getFee(String name, float amount) {
        if (name.equals("") || amount < 0) {
            return new FeeModel("Ingrese un nombre o cargue un monton no negativo", 0);
        }
        return new FeeModel(name, calulateFee(name)*amount);
    }
    
    public float calulateFee(String name) {
        float res;
        float day, month, year;

        switch (name) {
            case "VISA":
                year = LocalDate.now().getYear() % 100;
                month = LocalDate.now().getMonthValue();
                res = year / month;
                break;
            case "NARA":
                day = LocalDate.now().getDayOfMonth();
                res = day * 0.5f;
                break;
            case "AMEX":
                month = LocalDate.now().getMonthValue();
                res = month * 0.1f;
                break;
            default:
                throw new IllegalArgumentException("Invalid name");
        }
        return correctFee(res);

    }
    private float correctFee(float fee) {
        if (fee > 5) return 0.05f;
        if (fee < 0.3f) return 0.003f;
        return fee /100;
    }
}
