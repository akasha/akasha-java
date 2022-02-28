package akasha.xr;

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
    name = "XRMediaLayerInit"
)
public interface XRMediaLayerInit {
  @JsOverlay
  @Nonnull
  static Builder space(@Nonnull final XRSpace space) {
    final Builder $xrMediaLayerInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $xrMediaLayerInit.setSpace( space );
    return Js.uncheckedCast( $xrMediaLayerInit );
  }

  @JsProperty(
      name = "space"
  )
  @JsNonNull
  XRSpace space();

  @JsProperty
  void setSpace(@JsNonNull XRSpace space);

  @JsProperty(
      name = "invertStereo"
  )
  boolean invertStereo();

  @JsProperty
  void setInvertStereo(boolean invertStereo);

  @JsProperty(
      name = "layout"
  )
  @XRLayerLayout
  String layout();

  @JsProperty
  void setLayout(@XRLayerLayout @JsNonNull String layout);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRMediaLayerInit"
  )
  interface Builder extends XRMediaLayerInit {
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
