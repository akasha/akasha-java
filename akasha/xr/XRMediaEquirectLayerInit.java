package akasha.xr;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNullable;
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
    name = "XRMediaEquirectLayerInit"
)
public interface XRMediaEquirectLayerInit extends XRMediaLayerInit {
  @JsOverlay
  @Nonnull
  static Builder space(@Nonnull final XRSpace space) {
    final Builder $xrMediaEquirectLayerInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $xrMediaEquirectLayerInit.setSpace( space );
    return Js.uncheckedCast( $xrMediaEquirectLayerInit );
  }

  @JsProperty(
      name = "centralHorizontalAngle"
  )
  float centralHorizontalAngle();

  @JsProperty
  void setCentralHorizontalAngle(float centralHorizontalAngle);

  @JsProperty(
      name = "lowerVerticalAngle"
  )
  float lowerVerticalAngle();

  @JsProperty
  void setLowerVerticalAngle(float lowerVerticalAngle);

  @JsProperty(
      name = "radius"
  )
  float radius();

  @JsProperty
  void setRadius(float radius);

  @JsProperty(
      name = "transform"
  )
  @JsNullable
  XRRigidTransform transform();

  @JsProperty
  void setTransform(@JsNullable XRRigidTransform transform);

  @JsProperty(
      name = "upperVerticalAngle"
  )
  float upperVerticalAngle();

  @JsProperty
  void setUpperVerticalAngle(float upperVerticalAngle);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRMediaEquirectLayerInit"
  )
  interface Builder extends XRMediaEquirectLayerInit {
    @JsOverlay
    @Nonnull
    default Builder centralHorizontalAngle(final float centralHorizontalAngle) {
      setCentralHorizontalAngle( centralHorizontalAngle );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder lowerVerticalAngle(final float lowerVerticalAngle) {
      setLowerVerticalAngle( lowerVerticalAngle );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder radius(final float radius) {
      setRadius( radius );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder transform(@Nullable final XRRigidTransform transform) {
      setTransform( transform );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder upperVerticalAngle(final float upperVerticalAngle) {
      setUpperVerticalAngle( upperVerticalAngle );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder invertStereo(final boolean invertStereo) {
      setInvertStereo( invertStereo );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder layout(@XRLayerLayout @Nonnull final String layout) {
      setLayout( layout );
      return this;
    }
  }
}
