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
    name = "TouchInit"
)
public interface TouchInit {
  @JsOverlay
  @Nonnull
  static Step1 identifier(final int identifier) {
    final Builder $touchInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $touchInit.setIdentifier( identifier );
    return Js.uncheckedCast( $touchInit );
  }

  @JsProperty(
      name = "altitudeAngle"
  )
  double altitudeAngle();

  @JsProperty
  void setAltitudeAngle(double altitudeAngle);

  @JsProperty(
      name = "azimuthAngle"
  )
  double azimuthAngle();

  @JsProperty
  void setAzimuthAngle(double azimuthAngle);

  @JsProperty(
      name = "clientX"
  )
  double clientX();

  @JsProperty
  void setClientX(double clientX);

  @JsProperty(
      name = "clientY"
  )
  double clientY();

  @JsProperty
  void setClientY(double clientY);

  @JsProperty(
      name = "force"
  )
  float force();

  @JsProperty
  void setForce(float force);

  @JsProperty(
      name = "identifier"
  )
  int identifier();

  @JsProperty
  void setIdentifier(int identifier);

  @JsProperty(
      name = "pageX"
  )
  double pageX();

  @JsProperty
  void setPageX(double pageX);

  @JsProperty(
      name = "pageY"
  )
  double pageY();

  @JsProperty
  void setPageY(double pageY);

  @JsProperty(
      name = "radiusX"
  )
  float radiusX();

  @JsProperty
  void setRadiusX(float radiusX);

  @JsProperty(
      name = "radiusY"
  )
  float radiusY();

  @JsProperty
  void setRadiusY(float radiusY);

  @JsProperty(
      name = "rotationAngle"
  )
  float rotationAngle();

  @JsProperty
  void setRotationAngle(float rotationAngle);

  @JsProperty(
      name = "screenX"
  )
  double screenX();

  @JsProperty
  void setScreenX(double screenX);

  @JsProperty(
      name = "screenY"
  )
  double screenY();

  @JsProperty
  void setScreenY(double screenY);

  @JsProperty(
      name = "target"
  )
  @JsNonNull
  EventTarget target();

  @JsProperty
  void setTarget(@JsNonNull EventTarget target);

  @JsProperty(
      name = "touchType"
  )
  @TouchType
  String touchType();

  @JsProperty
  void setTouchType(@TouchType @JsNonNull String touchType);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "TouchInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder target(@Nonnull EventTarget target) {
      Js.<TouchInit>uncheckedCast( this ).setTarget( target );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "TouchInit"
  )
  interface Builder extends TouchInit {
    @JsOverlay
    @Nonnull
    default Builder altitudeAngle(final double altitudeAngle) {
      setAltitudeAngle( altitudeAngle );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder azimuthAngle(final double azimuthAngle) {
      setAzimuthAngle( azimuthAngle );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder clientX(final double clientX) {
      setClientX( clientX );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder clientY(final double clientY) {
      setClientY( clientY );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder force(final float force) {
      setForce( force );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder pageX(final double pageX) {
      setPageX( pageX );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder pageY(final double pageY) {
      setPageY( pageY );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder radiusX(final float radiusX) {
      setRadiusX( radiusX );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder radiusY(final float radiusY) {
      setRadiusY( radiusY );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rotationAngle(final float rotationAngle) {
      setRotationAngle( rotationAngle );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder screenX(final double screenX) {
      setScreenX( screenX );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder screenY(final double screenY) {
      setScreenY( screenY );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder touchType(@TouchType @Nonnull final String touchType) {
      setTouchType( touchType );
      return this;
    }
  }
}
