package akasha.codecs;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VideoColorSpaceInit"
)
public interface VideoColorSpaceInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "fullRange"
  )
  boolean fullRange();

  @JsProperty
  void setFullRange(boolean fullRange);

  @JsProperty(
      name = "matrix"
  )
  @VideoMatrixCoefficients
  String matrix();

  @JsProperty
  void setMatrix(@VideoMatrixCoefficients @JsNonNull String matrix);

  @JsProperty(
      name = "primaries"
  )
  @VideoColorPrimaries
  String primaries();

  @JsProperty
  void setPrimaries(@VideoColorPrimaries @JsNonNull String primaries);

  @JsProperty(
      name = "transfer"
  )
  @VideoTransferCharacteristics
  String transfer();

  @JsProperty
  void setTransfer(@VideoTransferCharacteristics @JsNonNull String transfer);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoColorSpaceInit"
  )
  interface Builder extends VideoColorSpaceInit {
    @JsOverlay
    @Nonnull
    default Builder fullRange(final boolean fullRange) {
      setFullRange( fullRange );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder matrix(@VideoMatrixCoefficients @Nonnull final String matrix) {
      setMatrix( matrix );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder primaries(@VideoColorPrimaries @Nonnull final String primaries) {
      setPrimaries( primaries );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder transfer(@VideoTransferCharacteristics @Nonnull final String transfer) {
      setTransfer( transfer );
      return this;
    }
  }
}
