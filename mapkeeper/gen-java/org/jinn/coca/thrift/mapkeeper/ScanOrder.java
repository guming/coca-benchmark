/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.jinn.coca.thrift.mapkeeper;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ScanOrder implements org.apache.thrift.TEnum {
  Ascending(0),
  Descending(1);

  private final int value;

  private ScanOrder(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ScanOrder findByValue(int value) { 
    switch (value) {
      case 0:
        return Ascending;
      case 1:
        return Descending;
      default:
        return null;
    }
  }
}
