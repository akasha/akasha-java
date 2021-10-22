package akasha;

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
    name = "QueuingStrategy"
)
public interface QueuingStrategy {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "highWaterMark"
  )
  double highWaterMark();

  @JsProperty
  void setHighWaterMark(double highWaterMark);

  @JsProperty(
      name = "size"
  )
  QueuingStrategySize size();

  @JsProperty
  void setSize(@JsNonNull QueuingStrategySize size);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "QueuingStrategy"
  )
  interface Builder extends QueuingStrategy {
    @JsOverlay
    @Nonnull
    default Builder highWaterMark(final double highWaterMark) {
      setHighWaterMark( highWaterMark );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder size(@Nonnull final QueuingStrategySize size) {
      setSize( size );
      return this;
    }
  }
}
