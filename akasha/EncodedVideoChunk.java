package akasha;

import akasha.core.BufferSource;
import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "EncodedVideoChunk"
)
public class EncodedVideoChunk extends JsObject {
  public EncodedVideoChunk(@Nonnull final EncodedVideoChunkInit init) {
  }

  @JsProperty(
      name = "byteLength"
  )
  public native int byteLength();

  @JsProperty(
      name = "duration"
  )
  @Nullable
  public native Double duration();

  @JsProperty(
      name = "timestamp"
  )
  public native int timestamp();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  @EncodedVideoChunkType
  public native String type();

  public native void copyTo(@Nonnull BufferSource destination);
}
