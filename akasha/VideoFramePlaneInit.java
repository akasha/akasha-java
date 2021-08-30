package akasha;

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
    name = "VideoFramePlaneInit"
)
public interface VideoFramePlaneInit {
  @JsOverlay
  @Nonnull
  static Builder create(final int codedHeight, final int codedWidth,
      @PixelFormat @Nonnull final String format) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).codedHeight( codedHeight ).codedWidth( codedWidth ).format( format );
  }

  @JsProperty(
      name = "codedHeight"
  )
  int codedHeight();

  @JsProperty
  void setCodedHeight(int codedHeight);

  @JsProperty(
      name = "codedWidth"
  )
  int codedWidth();

  @JsProperty
  void setCodedWidth(int codedWidth);

  @JsProperty(
      name = "displayHeight"
  )
  int displayHeight();

  @JsProperty
  void setDisplayHeight(int displayHeight);

  @JsProperty(
      name = "displayWidth"
  )
  int displayWidth();

  @JsProperty
  void setDisplayWidth(int displayWidth);

  @JsProperty(
      name = "duration"
  )
  int duration();

  @JsProperty
  void setDuration(int duration);

  @JsProperty(
      name = "format"
  )
  @PixelFormat
  @JsNonNull
  String format();

  @JsProperty
  void setFormat(@PixelFormat @JsNonNull String format);

  @JsProperty(
      name = "timestamp"
  )
  int timestamp();

  @JsProperty
  void setTimestamp(int timestamp);

  @JsProperty(
      name = "visibleRect"
  )
  VideoFrameRect visibleRect();

  @JsProperty
  void setVisibleRect(@JsNonNull VideoFrameRect visibleRect);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoFramePlaneInit"
  )
  interface Builder extends VideoFramePlaneInit {
    @JsOverlay
    @Nonnull
    default Builder codedHeight(final int codedHeight) {
      setCodedHeight( codedHeight );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder codedWidth(final int codedWidth) {
      setCodedWidth( codedWidth );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder displayHeight(final int displayHeight) {
      setDisplayHeight( displayHeight );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder displayWidth(final int displayWidth) {
      setDisplayWidth( displayWidth );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder duration(final int duration) {
      setDuration( duration );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder format(@PixelFormat @Nonnull final String format) {
      setFormat( format );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder timestamp(final int timestamp) {
      setTimestamp( timestamp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder visibleRect(@Nonnull final VideoFrameRect visibleRect) {
      setVisibleRect( visibleRect );
      return this;
    }
  }
}
