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
import java.io.IOException;

/**
 * Transfer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-05T14:43:56.054Z")
public class Transfer {
  @SerializedName("iban")
  private String iban = null;

  @SerializedName("bic")
  private String bic = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("amount")
  private Amount amount = null;

  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("tanMediaId")
  private String tanMediaId = null;

  @SerializedName("tanScheme")
  private String tanScheme = null;

  public Transfer iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * IBAN - International Bank Account Number (defined in ISO 13616-1)
   * @return iban
  **/
  @ApiModelProperty(required = true, value = "IBAN - International Bank Account Number (defined in ISO 13616-1)")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public Transfer bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * BIC - Business Identifier Code (defined in ISO-9362)
   * @return bic
  **/
  @ApiModelProperty(value = "BIC - Business Identifier Code (defined in ISO-9362)")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public Transfer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name - Name of the creditor
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name - Name of the creditor")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Transfer amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount to be transfered
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Amount to be transfered")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public Transfer purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Purpose
   * @return purpose
  **/
  @ApiModelProperty(value = "Purpose")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public Transfer tanMediaId(String tanMediaId) {
    this.tanMediaId = tanMediaId;
    return this;
  }

   /**
   * TANMediaId - The identifying ID of the TANMedia.
   * @return tanMediaId
  **/
  @ApiModelProperty(required = true, value = "TANMediaId - The identifying ID of the TANMedia.")
  public String getTanMediaId() {
    return tanMediaId;
  }

  public void setTanMediaId(String tanMediaId) {
    this.tanMediaId = tanMediaId;
  }

  public Transfer tanScheme(String tanScheme) {
    this.tanScheme = tanScheme;
    return this;
  }

   /**
   * TANScheme - The scheme **id** that is used to verify this payment (e.g. \&quot;901\&quot;)
   * @return tanScheme
  **/
  @ApiModelProperty(required = true, value = "TANScheme - The scheme **id** that is used to verify this payment (e.g. \"901\")")
  public String getTanScheme() {
    return tanScheme;
  }

  public void setTanScheme(String tanScheme) {
    this.tanScheme = tanScheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transfer transfer = (Transfer) o;
    return Objects.equals(this.iban, transfer.iban) &&
        Objects.equals(this.bic, transfer.bic) &&
        Objects.equals(this.name, transfer.name) &&
        Objects.equals(this.amount, transfer.amount) &&
        Objects.equals(this.purpose, transfer.purpose) &&
        Objects.equals(this.tanMediaId, transfer.tanMediaId) &&
        Objects.equals(this.tanScheme, transfer.tanScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, bic, name, amount, purpose, tanMediaId, tanScheme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transfer {\n");
    
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    tanMediaId: ").append(toIndentedString(tanMediaId)).append("\n");
    sb.append("    tanScheme: ").append(toIndentedString(tanScheme)).append("\n");
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

