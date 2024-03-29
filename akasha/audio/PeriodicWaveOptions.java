package akasha.audio;

import akasha.lang.JsArray;
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
    name = "PeriodicWaveOptions"
)
public interface PeriodicWaveOptions extends PeriodicWaveConstraints {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "imag"
  )
  JsArray<Double> imag();

  @JsProperty
  void setImag(@JsNonNull JsArray<Double> imag);

  @JsOverlay
  default void setImag(@Nonnull final double... imag) {
    setImag( Js.<JsArray<Double>>uncheckedCast( imag ) );
  }

  @JsProperty(
      name = "real"
  )
  JsArray<Double> real();

  @JsProperty
  void setReal(@JsNonNull JsArray<Double> real);

  @JsOverlay
  default void setReal(@Nonnull final double... real) {
    setReal( Js.<JsArray<Double>>uncheckedCast( real ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "PeriodicWaveOptions"
  )
  interface Builder extends PeriodicWaveOptions {
    @JsOverlay
    @Nonnull
    default Builder imag(@Nonnull final JsArray<Double> imag) {
      setImag( imag );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder imag(@Nonnull final double... imag) {
      setImag( imag );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder real(@Nonnull final JsArray<Double> real) {
      setReal( real );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder real(@Nonnull final double... real) {
      setReal( real );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder disableNormalization(final boolean disableNormalization) {
      setDisableNormalization( disableNormalization );
      return this;
    }
  }
}
