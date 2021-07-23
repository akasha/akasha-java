package akasha.gpu;

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
    name = "GPUBufferDescriptor"
)
@ApiStatus.Experimental
public interface GPUBufferDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create(final int size, final int usage) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).size( size ).usage( usage );
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
  int usage();

  @JsProperty
  void setUsage(int usage);

  @JsProperty(
      name = "mappedAtCreation"
  )
  boolean mappedAtCreation();

  @JsProperty
  void setMappedAtCreation(boolean mappedAtCreation);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBufferDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUBufferDescriptor {
    @JsOverlay
    @Nonnull
    default Builder size(final int size) {
      setSize( size );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder usage(final int usage) {
      setUsage( usage );
      return this;
    }

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