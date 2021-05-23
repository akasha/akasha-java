package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
  static Builder create(@Nonnull final DOMRectInit boundingClientRect,
      final double intersectionRatio, @Nonnull final DOMRectInit intersectionRect,
      final boolean isIntersecting, @Nullable final DOMRectInit rootBounds,
      @Nonnull final Element target, final double time) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).boundingClientRect( boundingClientRect ).intersectionRatio( intersectionRatio ).intersectionRect( intersectionRect ).isIntersecting( isIntersecting ).rootBounds( rootBounds ).target( target ).time( time );
  }

  @JsProperty(
      name = "boundingClientRect"
  )
  @Nonnull
  DOMRectInit boundingClientRect();

  @JsProperty
  void setBoundingClientRect(@Nonnull DOMRectInit boundingClientRect);

  @JsProperty(
      name = "intersectionRatio"
  )
  double intersectionRatio();

  @JsProperty
  void setIntersectionRatio(double intersectionRatio);

  @JsProperty(
      name = "intersectionRect"
  )
  @Nonnull
  DOMRectInit intersectionRect();

  @JsProperty
  void setIntersectionRect(@Nonnull DOMRectInit intersectionRect);

  @JsProperty(
      name = "isIntersecting"
  )
  boolean isIntersecting();

  @JsProperty
  void setIsIntersecting(boolean isIntersecting);

  @JsProperty(
      name = "rootBounds"
  )
  @Nullable
  DOMRectInit rootBounds();

  @JsProperty
  void setRootBounds(@Nullable DOMRectInit rootBounds);

  @JsProperty(
      name = "target"
  )
  @Nonnull
  Element target();

  @JsProperty
  void setTarget(@Nonnull Element target);

  @JsProperty(
      name = "time"
  )
  double time();

  @JsProperty
  void setTime(double time);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "IntersectionObserverEntryInit"
  )
  interface Builder extends IntersectionObserverEntryInit {
    @JsOverlay
    @Nonnull
    default Builder boundingClientRect(@Nonnull final DOMRectInit boundingClientRect) {
      setBoundingClientRect( boundingClientRect );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder intersectionRatio(final double intersectionRatio) {
      setIntersectionRatio( intersectionRatio );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder intersectionRect(@Nonnull final DOMRectInit intersectionRect) {
      setIntersectionRect( intersectionRect );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder isIntersecting(final boolean isIntersecting) {
      setIsIntersecting( isIntersecting );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rootBounds(@Nullable final DOMRectInit rootBounds) {
      setRootBounds( rootBounds );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder target(@Nonnull final Element target) {
      setTarget( target );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder time(final double time) {
      setTime( time );
      return this;
    }
  }
}
