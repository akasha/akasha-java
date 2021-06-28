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
    name = "GPUPipelineDescriptorBase"
)
@ApiStatus.Experimental
public interface GPUPipelineDescriptorBase extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "layout"
  )
  GPUPipelineLayout layout();

  @JsProperty
  void setLayout(@Nonnull GPUPipelineLayout layout);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUPipelineDescriptorBase"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUPipelineDescriptorBase {
    @JsOverlay
    @Nonnull
    default Builder layout(@Nonnull final GPUPipelineLayout layout) {
      setLayout( layout );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder label(@Nonnull final String label) {
      setLabel( label );
      return this;
    }
  }
}
