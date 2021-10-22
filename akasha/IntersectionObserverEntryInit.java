package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
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
    name = "IntersectionObserverEntryInit"
)
public interface IntersectionObserverEntryInit {
  @JsOverlay
  @Nonnull
  static Step1 boundingClientRect(@Nonnull final DOMRectInit boundingClientRect) {
    final IntersectionObserverEntryInit $intersectionObserverEntryInit = Js.<IntersectionObserverEntryInit>uncheckedCast( JsPropertyMap.of() );
    $intersectionObserverEntryInit.setBoundingClientRect( boundingClientRect );
    return Js.uncheckedCast( $intersectionObserverEntryInit );
  }

  @JsProperty(
      name = "boundingClientRect"
  )
  @JsNonNull
  DOMRectInit boundingClientRect();

  @JsProperty
  void setBoundingClientRect(@JsNonNull DOMRectInit boundingClientRect);

  @JsProperty(
      name = "intersectionRatio"
  )
  double intersectionRatio();

  @JsProperty
  void setIntersectionRatio(double intersectionRatio);

  @JsProperty(
      name = "intersectionRect"
  )
  @JsNonNull
  DOMRectInit intersectionRect();

  @JsProperty
  void setIntersectionRect(@JsNonNull DOMRectInit intersectionRect);

  @JsProperty(
      name = "isIntersecting"
  )
  boolean isIntersecting();

  @JsProperty
  void setIsIntersecting(boolean isIntersecting);

  @JsProperty(
      name = "rootBounds"
  )
  @JsNullable
  DOMRectInit rootBounds();

  @JsProperty
  void setRootBounds(@JsNullable DOMRectInit rootBounds);

  @JsProperty(
      name = "target"
  )
  @JsNonNull
  Element target();

  @JsProperty
  void setTarget(@JsNonNull Element target);

  @JsProperty(
      name = "time"
  )
  double time();

  @JsProperty
  void setTime(double time);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "IntersectionObserverEntryInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 intersectionRatio(double intersectionRatio) {
      Js.<IntersectionObserverEntryInit>uncheckedCast( this ).setIntersectionRatio( intersectionRatio );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "IntersectionObserverEntryInit"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 intersectionRect(@Nonnull DOMRectInit intersectionRect) {
      Js.<IntersectionObserverEntryInit>uncheckedCast( this ).setIntersectionRect( intersectionRect );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "IntersectionObserverEntryInit"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 isIntersecting(boolean isIntersecting) {
      Js.<IntersectionObserverEntryInit>uncheckedCast( this ).setIsIntersecting( isIntersecting );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "IntersectionObserverEntryInit"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default Step5 rootBounds(@Nullable DOMRectInit rootBounds) {
      Js.<IntersectionObserverEntryInit>uncheckedCast( this ).setRootBounds( rootBounds );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "IntersectionObserverEntryInit"
  )
  interface Step5 {
    @JsOverlay
    @Nonnull
    default Step6 target(@Nonnull Element target) {
      Js.<IntersectionObserverEntryInit>uncheckedCast( this ).setTarget( target );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "IntersectionObserverEntryInit"
  )
  interface Step6 {
    @JsOverlay
    @Nonnull
    default IntersectionObserverEntryInit time(double time) {
      Js.<IntersectionObserverEntryInit>uncheckedCast( this ).setTime( time );
      return Js.uncheckedCast( this );
    }
  }
}
