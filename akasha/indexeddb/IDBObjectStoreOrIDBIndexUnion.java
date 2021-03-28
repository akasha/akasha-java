package akasha.indexeddb;

import akasha.idb.IDBIndex;
import akasha.idb.IDBObjectStore;
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
    name = "?"
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
}
