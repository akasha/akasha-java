package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPURequestAdapterOptions"
)
@ApiStatus.Experimental
public interface GPURequestAdapterOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "forceSoftware"
  )
  boolean forceSoftware();

  @JsProperty
  void setForceSoftware(boolean forceSoftware);

  @JsProperty(
      name = "powerPreference"
  )
  @GPUPowerPreference
  String powerPreference();

  @JsProperty
  void setPowerPreference(@GPUPowerPreference @JsNonNull String powerPreference);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURequestAdapterOptions"
  )
  @ApiStatus.Experimental
  interface Builder extends GPURequestAdapterOptions {
    @JsOverlay
    @Nonnull
    default Builder forceSoftware(final boolean forceSoftware) {
      setForceSoftware( forceSoftware );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder powerPreference(@GPUPowerPreference @Nonnull final String powerPreference) {
      setPowerPreference( powerPreference );
      return this;
    }
  }
}
