package akasha;

import akasha.lang.JsArray;
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
    name = "IntersectionObserverInit"
)
public interface IntersectionObserverInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "root"
  )
  @JsNullable
  IntersectionRoot root();

  @JsProperty
  void setRoot(@JsNullable IntersectionRoot root);

  @JsProperty(
      name = "rootMargin"
  )
  String rootMargin();

  @JsProperty
  void setRootMargin(@JsNonNull String rootMargin);

  @JsProperty(
      name = "threshold"
  )
  DoubleOrDoubleArrayUnion threshold();

  @JsProperty
  void setThreshold(@JsNonNull DoubleOrDoubleArrayUnion threshold);

  @JsOverlay
  default void setThreshold(final double threshold) {
    setThreshold( DoubleOrDoubleArrayUnion.of( threshold ) );
  }

  @JsOverlay
  default void setThreshold(@Nonnull final JsArray<Double> threshold) {
    setThreshold( DoubleOrDoubleArrayUnion.of( threshold ) );
  }

  @JsOverlay
  default void setThreshold(@Nonnull final double... threshold) {
    setThreshold( DoubleOrDoubleArrayUnion.of( threshold ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "IntersectionObserverInit"
  )
  interface Builder extends IntersectionObserverInit {
    @JsOverlay
    @Nonnull
    default Builder root(@Nullable final IntersectionRoot root) {
      setRoot( root );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rootMargin(@Nonnull final String rootMargin) {
      setRootMargin( rootMargin );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder threshold(@Nonnull final DoubleOrDoubleArrayUnion threshold) {
      setThreshold( threshold );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder threshold(final double threshold) {
      setThreshold( threshold );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder threshold(@Nonnull final JsArray<Double> threshold) {
      setThreshold( threshold );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder threshold(@Nonnull final double... threshold) {
      setThreshold( threshold );
      return this;
    }
  }
}
