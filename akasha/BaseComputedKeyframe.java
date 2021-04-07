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
    name = "Object"
)
public interface BaseComputedKeyframe {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "composite"
  )
  @CompositeOperationOrAuto
  String composite();

  @JsProperty
  void setComposite(@CompositeOperationOrAuto @Nonnull String composite);

  @JsProperty(
      name = "computedOffset"
  )
  double computedOffset();

  @JsProperty
  void setComputedOffset(double computedOffset);

  @JsProperty(
      name = "easing"
  )
  String easing();

  @JsProperty
  void setEasing(@Nonnull String easing);

  @JsProperty(
      name = "offset"
  )
  @Nullable
  Double offset();

  @JsProperty
  void setOffset(@Nullable Double offset);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends BaseComputedKeyframe {
    @JsOverlay
    @Nonnull
    default Builder composite(@CompositeOperationOrAuto @Nonnull final String composite) {
      setComposite( composite );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder computedOffset(final double computedOffset) {
      setComputedOffset( computedOffset );
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
    default Builder offset(@Nullable final Double offset) {
      setOffset( offset );
      return this;
    }
  }
}
