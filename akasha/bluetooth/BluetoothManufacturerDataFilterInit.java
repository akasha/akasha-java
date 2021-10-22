package akasha.bluetooth;

import akasha.core.BufferSource;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
    name = "BluetoothManufacturerDataFilterInit"
)
public interface BluetoothManufacturerDataFilterInit extends BluetoothDataFilterInit {
  @JsOverlay
  @Nonnull
  static Builder companyIdentifier(final int companyIdentifier) {
    final Builder $bluetoothManufacturerDataFilterInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $bluetoothManufacturerDataFilterInit.setCompanyIdentifier( companyIdentifier );
    return Js.uncheckedCast( $bluetoothManufacturerDataFilterInit );
  }

  @JsProperty(
      name = "companyIdentifier"
  )
  int companyIdentifier();

  @JsProperty
  void setCompanyIdentifier(int companyIdentifier);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "BluetoothManufacturerDataFilterInit"
  )
  interface Builder extends BluetoothManufacturerDataFilterInit {
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
