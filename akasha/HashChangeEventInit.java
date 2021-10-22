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
    name = "HashChangeEventInit"
)
public interface HashChangeEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "newURL"
  )
  String newURL();

  @JsProperty
  void setNewURL(@JsNonNull String newURL);

  @JsProperty(
      name = "oldURL"
  )
  String oldURL();

  @JsProperty
  void setOldURL(@JsNonNull String oldURL);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "HashChangeEventInit"
  )
  interface Builder extends HashChangeEventInit {
    @JsOverlay
    @Nonnull
    default Builder newURL(@Nonnull final String newURL) {
      setNewURL( newURL );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder oldURL(@Nonnull final String oldURL) {
      setOldURL( oldURL );
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
