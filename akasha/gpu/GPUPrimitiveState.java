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
    name = "GPUPrimitiveState"
)
@ApiStatus.Experimental
public interface GPUPrimitiveState {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "cullMode"
  )
  @GPUCullMode
  String cullMode();

  @JsProperty
  void setCullMode(@GPUCullMode @JsNonNull String cullMode);

  @JsProperty(
      name = "frontFace"
  )
  @GPUFrontFace
  String frontFace();

  @JsProperty
  void setFrontFace(@GPUFrontFace @JsNonNull String frontFace);

  @JsProperty(
      name = "stripIndexFormat"
  )
  @GPUIndexFormat
  String stripIndexFormat();

  @JsProperty
  void setStripIndexFormat(@GPUIndexFormat @JsNonNull String stripIndexFormat);

  @JsProperty(
      name = "topology"
  )
  @GPUPrimitiveTopology
  String topology();

  @JsProperty
  void setTopology(@GPUPrimitiveTopology @JsNonNull String topology);

  @JsProperty(
      name = "unclippedDepth"
  )
  boolean unclippedDepth();

  @JsProperty
  void setUnclippedDepth(boolean unclippedDepth);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUPrimitiveState"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUPrimitiveState {
    @JsOverlay
    @Nonnull
    default Builder cullMode(@GPUCullMode @Nonnull final String cullMode) {
      setCullMode( cullMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder frontFace(@GPUFrontFace @Nonnull final String frontFace) {
      setFrontFace( frontFace );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stripIndexFormat(@GPUIndexFormat @Nonnull final String stripIndexFormat) {
      setStripIndexFormat( stripIndexFormat );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder topology(@GPUPrimitiveTopology @Nonnull final String topology) {
      setTopology( topology );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder unclippedDepth(final boolean unclippedDepth) {
      setUnclippedDepth( unclippedDepth );
      return this;
    }
  }
}
