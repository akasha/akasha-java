package akasha;

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
    name = "VideoFrameRect"
)
public interface VideoFrameRect {
  @JsOverlay
  @Nonnull
  static Builder create(final int height, final int left, final int top, final int width) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).height( height ).left( left ).top( top ).width( width );
  }

  @JsProperty(
      name = "height"
  )
  int height();

  @JsProperty
  void setHeight(int height);

  @JsProperty(
      name = "left"
  )
  int left();

  @JsProperty
  void setLeft(int left);

  @JsProperty(
      name = "top"
  )
  int top();

  @JsProperty
  void setTop(int top);

  @JsProperty(
      name = "width"
  )
  int width();

  @JsProperty
  void setWidth(int width);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "VideoFrameRect"
  )
  interface Builder extends VideoFrameRect {
    @JsOverlay
    @Nonnull
    default Builder height(final int height) {
      setHeight( height );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder left(final int left) {
      setLeft( left );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder top(final int top) {
      setTop( top );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder width(final int width) {
      setWidth( width );
      return this;
    }
  }
}
