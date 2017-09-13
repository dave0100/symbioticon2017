/*
 * YOMO-Service-Emulation with AHOI
 * [Data Privacy](/sandboxmanager/#/privacy)  [Terms of Service](/sandboxmanager/#/terms)  [Imprint](https://sparkassen-hub.com/impressum/)  &copy; 2017 Starfinanz - Ein Unternehmen der Finanz Informatik
 *
 * OpenAPI spec version: 2.1.0-yomo-emulator
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Amount;
import io.swagger.client.model.Transaction;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * GiroTransaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-05T14:43:56.054Z")
public class GiroTransaction extends Transaction {
  @SerializedName("amount")
  private Amount amount = null;

  @SerializedName("bookingDate")
  private DateTime bookingDate = null;

  @SerializedName("valueDate")
  private DateTime valueDate = null;

  @SerializedName("creditor")
  private String creditor = null;

  @SerializedName("creditorBankCode")
  private String creditorBankCode = null;

  @SerializedName("creditorAccountNumber")
  private String creditorAccountNumber = null;

  @SerializedName("debtor")
  private String debtor = null;

  @SerializedName("debtorBankCode")
  private String debtorBankCode = null;

  @SerializedName("debtorAccountNumber")
  private String debtorAccountNumber = null;

  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("cleanPurpose")
  private String cleanPurpose = null;

  @SerializedName("prebooked")
  private Boolean prebooked = null;

  @SerializedName("bookingKey")
  private String bookingKey = null;

  public GiroTransaction amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount value
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Amount value")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public GiroTransaction bookingDate(DateTime bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

   /**
   * Booking date (ISO 8601: \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssX\&quot;)
   * @return bookingDate
  **/
  @ApiModelProperty(required = true, value = "Booking date (ISO 8601: \"yyyy-MM-dd'T'HH:mm:ssX\")")
  public DateTime getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(DateTime bookingDate) {
    this.bookingDate = bookingDate;
  }

  public GiroTransaction valueDate(DateTime valueDate) {
    this.valueDate = valueDate;
    return this;
  }

   /**
   * Value Date (ISO 8601: \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssX\&quot;)
   * @return valueDate
  **/
  @ApiModelProperty(required = true, value = "Value Date (ISO 8601: \"yyyy-MM-dd'T'HH:mm:ssX\")")
  public DateTime getValueDate() {
    return valueDate;
  }

  public void setValueDate(DateTime valueDate) {
    this.valueDate = valueDate;
  }

  public GiroTransaction creditor(String creditor) {
    this.creditor = creditor;
    return this;
  }

   /**
   * Creditor&#39;s name
   * @return creditor
  **/
  @ApiModelProperty(required = true, value = "Creditor's name")
  public String getCreditor() {
    return creditor;
  }

  public void setCreditor(String creditor) {
    this.creditor = creditor;
  }

  public GiroTransaction creditorBankCode(String creditorBankCode) {
    this.creditorBankCode = creditorBankCode;
    return this;
  }

   /**
   * Creditor&#39;s bank code or BIC
   * @return creditorBankCode
  **/
  @ApiModelProperty(value = "Creditor's bank code or BIC")
  public String getCreditorBankCode() {
    return creditorBankCode;
  }

  public void setCreditorBankCode(String creditorBankCode) {
    this.creditorBankCode = creditorBankCode;
  }

  public GiroTransaction creditorAccountNumber(String creditorAccountNumber) {
    this.creditorAccountNumber = creditorAccountNumber;
    return this;
  }

   /**
   * Creditor&#39;s account number or IBAN
   * @return creditorAccountNumber
  **/
  @ApiModelProperty(value = "Creditor's account number or IBAN")
  public String getCreditorAccountNumber() {
    return creditorAccountNumber;
  }

  public void setCreditorAccountNumber(String creditorAccountNumber) {
    this.creditorAccountNumber = creditorAccountNumber;
  }

  public GiroTransaction debtor(String debtor) {
    this.debtor = debtor;
    return this;
  }

   /**
   * Debtor&#39;s name
   * @return debtor
  **/
  @ApiModelProperty(required = true, value = "Debtor's name")
  public String getDebtor() {
    return debtor;
  }

  public void setDebtor(String debtor) {
    this.debtor = debtor;
  }

  public GiroTransaction debtorBankCode(String debtorBankCode) {
    this.debtorBankCode = debtorBankCode;
    return this;
  }

   /**
   * Debtor&#39;s bank code or BIC
   * @return debtorBankCode
  **/
  @ApiModelProperty(value = "Debtor's bank code or BIC")
  public String getDebtorBankCode() {
    return debtorBankCode;
  }

  public void setDebtorBankCode(String debtorBankCode) {
    this.debtorBankCode = debtorBankCode;
  }

  public GiroTransaction debtorAccountNumber(String debtorAccountNumber) {
    this.debtorAccountNumber = debtorAccountNumber;
    return this;
  }

   /**
   * Debtor&#39;s account number or IBAN
   * @return debtorAccountNumber
  **/
  @ApiModelProperty(value = "Debtor's account number or IBAN")
  public String getDebtorAccountNumber() {
    return debtorAccountNumber;
  }

  public void setDebtorAccountNumber(String debtorAccountNumber) {
    this.debtorAccountNumber = debtorAccountNumber;
  }

  public GiroTransaction purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Purpose (as given by the provider)
   * @return purpose
  **/
  @ApiModelProperty(required = true, value = "Purpose (as given by the provider)")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public GiroTransaction cleanPurpose(String cleanPurpose) {
    this.cleanPurpose = cleanPurpose;
    return this;
  }

   /**
   * Cleaned purpose. Some SEPA information is filtered out (e.g., \&quot;KREF+-1434947533-2...\&quot;)
   * @return cleanPurpose
  **/
  @ApiModelProperty(value = "Cleaned purpose. Some SEPA information is filtered out (e.g., \"KREF+-1434947533-2...\")")
  public String getCleanPurpose() {
    return cleanPurpose;
  }

  public void setCleanPurpose(String cleanPurpose) {
    this.cleanPurpose = cleanPurpose;
  }

  public GiroTransaction prebooked(Boolean prebooked) {
    this.prebooked = prebooked;
    return this;
  }

   /**
   * Flag to identify if the transaction is marked as pre-booked
   * @return prebooked
  **/
  @ApiModelProperty(required = true, value = "Flag to identify if the transaction is marked as pre-booked")
  public Boolean getPrebooked() {
    return prebooked;
  }

  public void setPrebooked(Boolean prebooked) {
    this.prebooked = prebooked;
  }

  public GiroTransaction bookingKey(String bookingKey) {
    this.bookingKey = bookingKey;
    return this;
  }

   /**
   * Booking key for transaction
   * @return bookingKey
  **/
  @ApiModelProperty(required = true, value = "Booking key for transaction")
  public String getBookingKey() {
    return bookingKey;
  }

  public void setBookingKey(String bookingKey) {
    this.bookingKey = bookingKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiroTransaction giroTransaction = (GiroTransaction) o;
    return Objects.equals(this.amount, giroTransaction.amount) &&
        Objects.equals(this.bookingDate, giroTransaction.bookingDate) &&
        Objects.equals(this.valueDate, giroTransaction.valueDate) &&
        Objects.equals(this.creditor, giroTransaction.creditor) &&
        Objects.equals(this.creditorBankCode, giroTransaction.creditorBankCode) &&
        Objects.equals(this.creditorAccountNumber, giroTransaction.creditorAccountNumber) &&
        Objects.equals(this.debtor, giroTransaction.debtor) &&
        Objects.equals(this.debtorBankCode, giroTransaction.debtorBankCode) &&
        Objects.equals(this.debtorAccountNumber, giroTransaction.debtorAccountNumber) &&
        Objects.equals(this.purpose, giroTransaction.purpose) &&
        Objects.equals(this.cleanPurpose, giroTransaction.cleanPurpose) &&
        Objects.equals(this.prebooked, giroTransaction.prebooked) &&
        Objects.equals(this.bookingKey, giroTransaction.bookingKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bookingDate, valueDate, creditor, creditorBankCode, creditorAccountNumber, debtor, debtorBankCode, debtorAccountNumber, purpose, cleanPurpose, prebooked, bookingKey, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiroTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
    sb.append("    creditorBankCode: ").append(toIndentedString(creditorBankCode)).append("\n");
    sb.append("    creditorAccountNumber: ").append(toIndentedString(creditorAccountNumber)).append("\n");
    sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
    sb.append("    debtorBankCode: ").append(toIndentedString(debtorBankCode)).append("\n");
    sb.append("    debtorAccountNumber: ").append(toIndentedString(debtorAccountNumber)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    cleanPurpose: ").append(toIndentedString(cleanPurpose)).append("\n");
    sb.append("    prebooked: ").append(toIndentedString(prebooked)).append("\n");
    sb.append("    bookingKey: ").append(toIndentedString(bookingKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
