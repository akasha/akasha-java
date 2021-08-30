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
    name = "GPUVertexAttribute"
)
@ApiStatus.Experimental
public interface GPUVertexAttribute {
  @JsOverlay
  @Nonnull
  static Builder create(@GPUVertexFormat @Nonnull final String format, final int offset,
      final int shaderLocation) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).format( format ).offset( offset ).shaderLocation( shaderLocation );
  }

  @JsProperty(
      name = "format"
  )
  @GPUVertexFormat
  @JsNonNull
  String format();

  @JsProperty
  void setFormat(@GPUVertexFormat @JsNonNull String format);

  @JsProperty(
      name = "offset"
  )
  int offset();

  @JsProperty
  void setOffset(int offset);

  @JsProperty(
      name = "shaderLocation"
  )
  int shaderLocation();

  @JsProperty
  void setShaderLocation(int shaderLocation);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUVertexAttribute"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUVertexAttribute {
    @JsOverlay
    @Nonnull
    default Builder format(@GPUVertexFormat @Nonnull final String format) {
      setFormat( format );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder offset(final int offset) {
      setOffset( offset );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder shaderLocation(final int shaderLocation) {
      setShaderLocation( shaderLocation );
      return this;
    }
  }
}
