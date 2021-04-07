package akasha.media;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
    name = "Object"
)
public interface MediaTrackCapabilities {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "aspectRatio"
  )
  DoubleRange aspectRatio();

  @JsProperty
  void setAspectRatio(@Nonnull DoubleRange aspectRatio);

  @JsProperty(
      name = "autoGainControl"
  )
  JsArray<Boolean> autoGainControl();

  @JsProperty
  void setAutoGainControl(@Nonnull JsArray<Boolean> autoGainControl);

  @JsOverlay
  default void setAutoGainControl(@Nonnull final Boolean... autoGainControl) {
    setAutoGainControl( Js.<JsArray<Boolean>>uncheckedCast( autoGainControl ) );
  }

  @JsProperty(
      name = "channelCount"
  )
  ULongRange channelCount();

  @JsProperty
  void setChannelCount(@Nonnull ULongRange channelCount);

  @JsProperty(
      name = "deviceId"
  )
  String deviceId();

  @JsProperty
  void setDeviceId(@Nonnull String deviceId);

  @JsProperty(
      name = "echoCancellation"
  )
  JsArray<Boolean> echoCancellation();

  @JsProperty
  void setEchoCancellation(@Nonnull JsArray<Boolean> echoCancellation);

  @JsOverlay
  default void setEchoCancellation(@Nonnull final Boolean... echoCancellation) {
    setEchoCancellation( Js.<JsArray<Boolean>>uncheckedCast( echoCancellation ) );
  }

  @JsProperty(
      name = "facingMode"
  )
  JsArray<String> facingMode();

  @JsProperty
  void setFacingMode(@Nonnull JsArray<String> facingMode);

  @JsOverlay
  default void setFacingMode(@Nonnull final String... facingMode) {
    setFacingMode( Js.<JsArray<String>>uncheckedCast( facingMode ) );
  }

  @JsProperty(
      name = "frameRate"
  )
  DoubleRange frameRate();

  @JsProperty
  void setFrameRate(@Nonnull DoubleRange frameRate);

  @JsProperty(
      name = "groupId"
  )
  String groupId();

  @JsProperty
  void setGroupId(@Nonnull String groupId);

  @JsProperty(
      name = "height"
  )
  ULongRange height();

  @JsProperty
  void setHeight(@Nonnull ULongRange height);

  @JsProperty(
      name = "latency"
  )
  DoubleRange latency();

  @JsProperty
  void setLatency(@Nonnull DoubleRange latency);

  @JsProperty(
      name = "noiseSuppression"
  )
  JsArray<Boolean> noiseSuppression();

  @JsProperty
  void setNoiseSuppression(@Nonnull JsArray<Boolean> noiseSuppression);

  @JsOverlay
  default void setNoiseSuppression(@Nonnull final Boolean... noiseSuppression) {
    setNoiseSuppression( Js.<JsArray<Boolean>>uncheckedCast( noiseSuppression ) );
  }

  @JsProperty(
      name = "resizeMode"
  )
  JsArray<String> resizeMode();

  @JsProperty
  void setResizeMode(@Nonnull JsArray<String> resizeMode);

  @JsOverlay
  default void setResizeMode(@Nonnull final String... resizeMode) {
    setResizeMode( Js.<JsArray<String>>uncheckedCast( resizeMode ) );
  }

  @JsProperty(
      name = "sampleRate"
  )
  ULongRange sampleRate();

  @JsProperty
  void setSampleRate(@Nonnull ULongRange sampleRate);

  @JsProperty(
      name = "sampleSize"
  )
  ULongRange sampleSize();

  @JsProperty
  void setSampleSize(@Nonnull ULongRange sampleSize);

  @JsProperty(
      name = "width"
  )
  ULongRange width();

  @JsProperty
  void setWidth(@Nonnull ULongRange width);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends MediaTrackCapabilities {
    @JsOverlay
    @Nonnull
    default Builder aspectRatio(@Nonnull final DoubleRange aspectRatio) {
      setAspectRatio( aspectRatio );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder autoGainControl(@Nonnull final JsArray<Boolean> autoGainControl) {
      setAutoGainControl( autoGainControl );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder autoGainControl(@Nonnull final Boolean... autoGainControl) {
      setAutoGainControl( autoGainControl );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder channelCount(@Nonnull final ULongRange channelCount) {
      setChannelCount( channelCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder deviceId(@Nonnull final String deviceId) {
      setDeviceId( deviceId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder echoCancellation(@Nonnull final JsArray<Boolean> echoCancellation) {
      setEchoCancellation( echoCancellation );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder echoCancellation(@Nonnull final Boolean... echoCancellation) {
      setEchoCancellation( echoCancellation );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder facingMode(@Nonnull final JsArray<String> facingMode) {
      setFacingMode( facingMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder facingMode(@Nonnull final String... facingMode) {
      setFacingMode( facingMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder frameRate(@Nonnull final DoubleRange frameRate) {
      setFrameRate( frameRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder groupId(@Nonnull final String groupId) {
      setGroupId( groupId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder height(@Nonnull final ULongRange height) {
      setHeight( height );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder latency(@Nonnull final DoubleRange latency) {
      setLatency( latency );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder noiseSuppression(@Nonnull final JsArray<Boolean> noiseSuppression) {
      setNoiseSuppression( noiseSuppression );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder noiseSuppression(@Nonnull final Boolean... noiseSuppression) {
      setNoiseSuppression( noiseSuppression );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder resizeMode(@Nonnull final JsArray<String> resizeMode) {
      setResizeMode( resizeMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder resizeMode(@Nonnull final String... resizeMode) {
      setResizeMode( resizeMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampleRate(@Nonnull final ULongRange sampleRate) {
      setSampleRate( sampleRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampleSize(@Nonnull final ULongRange sampleSize) {
      setSampleSize( sampleSize );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder width(@Nonnull final ULongRange width) {
      setWidth( width );
      return this;
    }
  }
}
