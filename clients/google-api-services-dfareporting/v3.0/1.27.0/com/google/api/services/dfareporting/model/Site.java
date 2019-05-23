/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dfareporting.model;

/**
 * Contains properties of a site.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Site extends com.google.api.client.json.GenericJson {

  /**
   * Account ID of this site. This is a read-only field that can be left blank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long accountId;

  /**
   * Whether this site is approved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean approved;

  /**
   * Directory site associated with this site. This is a required field that is read-only after
   * insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long directorySiteId;

  /**
   * Dimension value for the ID of the directory site. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue directorySiteIdDimensionValue;

  /**
   * ID of this site. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Dimension value for the ID of this site. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue idDimensionValue;

  /**
   * Key name of this site. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String keyName;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#site".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of this site.This is a required field. Must be less than 128 characters long. If this site
   * is under a subaccount, the name must be unique among sites of the same subaccount. Otherwise,
   * this site is a top-level site, and the name must be unique among top-level sites of the same
   * account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Site contacts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SiteContact> siteContacts;

  /**
   * Site-wide settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SiteSettings siteSettings;

  /**
   * Subaccount ID of this site. This is a read-only field that can be left blank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long subaccountId;

  /**
   * Account ID of this site. This is a read-only field that can be left blank.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAccountId() {
    return accountId;
  }

  /**
   * Account ID of this site. This is a read-only field that can be left blank.
   * @param accountId accountId or {@code null} for none
   */
  public Site setAccountId(java.lang.Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Whether this site is approved.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getApproved() {
    return approved;
  }

  /**
   * Whether this site is approved.
   * @param approved approved or {@code null} for none
   */
  public Site setApproved(java.lang.Boolean approved) {
    this.approved = approved;
    return this;
  }

  /**
   * Directory site associated with this site. This is a required field that is read-only after
   * insertion.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDirectorySiteId() {
    return directorySiteId;
  }

  /**
   * Directory site associated with this site. This is a required field that is read-only after
   * insertion.
   * @param directorySiteId directorySiteId or {@code null} for none
   */
  public Site setDirectorySiteId(java.lang.Long directorySiteId) {
    this.directorySiteId = directorySiteId;
    return this;
  }

  /**
   * Dimension value for the ID of the directory site. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getDirectorySiteIdDimensionValue() {
    return directorySiteIdDimensionValue;
  }

  /**
   * Dimension value for the ID of the directory site. This is a read-only, auto-generated field.
   * @param directorySiteIdDimensionValue directorySiteIdDimensionValue or {@code null} for none
   */
  public Site setDirectorySiteIdDimensionValue(DimensionValue directorySiteIdDimensionValue) {
    this.directorySiteIdDimensionValue = directorySiteIdDimensionValue;
    return this;
  }

  /**
   * ID of this site. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * ID of this site. This is a read-only, auto-generated field.
   * @param id id or {@code null} for none
   */
  public Site setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Dimension value for the ID of this site. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getIdDimensionValue() {
    return idDimensionValue;
  }

  /**
   * Dimension value for the ID of this site. This is a read-only, auto-generated field.
   * @param idDimensionValue idDimensionValue or {@code null} for none
   */
  public Site setIdDimensionValue(DimensionValue idDimensionValue) {
    this.idDimensionValue = idDimensionValue;
    return this;
  }

  /**
   * Key name of this site. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.String getKeyName() {
    return keyName;
  }

  /**
   * Key name of this site. This is a read-only, auto-generated field.
   * @param keyName keyName or {@code null} for none
   */
  public Site setKeyName(java.lang.String keyName) {
    this.keyName = keyName;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#site".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#site".
   * @param kind kind or {@code null} for none
   */
  public Site setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of this site.This is a required field. Must be less than 128 characters long. If this site
   * is under a subaccount, the name must be unique among sites of the same subaccount. Otherwise,
   * this site is a top-level site, and the name must be unique among top-level sites of the same
   * account.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this site.This is a required field. Must be less than 128 characters long. If this site
   * is under a subaccount, the name must be unique among sites of the same subaccount. Otherwise,
   * this site is a top-level site, and the name must be unique among top-level sites of the same
   * account.
   * @param name name or {@code null} for none
   */
  public Site setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Site contacts.
   * @return value or {@code null} for none
   */
  public java.util.List<SiteContact> getSiteContacts() {
    return siteContacts;
  }

  /**
   * Site contacts.
   * @param siteContacts siteContacts or {@code null} for none
   */
  public Site setSiteContacts(java.util.List<SiteContact> siteContacts) {
    this.siteContacts = siteContacts;
    return this;
  }

  /**
   * Site-wide settings.
   * @return value or {@code null} for none
   */
  public SiteSettings getSiteSettings() {
    return siteSettings;
  }

  /**
   * Site-wide settings.
   * @param siteSettings siteSettings or {@code null} for none
   */
  public Site setSiteSettings(SiteSettings siteSettings) {
    this.siteSettings = siteSettings;
    return this;
  }

  /**
   * Subaccount ID of this site. This is a read-only field that can be left blank.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubaccountId() {
    return subaccountId;
  }

  /**
   * Subaccount ID of this site. This is a read-only field that can be left blank.
   * @param subaccountId subaccountId or {@code null} for none
   */
  public Site setSubaccountId(java.lang.Long subaccountId) {
    this.subaccountId = subaccountId;
    return this;
  }

  @Override
  public Site set(String fieldName, Object value) {
    return (Site) super.set(fieldName, value);
  }

  @Override
  public Site clone() {
    return (Site) super.clone();
  }

}