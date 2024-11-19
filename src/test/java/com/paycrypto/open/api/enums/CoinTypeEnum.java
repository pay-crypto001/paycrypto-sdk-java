package com.paycrypto.open.api.enums;


public enum CoinTypeEnum {


    USDT("USDT"),
    ;


    private String value;

    /**
     * 构造
     */
    CoinTypeEnum(String value) {
        this.value = value;
    }

    public static CoinTypeEnum getCoinType(String value) {
        for (CoinTypeEnum t : values()) {
            if (t.value().equals(value)) {
                return t;
            }
        }
        return null;
    }

    public String value() {
        return value;
    }




}
