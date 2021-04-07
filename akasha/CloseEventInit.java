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
    name = "Object"
)
public interface CloseEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "code"
  )
  int code();

  @JsProperty
  void setCode(int code);

  @JsProperty(
      name = "reason"
  )
  String reason();

  @JsProperty
  void setReason(@Nonnull String reason);

  @JsProperty(
      name = "wasClean"
  )
  boolean wasClean();

  @JsProperty
  void setWasClean(boolean wasClean);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends CloseEventInit {
    @JsOverlay
    @Nonnull
    default Builder code(final int code) {
      setCode( code );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder reason(@Nonnull final String reason) {
      setReason( reason );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder wasClean(final boolean wasClean) {
      setWasClean( wasClean );
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
