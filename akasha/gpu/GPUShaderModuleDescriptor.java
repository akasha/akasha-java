package akasha.gpu;

import akasha.core.JsObject;
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
    name = "GPUShaderModuleDescriptor"
)
@ApiStatus.Experimental
public interface GPUShaderModuleDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder code(@WGSL @Nonnull final String code) {
    final Builder $gpuShaderModuleDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuShaderModuleDescriptor.setCode( code );
    return Js.uncheckedCast( $gpuShaderModuleDescriptor );
  }

  @JsProperty(
      name = "code"
  )
  @WGSL
  @JsNonNull
  String code();

  @JsProperty
  void setCode(@WGSL @JsNonNull String code);

  @JsProperty(
      name = "hints"
  )
  JsPropertyMap<GPUShaderModuleCompilationHint> hints();

  @JsProperty
  void setHints(@JsNonNull JsPropertyMap<GPUShaderModuleCompilationHint> hints);

  @JsProperty(
      name = "sourceMap"
  )
  JsObject sourceMap();

  @JsProperty
  void setSourceMap(@JsNonNull JsObject sourceMap);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUShaderModuleDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUShaderModuleDescriptor {
    @JsOverlay
    @Nonnull
    default Builder hints(@Nonnull final JsPropertyMap<GPUShaderModuleCompilationHint> hints) {
      setHints( hints );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sourceMap(@Nonnull final JsObject sourceMap) {
      setSourceMap( sourceMap );
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
