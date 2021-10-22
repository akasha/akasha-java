package akasha.codecs;

import akasha.DOMRectInit;
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
    name = "VideoFrameCopyToOptions"
)
public interface VideoFrameCopyToOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "layout"
  )
  JsArray<PlaneLayout> layout();

  @JsProperty
  void setLayout(@JsNonNull JsArray<PlaneLayout> layout);

  @JsOverlay
  default void setLayout(@Nonnull final PlaneLayout... layout) {
    setLayout( Js.<JsArray<PlaneLayout>>uncheckedCast( layout ) );
  }

  @JsProperty(
      name = "rect"
  )
  DOMRectInit rect();

  @JsProperty
  void setRect(@JsNonNull DOMRectInit rect);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoFrameCopyToOptions"
  )
  interface Builder extends VideoFrameCopyToOptions {
    @JsOverlay
    @Nonnull
    default Builder layout(@Nonnull final JsArray<PlaneLayout> layout) {
      setLayout( layout );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder layout(@Nonnull final PlaneLayout... layout) {
      setLayout( layout );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rect(@Nonnull final DOMRectInit rect) {
      setRect( rect );
      return this;
    }
  }
}
