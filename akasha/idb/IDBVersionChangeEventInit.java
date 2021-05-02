package akasha.idb;

import akasha.EventInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
    name = "Object"
)
public interface IDBVersionChangeEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "newVersion"
  )
  @Nullable
  Double newVersion();

  @JsProperty
  void setNewVersion(@Nullable Double newVersion);

  @JsProperty(
      name = "oldVersion"
  )
  int oldVersion();

  @JsProperty
  void setOldVersion(int oldVersion);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends IDBVersionChangeEventInit {
    @JsOverlay
    @Nonnull
    default Builder newVersion(@Nullable final Double newVersion) {
      setNewVersion( newVersion );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder oldVersion(final int oldVersion) {
      setOldVersion( oldVersion );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}