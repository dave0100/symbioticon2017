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
 * AccessFieldsMap
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-05T14:43:56.054Z")
public class AccessFieldsMap {
  @SerializedName("USERNAME")
  private String USERNAME = null;

  @SerializedName("PIN")
  private String PIN = null;

  public AccessFieldsMap USERNAME(String USERNAME) {
    this.USERNAME = USERNAME;
    return this;
  }

   /**
   * Should be filled with the username if the Provider object signals this as mandatory.
   * @return USERNAME
  **/
  @ApiModelProperty(value = "Should be filled with the username if the Provider object signals this as mandatory.")
  public String getUSERNAME() {
    return USERNAME;
  }

  public void setUSERNAME(String USERNAME) {
    this.USERNAME = USERNAME;
  }

  public AccessFieldsMap PIN(String PIN) {
    this.PIN = PIN;
    return this;
  }

   /**
   * Should be filled with the PIN if the Provider object signals this as mandatory.
   * @return PIN
  **/
  @ApiModelProperty(value = "Should be filled with the PIN if the Provider object signals this as mandatory.")
  public String getPIN() {
    return PIN;
  }

  public void setPIN(String PIN) {
    this.PIN = PIN;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessFieldsMap accessFieldsMap = (AccessFieldsMap) o;
    return Objects.equals(this.USERNAME, accessFieldsMap.USERNAME) &&
        Objects.equals(this.PIN, accessFieldsMap.PIN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(USERNAME, PIN);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessFieldsMap {\n");
    
    sb.append("    USERNAME: ").append(toIndentedString(USERNAME)).append("\n");
    sb.append("    PIN: ").append(toIndentedString(PIN)).append("\n");
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

