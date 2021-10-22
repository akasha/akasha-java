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
    name = "IdleRequestOptions"
)
public interface IdleRequestOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "timeout"
  )
  int timeout();

  @JsProperty
  void setTimeout(int timeout);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "IdleRequestOptions"
  )
  interface Builder extends IdleRequestOptions {
    @JsOverlay
    @Nonnull
    default Builder timeout(final int timeout) {
      setTimeout( timeout );
      return this;
    }
  }
}
