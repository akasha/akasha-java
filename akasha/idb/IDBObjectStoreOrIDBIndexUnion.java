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
    name = "IDBObjectStoreOrIDBIndexUnion"
)
public interface IDBObjectStoreOrIDBIndexUnion {
  @JsOverlay
  @Nonnull
  static IDBObjectStoreOrIDBIndexUnion of(@Nonnull final IDBObjectStore value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static IDBObjectStoreOrIDBIndexUnion of(@Nonnull final IDBIndex value) {
    return Js.cast( value );
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
