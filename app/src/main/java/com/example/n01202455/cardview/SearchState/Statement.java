package com.example.n01202455.cardview.SearchState;

public class Statement {
    private String APP_STATUS;
    private String REG_NUMBER;
    private String APP_REG_DATE;
    private String FULL_TRANSACT;

    public Statement(){}
    public Statement(String APP_STATUS, String REG_NUMBER, String APP_REG_DATE, String FULL_TRANSACT){
        this.APP_STATUS = APP_STATUS;
        this.REG_NUMBER = REG_NUMBER;
        this.APP_REG_DATE = APP_REG_DATE;
        this.FULL_TRANSACT = FULL_TRANSACT;
    }

    public String getAPP_STATUS() { return APP_STATUS; }

    public void setAPP_STATUS(String APP_STATUS) {
        this.APP_STATUS = APP_STATUS;
    }

    public String getREG_NUMBER() {
        return REG_NUMBER;
    }

    public void setREG_NUMBER(String REG_NUMBER) {
        this.REG_NUMBER = REG_NUMBER;
    }

    public String getAPP_REG_DATE() {
        return APP_REG_DATE;
    }

    public void setAPP_REG_DATE(String APP_REG_DATE) {
        this.APP_REG_DATE = APP_REG_DATE;
    }

    public String getFULL_TRANSACT() {
        return FULL_TRANSACT;
    }

    public void setFULL_TRANSACT(String FULL_TRANSACT) {
        this.FULL_TRANSACT = FULL_TRANSACT;
    }
}

