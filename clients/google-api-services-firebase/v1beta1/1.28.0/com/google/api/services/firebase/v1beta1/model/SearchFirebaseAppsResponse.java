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

package com.google.api.services.firebase.v1beta1.model;

/**
 * Model definition for SearchFirebaseAppsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchFirebaseAppsResponse extends com.google.api.client.json.GenericJson {

  /**
   * One page of results from a call to `SearchFirebaseApps`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FirebaseAppInfo> apps;

  static {
    // hack to force ProGuard to consider FirebaseAppInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FirebaseAppInfo.class);
  }

  /**
   * If the result list is too large to fit in a single response, then a token is returned.
   *
   * This token can be used in a subsequent calls to `SearchFirebaseApps` to find the next group of
   * Apps. If the string is empty, then this response is the last page of results. Page tokens are
   * short-lived and should not be persisted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * One page of results from a call to `SearchFirebaseApps`.
   * @return value or {@code null} for none
   */
  public java.util.List<FirebaseAppInfo> getApps() {
    return apps;
  }

  /**
   * One page of results from a call to `SearchFirebaseApps`.
   * @param apps apps or {@code null} for none
   */
  public SearchFirebaseAppsResponse setApps(java.util.List<FirebaseAppInfo> apps) {
    this.apps = apps;
    return this;
  }

  /**
   * If the result list is too large to fit in a single response, then a token is returned.
   *
   * This token can be used in a subsequent calls to `SearchFirebaseApps` to find the next group of
   * Apps. If the string is empty, then this response is the last page of results. Page tokens are
   * short-lived and should not be persisted.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If the result list is too large to fit in a single response, then a token is returned.
   *
   * This token can be used in a subsequent calls to `SearchFirebaseApps` to find the next group of
   * Apps. If the string is empty, then this response is the last page of results. Page tokens are
   * short-lived and should not be persisted.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SearchFirebaseAppsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public SearchFirebaseAppsResponse set(String fieldName, Object value) {
    return (SearchFirebaseAppsResponse) super.set(fieldName, value);
  }

  @Override
  public SearchFirebaseAppsResponse clone() {
    return (SearchFirebaseAppsResponse) super.clone();
  }

}