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
  static Builder create(final int offset, final int stride) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).offset( offset ).stride( stride );
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

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PlaneLayout"
  )
  interface Builder extends PlaneLayout {
    @JsOverlay
    @Nonnull
    default Builder offset(final int offset) {
      setOffset( offset );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stride(final int stride) {
      setStride( stride );
      return this;
    }
  }
}
