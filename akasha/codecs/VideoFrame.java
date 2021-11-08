package akasha.codecs;

import akasha.CanvasImageSource;
import akasha.DOMRectReadOnly;
import akasha.Transferable;
import akasha.core.BufferSource;
import akasha.core.JsObject;
import akasha.gl.TexImageSource;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The VideoFrame interface of the Web Codecs API represents a frame of a video.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/VideoFrame">VideoFrame - MDN</a>
 * @see <a href="https://w3c.github.io/webcodecs/#videoframe-interface"># videoframe-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VideoFrame"
)
public class VideoFrame extends JsObject implements TexImageSource, CanvasImageSource, Transferable {
  public VideoFrame(@Nonnull final CanvasImageSource image, @Nonnull final VideoFrameInit init) {
  }

  public VideoFrame(@Nonnull final CanvasImageSource image) {
  }

  public VideoFrame(@Nonnull final BufferSource data, @Nonnull final VideoFrameBufferInit init) {
  }

  @JsProperty(
      name = "codedHeight"
  )
  public native int codedHeight();

  @JsProperty(
      name = "codedRect"
  )
  @Nullable
  public native DOMRectReadOnly codedRect();

  @JsProperty(
      name = "codedWidth"
  )
  public native int codedWidth();

  @JsProperty(
      name = "colorSpace"
  )
  @Nonnull
  public native VideoColorSpace colorSpace();

  @JsProperty(
      name = "displayHeight"
  )
  public native int displayHeight();

  @JsProperty(
      name = "displayWidth"
  )
  public native int displayWidth();

  @JsProperty(
      name = "duration"
  )
  @Nullable
  public native Double duration();

  @JsProperty(
      name = "format"
  )
  @Nullable
  @VideoPixelFormat
  public native String format();

  @JsProperty(
      name = "timestamp"
  )
  @Nullable
  public native Double timestamp();

  @JsProperty(
      name = "visibleRect"
  )
  @Nullable
  public native DOMRectReadOnly visibleRect();

  public native int allocationSize(@Nonnull VideoFrameCopyToOptions options);

  public native int allocationSize();

  @JsMethod(
      name = "clone"
  )
  @JsNonNull
  public native VideoFrame clone_();

  public native void close();

  @JsNonNull
  public native Promise<JsArray<PlaneLayout>> copyTo(@Nonnull BufferSource destination,
      @Nonnull VideoFrameCopyToOptions options);

  @JsNonNull
  public native Promise<JsArray<PlaneLayout>> copyTo(@Nonnull BufferSource destination);
}
