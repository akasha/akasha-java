package akasha.svg;

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
    name = "SVGBoundingBoxOptions"
)
public interface SVGBoundingBoxOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "clipped"
  )
  boolean clipped();

  @JsProperty
  void setClipped(boolean clipped);

  @JsProperty(
      name = "fill"
  )
  boolean fill();

  @JsProperty
  void setFill(boolean fill);

  @JsProperty(
      name = "markers"
  )
  boolean markers();

  @JsProperty
  void setMarkers(boolean markers);

  @JsProperty(
      name = "stroke"
  )
  boolean stroke();

  @JsProperty
  void setStroke(boolean stroke);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "SVGBoundingBoxOptions"
  )
  interface Builder extends SVGBoundingBoxOptions {
    @JsOverlay
    @Nonnull
    default Builder clipped(final boolean clipped) {
      setClipped( clipped );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder fill(final boolean fill) {
      setFill( fill );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder markers(final boolean markers) {
      setMarkers( markers );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stroke(final boolean stroke) {
      setStroke( stroke );
      return this;
    }
  }
}
