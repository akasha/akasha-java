package akasha.codecs;

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
    name = "SvcOutputMetadata"
)
public interface SvcOutputMetadata {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "temporalLayerId"
  )
  int temporalLayerId();

  @JsProperty
  void setTemporalLayerId(int temporalLayerId);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "SvcOutputMetadata"
  )
  interface Builder extends SvcOutputMetadata {
    @JsOverlay
    @Nonnull
    default Builder temporalLayerId(final int temporalLayerId) {
      setTemporalLayerId( temporalLayerId );
      return this;
    }
  }
}
