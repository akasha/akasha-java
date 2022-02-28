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
    name = "XRMediaCylinderLayerInit"
)
public interface XRMediaCylinderLayerInit extends XRMediaLayerInit {
  @JsOverlay
  @Nonnull
  static Builder space(@Nonnull final XRSpace space) {
    final Builder $xrMediaCylinderLayerInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $xrMediaCylinderLayerInit.setSpace( space );
    return Js.uncheckedCast( $xrMediaCylinderLayerInit );
  }

  @JsProperty(
      name = "aspectRatio"
  )
  @JsNullable
  Double aspectRatio();

  @JsProperty
  void setAspectRatio(@JsNullable Double aspectRatio);

  @JsProperty(
      name = "centralAngle"
  )
  float centralAngle();

  @JsProperty
  void setCentralAngle(float centralAngle);

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

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRMediaCylinderLayerInit"
  )
  interface Builder extends XRMediaCylinderLayerInit {
    @JsOverlay
    @Nonnull
    default Builder aspectRatio(@Nullable final Double aspectRatio) {
      setAspectRatio( aspectRatio );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder centralAngle(final float centralAngle) {
      setCentralAngle( centralAngle );
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
