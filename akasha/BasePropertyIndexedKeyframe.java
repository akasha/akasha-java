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
    name = "BasePropertyIndexedKeyframe"
)
public interface BasePropertyIndexedKeyframe {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "composite"
  )
  CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion composite();

  @JsProperty
  void setComposite(
      @JsNonNull CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion composite);

  @JsOverlay
  default void setComposite(@Nonnull final String composite) {
    setComposite( CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion.of( composite ) );
  }

  @JsOverlay
  default void setComposite(@Nonnull final JsArray<String> composite) {
    setComposite( CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion.of( composite ) );
  }

  @JsOverlay
  default void setComposite(@Nonnull final String... composite) {
    setComposite( CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion.of( composite ) );
  }

  @JsProperty(
      name = "easing"
  )
  @JsNullable
  StringOrStringArrayUnion easing();

  @JsProperty
  void setEasing(@JsNullable StringOrStringArrayUnion easing);

  @JsOverlay
  default void setEasing(@Nonnull final String easing) {
    setEasing( StringOrStringArrayUnion.of( easing ) );
  }

  @JsOverlay
  default void setEasing(@Nonnull final JsArray<String> easing) {
    setEasing( StringOrStringArrayUnion.of( easing ) );
  }

  @JsOverlay
  default void setEasing(@Nonnull final String... easing) {
    setEasing( StringOrStringArrayUnion.of( easing ) );
  }

  @JsProperty(
      name = "offset"
  )
  DoubleOrDoubleArrayUnion offset();

  @JsProperty
  void setOffset(@JsNonNull DoubleOrDoubleArrayUnion offset);

  @JsOverlay
  default void setOffset(final double offset) {
    setOffset( DoubleOrDoubleArrayUnion.of( offset ) );
  }

  @JsOverlay
  default void setOffset(@Nonnull final JsArray<Double> offset) {
    setOffset( DoubleOrDoubleArrayUnion.of( offset ) );
  }

  @JsOverlay
  default void setOffset(@Nonnull final double... offset) {
    setOffset( DoubleOrDoubleArrayUnion.of( offset ) );
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "BasePropertyIndexedKeyframe"
  )
  interface Builder extends BasePropertyIndexedKeyframe {
    @JsOverlay
    @Nonnull
    default Builder composite(
        @Nonnull final CompositeOperationOrAutoOrCompositeOperationOrAutoArrayUnion composite) {
      setComposite( composite );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composite(@Nonnull final String composite) {
      setComposite( composite );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composite(@Nonnull final JsArray<String> composite) {
      setComposite( composite );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composite(@Nonnull final String... composite) {
      setComposite( composite );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder easing(@Nullable final StringOrStringArrayUnion easing) {
      setEasing( easing );
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
    default Builder easing(@Nonnull final JsArray<String> easing) {
      setEasing( easing );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder easing(@Nonnull final String... easing) {
      setEasing( easing );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder offset(@Nonnull final DoubleOrDoubleArrayUnion offset) {
      setOffset( offset );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder offset(final double offset) {
      setOffset( offset );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder offset(@Nonnull final JsArray<Double> offset) {
      setOffset( offset );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder offset(@Nonnull final double... offset) {
      setOffset( offset );
      return this;
    }
  }
}
