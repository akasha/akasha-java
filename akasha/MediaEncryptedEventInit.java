package akasha;

import akasha.core.ArrayBuffer;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
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
    name = "MediaEncryptedEventInit"
)
public interface MediaEncryptedEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "initData"
  )
  @JsNullable
  ArrayBuffer initData();

  @JsProperty
  void setInitData(@JsNullable ArrayBuffer initData);

  @JsProperty(
      name = "initDataType"
  )
  String initDataType();

  @JsProperty
  void setInitDataType(@JsNonNull String initDataType);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MediaEncryptedEventInit"
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
