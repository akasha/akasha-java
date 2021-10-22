package akasha.media;

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

/**
 * The MediaTrackConstraints dictionary is used to describe a set of capabilities and the value or values each can take on. A constraints dictionary is passed into applyConstraints() to allow a script to establish a set of exact (required) values or ranges and/or preferred values or ranges of values for the track, and the most recently-requested set of custom constraints can be retrieved by calling getConstraints().
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackConstraints">MediaTrackConstraints - MDN</a>
 * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatrackconstraints"># dom-mediatrackconstraints</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaTrackConstraints"
)
public interface MediaTrackConstraints extends MediaTrackConstraintSet {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "advanced"
  )
  JsArray<MediaTrackConstraintSet> advanced();

  @JsProperty
  void setAdvanced(@JsNonNull JsArray<MediaTrackConstraintSet> advanced);

  @JsOverlay
  default void setAdvanced(@Nonnull final MediaTrackConstraintSet... advanced) {
    setAdvanced( Js.<JsArray<MediaTrackConstraintSet>>uncheckedCast( advanced ) );
  }

  /**
   * The MediaTrackConstraints dictionary is used to describe a set of capabilities and the value or values each can take on. A constraints dictionary is passed into applyConstraints() to allow a script to establish a set of exact (required) values or ranges and/or preferred values or ranges of values for the track, and the most recently-requested set of custom constraints can be retrieved by calling getConstraints().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaTrackConstraints">MediaTrackConstraints - MDN</a>
   * @see <a href="https://w3c.github.io/mediacapture-main/#dom-mediatrackconstraints"># dom-mediatrackconstraints</a>
   */
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MediaTrackConstraints"
  )
  interface Builder extends MediaTrackConstraints {
    @JsOverlay
    @Nonnull
    default Builder advanced(@Nonnull final JsArray<MediaTrackConstraintSet> advanced) {
      setAdvanced( advanced );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder advanced(@Nonnull final MediaTrackConstraintSet... advanced) {
      setAdvanced( advanced );
      return this;
    }

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
    default Builder deviceId(@Nonnull final ConstrainDOMStringParameters deviceId) {
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
    default Builder facingMode(@Nonnull final ConstrainDOMStringParameters facingMode) {
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
    default Builder groupId(@Nonnull final ConstrainDOMStringParameters groupId) {
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
    default Builder resizeMode(@Nonnull final ConstrainDOMStringParameters resizeMode) {
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
    default Builder cursor(@Nonnull final ConstrainDOMStringParameters cursor) {
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
    default Builder displaySurface(@Nonnull final ConstrainDOMStringParameters displaySurface) {
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

    @JsOverlay
    @Nonnull
    default Builder suppressLocalAudioPlayback(
        @Nonnull final ConstrainBoolean suppressLocalAudioPlayback) {
      setSuppressLocalAudioPlayback( suppressLocalAudioPlayback );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder suppressLocalAudioPlayback(final boolean suppressLocalAudioPlayback) {
      setSuppressLocalAudioPlayback( suppressLocalAudioPlayback );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder suppressLocalAudioPlayback(
        @Nonnull final ConstrainBooleanParameters suppressLocalAudioPlayback) {
      setSuppressLocalAudioPlayback( suppressLocalAudioPlayback );
      return this;
    }
  }
}
