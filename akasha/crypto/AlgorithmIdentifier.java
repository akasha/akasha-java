package akasha.crypto;

import akasha.core.JsObject;
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
    name = "AlgorithmIdentifier"
)
public interface AlgorithmIdentifier {
  @JsOverlay
  @Nonnull
  static AlgorithmIdentifier of(@Nonnull final JsObject value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static AlgorithmIdentifier of(@Nonnull final String value) {
    return Js.cast( value );
  }
}
