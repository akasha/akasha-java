package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
    name = "GPURenderPassDepthStencilAttachment"
)
@ApiStatus.Experimental
public interface GPURenderPassDepthStencilAttachment {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUTextureView view, @Nonnull final String depthLoadValue,
      @GPUStoreOp @Nonnull final String depthStoreOp, @Nonnull final String stencilLoadValue,
      @GPUStoreOp @Nonnull final String stencilStoreOp) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).view( view ).depthLoadValue( depthLoadValue ).depthStoreOp( depthStoreOp ).stencilLoadValue( stencilLoadValue ).stencilStoreOp( stencilStoreOp );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUTextureView view, final float depthLoadValue,
      @GPUStoreOp @Nonnull final String depthStoreOp, @Nonnull final String stencilLoadValue,
      @GPUStoreOp @Nonnull final String stencilStoreOp) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).view( view ).depthLoadValue( depthLoadValue ).depthStoreOp( depthStoreOp ).stencilLoadValue( stencilLoadValue ).stencilStoreOp( stencilStoreOp );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUTextureView view, @Nonnull final String depthLoadValue,
      @GPUStoreOp @Nonnull final String depthStoreOp, final int stencilLoadValue,
      @GPUStoreOp @Nonnull final String stencilStoreOp) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).view( view ).depthLoadValue( depthLoadValue ).depthStoreOp( depthStoreOp ).stencilLoadValue( stencilLoadValue ).stencilStoreOp( stencilStoreOp );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUTextureView view, final float depthLoadValue,
      @GPUStoreOp @Nonnull final String depthStoreOp, final int stencilLoadValue,
      @GPUStoreOp @Nonnull final String stencilStoreOp) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).view( view ).depthLoadValue( depthLoadValue ).depthStoreOp( depthStoreOp ).stencilLoadValue( stencilLoadValue ).stencilStoreOp( stencilStoreOp );
  }

  @JsProperty(
      name = "view"
  )
  @Nonnull
  GPUTextureView view();

  @JsProperty
  void setView(@Nonnull GPUTextureView view);

  @JsProperty(
      name = "depthLoadValue"
  )
  @Nonnull
  GPULoadOpOrFloatUnion depthLoadValue();

  @JsProperty
  void setDepthLoadValue(@Nonnull GPULoadOpOrFloatUnion depthLoadValue);

  @JsOverlay
  default void setDepthLoadValue(@Nonnull final String depthLoadValue) {
    setDepthLoadValue( GPULoadOpOrFloatUnion.of( depthLoadValue ) );
  }

  @JsOverlay
  default void setDepthLoadValue(final float depthLoadValue) {
    setDepthLoadValue( GPULoadOpOrFloatUnion.of( depthLoadValue ) );
  }

  @JsProperty(
      name = "depthStoreOp"
  )
  @GPUStoreOp
  @Nonnull
  String depthStoreOp();

  @JsProperty
  void setDepthStoreOp(@GPUStoreOp @Nonnull String depthStoreOp);

  @JsProperty(
      name = "depthReadOnly"
  )
  boolean depthReadOnly();

  @JsProperty
  void setDepthReadOnly(boolean depthReadOnly);

  @JsProperty(
      name = "stencilLoadValue"
  )
  @Nonnull
  GPULoadOpOrGPUStencilValueUnion stencilLoadValue();

  @JsProperty
  void setStencilLoadValue(@Nonnull GPULoadOpOrGPUStencilValueUnion stencilLoadValue);

  @JsOverlay
  default void setStencilLoadValue(@Nonnull final String stencilLoadValue) {
    setStencilLoadValue( GPULoadOpOrGPUStencilValueUnion.of( stencilLoadValue ) );
  }

  @JsOverlay
  default void setStencilLoadValue(final int stencilLoadValue) {
    setStencilLoadValue( GPULoadOpOrGPUStencilValueUnion.of( stencilLoadValue ) );
  }

  @JsProperty(
      name = "stencilStoreOp"
  )
  @GPUStoreOp
  @Nonnull
  String stencilStoreOp();

  @JsProperty
  void setStencilStoreOp(@GPUStoreOp @Nonnull String stencilStoreOp);

  @JsProperty(
      name = "stencilReadOnly"
  )
  boolean stencilReadOnly();

  @JsProperty
  void setStencilReadOnly(boolean stencilReadOnly);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassDepthStencilAttachment"
  )
  @ApiStatus.Experimental
  interface Builder extends GPURenderPassDepthStencilAttachment {
    @JsOverlay
    @Nonnull
    default Builder view(@Nonnull final GPUTextureView view) {
      setView( view );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthLoadValue(@Nonnull final String depthLoadValue) {
      setDepthLoadValue( depthLoadValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthLoadValue(final float depthLoadValue) {
      setDepthLoadValue( depthLoadValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthStoreOp(@GPUStoreOp @Nonnull final String depthStoreOp) {
      setDepthStoreOp( depthStoreOp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthReadOnly(final boolean depthReadOnly) {
      setDepthReadOnly( depthReadOnly );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stencilLoadValue(@Nonnull final String stencilLoadValue) {
      setStencilLoadValue( stencilLoadValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stencilLoadValue(final int stencilLoadValue) {
      setStencilLoadValue( stencilLoadValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stencilStoreOp(@GPUStoreOp @Nonnull final String stencilStoreOp) {
      setStencilStoreOp( stencilStoreOp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stencilReadOnly(final boolean stencilReadOnly) {
      setStencilReadOnly( stencilReadOnly );
      return this;
    }
  }
}
