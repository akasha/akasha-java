package akasha.core;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The DataView view provides a low-level interface for reading and writing multiple number types in a binary ArrayBuffer, without having to care about the platform's endianness.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView">DataView - MDN</a>
 * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview-objects"># sec-dataview-objects</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DataView"
)
public class DataView extends JsObject implements ArrayBufferView {
  /**
   * The DataView() constructor is used to create DataView objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/DataView">DataView.DataView - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-dataview-constructor">DataView constructor - ECMAScript (ECMA-262)</a>
   */
  public DataView(@Nonnull final ArrayBuffer buffer, final int byteOffset, final int byteLength) {
  }

  /**
   * The DataView() constructor is used to create DataView objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/DataView">DataView.DataView - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-dataview-constructor">DataView constructor - ECMAScript (ECMA-262)</a>
   */
  public DataView(@Nonnull final ArrayBuffer buffer, final int byteOffset) {
  }

  /**
   * The DataView() constructor is used to create DataView objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/DataView">DataView.DataView - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-dataview-constructor">DataView constructor - ECMAScript (ECMA-262)</a>
   */
  public DataView(@Nonnull final ArrayBuffer buffer) {
  }

  /**
   * The DataView() constructor is used to create DataView objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/DataView">DataView.DataView - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-dataview-constructor">DataView constructor - ECMAScript (ECMA-262)</a>
   */
  public DataView(@Nonnull final SharedArrayBuffer buffer, final int byteOffset,
      final int byteLength) {
  }

  /**
   * The DataView() constructor is used to create DataView objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/DataView">DataView.DataView - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-dataview-constructor">DataView constructor - ECMAScript (ECMA-262)</a>
   */
  public DataView(@Nonnull final SharedArrayBuffer buffer, final int byteOffset) {
  }

  /**
   * The DataView() constructor is used to create DataView objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/DataView">DataView.DataView - MDN</a>
   * @see <a href="https://tc39.es/ecma262/#sec-dataview-constructor">DataView constructor - ECMAScript (ECMA-262)</a>
   */
  public DataView(@Nonnull final SharedArrayBuffer buffer) {
  }

  /**
   * The buffer accessor property represents the ArrayBuffer or SharedArrayBuffer referenced by the DataView at construction time.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/buffer">DataView.buffer - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-get-dataview.prototype.buffer"># sec-get-dataview.prototype.buffer</a>
   */
  @JsProperty(
      name = "buffer"
  )
  @Nonnull
  public native ArrayBuffer buffer();

  /**
   * The byteLength accessor property represents the length (in bytes) of the dataview.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/byteLength">DataView.byteLength - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-get-dataview.prototype.bytelength"># sec-get-dataview.prototype.bytelength</a>
   */
  @JsProperty(
      name = "byteLength"
  )
  public native int byteLength();

  /**
   * The byteOffset accessor property represents the offset (in bytes) of this view from the start of its ArrayBuffer or SharedArrayBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/byteOffset">DataView.byteOffset - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-get-dataview.prototype.byteoffset"># sec-get-dataview.prototype.byteoffset</a>
   */
  @JsProperty(
      name = "byteOffset"
  )
  public native int byteOffset();

  /**
   * The getInt8() method gets a signed 8-bit integer (byte) at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/getInt8">DataView.getInt8 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.getint8"># sec-dataview.prototype.getint8</a>
   */
  public native byte getInt8(int byteOffset);

  /**
   * The getUint8() method gets an unsigned 8-bit integer (unsigned byte) at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/getUint8">DataView.getUint8 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.getuint8"># sec-dataview.prototype.getuint8</a>
   */
  public native short getUint8(int byteOffset);

  /**
   * The getInt16() method gets a signed 16-bit integer (short) at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/getInt16">DataView.getInt16 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.getint16"># sec-dataview.prototype.getint16</a>
   */
  public native short getInt16(int byteOffset, boolean littleEndian);

  /**
   * The getInt16() method gets a signed 16-bit integer (short) at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/getInt16">DataView.getInt16 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.getint16"># sec-dataview.prototype.getint16</a>
   */
  public native short getInt16(int byteOffset);

  /**
   * The getUint16() method gets an unsigned 16-bit integer (unsigned short) at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/getUint16">DataView.getUint16 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.getuint16"># sec-dataview.prototype.getuint16</a>
   */
  public native int getUint16(int byteOffset, boolean littleEndian);

  /**
   * The getUint16() method gets an unsigned 16-bit integer (unsigned short) at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/getUint16">DataView.getUint16 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.getuint16"># sec-dataview.prototype.getuint16</a>
   */
  public native int getUint16(int byteOffset);

  /**
   * The getInt32() method gets a signed 32-bit integer (long) at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/getInt32">DataView.getInt32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.getint32"># sec-dataview.prototype.getint32</a>
   */
  public native int getInt32(int byteOffset, boolean littleEndian);

  /**
   * The getInt32() method gets a signed 32-bit integer (long) at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/getInt32">DataView.getInt32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.getint32"># sec-dataview.prototype.getint32</a>
   */
  public native int getInt32(int byteOffset);

  /**
   * The getUint32() method gets an unsigned 32-bit integer (unsigned long) at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/getUint32">DataView.getUint32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.getuint32"># sec-dataview.prototype.getuint32</a>
   */
  public native int getUint32(int byteOffset, boolean littleEndian);

  /**
   * The getUint32() method gets an unsigned 32-bit integer (unsigned long) at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/getUint32">DataView.getUint32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.getuint32"># sec-dataview.prototype.getuint32</a>
   */
  public native int getUint32(int byteOffset);

  /**
   * The getFloat32() method gets a signed 32-bit float (float) at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/getFloat32">DataView.getFloat32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.getfloat32"># sec-dataview.prototype.getfloat32</a>
   */
  public native float getFloat32(int byteOffset, boolean littleEndian);

  /**
   * The getFloat32() method gets a signed 32-bit float (float) at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/getFloat32">DataView.getFloat32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.getfloat32"># sec-dataview.prototype.getfloat32</a>
   */
  public native float getFloat32(int byteOffset);

  /**
   * The getFloat64() method gets a signed 64-bit float (double) at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/getFloat64">DataView.getFloat64 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.getfloat64"># sec-dataview.prototype.getfloat64</a>
   */
  public native double getFloat64(int byteOffset, boolean littleEndian);

  /**
   * The getFloat64() method gets a signed 64-bit float (double) at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/getFloat64">DataView.getFloat64 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.getfloat64"># sec-dataview.prototype.getfloat64</a>
   */
  public native double getFloat64(int byteOffset);

  /**
   * The setInt8() method stores a signed 8-bit integer (byte) value at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/setInt8">DataView.setInt8 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.setint8"># sec-dataview.prototype.setint8</a>
   */
  public native void setInt8(int byteOffset, byte value);

  /**
   * The setUint8() method stores an unsigned 8-bit integer (byte) value at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/setUint8">DataView.setUint8 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.setuint8"># sec-dataview.prototype.setuint8</a>
   */
  public native void setUint8(int byteOffset, int value);

  /**
   * The setInt16() method stores a signed 16-bit integer (short) value at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/setInt16">DataView.setInt16 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.setint16"># sec-dataview.prototype.setint16</a>
   */
  public native void setInt16(int byteOffset, int value, boolean littleEndian);

  /**
   * The setInt16() method stores a signed 16-bit integer (short) value at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/setInt16">DataView.setInt16 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.setint16"># sec-dataview.prototype.setint16</a>
   */
  public native void setInt16(int byteOffset, int value);

  /**
   * The setUint16() method stores an unsigned 16-bit integer (unsigned short) value at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/setUint16">DataView.setUint16 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.setuint16"># sec-dataview.prototype.setuint16</a>
   */
  public native void setUint16(int byteOffset, int value, boolean littleEndian);

  /**
   * The setUint16() method stores an unsigned 16-bit integer (unsigned short) value at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/setUint16">DataView.setUint16 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.setuint16"># sec-dataview.prototype.setuint16</a>
   */
  public native void setUint16(int byteOffset, int value);

  /**
   * The setInt32() method stores a signed 32-bit integer (long) value at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/setInt32">DataView.setInt32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.setint32"># sec-dataview.prototype.setint32</a>
   */
  public native void setInt32(int byteOffset, int value, boolean littleEndian);

  /**
   * The setInt32() method stores a signed 32-bit integer (long) value at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/setInt32">DataView.setInt32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.setint32"># sec-dataview.prototype.setint32</a>
   */
  public native void setInt32(int byteOffset, int value);

  /**
   * The setUint32() method stores an unsigned 32-bit integer (unsigned long) value at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/setUint32">DataView.setUint32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.setuint32"># sec-dataview.prototype.setuint32</a>
   */
  public native void setUint32(int byteOffset, int value, boolean littleEndian);

  /**
   * The setUint32() method stores an unsigned 32-bit integer (unsigned long) value at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/setUint32">DataView.setUint32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.setuint32"># sec-dataview.prototype.setuint32</a>
   */
  public native void setUint32(int byteOffset, int value);

  /**
   * The setFloat32() method stores a signed 32-bit float (float) value at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/setFloat32">DataView.setFloat32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.setfloat32"># sec-dataview.prototype.setfloat32</a>
   */
  public native void setFloat32(int byteOffset, float value, boolean littleEndian);

  /**
   * The setFloat32() method stores a signed 32-bit float (float) value at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/setFloat32">DataView.setFloat32 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.setfloat32"># sec-dataview.prototype.setfloat32</a>
   */
  public native void setFloat32(int byteOffset, float value);

  /**
   * The setFloat64() method stores a signed 64-bit float (double) value at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/setFloat64">DataView.setFloat64 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.setfloat64"># sec-dataview.prototype.setfloat64</a>
   */
  public native void setFloat64(int byteOffset, double value, boolean littleEndian);

  /**
   * The setFloat64() method stores a signed 64-bit float (double) value at the specified byte offset from the start of the DataView.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/DataView/setFloat64">DataView.setFloat64 - MDN</a>
   * @see <a href="https://tc39.es/ecma262/multipage/structured-data.html#sec-dataview.prototype.setfloat64"># sec-dataview.prototype.setfloat64</a>
   */
  public native void setFloat64(int byteOffset, double value);
}
