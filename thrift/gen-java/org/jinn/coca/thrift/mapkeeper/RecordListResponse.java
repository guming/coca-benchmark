/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.jinn.coca.thrift.mapkeeper;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-2-5")
public class RecordListResponse implements org.apache.thrift.TBase<RecordListResponse, RecordListResponse._Fields>, java.io.Serializable, Cloneable, Comparable<RecordListResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RecordListResponse");

  private static final org.apache.thrift.protocol.TField RESPONSE_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("responseCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RECORDS_FIELD_DESC = new org.apache.thrift.protocol.TField("records", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RecordListResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RecordListResponseTupleSchemeFactory());
  }

  /**
   * 
   * @see ResponseCode
   */
  public ResponseCode responseCode; // required
  public List<Record> records; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ResponseCode
     */
    RESPONSE_CODE((short)1, "responseCode"),
    RECORDS((short)2, "records");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RESPONSE_CODE
          return RESPONSE_CODE;
        case 2: // RECORDS
          return RECORDS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESPONSE_CODE, new org.apache.thrift.meta_data.FieldMetaData("responseCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ResponseCode.class)));
    tmpMap.put(_Fields.RECORDS, new org.apache.thrift.meta_data.FieldMetaData("records", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Record.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RecordListResponse.class, metaDataMap);
  }

  public RecordListResponse() {
  }

  public RecordListResponse(
    ResponseCode responseCode,
    List<Record> records)
  {
    this();
    this.responseCode = responseCode;
    this.records = records;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RecordListResponse(RecordListResponse other) {
    if (other.isSetResponseCode()) {
      this.responseCode = other.responseCode;
    }
    if (other.isSetRecords()) {
      List<Record> __this__records = new ArrayList<Record>(other.records.size());
      for (Record other_element : other.records) {
        __this__records.add(new Record(other_element));
      }
      this.records = __this__records;
    }
  }

  public RecordListResponse deepCopy() {
    return new RecordListResponse(this);
  }

  @Override
  public void clear() {
    this.responseCode = null;
    this.records = null;
  }

  /**
   * 
   * @see ResponseCode
   */
  public ResponseCode getResponseCode() {
    return this.responseCode;
  }

  /**
   * 
   * @see ResponseCode
   */
  public RecordListResponse setResponseCode(ResponseCode responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  public void unsetResponseCode() {
    this.responseCode = null;
  }

  /** Returns true if field responseCode is set (has been assigned a value) and false otherwise */
  public boolean isSetResponseCode() {
    return this.responseCode != null;
  }

  public void setResponseCodeIsSet(boolean value) {
    if (!value) {
      this.responseCode = null;
    }
  }

  public int getRecordsSize() {
    return (this.records == null) ? 0 : this.records.size();
  }

  public java.util.Iterator<Record> getRecordsIterator() {
    return (this.records == null) ? null : this.records.iterator();
  }

  public void addToRecords(Record elem) {
    if (this.records == null) {
      this.records = new ArrayList<Record>();
    }
    this.records.add(elem);
  }

  public List<Record> getRecords() {
    return this.records;
  }

  public RecordListResponse setRecords(List<Record> records) {
    this.records = records;
    return this;
  }

  public void unsetRecords() {
    this.records = null;
  }

  /** Returns true if field records is set (has been assigned a value) and false otherwise */
  public boolean isSetRecords() {
    return this.records != null;
  }

  public void setRecordsIsSet(boolean value) {
    if (!value) {
      this.records = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESPONSE_CODE:
      if (value == null) {
        unsetResponseCode();
      } else {
        setResponseCode((ResponseCode)value);
      }
      break;

    case RECORDS:
      if (value == null) {
        unsetRecords();
      } else {
        setRecords((List<Record>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESPONSE_CODE:
      return getResponseCode();

    case RECORDS:
      return getRecords();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESPONSE_CODE:
      return isSetResponseCode();
    case RECORDS:
      return isSetRecords();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RecordListResponse)
      return this.equals((RecordListResponse)that);
    return false;
  }

  public boolean equals(RecordListResponse that) {
    if (that == null)
      return false;

    boolean this_present_responseCode = true && this.isSetResponseCode();
    boolean that_present_responseCode = true && that.isSetResponseCode();
    if (this_present_responseCode || that_present_responseCode) {
      if (!(this_present_responseCode && that_present_responseCode))
        return false;
      if (!this.responseCode.equals(that.responseCode))
        return false;
    }

    boolean this_present_records = true && this.isSetRecords();
    boolean that_present_records = true && that.isSetRecords();
    if (this_present_records || that_present_records) {
      if (!(this_present_records && that_present_records))
        return false;
      if (!this.records.equals(that.records))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_responseCode = true && (isSetResponseCode());
    list.add(present_responseCode);
    if (present_responseCode)
      list.add(responseCode.getValue());

    boolean present_records = true && (isSetRecords());
    list.add(present_records);
    if (present_records)
      list.add(records);

    return list.hashCode();
  }

  @Override
  public int compareTo(RecordListResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResponseCode()).compareTo(other.isSetResponseCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResponseCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.responseCode, other.responseCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecords()).compareTo(other.isSetRecords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecords()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.records, other.records);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RecordListResponse(");
    boolean first = true;

    sb.append("responseCode:");
    if (this.responseCode == null) {
      sb.append("null");
    } else {
      sb.append(this.responseCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("records:");
    if (this.records == null) {
      sb.append("null");
    } else {
      sb.append(this.records);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RecordListResponseStandardSchemeFactory implements SchemeFactory {
    public RecordListResponseStandardScheme getScheme() {
      return new RecordListResponseStandardScheme();
    }
  }

  private static class RecordListResponseStandardScheme extends StandardScheme<RecordListResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RecordListResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESPONSE_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.responseCode = org.jinn.coca.thrift.mapkeeper.ResponseCode.findByValue(iprot.readI32());
              struct.setResponseCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RECORDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.records = new ArrayList<Record>(_list0.size);
                Record _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new Record();
                  _elem1.read(iprot);
                  struct.records.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setRecordsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RecordListResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.responseCode != null) {
        oprot.writeFieldBegin(RESPONSE_CODE_FIELD_DESC);
        oprot.writeI32(struct.responseCode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.records != null) {
        oprot.writeFieldBegin(RECORDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.records.size()));
          for (Record _iter3 : struct.records)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RecordListResponseTupleSchemeFactory implements SchemeFactory {
    public RecordListResponseTupleScheme getScheme() {
      return new RecordListResponseTupleScheme();
    }
  }

  private static class RecordListResponseTupleScheme extends TupleScheme<RecordListResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RecordListResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetResponseCode()) {
        optionals.set(0);
      }
      if (struct.isSetRecords()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetResponseCode()) {
        oprot.writeI32(struct.responseCode.getValue());
      }
      if (struct.isSetRecords()) {
        {
          oprot.writeI32(struct.records.size());
          for (Record _iter4 : struct.records)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RecordListResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.responseCode = org.jinn.coca.thrift.mapkeeper.ResponseCode.findByValue(iprot.readI32());
        struct.setResponseCodeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.records = new ArrayList<Record>(_list5.size);
          Record _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new Record();
            _elem6.read(iprot);
            struct.records.add(_elem6);
          }
        }
        struct.setRecordsIsSet(true);
      }
    }
  }

}
