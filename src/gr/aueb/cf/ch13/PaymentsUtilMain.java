package gr.aueb.cf.ch13;

import java.math.BigDecimal;

public class PaymentsUtilMain {

    static void main(String[] args) {
        BigDecimal firstPayment = new BigDecimal("1000.23456789");
        BigDecimal secondPayment = new BigDecimal("800.23456789");

        BigDecimal roundedFirstPayment = PaymentsUtil.round(firstPayment, 2);
        BigDecimal roundedSecondPayment = PaymentsUtil.round(secondPayment, 2);

        System.out.println("Rounded First Payment: " + roundedFirstPayment);
        System.out.println("Rounded Second Payment: " + roundedSecondPayment);

        BigDecimal diff = PaymentsUtil.diff(roundedFirstPayment, roundedSecondPayment, 2);
        System.out.println("Difference between payments: " + diff);
    }
}
