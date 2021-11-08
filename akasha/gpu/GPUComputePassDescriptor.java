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
    name = "GPUComputePassDescriptor"
)
@ApiStatus.Experimental
public interface GPUComputePassDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "timestampWrites"
  )
  JsArray<GPUComputePassTimestampWrite> timestampWrites();

  @JsProperty
  void setTimestampWrites(@JsNonNull JsArray<GPUComputePassTimestampWrite> timestampWrites);

  @JsOverlay
  default void setTimestampWrites(@Nonnull final GPUComputePassTimestampWrite... timestampWrites) {
    setTimestampWrites( Js.<JsArray<GPUComputePassTimestampWrite>>uncheckedCast( timestampWrites ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUComputePassDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUComputePassDescriptor {
    @JsOverlay
    @Nonnull
    default Builder timestampWrites(
        @Nonnull final JsArray<GPUComputePassTimestampWrite> timestampWrites) {
      setTimestampWrites( timestampWrites );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder timestampWrites(
        @Nonnull final GPUComputePassTimestampWrite... timestampWrites) {
      setTimestampWrites( timestampWrites );
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
