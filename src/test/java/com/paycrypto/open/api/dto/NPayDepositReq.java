package com.paycrypto.open.api.dto;

import com.alibaba.fastjson.JSONObject;

public class NPayDepositReq {


    private String acct_no;


    private String cust_user_no;


    private String cust_tx_id;


    private String coin_type;


    private String tx_amount;


    private String bonus_coin_type;


    private String bonus_tx_amount;


    private String remark;

    public String getAcct_no() {
        return acct_no;
    }

    public String getCust_user_no() {
        return cust_user_no;
    }

    public String getCust_tx_id() {
        return cust_tx_id;
    }

    public String getCoin_type() {
        return coin_type;
    }

    public String getTx_amount() {
        return tx_amount;
    }

    public String getBonus_coin_type() {
        return bonus_coin_type;
    }

    public String getBonus_tx_amount() {
        return bonus_tx_amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setAcct_no(String acct_no) {
        this.acct_no = acct_no;
    }

    public void setCust_user_no(String cust_user_no) {
        this.cust_user_no = cust_user_no;
    }

    public void setCust_tx_id(String cust_tx_id) {
        this.cust_tx_id = cust_tx_id;
    }

    public void setCoin_type(String coin_type) {
        this.coin_type = coin_type;
    }

    public void setTx_amount(String tx_amount) {
        this.tx_amount = tx_amount;
    }

    public void setBonus_coin_type(String bonus_coin_type) {
        this.bonus_coin_type = bonus_coin_type;
    }

    public void setBonus_tx_amount(String bonus_tx_amount) {
        this.bonus_tx_amount = bonus_tx_amount;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }
}
