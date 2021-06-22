package akasha.gpu;

import akasha.core.JsObject;
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
    name = "GPUShaderModuleDescriptor"
)
public interface GPUShaderModuleDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String code) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).code( code );
  }

  @JsProperty(
      name = "code"
  )
  @Nonnull
  String code();

  @JsProperty
  void setCode(@Nonnull String code);

  @JsProperty(
      name = "sourceMap"
  )
  JsObject sourceMap();

  @JsProperty
  void setSourceMap(@Nonnull JsObject sourceMap);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUShaderModuleDescriptor"
  )
  interface Builder extends GPUShaderModuleDescriptor {
    @JsOverlay
    @Nonnull
    default Builder code(@Nonnull final String code) {
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
