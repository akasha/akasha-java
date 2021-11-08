package akasha.usb;

import akasha.EventInit;
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
    name = "USBConnectionEventInit"
)
public interface USBConnectionEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder device(@Nonnull final USBDevice device) {
    final Builder $usbConnectionEventInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $usbConnectionEventInit.setDevice( device );
    return Js.uncheckedCast( $usbConnectionEventInit );
  }

  @JsProperty(
      name = "device"
  )
  @JsNonNull
  USBDevice device();

  @JsProperty
  void setDevice(@JsNonNull USBDevice device);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "USBConnectionEventInit"
  )
  interface Builder extends USBConnectionEventInit {
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
