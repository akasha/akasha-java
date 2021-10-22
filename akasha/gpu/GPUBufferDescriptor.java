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
    name = "GPUBufferDescriptor"
)
@ApiStatus.Experimental
public interface GPUBufferDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Step1 size(final int size) {
    final Builder $gpuBufferDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $gpuBufferDescriptor.setSize( size );
    return Js.uncheckedCast( $gpuBufferDescriptor );
  }

  @JsProperty(
      name = "size"
  )
  int size();

  @JsProperty
  void setSize(int size);

  @JsProperty(
      name = "usage"
  )
  @GPUBufferUsageFlags
  @JsNonNull
  int usage();

  @JsProperty
  void setUsage(@GPUBufferUsageFlags @JsNonNull int usage);

  @JsProperty(
      name = "mappedAtCreation"
  )
  boolean mappedAtCreation();

  @JsProperty
  void setMappedAtCreation(boolean mappedAtCreation);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBufferDescriptor"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder usage(@GPUBufferUsageFlags int usage) {
      Js.<GPUBufferDescriptor>uncheckedCast( this ).setUsage( usage );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBufferDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUBufferDescriptor {
    @JsOverlay
    @Nonnull
    default Builder mappedAtCreation(final boolean mappedAtCreation) {
      setMappedAtCreation( mappedAtCreation );
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
