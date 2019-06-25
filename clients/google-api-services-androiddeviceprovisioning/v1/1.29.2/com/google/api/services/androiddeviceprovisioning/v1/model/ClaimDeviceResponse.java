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

package com.google.api.services.androiddeviceprovisioning.v1.model;

/**
 * Response message containing device id of the claim.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Device Provisioning Partner API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClaimDeviceResponse extends com.google.api.client.json.GenericJson {

  /**
   * The device ID of the claimed device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long deviceId;

  /**
   * The resource name of the device in the format `partners/[PARTNER_ID]/devices/[DEVICE_ID]`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceName;

  /**
   * The device ID of the claimed device.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDeviceId() {
    return deviceId;
  }

  /**
   * The device ID of the claimed device.
   * @param deviceId deviceId or {@code null} for none
   */
  public ClaimDeviceResponse setDeviceId(java.lang.Long deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * The resource name of the device in the format `partners/[PARTNER_ID]/devices/[DEVICE_ID]`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceName() {
    return deviceName;
  }

  /**
   * The resource name of the device in the format `partners/[PARTNER_ID]/devices/[DEVICE_ID]`.
   * @param deviceName deviceName or {@code null} for none
   */
  public ClaimDeviceResponse setDeviceName(java.lang.String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  @Override
  public ClaimDeviceResponse set(String fieldName, Object value) {
    return (ClaimDeviceResponse) super.set(fieldName, value);
  }

  @Override
  public ClaimDeviceResponse clone() {
    return (ClaimDeviceResponse) super.clone();
  }

}