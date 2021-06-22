package akasha.gpu;

import akasha.lang.JsArray;
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
    name = "GPURenderPassColorAttachment"
)
public interface GPURenderPassColorAttachment {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String loadValue, @GPUStoreOp @Nonnull final String storeOp,
      @Nonnull final GPUTextureView view) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).loadValue( loadValue ).storeOp( storeOp ).view( view );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUColor loadValue,
      @GPUStoreOp @Nonnull final String storeOp, @Nonnull final GPUTextureView view) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).loadValue( loadValue ).storeOp( storeOp ).view( view );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<Double> loadValue,
      @GPUStoreOp @Nonnull final String storeOp, @Nonnull final GPUTextureView view) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).loadValue( loadValue ).storeOp( storeOp ).view( view );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final double[] loadValue,
      @GPUStoreOp @Nonnull final String storeOp, @Nonnull final GPUTextureView view) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).loadValue( loadValue ).storeOp( storeOp ).view( view );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUColorDict loadValue,
      @GPUStoreOp @Nonnull final String storeOp, @Nonnull final GPUTextureView view) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).loadValue( loadValue ).storeOp( storeOp ).view( view );
  }

  @JsProperty(
      name = "loadValue"
  )
  @Nonnull
  GPULoadOpOrGPUColorUnion loadValue();

  @JsProperty
  void setLoadValue(@Nonnull GPULoadOpOrGPUColorUnion loadValue);

  @JsOverlay
  default void setLoadValue(@Nonnull final String loadValue) {
    setLoadValue( GPULoadOpOrGPUColorUnion.of( loadValue ) );
  }

  @JsOverlay
  default void setLoadValue(@Nonnull final GPUColor loadValue) {
    setLoadValue( GPULoadOpOrGPUColorUnion.of( loadValue ) );
  }

  @JsOverlay
  default void setLoadValue(@Nonnull final JsArray<Double> loadValue) {
    setLoadValue( GPULoadOpOrGPUColorUnion.of( loadValue ) );
  }

  @JsOverlay
  default void setLoadValue(@Nonnull final double... loadValue) {
    setLoadValue( GPULoadOpOrGPUColorUnion.of( loadValue ) );
  }

  @JsOverlay
  default void setLoadValue(@Nonnull final GPUColorDict loadValue) {
    setLoadValue( GPULoadOpOrGPUColorUnion.of( loadValue ) );
  }

  @JsProperty(
      name = "resolveTarget"
  )
  GPUTextureView resolveTarget();

  @JsProperty
  void setResolveTarget(@Nonnull GPUTextureView resolveTarget);

  @JsProperty(
      name = "storeOp"
  )
  @GPUStoreOp
  @Nonnull
  String storeOp();

  @JsProperty
  void setStoreOp(@GPUStoreOp @Nonnull String storeOp);

  @JsProperty(
      name = "view"
  )
  @Nonnull
  GPUTextureView view();

  @JsProperty
  void setView(@Nonnull GPUTextureView view);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassColorAttachment"
  )
  interface Builder extends GPURenderPassColorAttachment {
    @JsOverlay
    @Nonnull
    default Builder loadValue(@Nonnull final String loadValue) {
      setLoadValue( loadValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder loadValue(@Nonnull final GPUColor loadValue) {
      setLoadValue( loadValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder loadValue(@Nonnull final JsArray<Double> loadValue) {
      setLoadValue( loadValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder loadValue(@Nonnull final double... loadValue) {
      setLoadValue( loadValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder loadValue(@Nonnull final GPUColorDict loadValue) {
      setLoadValue( loadValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder resolveTarget(@Nonnull final GPUTextureView resolveTarget) {
      setResolveTarget( resolveTarget );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder storeOp(@GPUStoreOp @Nonnull final String storeOp) {
      setStoreOp( storeOp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder view(@Nonnull final GPUTextureView view) {
      setView( view );
      return this;
    }
  }
}
