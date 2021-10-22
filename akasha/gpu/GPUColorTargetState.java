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
    name = "GPUColorTargetState"
)
@ApiStatus.Experimental
public interface GPUColorTargetState {
  @JsOverlay
  @Nonnull
  static Builder format(@GPUTextureFormat @Nonnull final String format) {
    final Builder $gpuColorTargetState = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuColorTargetState.setFormat( format );
    return Js.uncheckedCast( $gpuColorTargetState );
  }

  @JsProperty(
      name = "format"
  )
  @GPUTextureFormat
  @JsNonNull
  String format();

  @JsProperty
  void setFormat(@GPUTextureFormat @JsNonNull String format);

  @JsProperty(
      name = "blend"
  )
  GPUBlendState blend();

  @JsProperty
  void setBlend(@JsNonNull GPUBlendState blend);

  @JsProperty(
      name = "writeMask"
  )
  @GPUColorWriteFlags
  int writeMask();

  @JsProperty
  void setWriteMask(@GPUColorWriteFlags @JsNonNull int writeMask);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUColorTargetState"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUColorTargetState {
    @JsOverlay
    @Nonnull
    default Builder blend(@Nonnull final GPUBlendState blend) {
      setBlend( blend );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder writeMask(@GPUColorWriteFlags final int writeMask) {
      setWriteMask( writeMask );
      return this;
    }
  }
}
