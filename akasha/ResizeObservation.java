package akasha;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ResizeObservation"
)
public class ResizeObservation extends JsObject {
  public ResizeObservation(@Nonnull final Element target) {
  }

  @JsProperty(
      name = "lastReportedSizes"
  )
  @Nonnull
  public native JsArray<ResizeObserverSize> lastReportedSizes();

  @JsProperty(
      name = "observedBox"
  )
  @Nonnull
  @ResizeObserverBoxOptions
  public native String observedBox();

  @JsProperty(
      name = "target"
  )
  @Nonnull
  public native Element target();
}
