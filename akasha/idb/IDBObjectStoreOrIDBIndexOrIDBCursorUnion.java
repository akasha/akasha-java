package akasha.idb;

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
    name = "IDBObjectStoreOrIDBIndexOrIDBCursorUnion"
)
public interface IDBObjectStoreOrIDBIndexOrIDBCursorUnion {
  @JsOverlay
  @Nonnull
  static IDBObjectStoreOrIDBIndexOrIDBCursorUnion of(@Nonnull final IDBObjectStore value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static IDBObjectStoreOrIDBIndexOrIDBCursorUnion of(@Nonnull final IDBIndex value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static IDBObjectStoreOrIDBIndexOrIDBCursorUnion of(@Nonnull final IDBCursor value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isIDBCursor() {
    return ( (Object) this ) instanceof IDBCursor;
  }

  @JsOverlay
  default IDBCursor asIDBCursor() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isIDBIndex() {
    return ( (Object) this ) instanceof IDBIndex;
  }

  @JsOverlay
  default IDBIndex asIDBIndex() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isIDBObjectStore() {
    return ( (Object) this ) instanceof IDBObjectStore;
  }

  @JsOverlay
  default IDBObjectStore asIDBObjectStore() {
    return Js.cast( this );
  }
}
