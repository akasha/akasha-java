package akasha;

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
    name = "Object"
)
public interface IdleRequestOptions {
  @JsOverlay
  @Nonnull
  static IdleRequestOptions create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "timeout"
  )
  int timeout();

  @JsProperty
  void setTimeout(int timeout);

  @JsOverlay
  @Nonnull
  default IdleRequestOptions timeout(final int timeout) {
    setTimeout( timeout );
    return this;
  }
}
