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
    name = "DocumentTimelineOptions"
)
public interface DocumentTimelineOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "originTime"
  )
  double originTime();

  @JsProperty
  void setOriginTime(double originTime);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "DocumentTimelineOptions"
  )
  interface Builder extends DocumentTimelineOptions {
    @JsOverlay
    @Nonnull
    default Builder originTime(final double originTime) {
      setOriginTime( originTime );
      return this;
    }
  }
}
