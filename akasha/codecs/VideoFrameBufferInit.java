package akasha.codecs;

import akasha.DOMRectInit;
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

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "VideoFrameBufferInit"
)
public interface VideoFrameBufferInit {
  @JsOverlay
  @Nonnull
  static Step1 format(@VideoPixelFormat @Nonnull final String format) {
    final Builder $videoFrameBufferInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $videoFrameBufferInit.setFormat( format );
    return Js.uncheckedCast( $videoFrameBufferInit );
  }

  @JsProperty(
      name = "format"
  )
  @VideoPixelFormat
  @JsNonNull
  String format();

  @JsProperty
  void setFormat(@VideoPixelFormat @JsNonNull String format);

  @JsProperty(
      name = "codedWidth"
  )
  int codedWidth();

  @JsProperty
  void setCodedWidth(int codedWidth);

  @JsProperty(
      name = "codedHeight"
  )
  int codedHeight();

  @JsProperty
  void setCodedHeight(int codedHeight);

  @JsProperty(
      name = "timestamp"
  )
  int timestamp();

  @JsProperty
  void setTimestamp(int timestamp);

  @JsProperty(
      name = "colorSpace"
  )
  VideoColorSpaceInit colorSpace();

  @JsProperty
  void setColorSpace(@JsNonNull VideoColorSpaceInit colorSpace);

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
      name = "layout"
  )
  JsArray<PlaneLayout> layout();

  @JsProperty
  void setLayout(@JsNonNull JsArray<PlaneLayout> layout);

  @JsOverlay
  default void setLayout(@Nonnull final PlaneLayout... layout) {
    setLayout( Js.<JsArray<PlaneLayout>>uncheckedCast( layout ) );
  }

  @JsProperty(
      name = "visibleRect"
  )
  DOMRectInit visibleRect();

  @JsProperty
  void setVisibleRect(@JsNonNull DOMRectInit visibleRect);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoFrameBufferInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 codedWidth(int codedWidth) {
      Js.<VideoFrameBufferInit>uncheckedCast( this ).setCodedWidth( codedWidth );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoFrameBufferInit"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 codedHeight(int codedHeight) {
      Js.<VideoFrameBufferInit>uncheckedCast( this ).setCodedHeight( codedHeight );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoFrameBufferInit"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Builder timestamp(int timestamp) {
      Js.<VideoFrameBufferInit>uncheckedCast( this ).setTimestamp( timestamp );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoFrameBufferInit"
  )
  interface Builder extends VideoFrameBufferInit {
    @JsOverlay
    @Nonnull
    default Builder colorSpace(@Nonnull final VideoColorSpaceInit colorSpace) {
      setColorSpace( colorSpace );
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
    default Builder layout(@Nonnull final JsArray<PlaneLayout> layout) {
      setLayout( layout );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder layout(@Nonnull final PlaneLayout... layout) {
      setLayout( layout );
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
