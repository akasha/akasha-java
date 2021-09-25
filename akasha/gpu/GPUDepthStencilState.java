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
    name = "GPUDepthStencilState"
)
@ApiStatus.Experimental
public interface GPUDepthStencilState {
  @JsOverlay
  @Nonnull
  static Builder format(@GPUTextureFormat @Nonnull final String format) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).format( format );
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
      name = "depthBias"
  )
  int depthBias();

  @JsProperty
  void setDepthBias(int depthBias);

  @JsProperty(
      name = "depthBiasClamp"
  )
  float depthBiasClamp();

  @JsProperty
  void setDepthBiasClamp(float depthBiasClamp);

  @JsProperty(
      name = "depthBiasSlopeScale"
  )
  float depthBiasSlopeScale();

  @JsProperty
  void setDepthBiasSlopeScale(float depthBiasSlopeScale);

  @JsProperty(
      name = "depthCompare"
  )
  @GPUCompareFunction
  String depthCompare();

  @JsProperty
  void setDepthCompare(@GPUCompareFunction @JsNonNull String depthCompare);

  @JsProperty(
      name = "depthWriteEnabled"
  )
  boolean depthWriteEnabled();

  @JsProperty
  void setDepthWriteEnabled(boolean depthWriteEnabled);

  @JsProperty(
      name = "stencilBack"
  )
  GPUStencilFaceState stencilBack();

  @JsProperty
  void setStencilBack(@JsNonNull GPUStencilFaceState stencilBack);

  @JsProperty(
      name = "stencilFront"
  )
  GPUStencilFaceState stencilFront();

  @JsProperty
  void setStencilFront(@JsNonNull GPUStencilFaceState stencilFront);

  @JsProperty(
      name = "stencilReadMask"
  )
  int stencilReadMask();

  @JsProperty
  void setStencilReadMask(int stencilReadMask);

  @JsProperty(
      name = "stencilWriteMask"
  )
  int stencilWriteMask();

  @JsProperty
  void setStencilWriteMask(int stencilWriteMask);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUDepthStencilState"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUDepthStencilState {
    @JsOverlay
    @Nonnull
    default Builder format(@GPUTextureFormat @Nonnull final String format) {
      setFormat( format );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthBias(final int depthBias) {
      setDepthBias( depthBias );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthBiasClamp(final float depthBiasClamp) {
      setDepthBiasClamp( depthBiasClamp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthBiasSlopeScale(final float depthBiasSlopeScale) {
      setDepthBiasSlopeScale( depthBiasSlopeScale );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthCompare(@GPUCompareFunction @Nonnull final String depthCompare) {
      setDepthCompare( depthCompare );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthWriteEnabled(final boolean depthWriteEnabled) {
      setDepthWriteEnabled( depthWriteEnabled );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stencilBack(@Nonnull final GPUStencilFaceState stencilBack) {
      setStencilBack( stencilBack );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stencilFront(@Nonnull final GPUStencilFaceState stencilFront) {
      setStencilFront( stencilFront );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stencilReadMask(final int stencilReadMask) {
      setStencilReadMask( stencilReadMask );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stencilWriteMask(final int stencilWriteMask) {
      setStencilWriteMask( stencilWriteMask );
      return this;
    }
  }
}
