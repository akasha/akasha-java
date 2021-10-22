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
  static QueuingStrategyInit highWaterMark(final double highWaterMark) {
    final QueuingStrategyInit $queuingStrategyInit = Js.<QueuingStrategyInit>uncheckedCast( JsPropertyMap.of() );
    $queuingStrategyInit.setHighWaterMark( highWaterMark );
    return Js.uncheckedCast( $queuingStrategyInit );
  }

  @JsProperty(
      name = "highWaterMark"
  )
  double highWaterMark();

  @JsProperty
  void setHighWaterMark(double highWaterMark);
}
