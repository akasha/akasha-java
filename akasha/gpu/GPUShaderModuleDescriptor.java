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
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).code( code );
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
      name = "sourceMap"
  )
  JsObject sourceMap();

  @JsProperty
  void setSourceMap(@JsNonNull JsObject sourceMap);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUShaderModuleDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUShaderModuleDescriptor {
    @JsOverlay
    @Nonnull
    default Builder code(@WGSL @Nonnull final String code) {
      setCode( code );
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
