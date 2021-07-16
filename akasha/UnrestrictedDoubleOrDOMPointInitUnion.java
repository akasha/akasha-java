package akasha;

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
    name = "UnrestrictedDoubleOrDOMPointInitUnion"
)
public interface UnrestrictedDoubleOrDOMPointInitUnion {
  @JsOverlay
  @Nonnull
  static UnrestrictedDoubleOrDOMPointInitUnion of(final double value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static UnrestrictedDoubleOrDOMPointInitUnion of(@Nonnull final DOMPointInit value) {
    return Js.cast( value );
  }
}
