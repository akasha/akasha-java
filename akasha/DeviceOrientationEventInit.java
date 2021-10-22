package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNullable;
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
    name = "DeviceOrientationEventInit"
)
public interface DeviceOrientationEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "absolute"
  )
  boolean absolute();

  @JsProperty
  void setAbsolute(boolean absolute);

  @JsProperty(
      name = "alpha"
  )
  @JsNullable
  Double alpha();

  @JsProperty
  void setAlpha(@JsNullable Double alpha);

  @JsProperty(
      name = "beta"
  )
  @JsNullable
  Double beta();

  @JsProperty
  void setBeta(@JsNullable Double beta);

  @JsProperty(
      name = "gamma"
  )
  @JsNullable
  Double gamma();

  @JsProperty
  void setGamma(@JsNullable Double gamma);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "DeviceOrientationEventInit"
  )
  interface Builder extends DeviceOrientationEventInit {
    @JsOverlay
    @Nonnull
    default Builder absolute(final boolean absolute) {
      setAbsolute( absolute );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder alpha(@Nullable final Double alpha) {
      setAlpha( alpha );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder beta(@Nullable final Double beta) {
      setBeta( beta );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder gamma(@Nullable final Double gamma) {
      setGamma( gamma );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
