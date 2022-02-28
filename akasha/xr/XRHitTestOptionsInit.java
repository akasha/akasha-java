package akasha.xr;

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
    name = "XRHitTestOptionsInit"
)
public interface XRHitTestOptionsInit {
  @JsOverlay
  @Nonnull
  static Builder space(@Nonnull final XRSpace space) {
    final Builder $xrHitTestOptionsInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $xrHitTestOptionsInit.setSpace( space );
    return Js.uncheckedCast( $xrHitTestOptionsInit );
  }

  @JsProperty(
      name = "space"
  )
  @JsNonNull
  XRSpace space();

  @JsProperty
  void setSpace(@JsNonNull XRSpace space);

  @JsProperty(
      name = "entityTypes"
  )
  JsArray<String> entityTypes();

  @JsProperty
  void setEntityTypes(@JsNonNull JsArray<String> entityTypes);

  @JsProperty(
      name = "offsetRay"
  )
  XRRay offsetRay();

  @JsProperty
  void setOffsetRay(@JsNonNull XRRay offsetRay);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRHitTestOptionsInit"
  )
  interface Builder extends XRHitTestOptionsInit {
    @JsOverlay
    @Nonnull
    default Builder entityTypes(@Nonnull final JsArray<String> entityTypes) {
      setEntityTypes( entityTypes );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder offsetRay(@Nonnull final XRRay offsetRay) {
      setOffsetRay( offsetRay );
      return this;
    }
  }
}
