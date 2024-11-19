package com.paycrypto.open.api.dto;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;


public class AccountKycReq {



    @JSONField(name = "acct_no")
    private String acctNo;


    @JSONField(name = "acct_name")
    private String acctName;


    @JSONField(name = "first_name")
    private String firstName;


    @JSONField(name = "last_name")
    private String lastName;


    @JSONField(name = "gender")
    private String gender;


    private String birthday;


    private String city;


    private String state;


    private String country;


    @JSONField(name = "country_code")
    private String countryCode;


    @JSONField(name = "doc_no")
    private String docNo;


    @JSONField(name = "doc_type")
    private String docType;


    @JSONField(name = "front_doc")
    private String frontDoc;


    @JSONField(name = "back_doc")
    private String backDoc;


    @JSONField(name = "mix_doc")
    private String mixDoc;


    private String mobile;


    private String mail;


    private String address;


    private Integer status;



    private String nationality;


    private String zipcode;


    @JSONField(name = "maiden_name")
    private String maidenName;


    @JSONField(name = "card_type_id")
    private String cardTypeId;


    private String kycInfo;

    private String[] poa_doc;


    private String mailVerificationCode;


    private String mailToken;




    public String getAcctNo() {
        return acctNo;
    }


    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }


    public String getAcctName() {
        return acctName;
    }


    public void setAcctName(String acctName) {
        this.acctName = acctName == null ? null : acctName.trim();
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }


    public String getBirthday() {
        return birthday;
    }


    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }


    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }


    public String getCountryCode() {
        return countryCode;
    }


    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }


    public String getDocNo() {
        return docNo;
    }


    public void setDocNo(String docNo) {
        this.docNo = docNo == null ? null : docNo.trim();
    }


    public String getDocType() {
        return docType;
    }


    public void setDocType(String docType) {
        this.docType = docType == null ? null : docType.trim();
    }


    public String getFrontDoc() {
        return frontDoc;
    }


    public void setFrontDoc(String frontDoc) {
        this.frontDoc = frontDoc == null ? null : frontDoc.trim();
    }


    public String getBackDoc() {
        return backDoc;
    }


    public void setBackDoc(String backDoc) {
        this.backDoc = backDoc == null ? null : backDoc.trim();
    }


    public String getMixDoc() {
        return mixDoc;
    }


    public void setMixDoc(String mixDoc) {
        this.mixDoc = mixDoc == null ? null : mixDoc.trim();
    }


    public String getMobile() {
        return mobile;
    }


    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }


    public String getMail() {
        return mail;
    }


    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }


    public Integer getStatus() {
        return status;
    }


    public void setStatus(Integer status) {
        this.status = status;
    }


    public String getNationality() {
        return nationality;
    }


    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }


    public String getZipcode() {
        return zipcode;
    }


    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }


    public String getMaidenName() {
        return maidenName;
    }


    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName == null ? null : maidenName.trim();
    }

    public String getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(String cardTypeId) {
        this.cardTypeId = cardTypeId == null ? null : cardTypeId.trim();
    }


    public String getKycInfo() {
        return kycInfo;
    }


    public void setKycInfo(String kycInfo) {
        this.kycInfo = kycInfo == null ? null : kycInfo.trim();
    }


    public String[] getPoa_doc() {
        return poa_doc;
    }
    public void setPoa_doc(String[] poa_doc) {
        this.poa_doc = poa_doc;
    }

    public String getMailVerificationCode() {
        return mailVerificationCode;
    }
    public void setMailVerificationCode(String mailVerificationCode) {
        this.mailVerificationCode = mailVerificationCode == null ? null : mailVerificationCode.trim();
    }

    public String getMailToken() {
        return mailToken;
    }
    public void setMailToken(String mailToken) {
        this.mailToken = mailToken == null ? null : mailToken.trim();
    }

    @Override
    public String toString(){
        return JSONObject.toJSONString(this);
    }


}