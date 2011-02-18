/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.hbase.thrift.generated;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class ScanSpec implements TBase<ScanSpec, ScanSpec._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ScanSpec");

  private static final TField TABLE_NAME_FIELD_DESC = new TField("tableName", TType.STRING, (short)1);
  private static final TField COLUMNS_FIELD_DESC = new TField("columns", TType.LIST, (short)2);
  private static final TField START_ROW_FIELD_DESC = new TField("startRow", TType.STRING, (short)3);
  private static final TField STOP_ROW_FIELD_DESC = new TField("stopRow", TType.STRING, (short)4);
  private static final TField PREFIX_SCAN_FIELD_DESC = new TField("prefixScan", TType.BOOL, (short)5);
  private static final TField MAX_VERSIONS_FIELD_DESC = new TField("maxVersions", TType.I32, (short)6);
  private static final TField START_TIME_FIELD_DESC = new TField("startTime", TType.I64, (short)7);
  private static final TField END_TIME_FIELD_DESC = new TField("endTime", TType.I64, (short)8);
  private static final TField CACHE_BLOCKS_FIELD_DESC = new TField("cacheBlocks", TType.BOOL, (short)9);

  public ByteBuffer tableName;
  public List<ByteBuffer> columns;
  public ByteBuffer startRow;
  public ByteBuffer stopRow;
  public boolean prefixScan;
  public int maxVersions;
  public long startTime;
  public long endTime;
  public boolean cacheBlocks;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    TABLE_NAME((short)1, "tableName"),
    COLUMNS((short)2, "columns"),
    START_ROW((short)3, "startRow"),
    STOP_ROW((short)4, "stopRow"),
    PREFIX_SCAN((short)5, "prefixScan"),
    MAX_VERSIONS((short)6, "maxVersions"),
    START_TIME((short)7, "startTime"),
    END_TIME((short)8, "endTime"),
    CACHE_BLOCKS((short)9, "cacheBlocks");

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
        case 1: // TABLE_NAME
          return TABLE_NAME;
        case 2: // COLUMNS
          return COLUMNS;
        case 3: // START_ROW
          return START_ROW;
        case 4: // STOP_ROW
          return STOP_ROW;
        case 5: // PREFIX_SCAN
          return PREFIX_SCAN;
        case 6: // MAX_VERSIONS
          return MAX_VERSIONS;
        case 7: // START_TIME
          return START_TIME;
        case 8: // END_TIME
          return END_TIME;
        case 9: // CACHE_BLOCKS
          return CACHE_BLOCKS;
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
  private static final int __PREFIXSCAN_ISSET_ID = 0;
  private static final int __MAXVERSIONS_ISSET_ID = 1;
  private static final int __STARTTIME_ISSET_ID = 2;
  private static final int __ENDTIME_ISSET_ID = 3;
  private static final int __CACHEBLOCKS_ISSET_ID = 4;
  private BitSet __isset_bit_vector = new BitSet(5);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE_NAME, new FieldMetaData("tableName", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.STRING        , "Text")));
    tmpMap.put(_Fields.COLUMNS, new FieldMetaData("columns", TFieldRequirementType.DEFAULT,
        new ListMetaData(TType.LIST,
            new FieldValueMetaData(TType.STRING            , "Text"))));
    tmpMap.put(_Fields.START_ROW, new FieldMetaData("startRow", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.STRING        , "Text")));
    tmpMap.put(_Fields.STOP_ROW, new FieldMetaData("stopRow", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.STRING        , "Text")));
    tmpMap.put(_Fields.PREFIX_SCAN, new FieldMetaData("prefixScan", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.MAX_VERSIONS, new FieldMetaData("maxVersions", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.START_TIME, new FieldMetaData("startTime", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.END_TIME, new FieldMetaData("endTime", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.I64)));
    tmpMap.put(_Fields.CACHE_BLOCKS, new FieldMetaData("cacheBlocks", TFieldRequirementType.DEFAULT,
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ScanSpec.class, metaDataMap);
  }

  public ScanSpec() {
  }

  public ScanSpec(
    ByteBuffer tableName,
    List<ByteBuffer> columns,
    ByteBuffer startRow,
    ByteBuffer stopRow,
    boolean prefixScan,
    int maxVersions,
    long startTime,
    long endTime,
    boolean cacheBlocks)
  {
    this();
    this.tableName = tableName;
    this.columns = columns;
    this.startRow = startRow;
    this.stopRow = stopRow;
    this.prefixScan = prefixScan;
    setPrefixScanIsSet(true);
    this.maxVersions = maxVersions;
    setMaxVersionsIsSet(true);
    this.startTime = startTime;
    setStartTimeIsSet(true);
    this.endTime = endTime;
    setEndTimeIsSet(true);
    this.cacheBlocks = cacheBlocks;
    setCacheBlocksIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ScanSpec(ScanSpec other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetColumns()) {
      List<ByteBuffer> __this__columns = new ArrayList<ByteBuffer>();
      for (ByteBuffer other_element : other.columns) {
        __this__columns.add(other_element);
      }
      this.columns = __this__columns;
    }
    if (other.isSetStartRow()) {
      this.startRow = other.startRow;
    }
    if (other.isSetStopRow()) {
      this.stopRow = other.stopRow;
    }
    this.prefixScan = other.prefixScan;
    this.maxVersions = other.maxVersions;
    this.startTime = other.startTime;
    this.endTime = other.endTime;
    this.cacheBlocks = other.cacheBlocks;
  }

  public ScanSpec deepCopy() {
    return new ScanSpec(this);
  }

  @Override
  public void clear() {
    this.tableName = null;
    this.columns = null;
    this.startRow = null;
    this.stopRow = null;
    setPrefixScanIsSet(false);
    this.prefixScan = false;
    setMaxVersionsIsSet(false);
    this.maxVersions = 0;
    setStartTimeIsSet(false);
    this.startTime = 0;
    setEndTimeIsSet(false);
    this.endTime = 0;
    setCacheBlocksIsSet(false);
    this.cacheBlocks = false;
  }

  public byte[] getTableName() {
    setTableName(TBaseHelper.rightSize(tableName));
    return tableName.array();
  }

  public ByteBuffer BufferForTableName() {
    return tableName;
  }

  public ScanSpec setTableName(byte[] tableName) {
    setTableName(ByteBuffer.wrap(tableName));
    return this;
  }

  public ScanSpec setTableName(ByteBuffer tableName) {
    this.tableName = tableName;
    return this;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been asigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public java.util.Iterator<ByteBuffer> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(ByteBuffer elem) {
    if (this.columns == null) {
      this.columns = new ArrayList<ByteBuffer>();
    }
    this.columns.add(elem);
  }

  public List<ByteBuffer> getColumns() {
    return this.columns;
  }

  public ScanSpec setColumns(List<ByteBuffer> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been asigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public byte[] getStartRow() {
    setStartRow(TBaseHelper.rightSize(startRow));
    return startRow.array();
  }

  public ByteBuffer BufferForStartRow() {
    return startRow;
  }

  public ScanSpec setStartRow(byte[] startRow) {
    setStartRow(ByteBuffer.wrap(startRow));
    return this;
  }

  public ScanSpec setStartRow(ByteBuffer startRow) {
    this.startRow = startRow;
    return this;
  }

  public void unsetStartRow() {
    this.startRow = null;
  }

  /** Returns true if field startRow is set (has been asigned a value) and false otherwise */
  public boolean isSetStartRow() {
    return this.startRow != null;
  }

  public void setStartRowIsSet(boolean value) {
    if (!value) {
      this.startRow = null;
    }
  }

  public byte[] getStopRow() {
    setStopRow(TBaseHelper.rightSize(stopRow));
    return stopRow.array();
  }

  public ByteBuffer BufferForStopRow() {
    return stopRow;
  }

  public ScanSpec setStopRow(byte[] stopRow) {
    setStopRow(ByteBuffer.wrap(stopRow));
    return this;
  }

  public ScanSpec setStopRow(ByteBuffer stopRow) {
    this.stopRow = stopRow;
    return this;
  }

  public void unsetStopRow() {
    this.stopRow = null;
  }

  /** Returns true if field stopRow is set (has been asigned a value) and false otherwise */
  public boolean isSetStopRow() {
    return this.stopRow != null;
  }

  public void setStopRowIsSet(boolean value) {
    if (!value) {
      this.stopRow = null;
    }
  }

  public boolean isPrefixScan() {
    return this.prefixScan;
  }

  public ScanSpec setPrefixScan(boolean prefixScan) {
    this.prefixScan = prefixScan;
    setPrefixScanIsSet(true);
    return this;
  }

  public void unsetPrefixScan() {
    __isset_bit_vector.clear(__PREFIXSCAN_ISSET_ID);
  }

  /** Returns true if field prefixScan is set (has been asigned a value) and false otherwise */
  public boolean isSetPrefixScan() {
    return __isset_bit_vector.get(__PREFIXSCAN_ISSET_ID);
  }

  public void setPrefixScanIsSet(boolean value) {
    __isset_bit_vector.set(__PREFIXSCAN_ISSET_ID, value);
  }

  public int getMaxVersions() {
    return this.maxVersions;
  }

  public ScanSpec setMaxVersions(int maxVersions) {
    this.maxVersions = maxVersions;
    setMaxVersionsIsSet(true);
    return this;
  }

  public void unsetMaxVersions() {
    __isset_bit_vector.clear(__MAXVERSIONS_ISSET_ID);
  }

  /** Returns true if field maxVersions is set (has been asigned a value) and false otherwise */
  public boolean isSetMaxVersions() {
    return __isset_bit_vector.get(__MAXVERSIONS_ISSET_ID);
  }

  public void setMaxVersionsIsSet(boolean value) {
    __isset_bit_vector.set(__MAXVERSIONS_ISSET_ID, value);
  }

  public long getStartTime() {
    return this.startTime;
  }

  public ScanSpec setStartTime(long startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
    return this;
  }

  public void unsetStartTime() {
    __isset_bit_vector.clear(__STARTTIME_ISSET_ID);
  }

  /** Returns true if field startTime is set (has been asigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return __isset_bit_vector.get(__STARTTIME_ISSET_ID);
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_bit_vector.set(__STARTTIME_ISSET_ID, value);
  }

  public long getEndTime() {
    return this.endTime;
  }

  public ScanSpec setEndTime(long endTime) {
    this.endTime = endTime;
    setEndTimeIsSet(true);
    return this;
  }

  public void unsetEndTime() {
    __isset_bit_vector.clear(__ENDTIME_ISSET_ID);
  }

  /** Returns true if field endTime is set (has been asigned a value) and false otherwise */
  public boolean isSetEndTime() {
    return __isset_bit_vector.get(__ENDTIME_ISSET_ID);
  }

  public void setEndTimeIsSet(boolean value) {
    __isset_bit_vector.set(__ENDTIME_ISSET_ID, value);
  }

  public boolean isCacheBlocks() {
    return this.cacheBlocks;
  }

  public ScanSpec setCacheBlocks(boolean cacheBlocks) {
    this.cacheBlocks = cacheBlocks;
    setCacheBlocksIsSet(true);
    return this;
  }

  public void unsetCacheBlocks() {
    __isset_bit_vector.clear(__CACHEBLOCKS_ISSET_ID);
  }

  /** Returns true if field cacheBlocks is set (has been asigned a value) and false otherwise */
  public boolean isSetCacheBlocks() {
    return __isset_bit_vector.get(__CACHEBLOCKS_ISSET_ID);
  }

  public void setCacheBlocksIsSet(boolean value) {
    __isset_bit_vector.set(__CACHEBLOCKS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((ByteBuffer)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((List<ByteBuffer>)value);
      }
      break;

    case START_ROW:
      if (value == null) {
        unsetStartRow();
      } else {
        setStartRow((ByteBuffer)value);
      }
      break;

    case STOP_ROW:
      if (value == null) {
        unsetStopRow();
      } else {
        setStopRow((ByteBuffer)value);
      }
      break;

    case PREFIX_SCAN:
      if (value == null) {
        unsetPrefixScan();
      } else {
        setPrefixScan((Boolean)value);
      }
      break;

    case MAX_VERSIONS:
      if (value == null) {
        unsetMaxVersions();
      } else {
        setMaxVersions((Integer)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((Long)value);
      }
      break;

    case END_TIME:
      if (value == null) {
        unsetEndTime();
      } else {
        setEndTime((Long)value);
      }
      break;

    case CACHE_BLOCKS:
      if (value == null) {
        unsetCacheBlocks();
      } else {
        setCacheBlocks((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE_NAME:
      return getTableName();

    case COLUMNS:
      return getColumns();

    case START_ROW:
      return getStartRow();

    case STOP_ROW:
      return getStopRow();

    case PREFIX_SCAN:
      return new Boolean(isPrefixScan());

    case MAX_VERSIONS:
      return new Integer(getMaxVersions());

    case START_TIME:
      return new Long(getStartTime());

    case END_TIME:
      return new Long(getEndTime());

    case CACHE_BLOCKS:
      return new Boolean(isCacheBlocks());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE_NAME:
      return isSetTableName();
    case COLUMNS:
      return isSetColumns();
    case START_ROW:
      return isSetStartRow();
    case STOP_ROW:
      return isSetStopRow();
    case PREFIX_SCAN:
      return isSetPrefixScan();
    case MAX_VERSIONS:
      return isSetMaxVersions();
    case START_TIME:
      return isSetStartTime();
    case END_TIME:
      return isSetEndTime();
    case CACHE_BLOCKS:
      return isSetCacheBlocks();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ScanSpec)
      return this.equals((ScanSpec)that);
    return false;
  }

  public boolean equals(ScanSpec that) {
    if (that == null)
      return false;

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_startRow = true && this.isSetStartRow();
    boolean that_present_startRow = true && that.isSetStartRow();
    if (this_present_startRow || that_present_startRow) {
      if (!(this_present_startRow && that_present_startRow))
        return false;
      if (!this.startRow.equals(that.startRow))
        return false;
    }

    boolean this_present_stopRow = true && this.isSetStopRow();
    boolean that_present_stopRow = true && that.isSetStopRow();
    if (this_present_stopRow || that_present_stopRow) {
      if (!(this_present_stopRow && that_present_stopRow))
        return false;
      if (!this.stopRow.equals(that.stopRow))
        return false;
    }

    boolean this_present_prefixScan = true;
    boolean that_present_prefixScan = true;
    if (this_present_prefixScan || that_present_prefixScan) {
      if (!(this_present_prefixScan && that_present_prefixScan))
        return false;
      if (this.prefixScan != that.prefixScan)
        return false;
    }

    boolean this_present_maxVersions = true;
    boolean that_present_maxVersions = true;
    if (this_present_maxVersions || that_present_maxVersions) {
      if (!(this_present_maxVersions && that_present_maxVersions))
        return false;
      if (this.maxVersions != that.maxVersions)
        return false;
    }

    boolean this_present_startTime = true;
    boolean that_present_startTime = true;
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    boolean this_present_endTime = true;
    boolean that_present_endTime = true;
    if (this_present_endTime || that_present_endTime) {
      if (!(this_present_endTime && that_present_endTime))
        return false;
      if (this.endTime != that.endTime)
        return false;
    }

    boolean this_present_cacheBlocks = true;
    boolean that_present_cacheBlocks = true;
    if (this_present_cacheBlocks || that_present_cacheBlocks) {
      if (!(this_present_cacheBlocks && that_present_cacheBlocks))
        return false;
      if (this.cacheBlocks != that.cacheBlocks)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ScanSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ScanSpec typedOther = (ScanSpec)other;

    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(typedOther.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = TBaseHelper.compareTo(this.tableName, typedOther.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumns()).compareTo(typedOther.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = TBaseHelper.compareTo(this.columns, typedOther.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartRow()).compareTo(typedOther.isSetStartRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartRow()) {
      lastComparison = TBaseHelper.compareTo(this.startRow, typedOther.startRow);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStopRow()).compareTo(typedOther.isSetStopRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStopRow()) {
      lastComparison = TBaseHelper.compareTo(this.stopRow, typedOther.stopRow);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrefixScan()).compareTo(typedOther.isSetPrefixScan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrefixScan()) {
      lastComparison = TBaseHelper.compareTo(this.prefixScan, typedOther.prefixScan);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxVersions()).compareTo(typedOther.isSetMaxVersions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxVersions()) {
      lastComparison = TBaseHelper.compareTo(this.maxVersions, typedOther.maxVersions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartTime()).compareTo(typedOther.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = TBaseHelper.compareTo(this.startTime, typedOther.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndTime()).compareTo(typedOther.isSetEndTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndTime()) {
      lastComparison = TBaseHelper.compareTo(this.endTime, typedOther.endTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCacheBlocks()).compareTo(typedOther.isSetCacheBlocks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCacheBlocks()) {
      lastComparison = TBaseHelper.compareTo(this.cacheBlocks, typedOther.cacheBlocks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // TABLE_NAME
          if (field.type == TType.STRING) {
            this.tableName = iprot.readBinary();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // COLUMNS
          if (field.type == TType.LIST) {
            {
              TList _list13 = iprot.readListBegin();
              this.columns = new ArrayList<ByteBuffer>(_list13.size);
              for (int _i14 = 0; _i14 < _list13.size; ++_i14)
              {
                ByteBuffer _elem15;
                _elem15 = iprot.readBinary();
                this.columns.add(_elem15);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // START_ROW
          if (field.type == TType.STRING) {
            this.startRow = iprot.readBinary();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // STOP_ROW
          if (field.type == TType.STRING) {
            this.stopRow = iprot.readBinary();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // PREFIX_SCAN
          if (field.type == TType.BOOL) {
            this.prefixScan = iprot.readBool();
            setPrefixScanIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // MAX_VERSIONS
          if (field.type == TType.I32) {
            this.maxVersions = iprot.readI32();
            setMaxVersionsIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // START_TIME
          if (field.type == TType.I64) {
            this.startTime = iprot.readI64();
            setStartTimeIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // END_TIME
          if (field.type == TType.I64) {
            this.endTime = iprot.readI64();
            setEndTimeIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // CACHE_BLOCKS
          if (field.type == TType.BOOL) {
            this.cacheBlocks = iprot.readBool();
            setCacheBlocksIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.tableName != null) {
      oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
      oprot.writeBinary(this.tableName);
      oprot.writeFieldEnd();
    }
    if (this.columns != null) {
      oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.columns.size()));
        for (ByteBuffer _iter16 : this.columns)
        {
          oprot.writeBinary(_iter16);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.startRow != null) {
      oprot.writeFieldBegin(START_ROW_FIELD_DESC);
      oprot.writeBinary(this.startRow);
      oprot.writeFieldEnd();
    }
    if (this.stopRow != null) {
      oprot.writeFieldBegin(STOP_ROW_FIELD_DESC);
      oprot.writeBinary(this.stopRow);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(PREFIX_SCAN_FIELD_DESC);
    oprot.writeBool(this.prefixScan);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(MAX_VERSIONS_FIELD_DESC);
    oprot.writeI32(this.maxVersions);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(START_TIME_FIELD_DESC);
    oprot.writeI64(this.startTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(END_TIME_FIELD_DESC);
    oprot.writeI64(this.endTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(CACHE_BLOCKS_FIELD_DESC);
    oprot.writeBool(this.cacheBlocks);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ScanSpec(");
    boolean first = true;

    sb.append("tableName:");
    if (this.tableName == null) {
      sb.append("null");
    } else {
      sb.append(this.tableName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      sb.append(this.columns);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("startRow:");
    if (this.startRow == null) {
      sb.append("null");
    } else {
      sb.append(this.startRow);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stopRow:");
    if (this.stopRow == null) {
      sb.append("null");
    } else {
      sb.append(this.stopRow);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("prefixScan:");
    sb.append(this.prefixScan);
    first = false;
    if (!first) sb.append(", ");
    sb.append("maxVersions:");
    sb.append(this.maxVersions);
    first = false;
    if (!first) sb.append(", ");
    sb.append("startTime:");
    sb.append(this.startTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("endTime:");
    sb.append(this.endTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("cacheBlocks:");
    sb.append(this.cacheBlocks);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
