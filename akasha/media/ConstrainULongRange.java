package akasha.media;

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
    name = "Object"
)
public interface ConstrainULongRange extends ULongRange {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "exact"
  )
  int exact();

  @JsProperty
  void setExact(int exact);

  @JsProperty(
      name = "ideal"
  )
  int ideal();

  @JsProperty
  void setIdeal(int ideal);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends ConstrainULongRange {
    @JsOverlay
    @Nonnull
    default Builder exact(final int exact) {
      setExact( exact );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ideal(final int ideal) {
      setIdeal( ideal );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder max(final int max) {
      setMax( max );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder min(final int min) {
      setMin( min );
      return this;
    }
  }
}
