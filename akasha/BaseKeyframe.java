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
    name = "BaseKeyframe"
)
public interface BaseKeyframe {
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
      name = "BaseKeyframe"
  )
  interface Builder extends BaseKeyframe {
    @JsOverlay
    @Nonnull
    default Builder composite(@CompositeOperationOrAuto @Nonnull final String composite) {
      setComposite( composite );
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