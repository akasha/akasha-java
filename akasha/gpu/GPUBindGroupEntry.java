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
    name = "GPUBindGroupEntry"
)
@ApiStatus.Experimental
public interface GPUBindGroupEntry {
  @JsOverlay
  @Nonnull
  static Builder create(final int binding, @Nonnull final GPUBindingResource resource) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).binding( binding ).resource( resource );
  }

  @JsProperty(
      name = "binding"
  )
  int binding();

  @JsProperty
  void setBinding(int binding);

  @JsProperty(
      name = "resource"
  )
  @JsNonNull
  GPUBindingResource resource();

  @JsProperty
  void setResource(@JsNonNull GPUBindingResource resource);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBindGroupEntry"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUBindGroupEntry {
    @JsOverlay
    @Nonnull
    default Builder binding(final int binding) {
      setBinding( binding );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder resource(@Nonnull final GPUBindingResource resource) {
      setResource( resource );
      return this;
    }
  }
}
