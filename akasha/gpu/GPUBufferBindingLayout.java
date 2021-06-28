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
    name = "GPUBufferBindingLayout"
)
@ApiStatus.Experimental
public interface GPUBufferBindingLayout {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "hasDynamicOffset"
  )
  boolean hasDynamicOffset();

  @JsProperty
  void setHasDynamicOffset(boolean hasDynamicOffset);

  @JsProperty(
      name = "minBindingSize"
  )
  int minBindingSize();

  @JsProperty
  void setMinBindingSize(int minBindingSize);

  @JsProperty(
      name = "type"
  )
  @GPUBufferBindingType
  String type();

  @JsProperty
  void setType(@GPUBufferBindingType @Nonnull String type);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBufferBindingLayout"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUBufferBindingLayout {
    @JsOverlay
    @Nonnull
    default Builder hasDynamicOffset(final boolean hasDynamicOffset) {
      setHasDynamicOffset( hasDynamicOffset );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder minBindingSize(final int minBindingSize) {
      setMinBindingSize( minBindingSize );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder type(@GPUBufferBindingType @Nonnull final String type) {
      setType( type );
      return this;
    }
  }
}
