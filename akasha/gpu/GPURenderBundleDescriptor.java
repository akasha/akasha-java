package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPURenderBundleDescriptor"
)
@ApiStatus.Experimental
public interface GPURenderBundleDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderBundleDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPURenderBundleDescriptor {
    @JsOverlay
    @Nonnull
    default Builder label(@Nonnull final String label) {
      setLabel( label );
      return this;
    }
  }
}
