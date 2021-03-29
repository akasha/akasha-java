package akasha.core;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Object"
)
public interface ObjectPropertyDescriptor {
  @JsOverlay
  @Nonnull
  static ObjectPropertyDescriptor create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "configurable"
  )
  boolean configurable();

  @JsProperty
  void setConfigurable(boolean configurable);

  @JsOverlay
  @Nonnull
  default ObjectPropertyDescriptor configurable(final boolean configurable) {
    setConfigurable( configurable );
    return this;
  }

  @JsProperty(
      name = "enumerable"
  )
  boolean enumerable();

  @JsProperty
  void setEnumerable(boolean enumerable);

  @JsOverlay
  @Nonnull
  default ObjectPropertyDescriptor enumerable(final boolean enumerable) {
    setEnumerable( enumerable );
    return this;
  }

  @JsProperty(
      name = "get"
  )
  PropertyAccessorFunction get();

  @JsProperty
  void setGet(@Nonnull PropertyAccessorFunction get);

  @JsOverlay
  @Nonnull
  default ObjectPropertyDescriptor get(@Nonnull final PropertyAccessorFunction get) {
    setGet( get );
    return this;
  }

  @JsProperty(
      name = "set"
  )
  PropertyMutatorFunction set();

  @JsProperty
  void setSet(@Nonnull PropertyMutatorFunction set);

  @JsOverlay
  @Nonnull
  default ObjectPropertyDescriptor set(@Nonnull final PropertyMutatorFunction set) {
    setSet( set );
    return this;
  }

  @JsProperty(
      name = "value"
  )
  @Nullable
  Any value();

  @JsProperty
  void setValue(@DoNotAutobox @Nullable Object value);

  @JsOverlay
  @Nonnull
  default ObjectPropertyDescriptor value(@DoNotAutobox @Nullable final Object value) {
    setValue( value );
    return this;
  }

  @JsProperty(
      name = "writable"
  )
  boolean writable();

  @JsProperty
  void setWritable(boolean writable);

  @JsOverlay
  @Nonnull
  default ObjectPropertyDescriptor writable(final boolean writable) {
    setWritable( writable );
    return this;
  }
}
