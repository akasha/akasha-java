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
  static Step1 format(@GPUVertexFormat @Nonnull final String format) {
    final GPUVertexAttribute $gpuVertexAttribute = Js.<GPUVertexAttribute>uncheckedCast( JsPropertyMap.of() );
    $gpuVertexAttribute.setFormat( format );
    return Js.uncheckedCast( $gpuVertexAttribute );
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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUVertexAttribute"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 offset(int offset) {
      Js.<GPUVertexAttribute>uncheckedCast( this ).setOffset( offset );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUVertexAttribute"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default GPUVertexAttribute shaderLocation(int shaderLocation) {
      Js.<GPUVertexAttribute>uncheckedCast( this ).setShaderLocation( shaderLocation );
      return Js.uncheckedCast( this );
    }
  }
}
