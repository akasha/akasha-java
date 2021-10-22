package akasha.codecs;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
    name = "PlaneLayout"
)
public interface PlaneLayout {
  @JsOverlay
  @Nonnull
  static Step1 offset(final int offset) {
    final PlaneLayout $planeLayout = Js.<PlaneLayout>uncheckedCast( JsPropertyMap.of() );
    $planeLayout.setOffset( offset );
    return Js.uncheckedCast( $planeLayout );
  }

  @JsProperty(
      name = "offset"
  )
  int offset();

  @JsProperty
  void setOffset(int offset);

  @JsProperty(
      name = "stride"
  )
  int stride();

  @JsProperty
  void setStride(int stride);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PlaneLayout"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default PlaneLayout stride(int stride) {
      Js.<PlaneLayout>uncheckedCast( this ).setStride( stride );
      return Js.uncheckedCast( this );
    }
  }
}
