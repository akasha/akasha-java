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
    name = "GPUObjectDescriptorBase"
)
@ApiStatus.Experimental
public interface GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "label"
  )
  String label();

  @JsProperty
  void setLabel(@JsNonNull String label);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUObjectDescriptorBase"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUObjectDescriptorBase {
    @JsOverlay
    @Nonnull
    default Builder label(@Nonnull final String label) {
      setLabel( label );
      return this;
    }
  }
}
