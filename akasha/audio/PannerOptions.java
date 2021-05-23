package akasha.audio;

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
    name = "PannerOptions"
)
public interface PannerOptions extends AudioNodeOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "coneInnerAngle"
  )
  double coneInnerAngle();

  @JsProperty
  void setConeInnerAngle(double coneInnerAngle);

  @JsProperty(
      name = "coneOuterAngle"
  )
  double coneOuterAngle();

  @JsProperty
  void setConeOuterAngle(double coneOuterAngle);

  @JsProperty(
      name = "coneOuterGain"
  )
  double coneOuterGain();

  @JsProperty
  void setConeOuterGain(double coneOuterGain);

  @JsProperty(
      name = "distanceModel"
  )
  @DistanceModelType
  String distanceModel();

  @JsProperty
  void setDistanceModel(@DistanceModelType @Nonnull String distanceModel);

  @JsProperty(
      name = "maxDistance"
  )
  double maxDistance();

  @JsProperty
  void setMaxDistance(double maxDistance);

  @JsProperty(
      name = "orientationX"
  )
  float orientationX();

  @JsProperty
  void setOrientationX(float orientationX);

  @JsProperty(
      name = "orientationY"
  )
  float orientationY();

  @JsProperty
  void setOrientationY(float orientationY);

  @JsProperty(
      name = "orientationZ"
  )
  float orientationZ();

  @JsProperty
  void setOrientationZ(float orientationZ);

  @JsProperty(
      name = "panningModel"
  )
  @PanningModelType
  String panningModel();

  @JsProperty
  void setPanningModel(@PanningModelType @Nonnull String panningModel);

  @JsProperty(
      name = "positionX"
  )
  float positionX();

  @JsProperty
  void setPositionX(float positionX);

  @JsProperty(
      name = "positionY"
  )
  float positionY();

  @JsProperty
  void setPositionY(float positionY);

  @JsProperty(
      name = "positionZ"
  )
  float positionZ();

  @JsProperty
  void setPositionZ(float positionZ);

  @JsProperty(
      name = "refDistance"
  )
  double refDistance();

  @JsProperty
  void setRefDistance(double refDistance);

  @JsProperty(
      name = "rolloffFactor"
  )
  double rolloffFactor();

  @JsProperty
  void setRolloffFactor(double rolloffFactor);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PannerOptions"
  )
  interface Builder extends PannerOptions {
    @JsOverlay
    @Nonnull
    default Builder coneInnerAngle(final double coneInnerAngle) {
      setConeInnerAngle( coneInnerAngle );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder coneOuterAngle(final double coneOuterAngle) {
      setConeOuterAngle( coneOuterAngle );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder coneOuterGain(final double coneOuterGain) {
      setConeOuterGain( coneOuterGain );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder distanceModel(@DistanceModelType @Nonnull final String distanceModel) {
      setDistanceModel( distanceModel );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder maxDistance(final double maxDistance) {
      setMaxDistance( maxDistance );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder orientationX(final float orientationX) {
      setOrientationX( orientationX );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder orientationY(final float orientationY) {
      setOrientationY( orientationY );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder orientationZ(final float orientationZ) {
      setOrientationZ( orientationZ );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder panningModel(@PanningModelType @Nonnull final String panningModel) {
      setPanningModel( panningModel );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder positionX(final float positionX) {
      setPositionX( positionX );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder positionY(final float positionY) {
      setPositionY( positionY );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder positionZ(final float positionZ) {
      setPositionZ( positionZ );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder refDistance(final double refDistance) {
      setRefDistance( refDistance );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rolloffFactor(final double rolloffFactor) {
      setRolloffFactor( rolloffFactor );
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
    default Builder channelCountMode(@ChannelCountMode @Nonnull final String channelCountMode) {
      setChannelCountMode( channelCountMode );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder channelInterpretation(
        @ChannelInterpretation @Nonnull final String channelInterpretation) {
      setChannelInterpretation( channelInterpretation );
      return this;
    }
  }
}
