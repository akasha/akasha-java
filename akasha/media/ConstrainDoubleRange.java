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
public interface ConstrainDoubleRange extends DoubleRange {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "exact"
  )
  double exact();

  @JsProperty
  void setExact(double exact);

  @JsProperty(
      name = "ideal"
  )
  double ideal();

  @JsProperty
  void setIdeal(double ideal);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends ConstrainDoubleRange {
    @JsOverlay
    @Nonnull
    default Builder exact(final double exact) {
      setExact( exact );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ideal(final double ideal) {
      setIdeal( ideal );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder max(final double max) {
      setMax( max );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder min(final double min) {
      setMin( min );
      return this;
    }
  }
}
