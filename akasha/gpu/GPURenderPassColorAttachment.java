package akasha.gpu;

import akasha.lang.JsArray;
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
    name = "GPURenderPassColorAttachment"
)
@ApiStatus.Experimental
public interface GPURenderPassColorAttachment {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUTextureView view, @Nonnull final String loadValue,
      @GPUStoreOp @Nonnull final String storeOp) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).view( view ).loadValue( loadValue ).storeOp( storeOp );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUTextureView view, @Nonnull final GPUColor loadValue,
      @GPUStoreOp @Nonnull final String storeOp) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).view( view ).loadValue( loadValue ).storeOp( storeOp );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUTextureView view,
      @Nonnull final JsArray<Double> loadValue, @GPUStoreOp @Nonnull final String storeOp) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).view( view ).loadValue( loadValue ).storeOp( storeOp );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUTextureView view, @Nonnull final double[] loadValue,
      @GPUStoreOp @Nonnull final String storeOp) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).view( view ).loadValue( loadValue ).storeOp( storeOp );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUTextureView view, @Nonnull final GPUColorDict loadValue,
      @GPUStoreOp @Nonnull final String storeOp) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).view( view ).loadValue( loadValue ).storeOp( storeOp );
  }

  @JsProperty(
      name = "view"
  )
  @JsNonNull
  GPUTextureView view();

  @JsProperty
  void setView(@JsNonNull GPUTextureView view);

  @JsProperty(
      name = "resolveTarget"
  )
  GPUTextureView resolveTarget();

  @JsProperty
  void setResolveTarget(@JsNonNull GPUTextureView resolveTarget);

  @JsProperty(
      name = "loadValue"
  )
  @JsNonNull
  GPULoadOpOrGPUColorUnion loadValue();

  @JsProperty
  void setLoadValue(@JsNonNull GPULoadOpOrGPUColorUnion loadValue);

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
      name = "storeOp"
  )
  @GPUStoreOp
  @JsNonNull
  String storeOp();

  @JsProperty
  void setStoreOp(@GPUStoreOp @JsNonNull String storeOp);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassColorAttachment"
  )
  @ApiStatus.Experimental
  interface Builder extends GPURenderPassColorAttachment {
    @JsOverlay
    @Nonnull
    default Builder view(@Nonnull final GPUTextureView view) {
      setView( view );
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
    default Builder storeOp(@GPUStoreOp @Nonnull final String storeOp) {
      setStoreOp( storeOp );
      return this;
    }
  }
}
