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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * Artifact describes a build product.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Artifact extends com.google.api.client.json.GenericJson {

  /**
   * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a container.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String checksum;

  /**
   * Artifact ID, if any; for container images, this will be a URL by digest like
   * gcr.io/projectID/imagename@sha256:123456
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Name of the artifact. This may be the path to a binary or jar file, or in the case of a
   * container build, the name used to push the container image to Google Container Registry, as
   * presented to `docker push`.
   *
   * This field is deprecated in favor of the plural `names` field; it continues to exist here to
   * allow existing BuildProvenance serialized to json in
   * google.devtools.containeranalysis.v1alpha1.BuildDetails.provenance_bytes to deserialize back
   * into proto.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Related artifact names. This may be the path to a binary or jar file, or in the case of a
   * container build, the name used to push the container image to Google Container Registry, as
   * presented to `docker push`. Note that a single Artifact ID can have multiple names, for example
   * if two tags are applied to one image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> names;

  /**
   * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a container.
   * @return value or {@code null} for none
   */
  public java.lang.String getChecksum() {
    return checksum;
  }

  /**
   * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a container.
   * @param checksum checksum or {@code null} for none
   */
  public Artifact setChecksum(java.lang.String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * Artifact ID, if any; for container images, this will be a URL by digest like
   * gcr.io/projectID/imagename@sha256:123456
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Artifact ID, if any; for container images, this will be a URL by digest like
   * gcr.io/projectID/imagename@sha256:123456
   * @param id id or {@code null} for none
   */
  public Artifact setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Name of the artifact. This may be the path to a binary or jar file, or in the case of a
   * container build, the name used to push the container image to Google Container Registry, as
   * presented to `docker push`.
   *
   * This field is deprecated in favor of the plural `names` field; it continues to exist here to
   * allow existing BuildProvenance serialized to json in
   * google.devtools.containeranalysis.v1alpha1.BuildDetails.provenance_bytes to deserialize back
   * into proto.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the artifact. This may be the path to a binary or jar file, or in the case of a
   * container build, the name used to push the container image to Google Container Registry, as
   * presented to `docker push`.
   *
   * This field is deprecated in favor of the plural `names` field; it continues to exist here to
   * allow existing BuildProvenance serialized to json in
   * google.devtools.containeranalysis.v1alpha1.BuildDetails.provenance_bytes to deserialize back
   * into proto.
   * @param name name or {@code null} for none
   */
  public Artifact setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Related artifact names. This may be the path to a binary or jar file, or in the case of a
   * container build, the name used to push the container image to Google Container Registry, as
   * presented to `docker push`. Note that a single Artifact ID can have multiple names, for example
   * if two tags are applied to one image.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNames() {
    return names;
  }

  /**
   * Related artifact names. This may be the path to a binary or jar file, or in the case of a
   * container build, the name used to push the container image to Google Container Registry, as
   * presented to `docker push`. Note that a single Artifact ID can have multiple names, for example
   * if two tags are applied to one image.
   * @param names names or {@code null} for none
   */
  public Artifact setNames(java.util.List<java.lang.String> names) {
    this.names = names;
    return this;
  }

  @Override
  public Artifact set(String fieldName, Object value) {
    return (Artifact) super.set(fieldName, value);
  }

  @Override
  public Artifact clone() {
    return (Artifact) super.clone();
  }

}