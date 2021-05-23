package akasha;

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
    name = "ScrollIntoViewOptions"
)
public interface ScrollIntoViewOptions extends ScrollOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "block"
  )
  @ScrollLogicalPosition
  String block();

  @JsProperty
  void setBlock(@ScrollLogicalPosition @Nonnull String block);

  @JsProperty(
      name = "inline"
  )
  @ScrollLogicalPosition
  String inline();

  @JsProperty
  void setInline(@ScrollLogicalPosition @Nonnull String inline);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ScrollIntoViewOptions"
  )
  interface Builder extends ScrollIntoViewOptions {
    @JsOverlay
    @Nonnull
    default Builder block(@ScrollLogicalPosition @Nonnull final String block) {
      setBlock( block );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder inline(@ScrollLogicalPosition @Nonnull final String inline) {
      setInline( inline );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder behavior(@ScrollBehavior @Nonnull final String behavior) {
      setBehavior( behavior );
      return this;
    }
  }
}
