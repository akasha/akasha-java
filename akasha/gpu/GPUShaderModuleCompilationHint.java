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
    name = "GPUShaderModuleCompilationHint"
)
@ApiStatus.Experimental
public interface GPUShaderModuleCompilationHint {
  @JsOverlay
  @Nonnull
  static GPUShaderModuleCompilationHint layout(@Nonnull final GPUPipelineLayout layout) {
    final GPUShaderModuleCompilationHint $gpuShaderModuleCompilationHint = Js.<GPUShaderModuleCompilationHint>uncheckedCast( JsPropertyMap.of() );
    $gpuShaderModuleCompilationHint.setLayout( layout );
    return Js.uncheckedCast( $gpuShaderModuleCompilationHint );
  }

  @JsProperty(
      name = "layout"
  )
  @JsNonNull
  GPUPipelineLayout layout();

  @JsProperty
  void setLayout(@JsNonNull GPUPipelineLayout layout);
}
