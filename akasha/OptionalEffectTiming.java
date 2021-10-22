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
    name = "OptionalEffectTiming"
)
public interface OptionalEffectTiming {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "delay"
  )
  double delay();

  @JsProperty
  void setDelay(double delay);

  @JsProperty(
      name = "direction"
  )
  @PlaybackDirection
  String direction();

  @JsProperty
  void setDirection(@PlaybackDirection @JsNonNull String direction);

  @JsProperty(
      name = "duration"
  )
  UnrestrictedDoubleOrStringUnion duration();

  @JsProperty
  void setDuration(@JsNonNull UnrestrictedDoubleOrStringUnion duration);

  @JsOverlay
  default void setDuration(final double duration) {
    setDuration( UnrestrictedDoubleOrStringUnion.of( duration ) );
  }

  @JsOverlay
  default void setDuration(@Nonnull final String duration) {
    setDuration( UnrestrictedDoubleOrStringUnion.of( duration ) );
  }

  @JsProperty(
      name = "easing"
  )
  String easing();

  @JsProperty
  void setEasing(@JsNonNull String easing);

  @JsProperty(
      name = "endDelay"
  )
  double endDelay();

  @JsProperty
  void setEndDelay(double endDelay);

  @JsProperty(
      name = "fill"
  )
  @FillMode
  String fill();

  @JsProperty
  void setFill(@FillMode @JsNonNull String fill);

  @JsProperty(
      name = "iterationStart"
  )
  double iterationStart();

  @JsProperty
  void setIterationStart(double iterationStart);

  @JsProperty(
      name = "iterations"
  )
  double iterations();

  @JsProperty
  void setIterations(double iterations);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "OptionalEffectTiming"
  )
  interface Builder extends OptionalEffectTiming {
    @JsOverlay
    @Nonnull
    default Builder delay(final double delay) {
      setDelay( delay );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder direction(@PlaybackDirection @Nonnull final String direction) {
      setDirection( direction );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder duration(@Nonnull final UnrestrictedDoubleOrStringUnion duration) {
      setDuration( duration );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder duration(final double duration) {
      setDuration( duration );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder duration(@Nonnull final String duration) {
      setDuration( duration );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder easing(@Nonnull final String easing) {
      setEasing( easing );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder endDelay(final double endDelay) {
      setEndDelay( endDelay );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder fill(@FillMode @Nonnull final String fill) {
      setFill( fill );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder iterationStart(final double iterationStart) {
      setIterationStart( iterationStart );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder iterations(final double iterations) {
      setIterations( iterations );
      return this;
    }
  }
}
