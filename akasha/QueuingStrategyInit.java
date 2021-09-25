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
    name = "QueuingStrategyInit"
)
public interface QueuingStrategyInit {
  @JsOverlay
  @Nonnull
  static Builder highWaterMark(final double highWaterMark) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).highWaterMark( highWaterMark );
  }

  @JsProperty(
      name = "highWaterMark"
  )
  double highWaterMark();

  @JsProperty
  void setHighWaterMark(double highWaterMark);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "QueuingStrategyInit"
  )
  interface Builder extends QueuingStrategyInit {
    @JsOverlay
    @Nonnull
    default Builder highWaterMark(final double highWaterMark) {
      setHighWaterMark( highWaterMark );
      return this;
    }
  }
}
