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
    name = "PeriodicWaveConstraints"
)
public interface PeriodicWaveConstraints {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "disableNormalization"
  )
  boolean disableNormalization();

  @JsProperty
  void setDisableNormalization(boolean disableNormalization);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PeriodicWaveConstraints"
  )
  interface Builder extends PeriodicWaveConstraints {
    @JsOverlay
    @Nonnull
    default Builder disableNormalization(final boolean disableNormalization) {
      setDisableNormalization( disableNormalization );
      return this;
    }
  }
}
