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

package com.google.api.services.iam.v1.model;

/**
 * The service account sign JWT request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SignJwtRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The JWT payload to sign. Must be a serialized JSON object that contains a JWT Claims
   * Set. For example: `{"sub": "user@example.com", "iat": 313435}`
   *
   * If the JWT Claims Set contains an expiration time (`exp`) claim, it must be an integer
   * timestamp that is not in the past and no more than 1 hour in the future.
   *
   * If the JWT Claims Set does not contain an expiration time (`exp`) claim, this claim is added
   * automatically, with a timestamp that is 1 hour in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String payload;

  /**
   * Required. The JWT payload to sign. Must be a serialized JSON object that contains a JWT Claims
   * Set. For example: `{"sub": "user@example.com", "iat": 313435}`
   *
   * If the JWT Claims Set contains an expiration time (`exp`) claim, it must be an integer
   * timestamp that is not in the past and no more than 1 hour in the future.
   *
   * If the JWT Claims Set does not contain an expiration time (`exp`) claim, this claim is added
   * automatically, with a timestamp that is 1 hour in the future.
   * @return value or {@code null} for none
   */
  public java.lang.String getPayload() {
    return payload;
  }

  /**
   * Required. The JWT payload to sign. Must be a serialized JSON object that contains a JWT Claims
   * Set. For example: `{"sub": "user@example.com", "iat": 313435}`
   *
   * If the JWT Claims Set contains an expiration time (`exp`) claim, it must be an integer
   * timestamp that is not in the past and no more than 1 hour in the future.
   *
   * If the JWT Claims Set does not contain an expiration time (`exp`) claim, this claim is added
   * automatically, with a timestamp that is 1 hour in the future.
   * @param payload payload or {@code null} for none
   */
  public SignJwtRequest setPayload(java.lang.String payload) {
    this.payload = payload;
    return this;
  }

  @Override
  public SignJwtRequest set(String fieldName, Object value) {
    return (SignJwtRequest) super.set(fieldName, value);
  }

  @Override
  public SignJwtRequest clone() {
    return (SignJwtRequest) super.clone();
  }

}
