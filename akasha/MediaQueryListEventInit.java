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
    name = "MediaQueryListEventInit"
)
public interface MediaQueryListEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "matches"
  )
  boolean matches();

  @JsProperty
  void setMatches(boolean matches);

  @JsProperty(
      name = "media"
  )
  String media();

  @JsProperty
  void setMedia(@JsNonNull String media);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MediaQueryListEventInit"
  )
  interface Builder extends MediaQueryListEventInit {
    @JsOverlay
    @Nonnull
    default Builder matches(final boolean matches) {
      setMatches( matches );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder media(@Nonnull final String media) {
      setMedia( media );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
