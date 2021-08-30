package akasha.idb;

import akasha.StringOrStringArrayUnion;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBObjectStoreParameters"
)
public interface IDBObjectStoreParameters {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "autoIncrement"
  )
  boolean autoIncrement();

  @JsProperty
  void setAutoIncrement(boolean autoIncrement);

  @JsProperty(
      name = "keyPath"
  )
  @JsNullable
  StringOrStringArrayUnion keyPath();

  @JsProperty
  void setKeyPath(@JsNullable StringOrStringArrayUnion keyPath);

  @JsOverlay
  default void setKeyPath(@Nonnull final String keyPath) {
    setKeyPath( StringOrStringArrayUnion.of( keyPath ) );
  }

  @JsOverlay
  default void setKeyPath(@Nonnull final JsArray<String> keyPath) {
    setKeyPath( StringOrStringArrayUnion.of( keyPath ) );
  }

  @JsOverlay
  default void setKeyPath(@Nonnull final String... keyPath) {
    setKeyPath( StringOrStringArrayUnion.of( keyPath ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "IDBObjectStoreParameters"
  )
  interface Builder extends IDBObjectStoreParameters {
    @JsOverlay
    @Nonnull
    default Builder autoIncrement(final boolean autoIncrement) {
      setAutoIncrement( autoIncrement );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder keyPath(@Nonnull final String keyPath) {
      setKeyPath( keyPath );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder keyPath(@Nonnull final JsArray<String> keyPath) {
      setKeyPath( keyPath );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder keyPath(@Nonnull final String... keyPath) {
      setKeyPath( keyPath );
      return this;
    }
  }
}
