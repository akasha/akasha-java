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
    name = "ObjectPropertyDescriptor"
)
public interface ObjectPropertyDescriptor {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "configurable"
  )
  boolean configurable();

  @JsProperty
  void setConfigurable(boolean configurable);

  @JsProperty(
      name = "enumerable"
  )
  boolean enumerable();

  @JsProperty
  void setEnumerable(boolean enumerable);

  @JsProperty(
      name = "get"
  )
  PropertyAccessorFunction get();

  @JsProperty
  void setGet(@Nonnull PropertyAccessorFunction get);

  @JsProperty(
      name = "set"
  )
  PropertyMutatorFunction set();

  @JsProperty
  void setSet(@Nonnull PropertyMutatorFunction set);

  @JsProperty(
      name = "value"
  )
  @Nullable
  Any value();

  @JsProperty
  void setValue(@DoNotAutobox @Nullable Object value);

  @JsProperty(
      name = "writable"
  )
  boolean writable();

  @JsProperty
  void setWritable(boolean writable);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ObjectPropertyDescriptor"
  )
  interface Builder extends ObjectPropertyDescriptor {
    @JsOverlay
    @Nonnull
    default Builder configurable(final boolean configurable) {
      setConfigurable( configurable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder enumerable(final boolean enumerable) {
      setEnumerable( enumerable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder get(@Nonnull final PropertyAccessorFunction get) {
      setGet( get );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder set(@Nonnull final PropertyMutatorFunction set) {
      setSet( set );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder value(@DoNotAutobox @Nullable final Object value) {
      setValue( value );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder writable(final boolean writable) {
      setWritable( writable );
      return this;
    }
  }
}
