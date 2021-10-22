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
    name = "ImageEncodeOptions"
)
public interface ImageEncodeOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "quality"
  )
  double quality();

  @JsProperty
  void setQuality(double quality);

  @JsProperty(
      name = "type"
  )
  String type();

  @JsProperty
  void setType(@JsNonNull String type);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ImageEncodeOptions"
  )
  interface Builder extends ImageEncodeOptions {
    @JsOverlay
    @Nonnull
    default Builder quality(final double quality) {
      setQuality( quality );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder type(@Nonnull final String type) {
      setType( type );
      return this;
    }
  }
}
