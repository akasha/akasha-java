package akasha.xr;

import akasha.Element;
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
    name = "XRDOMOverlayInit"
)
public interface XRDOMOverlayInit {
  @JsOverlay
  @Nonnull
  static XRDOMOverlayInit root(@Nonnull final Element root) {
    final XRDOMOverlayInit $xrdomOverlayInit = Js.<XRDOMOverlayInit>uncheckedCast( JsPropertyMap.of() );
    $xrdomOverlayInit.setRoot( root );
    return Js.uncheckedCast( $xrdomOverlayInit );
  }

  @JsProperty(
      name = "root"
  )
  @JsNonNull
  Element root();

  @JsProperty
  void setRoot(@JsNonNull Element root);
}
