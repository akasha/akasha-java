package akasha.wasm;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
public interface GlobalDescriptor {
  @JsOverlay
  @Nonnull
  static Builder create(@ValueType @Nonnull final String value) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).value( value );
  }

  @JsProperty(
      name = "mutable"
  )
  boolean mutable();

  @JsProperty
  void setMutable(boolean mutable);

  @JsProperty(
      name = "value"
  )
  @ValueType
  @Nonnull
  String value();

  @JsProperty
  void setValue(@ValueType @Nonnull String value);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends GlobalDescriptor {
    @JsOverlay
    @Nonnull
    default Builder mutable(final boolean mutable) {
      setMutable( mutable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder value(@ValueType @Nonnull final String value) {
      setValue( value );
      return this;
    }
  }
}
