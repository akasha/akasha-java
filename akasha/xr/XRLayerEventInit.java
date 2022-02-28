package akasha.xr;

import akasha.EventInit;
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
    name = "XRLayerEventInit"
)
public interface XRLayerEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder layer(@Nonnull final XRLayer layer) {
    final Builder $xrLayerEventInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $xrLayerEventInit.setLayer( layer );
    return Js.uncheckedCast( $xrLayerEventInit );
  }

  @JsProperty(
      name = "layer"
  )
  @JsNonNull
  XRLayer layer();

  @JsProperty
  void setLayer(@JsNonNull XRLayer layer);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "XRLayerEventInit"
  )
  interface Builder extends XRLayerEventInit {
    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
