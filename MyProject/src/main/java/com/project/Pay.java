package com.project;

public class Pay {
    String Id;
    private long moneyMustPay;
    private boolean payComplite = false;
    private boolean canBeImpliment;
    public Pay (long moneyMustPay,boolean canBeImpliment,String id){
        this.moneyMustPay = moneyMustPay;this.canBeImpliment = canBeImpliment;this.Id = id;
    }
    public void ChangePayComplite(){
        this.payComplite = true;
    }

    public long getMoneyMustPay() {
        return moneyMustPay;
    }

    public void setMoneyMustPay(long moneyMustPay) {
        this.moneyMustPay = moneyMustPay;
    }

    public boolean isPayComplite() {
        return payComplite;
    }

    public void setPayComplite(boolean payComplite) {
        this.payComplite = payComplite;
    }
}
