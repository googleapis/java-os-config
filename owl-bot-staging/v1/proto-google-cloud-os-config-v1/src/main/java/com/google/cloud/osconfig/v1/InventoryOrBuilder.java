// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1/inventory.proto

package com.google.cloud.osconfig.v1;

public interface InventoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1.Inventory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Base level operating system information for the VM.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.Inventory.OsInfo os_info = 1;</code>
   * @return Whether the osInfo field is set.
   */
  boolean hasOsInfo();
  /**
   * <pre>
   * Base level operating system information for the VM.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.Inventory.OsInfo os_info = 1;</code>
   * @return The osInfo.
   */
  com.google.cloud.osconfig.v1.Inventory.OsInfo getOsInfo();
  /**
   * <pre>
   * Base level operating system information for the VM.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.Inventory.OsInfo os_info = 1;</code>
   */
  com.google.cloud.osconfig.v1.Inventory.OsInfoOrBuilder getOsInfoOrBuilder();

  /**
   * <pre>
   * Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item.  The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.osconfig.v1.Inventory.Item&gt; items = 2;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item.  The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.osconfig.v1.Inventory.Item&gt; items = 2;</code>
   */
  boolean containsItems(
      java.lang.String key);
  /**
   * Use {@link #getItemsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.osconfig.v1.Inventory.Item>
  getItems();
  /**
   * <pre>
   * Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item.  The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.osconfig.v1.Inventory.Item&gt; items = 2;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.osconfig.v1.Inventory.Item>
  getItemsMap();
  /**
   * <pre>
   * Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item.  The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.osconfig.v1.Inventory.Item&gt; items = 2;</code>
   */

  com.google.cloud.osconfig.v1.Inventory.Item getItemsOrDefault(
      java.lang.String key,
      com.google.cloud.osconfig.v1.Inventory.Item defaultValue);
  /**
   * <pre>
   * Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item.  The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.osconfig.v1.Inventory.Item&gt; items = 2;</code>
   */

  com.google.cloud.osconfig.v1.Inventory.Item getItemsOrThrow(
      java.lang.String key);
}