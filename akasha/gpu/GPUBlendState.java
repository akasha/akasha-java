package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUBlendState"
)
@ApiStatus.Experimental
public interface GPUBlendState {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUBlendComponent color,
      @Nonnull final GPUBlendComponent alpha) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).color( color ).alpha( alpha );
  }

  @JsProperty(
      name = "color"
  )
  @JsNonNull
  GPUBlendComponent color();

  @JsProperty
  void setColor(@JsNonNull GPUBlendComponent color);

  @JsProperty(
      name = "alpha"
  )
  @JsNonNull
  GPUBlendComponent alpha();

  @JsProperty
  void setAlpha(@JsNonNull GPUBlendComponent alpha);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBlendState"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUBlendState {
    @JsOverlay
    @Nonnull
    default Builder color(@Nonnull final GPUBlendComponent color) {
      setColor( color );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder alpha(@Nonnull final GPUBlendComponent alpha) {
      setAlpha( alpha );
      return this;
    }
  }
}
