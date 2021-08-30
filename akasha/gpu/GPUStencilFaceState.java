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
    name = "GPUStencilFaceState"
)
@ApiStatus.Experimental
public interface GPUStencilFaceState {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "compare"
  )
  @GPUCompareFunction
  String compare();

  @JsProperty
  void setCompare(@GPUCompareFunction @JsNonNull String compare);

  @JsProperty(
      name = "depthFailOp"
  )
  @GPUStencilOperation
  String depthFailOp();

  @JsProperty
  void setDepthFailOp(@GPUStencilOperation @JsNonNull String depthFailOp);

  @JsProperty(
      name = "failOp"
  )
  @GPUStencilOperation
  String failOp();

  @JsProperty
  void setFailOp(@GPUStencilOperation @JsNonNull String failOp);

  @JsProperty(
      name = "passOp"
  )
  @GPUStencilOperation
  String passOp();

  @JsProperty
  void setPassOp(@GPUStencilOperation @JsNonNull String passOp);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUStencilFaceState"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUStencilFaceState {
    @JsOverlay
    @Nonnull
    default Builder compare(@GPUCompareFunction @Nonnull final String compare) {
      setCompare( compare );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder depthFailOp(@GPUStencilOperation @Nonnull final String depthFailOp) {
      setDepthFailOp( depthFailOp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder failOp(@GPUStencilOperation @Nonnull final String failOp) {
      setFailOp( failOp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder passOp(@GPUStencilOperation @Nonnull final String passOp) {
      setPassOp( passOp );
      return this;
    }
  }
}
