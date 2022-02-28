package akasha;

import akasha.core.ArrayBuffer;
import akasha.core.BufferSource;
import akasha.core.DataView;
import akasha.core.Float32Array;
import akasha.core.Float64Array;
import akasha.core.Int16Array;
import akasha.core.Int32Array;
import akasha.core.Int8Array;
import akasha.core.JsObject;
import akasha.core.Uint16Array;
import akasha.core.Uint32Array;
import akasha.core.Uint8Array;
import akasha.core.Uint8ClampedArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "FileSystemWriteChunkType"
)
public interface FileSystemWriteChunkType {
  @JsOverlay
  @Nonnull
  static FileSystemWriteChunkType of(@Nonnull final BufferSource value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static FileSystemWriteChunkType of(@Nonnull final Blob value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static FileSystemWriteChunkType of(@Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static FileSystemWriteChunkType of(@Nonnull final WriteParams value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isArrayBuffer() {
    return ( (Object) this ) instanceof ArrayBuffer;
  }

  @JsOverlay
  default ArrayBuffer asArrayBuffer() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isBlob() {
    return ( (Object) this ) instanceof Blob;
  }

  @JsOverlay
  default Blob asBlob() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isDataView() {
    return ( (Object) this ) instanceof DataView;
  }

  @JsOverlay
  default DataView asDataView() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isFloat32Array() {
    return ( (Object) this ) instanceof Float32Array;
  }

  @JsOverlay
  default Float32Array asFloat32Array() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isFloat64Array() {
    return ( (Object) this ) instanceof Float64Array;
  }

  @JsOverlay
  default Float64Array asFloat64Array() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isInt16Array() {
    return ( (Object) this ) instanceof Int16Array;
  }

  @JsOverlay
  default Int16Array asInt16Array() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isInt32Array() {
    return ( (Object) this ) instanceof Int32Array;
  }

  @JsOverlay
  default Int32Array asInt32Array() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isInt8Array() {
    return ( (Object) this ) instanceof Int8Array;
  }

  @JsOverlay
  default Int8Array asInt8Array() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isString() {
    return ( (Object) this ) instanceof String;
  }

  @JsOverlay
  default String asString() {
    return Js.asString( this );
  }

  @JsOverlay
  default boolean isUint16Array() {
    return ( (Object) this ) instanceof Uint16Array;
  }

  @JsOverlay
  default Uint16Array asUint16Array() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isUint32Array() {
    return ( (Object) this ) instanceof Uint32Array;
  }

  @JsOverlay
  default Uint32Array asUint32Array() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isUint8Array() {
    return ( (Object) this ) instanceof Uint8Array;
  }

  @JsOverlay
  default Uint8Array asUint8Array() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isUint8ClampedArray() {
    return ( (Object) this ) instanceof Uint8ClampedArray;
  }

  @JsOverlay
  default Uint8ClampedArray asUint8ClampedArray() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isWriteParams() {
    return ( (Object) this ) instanceof JsObject;
  }

  @JsOverlay
  default WriteParams asWriteParams() {
    return Js.cast( this );
  }
}
