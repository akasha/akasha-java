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
    name = "XRLightProbeInit"
)
public interface XRLightProbeInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "reflectionFormat"
  )
  @XRReflectionFormat
  String reflectionFormat();

  @JsProperty
  void setReflectionFormat(@XRReflectionFormat @JsNonNull String reflectionFormat);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRLightProbeInit"
  )
  interface Builder extends XRLightProbeInit {
    @JsOverlay
    @Nonnull
    default Builder reflectionFormat(@XRReflectionFormat @Nonnull final String reflectionFormat) {
      setReflectionFormat( reflectionFormat );
      return this;
    }
  }
}
