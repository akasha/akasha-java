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
    name = "XRDOMOverlayState"
)
public interface XRDOMOverlayState {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "type"
  )
  @XRDOMOverlayType
  String type();

  @JsProperty
  void setType(@XRDOMOverlayType @JsNonNull String type);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRDOMOverlayState"
  )
  interface Builder extends XRDOMOverlayState {
    @JsOverlay
    @Nonnull
    default Builder type(@XRDOMOverlayType @Nonnull final String type) {
      setType( type );
      return this;
    }
  }
}
