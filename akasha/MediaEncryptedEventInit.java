package akasha;

import akasha.core.ArrayBuffer;
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
public interface MediaEncryptedEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "initData"
  )
  @Nullable
  ArrayBuffer initData();

  @JsProperty
  void setInitData(@Nullable ArrayBuffer initData);

  @JsProperty(
      name = "initDataType"
  )
  String initDataType();

  @JsProperty
  void setInitDataType(@Nonnull String initDataType);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends MediaEncryptedEventInit {
    @JsOverlay
    @Nonnull
    default Builder initData(@Nullable final ArrayBuffer initData) {
      setInitData( initData );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder initDataType(@Nonnull final String initDataType) {
      setInitDataType( initDataType );
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
