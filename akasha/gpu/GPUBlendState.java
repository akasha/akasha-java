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
  static Step1 color(@Nonnull final GPUBlendComponent color) {
    final GPUBlendState $gpuBlendState = Js.<GPUBlendState>uncheckedCast( JsPropertyMap.of() );
    $gpuBlendState.setColor( color );
    return Js.uncheckedCast( $gpuBlendState );
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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBlendState"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default GPUBlendState alpha(@Nonnull GPUBlendComponent alpha) {
      Js.<GPUBlendState>uncheckedCast( this ).setAlpha( alpha );
      return Js.uncheckedCast( this );
    }
  }
}
