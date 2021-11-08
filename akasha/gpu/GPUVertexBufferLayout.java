package akasha.gpu;

import akasha.lang.JsArray;
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
    name = "GPUVertexBufferLayout"
)
@ApiStatus.Experimental
public interface GPUVertexBufferLayout {
  @JsOverlay
  @Nonnull
  static Step1 arrayStride(final int arrayStride) {
    final Builder $gpuVertexBufferLayout = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuVertexBufferLayout.setArrayStride( arrayStride );
    return Js.uncheckedCast( $gpuVertexBufferLayout );
  }

  @JsProperty(
      name = "arrayStride"
  )
  int arrayStride();

  @JsProperty
  void setArrayStride(int arrayStride);

  @JsProperty(
      name = "attributes"
  )
  @JsNonNull
  JsArray<GPUVertexAttribute> attributes();

  @JsProperty
  void setAttributes(@JsNonNull JsArray<GPUVertexAttribute> attributes);

  @JsOverlay
  default void setAttributes(@Nonnull final GPUVertexAttribute... attributes) {
    setAttributes( Js.<JsArray<GPUVertexAttribute>>uncheckedCast( attributes ) );
  }

  @JsProperty(
      name = "stepMode"
  )
  @GPUVertexStepMode
  String stepMode();

  @JsProperty
  void setStepMode(@GPUVertexStepMode @JsNonNull String stepMode);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUVertexBufferLayout"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder attributes(@Nonnull JsArray<GPUVertexAttribute> attributes) {
      Js.<GPUVertexBufferLayout>uncheckedCast( this ).setAttributes( attributes );
      return Js.uncheckedCast( this );
    }

    @JsOverlay
    @Nonnull
    default Builder attributes(@Nonnull GPUVertexAttribute... attributes) {
      Js.<GPUVertexBufferLayout>uncheckedCast( this ).setAttributes( attributes );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUVertexBufferLayout"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUVertexBufferLayout {
    @JsOverlay
    @Nonnull
    default Builder stepMode(@GPUVertexStepMode @Nonnull final String stepMode) {
      setStepMode( stepMode );
      return this;
    }
  }
}
