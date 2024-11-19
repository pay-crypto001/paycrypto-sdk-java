package com.paycrypto.open.api.test;

import com.github.ontio.account.Account;
import com.github.ontio.common.Helper;
import com.github.ontio.crypto.SignatureScheme;
import com.github.ontio.sdk.manager.ECIES;
import com.paycrypto.open.api.util.Base64Utils;
import com.paycrypto.open.api.util.HttpUtil;
import com.paycrypto.open.api.util.RsaUtils;
import com.paycrypto.open.api.dto.CardInfoReq;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

/**
 * @author zhouq
 * @version 1.0
 * @date 2019/12/11
 */
public class RSATest {

    String host = "https://api.sandbox.paycrypto.com";
    private static final String apiKey = "14db63d7f3614664ad1c71dd134a21dc";
    private static final String apiSecret = "ed8cb3a0-8365-4340-9d9c-33f051eedccd";
    private static final String apiPassphrase = "12345678a";


    @Before
    public void setUp() throws Exception {
        HttpUtil.init(host,apiKey,apiSecret,apiPassphrase);
    }
    @Test
    public void eciesTest() throws Exception {
        Account account = new Account(SignatureScheme.SHA256WITHECDSA);
        System.out.println("privatekey:"+Helper.toHexString(account.serializePrivateKey()));
        System.out.println("publickey:"+Helper.toHexString(account.serializePublicKey()));
        String msg = "12345678";
        String[] endata = ECIES.Encrypt(Helper.toHexString(account.serializePublicKey()),msg.getBytes());
        byte[] dedata = ECIES.Decrypt(Helper.toHexString(account.serializePrivateKey()),endata);
        System.out.println(new String(dedata));
    }
    @Test
    public void rsaTest() throws Exception {

        Map<String, Object> map = RsaUtils.genKeyPair();
        String publicKey = RsaUtils.getPublicKey(map);
        System.out.println("String publicKey= \""+publicKey+"\";");
        String privateKey = RsaUtils.getPrivateKey(map);
        System.out.println("String privateKey= \""+privateKey+"\";");
        String data = "12345678a";
        byte[] endata = RsaUtils.encryptByPublicKey(data.getBytes(),publicKey);
        System.out.println(Base64Utils.encode(endata));
        String rspContent = new String(RsaUtils.decryptByPrivateKey(endata, privateKey));
        System.out.println(rspContent);

    }

    @Test
    public void getBankVirtualcardByPostTest() throws Exception {
        String publicKey= "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCDtxc+w3LlhtF3DcbgS8zqvjYs8Z+s03DrtbQb8iigeMAbKjXLbrWZwX6IprmVRandLuM3PV3UU7L4SCdJZBRUjgEe0q3F/kUe1XwFhsl4aoW9FHKK/d/em50qHSLXw/KPX2HyZ9Ey9G/bV6OwJXvkUYfStBjHNgPlwFca17QhuQIDAQAB";
        String privateKey= "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIO3Fz7DcuWG0XcNxuBLzOq+Nizxn6zTcOu1tBvyKKB4wBsqNctutZnBfoimuZVFqd0u4zc9XdRTsvhIJ0lkFFSOAR7SrcX+RR7VfAWGyXhqhb0Ucor9396bnSodItfD8o9fYfJn0TL0b9tXo7Ale+RRh9K0GMc2A+XAVxrXtCG5AgMBAAECgYAi/YadU8q4EuKeX/iPKVPcoH8/3Uhv3xPGalTYf7IvPyS5krMLwfNYT0DQCIqQjxsa+RO/XvwIJdwLfQ+CvaVwlr44f7ytmFAiKlWGGy7xIrfAVzyxZiEVJMLpiBxwhPjAm0Z1IpuQygXxfMJ1ZVD3vltwt5yWGE6cCaqvU8kR6QJBAM3LTkrEm9xVxTCj3fQzI+qk4kwLZREDb/AnZ9rJKFmgAD5JmCl/M8PJty/ucXcKQuXU3a6zGZsRNLLWlSjlbe8CQQCj2T+Ezjx/i7yns5fugJ87MlvuD1NKUFdo94EaxF6cF5n7BmhI9LFhqXi5KaQVuITB6DMsyQYkCiABq1OBVhLXAkAw7FAkfjD/ZHSIZ6xwTWgQdDpIEb1pGgQWd4e8/21UQTFNnXlLBC5uMRoXjvvybMISmVRKH9HKh4Cbs1+qZUCJAkEAihSFgShEt8BNZo7lVSu0BTE1Y/QqXxBB+cXLWYFvsd/59iC6NfFwozss7+51x5BO4RMMPYvTzv9xZba6kt601QJBAJ6A5/YzzPU9Aeiy43dL59GHYrPG8NHatUcY2GiMuvrXREWzde/s261EIK3+6etVTQuqJkmighNCDsACxcBZn1U=";

        String requestPath = "/api/v1/bank/virtualcard";
        String requestQueryStr = "card_no=4334094500000041101";
        CardInfoReq req = new CardInfoReq();
        req.setCard_no("4334094500000041101");
        req.setPublickey(publicKey);
        HttpUtil.post(requestPath,requestQueryStr,req.toString());


        String endata = "IljYkMeAN1wBMcfreEUuJ+26haMcm8UIVNeXkY8WKKbvjBi1EoJhycMoebKTyekEO5R3JN0QePZxZkh6KSioz5gykMJ9exCIaZ4nQEkD5p1g4VWGcBkYfV2axgxUzuoyHW7r5myrHpGROmiiqPnzqm9Aj5e46j29pMxJWCQP44E=";
        String rspContent = new String(RsaUtils.decryptByPrivateKey(Base64Utils.decode(endata), privateKey));
        System.out.println(rspContent);
    }

}
