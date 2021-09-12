package akasha.codecs;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VideoColorSpace"
)
public class VideoColorSpace extends JsObject {
  public VideoColorSpace(@Nonnull final VideoColorSpaceInit init) {
  }

  public VideoColorSpace() {
  }

  @JsProperty(
      name = "fullRange"
  )
  @Nullable
  public native Boolean fullRange();

  @JsProperty(
      name = "matrix"
  )
  @Nullable
  @VideoMatrixCoefficients
  public native String matrix();

  @JsProperty(
      name = "primaries"
  )
  @Nullable
  @VideoColorPrimaries
  public native String primaries();

  @JsProperty(
      name = "transfer"
  )
  @Nullable
  @VideoTransferCharacteristics
  public native String transfer();

  @JsNonNull
  public native VideoColorSpaceInit toJSON();
}
