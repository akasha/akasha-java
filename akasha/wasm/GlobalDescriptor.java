package akasha.wasm;

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
    name = "GlobalDescriptor"
)
public interface GlobalDescriptor {
  @JsOverlay
  @Nonnull
  static Builder value(@ValueType @Nonnull final String value) {
    final Builder $globalDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $globalDescriptor.setValue( value );
    return Js.uncheckedCast( $globalDescriptor );
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
  @JsNonNull
  String value();

  @JsProperty
  void setValue(@ValueType @JsNonNull String value);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GlobalDescriptor"
  )
  interface Builder extends GlobalDescriptor {
    @JsOverlay
    @Nonnull
    default Builder mutable(final boolean mutable) {
      setMutable( mutable );
      return this;
    }
  }
}
