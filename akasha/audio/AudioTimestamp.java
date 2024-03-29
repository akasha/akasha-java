package akasha.audio;

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
    name = "AudioTimestamp"
)
public interface AudioTimestamp {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "contextTime"
  )
  double contextTime();

  @JsProperty
  void setContextTime(double contextTime);

  @JsProperty(
      name = "performanceTime"
  )
  double performanceTime();

  @JsProperty
  void setPerformanceTime(double performanceTime);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioTimestamp"
  )
  interface Builder extends AudioTimestamp {
    @JsOverlay
    @Nonnull
    default Builder contextTime(final double contextTime) {
      setContextTime( contextTime );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder performanceTime(final double performanceTime) {
      setPerformanceTime( performanceTime );
      return this;
    }
  }
}
