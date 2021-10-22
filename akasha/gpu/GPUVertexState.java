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
    name = "GPUVertexState"
)
@ApiStatus.Experimental
public interface GPUVertexState extends GPUProgrammableStage {
  @JsOverlay
  @Nonnull
  static Step1 module(@Nonnull final GPUShaderModule module) {
    final Builder $gpuVertexState = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuVertexState.setModule( module );
    return Js.uncheckedCast( $gpuVertexState );
  }

  @JsProperty(
      name = "buffers"
  )
  JsArray<GPUVertexBufferLayout> buffers();

  @JsProperty
  void setBuffers(@JsNonNull JsArray<GPUVertexBufferLayout> buffers);

  @JsOverlay
  default void setBuffers(@Nonnull final GPUVertexBufferLayout... buffers) {
    setBuffers( Js.<JsArray<GPUVertexBufferLayout>>uncheckedCast( buffers ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUVertexState"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder entryPoint(@Nonnull String entryPoint) {
      Js.<GPUVertexState>uncheckedCast( this ).setEntryPoint( entryPoint );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUVertexState"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUVertexState {
    @JsOverlay
    @Nonnull
    default Builder buffers(@Nonnull final JsArray<GPUVertexBufferLayout> buffers) {
      setBuffers( buffers );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder buffers(@Nonnull final GPUVertexBufferLayout... buffers) {
      setBuffers( buffers );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder constants(@Nonnull final JsPropertyMap<Double> constants) {
      setConstants( constants );
      return this;
    }
  }
}
