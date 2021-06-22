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
    name = "GPUStencilFaceState"
)
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
  void setCompare(@GPUCompareFunction @Nonnull String compare);

  @JsProperty(
      name = "depthFailOp"
  )
  @GPUStencilOperation
  String depthFailOp();

  @JsProperty
  void setDepthFailOp(@GPUStencilOperation @Nonnull String depthFailOp);

  @JsProperty(
      name = "failOp"
  )
  @GPUStencilOperation
  String failOp();

  @JsProperty
  void setFailOp(@GPUStencilOperation @Nonnull String failOp);

  @JsProperty(
      name = "passOp"
  )
  @GPUStencilOperation
  String passOp();

  @JsProperty
  void setPassOp(@GPUStencilOperation @Nonnull String passOp);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUStencilFaceState"
  )
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
