package akasha.codecs;

import akasha.DOMRectInit;
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
    name = "VideoFrameInit"
)
public interface VideoFrameInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "alpha"
  )
  @AlphaOption
  String alpha();

  @JsProperty
  void setAlpha(@AlphaOption @JsNonNull String alpha);

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
      name = "timestamp"
  )
  int timestamp();

  @JsProperty
  void setTimestamp(int timestamp);

  @JsProperty(
      name = "visibleRect"
  )
  DOMRectInit visibleRect();

  @JsProperty
  void setVisibleRect(@JsNonNull DOMRectInit visibleRect);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoFrameInit"
  )
  interface Builder extends VideoFrameInit {
    @JsOverlay
    @Nonnull
    default Builder alpha(@AlphaOption @Nonnull final String alpha) {
      setAlpha( alpha );
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
    default Builder timestamp(final int timestamp) {
      setTimestamp( timestamp );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder visibleRect(@Nonnull final DOMRectInit visibleRect) {
      setVisibleRect( visibleRect );
      return this;
    }
  }
}
