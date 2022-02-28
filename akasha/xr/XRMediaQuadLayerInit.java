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
    name = "XRMediaQuadLayerInit"
)
public interface XRMediaQuadLayerInit extends XRMediaLayerInit {
  @JsOverlay
  @Nonnull
  static Builder space(@Nonnull final XRSpace space) {
    final Builder $xrMediaQuadLayerInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $xrMediaQuadLayerInit.setSpace( space );
    return Js.uncheckedCast( $xrMediaQuadLayerInit );
  }

  @JsProperty(
      name = "height"
  )
  @JsNullable
  Double height();

  @JsProperty
  void setHeight(@JsNullable Double height);

  @JsProperty(
      name = "transform"
  )
  @JsNullable
  XRRigidTransform transform();

  @JsProperty
  void setTransform(@JsNullable XRRigidTransform transform);

  @JsProperty(
      name = "width"
  )
  @JsNullable
  Double width();

  @JsProperty
  void setWidth(@JsNullable Double width);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRMediaQuadLayerInit"
  )
  interface Builder extends XRMediaQuadLayerInit {
    @JsOverlay
    @Nonnull
    default Builder height(@Nullable final Double height) {
      setHeight( height );
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
    default Builder width(@Nullable final Double width) {
      setWidth( width );
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
