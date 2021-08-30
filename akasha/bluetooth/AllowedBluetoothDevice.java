package akasha.bluetooth;

import akasha.StringOrUUIDArrayUnion;
import akasha.lang.JsArray;
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
    name = "AllowedBluetoothDevice"
)
public interface AllowedBluetoothDevice {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<Double> allowedManufacturerData,
      @Nonnull final String allowedServices, @Nonnull final String deviceId,
      final boolean mayUseGATT) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).allowedManufacturerData( allowedManufacturerData ).allowedServices( allowedServices ).deviceId( deviceId ).mayUseGATT( mayUseGATT );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final double[] allowedManufacturerData,
      @Nonnull final String allowedServices, @Nonnull final String deviceId,
      final boolean mayUseGATT) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).allowedManufacturerData( allowedManufacturerData ).allowedServices( allowedServices ).deviceId( deviceId ).mayUseGATT( mayUseGATT );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<Double> allowedManufacturerData,
      @Nonnull final JsArray<String> allowedServices, @Nonnull final String deviceId,
      final boolean mayUseGATT) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).allowedManufacturerData( allowedManufacturerData ).allowedServices( allowedServices ).deviceId( deviceId ).mayUseGATT( mayUseGATT );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final double[] allowedManufacturerData,
      @Nonnull final JsArray<String> allowedServices, @Nonnull final String deviceId,
      final boolean mayUseGATT) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).allowedManufacturerData( allowedManufacturerData ).allowedServices( allowedServices ).deviceId( deviceId ).mayUseGATT( mayUseGATT );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<Double> allowedManufacturerData,
      @Nonnull final String[] allowedServices, @Nonnull final String deviceId,
      final boolean mayUseGATT) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).allowedManufacturerData( allowedManufacturerData ).allowedServices( allowedServices ).deviceId( deviceId ).mayUseGATT( mayUseGATT );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final double[] allowedManufacturerData,
      @Nonnull final String[] allowedServices, @Nonnull final String deviceId,
      final boolean mayUseGATT) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).allowedManufacturerData( allowedManufacturerData ).allowedServices( allowedServices ).deviceId( deviceId ).mayUseGATT( mayUseGATT );
  }

  @JsProperty(
      name = "allowedManufacturerData"
  )
  @JsNonNull
  JsArray<Double> allowedManufacturerData();

  @JsProperty
  void setAllowedManufacturerData(@JsNonNull JsArray<Double> allowedManufacturerData);

  @JsOverlay
  default void setAllowedManufacturerData(@Nonnull final double... allowedManufacturerData) {
    setAllowedManufacturerData( Js.<JsArray<Double>>uncheckedCast( allowedManufacturerData ) );
  }

  @JsProperty(
      name = "allowedServices"
  )
  @JsNonNull
  StringOrUUIDArrayUnion allowedServices();

  @JsProperty
  void setAllowedServices(@JsNonNull StringOrUUIDArrayUnion allowedServices);

  @JsOverlay
  default void setAllowedServices(@Nonnull final String allowedServices) {
    setAllowedServices( StringOrUUIDArrayUnion.of( allowedServices ) );
  }

  @JsOverlay
  default void setAllowedServices(@Nonnull final JsArray<String> allowedServices) {
    setAllowedServices( StringOrUUIDArrayUnion.of( allowedServices ) );
  }

  @JsOverlay
  default void setAllowedServices(@Nonnull final String... allowedServices) {
    setAllowedServices( StringOrUUIDArrayUnion.of( allowedServices ) );
  }

  @JsProperty(
      name = "deviceId"
  )
  @JsNonNull
  String deviceId();

  @JsProperty
  void setDeviceId(@JsNonNull String deviceId);

  @JsProperty(
      name = "mayUseGATT"
  )
  boolean mayUseGATT();

  @JsProperty
  void setMayUseGATT(boolean mayUseGATT);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AllowedBluetoothDevice"
  )
  interface Builder extends AllowedBluetoothDevice {
    @JsOverlay
    @Nonnull
    default Builder allowedManufacturerData(
        @Nonnull final JsArray<Double> allowedManufacturerData) {
      setAllowedManufacturerData( allowedManufacturerData );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder allowedManufacturerData(@Nonnull final double... allowedManufacturerData) {
      setAllowedManufacturerData( allowedManufacturerData );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder allowedServices(@Nonnull final String allowedServices) {
      setAllowedServices( allowedServices );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder allowedServices(@Nonnull final JsArray<String> allowedServices) {
      setAllowedServices( allowedServices );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder allowedServices(@Nonnull final String... allowedServices) {
      setAllowedServices( allowedServices );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder deviceId(@Nonnull final String deviceId) {
      setDeviceId( deviceId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mayUseGATT(final boolean mayUseGATT) {
      setMayUseGATT( mayUseGATT );
      return this;
    }
  }
}
