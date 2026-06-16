package gr.aueb.cf.ch18.bankapp.dto;

import java.math.BigDecimal;

public record AccountWithdraw(String iban, BigDecimal amount) {


}
