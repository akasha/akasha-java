package akasha;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CountQueuingStrategy"
)
public class CountQueuingStrategy extends JsObject {
  public CountQueuingStrategy(@Nonnull final QueuingStrategyInit init) {
  }

  @JsProperty(
      name = "highWaterMark"
  )
  public native double highWaterMark();

  @JsProperty(
      name = "size"
  )
  @Nonnull
  public native Function size();
}
