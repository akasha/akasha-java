package akasha;

import akasha.core.BufferSource;
import akasha.core.JsObject;
import akasha.gl.TexImageSource;
import akasha.lang.JsArray;
import akasha.promise.Promise;
import akasha.svg.SVGImageElement;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VideoFrame"
)
public class VideoFrame extends JsObject implements TexImageSource {
  public VideoFrame(@Nonnull final CanvasImageSource image, @Nonnull final VideoFrameInit init) {
  }

  public VideoFrame(@Nonnull final HTMLOrSVGImageElement image,
      @Nonnull final VideoFrameInit init) {
  }

  public VideoFrame(@Nonnull final HTMLImageElement image, @Nonnull final VideoFrameInit init) {
  }

  public VideoFrame(@Nonnull final SVGImageElement image, @Nonnull final VideoFrameInit init) {
  }

  public VideoFrame(@Nonnull final HTMLVideoElement image, @Nonnull final VideoFrameInit init) {
  }

  public VideoFrame(@Nonnull final HTMLCanvasElement image, @Nonnull final VideoFrameInit init) {
  }

  public VideoFrame(@Nonnull final ImageBitmap image, @Nonnull final VideoFrameInit init) {
  }

  public VideoFrame(@Nonnull final OffscreenCanvas image, @Nonnull final VideoFrameInit init) {
  }

  public VideoFrame(@Nonnull final CanvasImageSource image) {
  }

  public VideoFrame(@Nonnull final HTMLOrSVGImageElement image) {
  }

  public VideoFrame(@Nonnull final HTMLImageElement image) {
  }

  public VideoFrame(@Nonnull final SVGImageElement image) {
  }

  public VideoFrame(@Nonnull final HTMLVideoElement image) {
  }

  public VideoFrame(@Nonnull final HTMLCanvasElement image) {
  }

  public VideoFrame(@Nonnull final ImageBitmap image) {
  }

  public VideoFrame(@Nonnull final OffscreenCanvas image) {
  }

  public VideoFrame(@Nonnull final JsArray<PlaneInit> planes,
      @Nonnull final VideoFramePlaneInit init) {
  }

  public VideoFrame(@Nonnull final PlaneInit[] planes, @Nonnull final VideoFramePlaneInit init) {
  }

  @JsProperty(
      name = "codedHeight"
  )
  public native int codedHeight();

  @JsProperty(
      name = "codedRect"
  )
  @Nonnull
  public native VideoFrameRect codedRect();

  @JsProperty(
      name = "codedWidth"
  )
  public native int codedWidth();

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
  @Nonnull
  @PixelFormat
  public native String format();

  @JsProperty(
      name = "timestamp"
  )
  @Nullable
  public native Double timestamp();

  @JsProperty(
      name = "visibleRect"
  )
  @Nonnull
  public native VideoFrameRect visibleRect();

  public native int allocationSize(@Nonnull VideoFrameCopyToOptions options);

  public native int allocationSize();

  @JsMethod(
      name = "clone"
  )
  @Nonnull
  public native VideoFrame clone_();

  public native void close();

  @Nonnull
  public native Promise<JsArray<PlaneLayout>> copyTo(@Nonnull BufferSource destination,
      @Nonnull VideoFrameCopyToOptions options);

  @Nonnull
  public native Promise<JsArray<PlaneLayout>> copyTo(@Nonnull BufferSource destination);
}
