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

package com.google.api.services.factchecktools.v1alpha1.model;

/**
 * Information about the claim review author.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fact Check Tools API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor extends com.google.api.client.json.GenericJson {

  /**
   * Corresponds to `ClaimReview.author.image`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUrl;

  /**
   * Name of the organization that is publishing the fact check. Corresponds to
   * `ClaimReview.author.name`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Corresponds to `ClaimReview.author.image`.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUrl() {
    return imageUrl;
  }

  /**
   * Corresponds to `ClaimReview.author.image`.
   * @param imageUrl imageUrl or {@code null} for none
   */
  public GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Name of the organization that is publishing the fact check. Corresponds to
   * `ClaimReview.author.name`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the organization that is publishing the fact check. Corresponds to
   * `ClaimReview.author.name`.
   * @param name name or {@code null} for none
   */
  public GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor set(String fieldName, Object value) {
    return (GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor) super.set(fieldName, value);
  }

  @Override
  public GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor clone() {
    return (GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor) super.clone();
  }

}
