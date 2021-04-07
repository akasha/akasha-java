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
public interface ConvertCoordinateOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "fromBox"
  )
  @CSSBoxType
  String fromBox();

  @JsProperty
  void setFromBox(@CSSBoxType @Nonnull String fromBox);

  @JsProperty(
      name = "toBox"
  )
  @CSSBoxType
  String toBox();

  @JsProperty
  void setToBox(@CSSBoxType @Nonnull String toBox);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends ConvertCoordinateOptions {
    @JsOverlay
    @Nonnull
    default Builder fromBox(@CSSBoxType @Nonnull final String fromBox) {
      setFromBox( fromBox );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder toBox(@CSSBoxType @Nonnull final String toBox) {
      setToBox( toBox );
      return this;
    }
  }
}
