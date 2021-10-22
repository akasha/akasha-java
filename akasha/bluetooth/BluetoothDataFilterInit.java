package akasha.bluetooth;

import akasha.core.BufferSource;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
    name = "BluetoothDataFilterInit"
)
public interface BluetoothDataFilterInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "dataPrefix"
  )
  BufferSource dataPrefix();

  @JsProperty
  void setDataPrefix(@JsNonNull BufferSource dataPrefix);

  @JsProperty(
      name = "mask"
  )
  BufferSource mask();

  @JsProperty
  void setMask(@JsNonNull BufferSource mask);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "BluetoothDataFilterInit"
  )
  interface Builder extends BluetoothDataFilterInit {
    @JsOverlay
    @Nonnull
    default Builder dataPrefix(@Nonnull final BufferSource dataPrefix) {
      setDataPrefix( dataPrefix );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mask(@Nonnull final BufferSource mask) {
      setMask( mask );
      return this;
    }
  }
}
