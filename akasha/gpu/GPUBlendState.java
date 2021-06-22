package akasha.gpu;

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
    name = "GPUBlendState"
)
public interface GPUBlendState {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUBlendComponent alpha,
      @Nonnull final GPUBlendComponent color) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).alpha( alpha ).color( color );
  }

  @JsProperty(
      name = "alpha"
  )
  @Nonnull
  GPUBlendComponent alpha();

  @JsProperty
  void setAlpha(@Nonnull GPUBlendComponent alpha);

  @JsProperty(
      name = "color"
  )
  @Nonnull
  GPUBlendComponent color();

  @JsProperty
  void setColor(@Nonnull GPUBlendComponent color);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBlendState"
  )
  interface Builder extends GPUBlendState {
    @JsOverlay
    @Nonnull
    default Builder alpha(@Nonnull final GPUBlendComponent alpha) {
      setAlpha( alpha );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder color(@Nonnull final GPUBlendComponent color) {
      setColor( color );
      return this;
    }
  }
}
