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
public interface MediaTrackConstraintSet {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "aspectRatio"
  )
  ConstrainDouble aspectRatio();

  @JsProperty
  void setAspectRatio(@Nonnull ConstrainDouble aspectRatio);

  @JsOverlay
  default void setAspectRatio(final double aspectRatio) {
    setAspectRatio( ConstrainDouble.of( aspectRatio ) );
  }

  @JsOverlay
  default void setAspectRatio(@Nonnull final ConstrainDoubleRange aspectRatio) {
    setAspectRatio( ConstrainDouble.of( aspectRatio ) );
  }

  @JsProperty(
      name = "autoGainControl"
  )
  ConstrainBoolean autoGainControl();

  @JsProperty
  void setAutoGainControl(@Nonnull ConstrainBoolean autoGainControl);

  @JsOverlay
  default void setAutoGainControl(final boolean autoGainControl) {
    setAutoGainControl( ConstrainBoolean.of( autoGainControl ) );
  }

  @JsOverlay
  default void setAutoGainControl(@Nonnull final ConstrainBooleanParameters autoGainControl) {
    setAutoGainControl( ConstrainBoolean.of( autoGainControl ) );
  }

  @JsProperty(
      name = "channelCount"
  )
  ConstrainULong channelCount();

  @JsProperty
  void setChannelCount(@Nonnull ConstrainULong channelCount);

  @JsOverlay
  default void setChannelCount(final int channelCount) {
    setChannelCount( ConstrainULong.of( channelCount ) );
  }

  @JsOverlay
  default void setChannelCount(@Nonnull final ConstrainULongRange channelCount) {
    setChannelCount( ConstrainULong.of( channelCount ) );
  }

  @JsProperty(
      name = "deviceId"
  )
  ConstrainDOMString deviceId();

  @JsProperty
  void setDeviceId(@Nonnull ConstrainDOMString deviceId);

  @JsOverlay
  default void setDeviceId(@Nonnull final String deviceId) {
    setDeviceId( ConstrainDOMString.of( deviceId ) );
  }

  @JsOverlay
  default void setDeviceId(@Nonnull final JsArray<String> deviceId) {
    setDeviceId( ConstrainDOMString.of( deviceId ) );
  }

  @JsOverlay
  default void setDeviceId(@Nonnull final String... deviceId) {
    setDeviceId( ConstrainDOMString.of( deviceId ) );
  }

  @JsOverlay
  default void setDeviceId(@Nonnull final ConstrainDOMStringParameters deviceId) {
    setDeviceId( ConstrainDOMString.of( deviceId ) );
  }

  @JsProperty(
      name = "echoCancellation"
  )
  ConstrainBoolean echoCancellation();

  @JsProperty
  void setEchoCancellation(@Nonnull ConstrainBoolean echoCancellation);

  @JsOverlay
  default void setEchoCancellation(final boolean echoCancellation) {
    setEchoCancellation( ConstrainBoolean.of( echoCancellation ) );
  }

  @JsOverlay
  default void setEchoCancellation(@Nonnull final ConstrainBooleanParameters echoCancellation) {
    setEchoCancellation( ConstrainBoolean.of( echoCancellation ) );
  }

  @JsProperty(
      name = "facingMode"
  )
  ConstrainDOMString facingMode();

  @JsProperty
  void setFacingMode(@Nonnull ConstrainDOMString facingMode);

  @JsOverlay
  default void setFacingMode(@Nonnull final String facingMode) {
    setFacingMode( ConstrainDOMString.of( facingMode ) );
  }

  @JsOverlay
  default void setFacingMode(@Nonnull final JsArray<String> facingMode) {
    setFacingMode( ConstrainDOMString.of( facingMode ) );
  }

  @JsOverlay
  default void setFacingMode(@Nonnull final String... facingMode) {
    setFacingMode( ConstrainDOMString.of( facingMode ) );
  }

  @JsOverlay
  default void setFacingMode(@Nonnull final ConstrainDOMStringParameters facingMode) {
    setFacingMode( ConstrainDOMString.of( facingMode ) );
  }

  @JsProperty(
      name = "frameRate"
  )
  ConstrainDouble frameRate();

  @JsProperty
  void setFrameRate(@Nonnull ConstrainDouble frameRate);

  @JsOverlay
  default void setFrameRate(final double frameRate) {
    setFrameRate( ConstrainDouble.of( frameRate ) );
  }

  @JsOverlay
  default void setFrameRate(@Nonnull final ConstrainDoubleRange frameRate) {
    setFrameRate( ConstrainDouble.of( frameRate ) );
  }

  @JsProperty(
      name = "groupId"
  )
  ConstrainDOMString groupId();

  @JsProperty
  void setGroupId(@Nonnull ConstrainDOMString groupId);

  @JsOverlay
  default void setGroupId(@Nonnull final String groupId) {
    setGroupId( ConstrainDOMString.of( groupId ) );
  }

  @JsOverlay
  default void setGroupId(@Nonnull final JsArray<String> groupId) {
    setGroupId( ConstrainDOMString.of( groupId ) );
  }

  @JsOverlay
  default void setGroupId(@Nonnull final String... groupId) {
    setGroupId( ConstrainDOMString.of( groupId ) );
  }

  @JsOverlay
  default void setGroupId(@Nonnull final ConstrainDOMStringParameters groupId) {
    setGroupId( ConstrainDOMString.of( groupId ) );
  }

  @JsProperty(
      name = "height"
  )
  ConstrainULong height();

  @JsProperty
  void setHeight(@Nonnull ConstrainULong height);

  @JsOverlay
  default void setHeight(final int height) {
    setHeight( ConstrainULong.of( height ) );
  }

  @JsOverlay
  default void setHeight(@Nonnull final ConstrainULongRange height) {
    setHeight( ConstrainULong.of( height ) );
  }

  @JsProperty(
      name = "latency"
  )
  ConstrainDouble latency();

  @JsProperty
  void setLatency(@Nonnull ConstrainDouble latency);

  @JsOverlay
  default void setLatency(final double latency) {
    setLatency( ConstrainDouble.of( latency ) );
  }

  @JsOverlay
  default void setLatency(@Nonnull final ConstrainDoubleRange latency) {
    setLatency( ConstrainDouble.of( latency ) );
  }

  @JsProperty(
      name = "noiseSuppression"
  )
  ConstrainBoolean noiseSuppression();

  @JsProperty
  void setNoiseSuppression(@Nonnull ConstrainBoolean noiseSuppression);

  @JsOverlay
  default void setNoiseSuppression(final boolean noiseSuppression) {
    setNoiseSuppression( ConstrainBoolean.of( noiseSuppression ) );
  }

  @JsOverlay
  default void setNoiseSuppression(@Nonnull final ConstrainBooleanParameters noiseSuppression) {
    setNoiseSuppression( ConstrainBoolean.of( noiseSuppression ) );
  }

  @JsProperty(
      name = "resizeMode"
  )
  ConstrainDOMString resizeMode();

  @JsProperty
  void setResizeMode(@Nonnull ConstrainDOMString resizeMode);

  @JsOverlay
  default void setResizeMode(@Nonnull final String resizeMode) {
    setResizeMode( ConstrainDOMString.of( resizeMode ) );
  }

  @JsOverlay
  default void setResizeMode(@Nonnull final JsArray<String> resizeMode) {
    setResizeMode( ConstrainDOMString.of( resizeMode ) );
  }

  @JsOverlay
  default void setResizeMode(@Nonnull final String... resizeMode) {
    setResizeMode( ConstrainDOMString.of( resizeMode ) );
  }

  @JsOverlay
  default void setResizeMode(@Nonnull final ConstrainDOMStringParameters resizeMode) {
    setResizeMode( ConstrainDOMString.of( resizeMode ) );
  }

  @JsProperty(
      name = "sampleRate"
  )
  ConstrainULong sampleRate();

  @JsProperty
  void setSampleRate(@Nonnull ConstrainULong sampleRate);

  @JsOverlay
  default void setSampleRate(final int sampleRate) {
    setSampleRate( ConstrainULong.of( sampleRate ) );
  }

  @JsOverlay
  default void setSampleRate(@Nonnull final ConstrainULongRange sampleRate) {
    setSampleRate( ConstrainULong.of( sampleRate ) );
  }

  @JsProperty(
      name = "sampleSize"
  )
  ConstrainULong sampleSize();

  @JsProperty
  void setSampleSize(@Nonnull ConstrainULong sampleSize);

  @JsOverlay
  default void setSampleSize(final int sampleSize) {
    setSampleSize( ConstrainULong.of( sampleSize ) );
  }

  @JsOverlay
  default void setSampleSize(@Nonnull final ConstrainULongRange sampleSize) {
    setSampleSize( ConstrainULong.of( sampleSize ) );
  }

  @JsProperty(
      name = "width"
  )
  ConstrainULong width();

  @JsProperty
  void setWidth(@Nonnull ConstrainULong width);

  @JsOverlay
  default void setWidth(final int width) {
    setWidth( ConstrainULong.of( width ) );
  }

  @JsOverlay
  default void setWidth(@Nonnull final ConstrainULongRange width) {
    setWidth( ConstrainULong.of( width ) );
  }

  @JsProperty(
      name = "cursor"
  )
  ConstrainDOMString cursor();

  @JsProperty
  void setCursor(@Nonnull ConstrainDOMString cursor);

  @JsOverlay
  default void setCursor(@Nonnull final String cursor) {
    setCursor( ConstrainDOMString.of( cursor ) );
  }

  @JsOverlay
  default void setCursor(@Nonnull final JsArray<String> cursor) {
    setCursor( ConstrainDOMString.of( cursor ) );
  }

  @JsOverlay
  default void setCursor(@Nonnull final String... cursor) {
    setCursor( ConstrainDOMString.of( cursor ) );
  }

  @JsOverlay
  default void setCursor(@Nonnull final ConstrainDOMStringParameters cursor) {
    setCursor( ConstrainDOMString.of( cursor ) );
  }

  @JsProperty(
      name = "displaySurface"
  )
  ConstrainDOMString displaySurface();

  @JsProperty
  void setDisplaySurface(@Nonnull ConstrainDOMString displaySurface);

  @JsOverlay
  default void setDisplaySurface(@Nonnull final String displaySurface) {
    setDisplaySurface( ConstrainDOMString.of( displaySurface ) );
  }

  @JsOverlay
  default void setDisplaySurface(@Nonnull final JsArray<String> displaySurface) {
    setDisplaySurface( ConstrainDOMString.of( displaySurface ) );
  }

  @JsOverlay
  default void setDisplaySurface(@Nonnull final String... displaySurface) {
    setDisplaySurface( ConstrainDOMString.of( displaySurface ) );
  }

  @JsOverlay
  default void setDisplaySurface(@Nonnull final ConstrainDOMStringParameters displaySurface) {
    setDisplaySurface( ConstrainDOMString.of( displaySurface ) );
  }

  @JsProperty(
      name = "logicalSurface"
  )
  ConstrainBoolean logicalSurface();

  @JsProperty
  void setLogicalSurface(@Nonnull ConstrainBoolean logicalSurface);

  @JsOverlay
  default void setLogicalSurface(final boolean logicalSurface) {
    setLogicalSurface( ConstrainBoolean.of( logicalSurface ) );
  }

  @JsOverlay
  default void setLogicalSurface(@Nonnull final ConstrainBooleanParameters logicalSurface) {
    setLogicalSurface( ConstrainBoolean.of( logicalSurface ) );
  }

  @JsProperty(
      name = "restrictOwnAudio"
  )
  ConstrainBoolean restrictOwnAudio();

  @JsProperty
  void setRestrictOwnAudio(@Nonnull ConstrainBoolean restrictOwnAudio);

  @JsOverlay
  default void setRestrictOwnAudio(final boolean restrictOwnAudio) {
    setRestrictOwnAudio( ConstrainBoolean.of( restrictOwnAudio ) );
  }

  @JsOverlay
  default void setRestrictOwnAudio(@Nonnull final ConstrainBooleanParameters restrictOwnAudio) {
    setRestrictOwnAudio( ConstrainBoolean.of( restrictOwnAudio ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends MediaTrackConstraintSet {
    @JsOverlay
    @Nonnull
    default Builder aspectRatio(@Nonnull final ConstrainDouble aspectRatio) {
      setAspectRatio( aspectRatio );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder aspectRatio(final double aspectRatio) {
      setAspectRatio( aspectRatio );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder aspectRatio(@Nonnull final ConstrainDoubleRange aspectRatio) {
      setAspectRatio( aspectRatio );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder autoGainControl(@Nonnull final ConstrainBoolean autoGainControl) {
      setAutoGainControl( autoGainControl );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder autoGainControl(final boolean autoGainControl) {
      setAutoGainControl( autoGainControl );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder autoGainControl(@Nonnull final ConstrainBooleanParameters autoGainControl) {
      setAutoGainControl( autoGainControl );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder channelCount(@Nonnull final ConstrainULong channelCount) {
      setChannelCount( channelCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder channelCount(final int channelCount) {
      setChannelCount( channelCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder channelCount(@Nonnull final ConstrainULongRange channelCount) {
      setChannelCount( channelCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder deviceId(@Nonnull final ConstrainDOMString deviceId) {
      setDeviceId( deviceId );
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
    default Builder deviceId(@Nonnull final JsArray<String> deviceId) {
      setDeviceId( deviceId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder deviceId(@Nonnull final String... deviceId) {
      setDeviceId( deviceId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder deviceId(@Nonnull final ConstrainDOMStringParameters deviceId) {
      setDeviceId( deviceId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder echoCancellation(@Nonnull final ConstrainBoolean echoCancellation) {
      setEchoCancellation( echoCancellation );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder echoCancellation(final boolean echoCancellation) {
      setEchoCancellation( echoCancellation );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder echoCancellation(@Nonnull final ConstrainBooleanParameters echoCancellation) {
      setEchoCancellation( echoCancellation );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder facingMode(@Nonnull final ConstrainDOMString facingMode) {
      setFacingMode( facingMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder facingMode(@Nonnull final String facingMode) {
      setFacingMode( facingMode );
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
    default Builder facingMode(@Nonnull final ConstrainDOMStringParameters facingMode) {
      setFacingMode( facingMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder frameRate(@Nonnull final ConstrainDouble frameRate) {
      setFrameRate( frameRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder frameRate(final double frameRate) {
      setFrameRate( frameRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder frameRate(@Nonnull final ConstrainDoubleRange frameRate) {
      setFrameRate( frameRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder groupId(@Nonnull final ConstrainDOMString groupId) {
      setGroupId( groupId );
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
    default Builder groupId(@Nonnull final JsArray<String> groupId) {
      setGroupId( groupId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder groupId(@Nonnull final String... groupId) {
      setGroupId( groupId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder groupId(@Nonnull final ConstrainDOMStringParameters groupId) {
      setGroupId( groupId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder height(@Nonnull final ConstrainULong height) {
      setHeight( height );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder height(final int height) {
      setHeight( height );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder height(@Nonnull final ConstrainULongRange height) {
      setHeight( height );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder latency(@Nonnull final ConstrainDouble latency) {
      setLatency( latency );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder latency(final double latency) {
      setLatency( latency );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder latency(@Nonnull final ConstrainDoubleRange latency) {
      setLatency( latency );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder noiseSuppression(@Nonnull final ConstrainBoolean noiseSuppression) {
      setNoiseSuppression( noiseSuppression );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder noiseSuppression(final boolean noiseSuppression) {
      setNoiseSuppression( noiseSuppression );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder noiseSuppression(@Nonnull final ConstrainBooleanParameters noiseSuppression) {
      setNoiseSuppression( noiseSuppression );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder resizeMode(@Nonnull final ConstrainDOMString resizeMode) {
      setResizeMode( resizeMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder resizeMode(@Nonnull final String resizeMode) {
      setResizeMode( resizeMode );
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
    default Builder resizeMode(@Nonnull final ConstrainDOMStringParameters resizeMode) {
      setResizeMode( resizeMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampleRate(@Nonnull final ConstrainULong sampleRate) {
      setSampleRate( sampleRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampleRate(final int sampleRate) {
      setSampleRate( sampleRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampleRate(@Nonnull final ConstrainULongRange sampleRate) {
      setSampleRate( sampleRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampleSize(@Nonnull final ConstrainULong sampleSize) {
      setSampleSize( sampleSize );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampleSize(final int sampleSize) {
      setSampleSize( sampleSize );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder sampleSize(@Nonnull final ConstrainULongRange sampleSize) {
      setSampleSize( sampleSize );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder width(@Nonnull final ConstrainULong width) {
      setWidth( width );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder width(final int width) {
      setWidth( width );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder width(@Nonnull final ConstrainULongRange width) {
      setWidth( width );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cursor(@Nonnull final ConstrainDOMString cursor) {
      setCursor( cursor );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cursor(@Nonnull final String cursor) {
      setCursor( cursor );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cursor(@Nonnull final JsArray<String> cursor) {
      setCursor( cursor );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cursor(@Nonnull final String... cursor) {
      setCursor( cursor );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cursor(@Nonnull final ConstrainDOMStringParameters cursor) {
      setCursor( cursor );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder displaySurface(@Nonnull final ConstrainDOMString displaySurface) {
      setDisplaySurface( displaySurface );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder displaySurface(@Nonnull final String displaySurface) {
      setDisplaySurface( displaySurface );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder displaySurface(@Nonnull final JsArray<String> displaySurface) {
      setDisplaySurface( displaySurface );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder displaySurface(@Nonnull final String... displaySurface) {
      setDisplaySurface( displaySurface );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder displaySurface(@Nonnull final ConstrainDOMStringParameters displaySurface) {
      setDisplaySurface( displaySurface );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder logicalSurface(@Nonnull final ConstrainBoolean logicalSurface) {
      setLogicalSurface( logicalSurface );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder logicalSurface(final boolean logicalSurface) {
      setLogicalSurface( logicalSurface );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder logicalSurface(@Nonnull final ConstrainBooleanParameters logicalSurface) {
      setLogicalSurface( logicalSurface );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder restrictOwnAudio(@Nonnull final ConstrainBoolean restrictOwnAudio) {
      setRestrictOwnAudio( restrictOwnAudio );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder restrictOwnAudio(final boolean restrictOwnAudio) {
      setRestrictOwnAudio( restrictOwnAudio );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder restrictOwnAudio(@Nonnull final ConstrainBooleanParameters restrictOwnAudio) {
      setRestrictOwnAudio( restrictOwnAudio );
      return this;
    }
  }
}
