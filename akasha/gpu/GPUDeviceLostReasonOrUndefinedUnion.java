package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUDeviceLostReasonOrUndefinedUnion"
)
public interface GPUDeviceLostReasonOrUndefinedUnion {
  @JsOverlay
  @Nonnull
  static GPUDeviceLostReasonOrUndefinedUnion of(@GPUDeviceLostReason @Nonnull final String value) {
    return Js.cast( value );
  }

  @JsOverlay
  static GPUDeviceLostReasonOrUndefinedUnion of() {
    return Js.cast( Js.undefined() );
  }

  @JsOverlay
  default boolean isGPUDeviceLostReason() {
    return ( (Object) this ) instanceof String;
  }

  @JsOverlay
  @GPUDeviceLostReason
  default String asGPUDeviceLostReason() {
    return Js.asString( this );
  }

  @JsOverlay
  default boolean isVoid() {
    return Js.isTripleEqual( Js.undefined(), this );
  }
}
