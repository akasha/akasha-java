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
    name = "GPUBufferBinding"
)
@ApiStatus.Experimental
public interface GPUBufferBinding extends GPUBindingResource {
  @JsOverlay
  @Nonnull
  static Builder buffer(@Nonnull final GPUBuffer buffer) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).buffer( buffer );
  }

  @JsProperty(
      name = "buffer"
  )
  @JsNonNull
  GPUBuffer buffer();

  @JsProperty
  void setBuffer(@JsNonNull GPUBuffer buffer);

  @JsProperty(
      name = "offset"
  )
  int offset();

  @JsProperty
  void setOffset(int offset);

  @JsProperty(
      name = "size"
  )
  int size();

  @JsProperty
  void setSize(int size);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBufferBinding"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUBufferBinding {
    @JsOverlay
    @Nonnull
    default Builder buffer(@Nonnull final GPUBuffer buffer) {
      setBuffer( buffer );
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
    default Builder size(final int size) {
      setSize( size );
      return this;
    }
  }
}
