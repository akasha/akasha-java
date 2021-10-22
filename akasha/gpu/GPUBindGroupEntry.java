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
  static Step1 binding(final int binding) {
    final GPUBindGroupEntry $gpuBindGroupEntry = Js.<GPUBindGroupEntry>uncheckedCast( JsPropertyMap.of() );
    $gpuBindGroupEntry.setBinding( binding );
    return Js.uncheckedCast( $gpuBindGroupEntry );
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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBindGroupEntry"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default GPUBindGroupEntry resource(@Nonnull GPUBindingResource resource) {
      Js.<GPUBindGroupEntry>uncheckedCast( this ).setResource( resource );
      return Js.uncheckedCast( this );
    }
  }
}
