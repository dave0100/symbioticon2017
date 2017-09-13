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
import java.io.IOException;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-05T14:43:56.054Z")

public class Transaction {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("transactionPatternId")
  private Long transactionPatternId = null;

  @SerializedName("type")
  private String type = null;

  public Transaction id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Internal ID of this transaction (generated value)
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Internal ID of this transaction (generated value)")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Transaction transactionPatternId(Long transactionPatternId) {
    this.transactionPatternId = transactionPatternId;
    return this;
  }

   /**
   * not relevant in this Symbioticon scope
   * @return transactionPatternId
  **/
  @ApiModelProperty(value = "not relevant in this Symbioticon scope")
  public Long getTransactionPatternId() {
    return transactionPatternId;
  }

  public void setTransactionPatternId(Long transactionPatternId) {
    this.transactionPatternId = transactionPatternId;
  }

  public Transaction type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Discriminator for subtypes. At the moment only &#x60;GiroTransaction&#x60; is supported.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Discriminator for subtypes. At the moment only `GiroTransaction` is supported.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.transactionPatternId, transaction.transactionPatternId) &&
        Objects.equals(this.type, transaction.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionPatternId, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionPatternId: ").append(toIndentedString(transactionPatternId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
