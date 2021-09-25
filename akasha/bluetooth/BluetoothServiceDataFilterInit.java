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
    name = "BluetoothServiceDataFilterInit"
)
public interface BluetoothServiceDataFilterInit extends BluetoothDataFilterInit {
  @JsOverlay
  @Nonnull
  static Builder service(@Nonnull final BluetoothServiceUUID service) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).service( service );
  }

  @JsOverlay
  @Nonnull
  static Builder service(@Nonnull final String service) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).service( service );
  }

  @JsOverlay
  @Nonnull
  static Builder service(final int service) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).service( service );
  }

  @JsProperty(
      name = "service"
  )
  @JsNonNull
  BluetoothServiceUUID service();

  @JsProperty
  void setService(@JsNonNull BluetoothServiceUUID service);

  @JsOverlay
  default void setService(@Nonnull final String service) {
    setService( BluetoothServiceUUID.of( service ) );
  }

  @JsOverlay
  default void setService(final int service) {
    setService( BluetoothServiceUUID.of( service ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "BluetoothServiceDataFilterInit"
  )
  interface Builder extends BluetoothServiceDataFilterInit {
    @JsOverlay
    @Nonnull
    default Builder service(@Nonnull final BluetoothServiceUUID service) {
      setService( service );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder service(@Nonnull final String service) {
      setService( service );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder service(final int service) {
      setService( service );
      return this;
    }

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
