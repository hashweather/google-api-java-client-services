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

package com.google.api.services.pubsub.model;

/**
 * A topic resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Topic extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of the Cloud KMS CryptoKey to be used to protect access to messages published
   * on this topic.
   *
   * The expected format is `projects/locations/keyRings/cryptoKeys`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyName;

  /**
   * See  Creating and managing labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Policy constraining the set of Google Cloud Platform regions where messages published to the
   * topic may be stored. If not present, then no constraints are in effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MessageStoragePolicy messageStoragePolicy;

  /**
   * The name of the topic. It must have the format `"projects/{project}/topics/{topic}"`. `{topic}`
   * must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes
   * (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It
   * must be between 3 and 255 characters in length, and it must not start with `"goog"`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The resource name of the Cloud KMS CryptoKey to be used to protect access to messages published
   * on this topic.
   *
   * The expected format is `projects/locations/keyRings/cryptoKeys`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyName() {
    return kmsKeyName;
  }

  /**
   * The resource name of the Cloud KMS CryptoKey to be used to protect access to messages published
   * on this topic.
   *
   * The expected format is `projects/locations/keyRings/cryptoKeys`.
   * @param kmsKeyName kmsKeyName or {@code null} for none
   */
  public Topic setKmsKeyName(java.lang.String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
    return this;
  }

  /**
   * See  Creating and managing labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * See  Creating and managing labels.
   * @param labels labels or {@code null} for none
   */
  public Topic setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Policy constraining the set of Google Cloud Platform regions where messages published to the
   * topic may be stored. If not present, then no constraints are in effect.
   * @return value or {@code null} for none
   */
  public MessageStoragePolicy getMessageStoragePolicy() {
    return messageStoragePolicy;
  }

  /**
   * Policy constraining the set of Google Cloud Platform regions where messages published to the
   * topic may be stored. If not present, then no constraints are in effect.
   * @param messageStoragePolicy messageStoragePolicy or {@code null} for none
   */
  public Topic setMessageStoragePolicy(MessageStoragePolicy messageStoragePolicy) {
    this.messageStoragePolicy = messageStoragePolicy;
    return this;
  }

  /**
   * The name of the topic. It must have the format `"projects/{project}/topics/{topic}"`. `{topic}`
   * must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes
   * (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It
   * must be between 3 and 255 characters in length, and it must not start with `"goog"`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the topic. It must have the format `"projects/{project}/topics/{topic}"`. `{topic}`
   * must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes
   * (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It
   * must be between 3 and 255 characters in length, and it must not start with `"goog"`.
   * @param name name or {@code null} for none
   */
  public Topic setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Topic set(String fieldName, Object value) {
    return (Topic) super.set(fieldName, value);
  }

  @Override
  public Topic clone() {
    return (Topic) super.clone();
  }

}
