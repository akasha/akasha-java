package akasha.audio;

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
    name = "ConstantSourceOptions"
)
public interface ConstantSourceOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "offset"
  )
  float offset();

  @JsProperty
  void setOffset(float offset);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ConstantSourceOptions"
  )
  interface Builder extends ConstantSourceOptions {
    @JsOverlay
    @Nonnull
    default Builder offset(final float offset) {
      setOffset( offset );
      return this;
    }
  }
}
