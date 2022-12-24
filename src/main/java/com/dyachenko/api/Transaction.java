package com.dyachenko.api;

public class Transaction {
    private Long outcomeAccountId;
    private Long incomeAccountId;
    private Long sum;

    public Long getOutcomeAccountId() {
        return outcomeAccountId;
    }

    public void setOutcomeAccountId(Long outcomeAccountId) {
        this.outcomeAccountId = outcomeAccountId;
    }

    public Long getIncomeAccountId() {
        return incomeAccountId;
    }

    public void setIncomeAccountId(Long incomeAccountId) {
        this.incomeAccountId = incomeAccountId;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }
}
