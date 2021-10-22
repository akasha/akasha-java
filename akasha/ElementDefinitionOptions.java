package akasha;

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
    name = "ElementDefinitionOptions"
)
public interface ElementDefinitionOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "extends"
  )
  String extends_();

  @JsProperty
  void setExtends(@JsNonNull String extends_);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ElementDefinitionOptions"
  )
  interface Builder extends ElementDefinitionOptions {
    @JsOverlay
    @Nonnull
    default Builder extends_(@Nonnull final String extends_) {
      setExtends( extends_ );
      return this;
    }
  }
}
