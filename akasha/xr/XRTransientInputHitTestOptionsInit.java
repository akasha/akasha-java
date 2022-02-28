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
    name = "XRTransientInputHitTestOptionsInit"
)
public interface XRTransientInputHitTestOptionsInit {
  @JsOverlay
  @Nonnull
  static Builder profile(@Nonnull final String profile) {
    final Builder $xrTransientInputHitTestOptionsInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $xrTransientInputHitTestOptionsInit.setProfile( profile );
    return Js.uncheckedCast( $xrTransientInputHitTestOptionsInit );
  }

  @JsProperty(
      name = "profile"
  )
  @JsNonNull
  String profile();

  @JsProperty
  void setProfile(@JsNonNull String profile);

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
      name = "XRTransientInputHitTestOptionsInit"
  )
  interface Builder extends XRTransientInputHitTestOptionsInit {
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
