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
 * Account
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-05T14:43:56.054Z")

public class Account {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("userDefinedName")
  private String userDefinedName = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("providerId")
  private Long providerId = null;

  /**
   * An account kind is a classification of its structure and its possibilities.   This is typically defined by the bank provider.
   */
  @JsonAdapter(KindEnum.Adapter.class)
  public enum KindEnum {
    GIRO("GIRO"),
    
    SPAR("SPAR"),
    
    FESTGELD("FESTGELD"),
    
    DEPOT("DEPOT"),
    
    DARLEHEN("DARLEHEN"),
    
    KREDITKARTE("KREDITKARTE"),
    
    BAUSPAR("BAUSPAR"),
    
    VL_SPAR("VL_SPAR"),
    
    VL_BAUSPAR("VL_BAUSPAR"),
    
    VL_WERTPAPIERSPARVERTRAG("VL_WERTPAPIERSPARVERTRAG");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KindEnum fromValue(String text) {
      for (KindEnum b : KindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<KindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KindEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KindEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("kind")
  private KindEnum kind = null;

  @SerializedName("automaticRefreshInterval")
  private Long automaticRefreshInterval = null;

  @SerializedName("type")
  private String type = null;

  public Account id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Internal ID of this account (generated value)
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Internal ID of this account (generated value)")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Account name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Account name returned by bank provider (e.g., \&quot;Giro Account\&quot;)
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Account name returned by bank provider (e.g., \"Giro Account\")")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account userDefinedName(String userDefinedName) {
    this.userDefinedName = userDefinedName;
    return this;
  }

   /**
   * Account userDefinedName. This value can be set to define a custom name used in AHOI (e.g., \&quot;My Giro Account\&quot;).  Can be changed by using the account resource.
   * @return userDefinedName
  **/
  @ApiModelProperty(value = "Account userDefinedName. This value can be set to define a custom name used in AHOI (e.g., \"My Giro Account\").  Can be changed by using the account resource.")
  public String getUserDefinedName() {
    return userDefinedName;
  }

  public void setUserDefinedName(String userDefinedName) {
    this.userDefinedName = userDefinedName;
  }

  public Account owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Account owner returned by bank provider (e.g., \&quot;Max Mustermann\&quot;)
   * @return owner
  **/
  @ApiModelProperty(required = true, value = "Account owner returned by bank provider (e.g., \"Max Mustermann\")")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Account providerId(Long providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * Identifier of the provider to which this account belongs
   * @return providerId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the provider to which this account belongs")
  public Long getProviderId() {
    return providerId;
  }

  public void setProviderId(Long providerId) {
    this.providerId = providerId;
  }

  public Account kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * An account kind is a classification of its structure and its possibilities.   This is typically defined by the bank provider.
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "An account kind is a classification of its structure and its possibilities.   This is typically defined by the bank provider.")
  public KindEnum getKind() {
    return kind;
  }

  public void setKind(KindEnum kind) {
    this.kind = kind;
  }

  public Account automaticRefreshInterval(Long automaticRefreshInterval) {
    this.automaticRefreshInterval = automaticRefreshInterval;
    return this;
  }

   /**
   * Interval that indicates the freguency of which the account is updated.   This interval is read-only and is determined by the server depending on created notifications and last use of the API. The range is between every hour, daily and monthly.
   * @return automaticRefreshInterval
  **/
  @ApiModelProperty(required = true, value = "Interval that indicates the freguency of which the account is updated.   This interval is read-only and is determined by the server depending on created notifications and last use of the API. The range is between every hour, daily and monthly.")
  public Long getAutomaticRefreshInterval() {
    return automaticRefreshInterval;
  }

  public void setAutomaticRefreshInterval(Long automaticRefreshInterval) {
    this.automaticRefreshInterval = automaticRefreshInterval;
  }

  public Account type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Discriminator for subtypes. At the moment only &#x60;BankAccount&#x60; is supported.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Discriminator for subtypes. At the moment only `BankAccount` is supported.")
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
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.userDefinedName, account.userDefinedName) &&
        Objects.equals(this.owner, account.owner) &&
        Objects.equals(this.providerId, account.providerId) &&
        Objects.equals(this.kind, account.kind) &&
        Objects.equals(this.automaticRefreshInterval, account.automaticRefreshInterval) &&
        Objects.equals(this.type, account.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, userDefinedName, owner, providerId, kind, automaticRefreshInterval, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userDefinedName: ").append(toIndentedString(userDefinedName)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    automaticRefreshInterval: ").append(toIndentedString(automaticRefreshInterval)).append("\n");
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

