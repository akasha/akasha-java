package akasha.gpu;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
  static Builder create(@Nonnull final String entryPoint, @Nonnull final GPUShaderModule module) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).entryPoint( entryPoint ).module( module );
  }

  @JsProperty(
      name = "buffers"
  )
  JsArray<GPUVertexBufferLayout> buffers();

  @JsProperty
  void setBuffers(@Nonnull JsArray<GPUVertexBufferLayout> buffers);

  @JsOverlay
  default void setBuffers(@Nonnull final GPUVertexBufferLayout... buffers) {
    setBuffers( Js.<JsArray<GPUVertexBufferLayout>>uncheckedCast( buffers ) );
  }

  @Generated("org.realityforge.webtack")
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

    @JsOverlay
    @Nonnull
    default Builder entryPoint(@Nonnull final String entryPoint) {
      setEntryPoint( entryPoint );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder module(@Nonnull final GPUShaderModule module) {
      setModule( module );
      return this;
    }
  }
}
