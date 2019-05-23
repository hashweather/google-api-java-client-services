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

package com.google.api.services.civicinfo.model;

/**
 * Model definition for FieldMetadataProto.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Civic Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FieldMetadataProto extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InternalFieldMetadataProto internal;

  /**
   * @return value or {@code null} for none
   */
  public InternalFieldMetadataProto getInternal() {
    return internal;
  }

  /**
   * @param internal internal or {@code null} for none
   */
  public FieldMetadataProto setInternal(InternalFieldMetadataProto internal) {
    this.internal = internal;
    return this;
  }

  @Override
  public FieldMetadataProto set(String fieldName, Object value) {
    return (FieldMetadataProto) super.set(fieldName, value);
  }

  @Override
  public FieldMetadataProto clone() {
    return (FieldMetadataProto) super.clone();
  }

}