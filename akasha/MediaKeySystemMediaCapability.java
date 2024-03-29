package akasha;

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
    name = "MediaKeySystemMediaCapability"
)
public interface MediaKeySystemMediaCapability {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "contentType"
  )
  String contentType();

  @JsProperty
  void setContentType(@JsNonNull String contentType);

  @JsProperty(
      name = "robustness"
  )
  String robustness();

  @JsProperty
  void setRobustness(@JsNonNull String robustness);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MediaKeySystemMediaCapability"
  )
  interface Builder extends MediaKeySystemMediaCapability {
    @JsOverlay
    @Nonnull
    default Builder contentType(@Nonnull final String contentType) {
      setContentType( contentType );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder robustness(@Nonnull final String robustness) {
      setRobustness( robustness );
      return this;
    }
  }
}
