package akasha.bluetooth;

import akasha.AbortSignal;
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
    name = "WatchAdvertisementsOptions"
)
public interface WatchAdvertisementsOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "signal"
  )
  AbortSignal signal();

  @JsProperty
  void setSignal(@Nonnull AbortSignal signal);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "WatchAdvertisementsOptions"
  )
  interface Builder extends WatchAdvertisementsOptions {
    @JsOverlay
    @Nonnull
    default Builder signal(@Nonnull final AbortSignal signal) {
      setSignal( signal );
      return this;
    }
  }
}
