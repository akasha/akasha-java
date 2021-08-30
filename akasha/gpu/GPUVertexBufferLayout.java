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
  static Builder create(final int arrayStride,
      @Nonnull final JsArray<GPUVertexAttribute> attributes) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).arrayStride( arrayStride ).attributes( attributes );
  }

  @JsOverlay
  @Nonnull
  static Builder create(final int arrayStride, @Nonnull final GPUVertexAttribute[] attributes) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).arrayStride( arrayStride ).attributes( attributes );
  }

  @JsProperty(
      name = "arrayStride"
  )
  int arrayStride();

  @JsProperty
  void setArrayStride(int arrayStride);

  @JsProperty(
      name = "stepMode"
  )
  @GPUVertexStepMode
  String stepMode();

  @JsProperty
  void setStepMode(@GPUVertexStepMode @JsNonNull String stepMode);

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

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUVertexBufferLayout"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUVertexBufferLayout {
    @JsOverlay
    @Nonnull
    default Builder arrayStride(final int arrayStride) {
      setArrayStride( arrayStride );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stepMode(@GPUVertexStepMode @Nonnull final String stepMode) {
      setStepMode( stepMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder attributes(@Nonnull final JsArray<GPUVertexAttribute> attributes) {
      setAttributes( attributes );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder attributes(@Nonnull final GPUVertexAttribute... attributes) {
      setAttributes( attributes );
      return this;
    }
  }
}
