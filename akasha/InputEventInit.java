package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
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
    name = "InputEventInit"
)
public interface InputEventInit extends UIEventInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "data"
  )
  @JsNullable
  String data();

  @JsProperty
  void setData(@JsNullable String data);

  @JsProperty(
      name = "inputType"
  )
  String inputType();

  @JsProperty
  void setInputType(@JsNonNull String inputType);

  @JsProperty(
      name = "isComposing"
  )
  boolean isComposing();

  @JsProperty
  void setIsComposing(boolean isComposing);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "InputEventInit"
  )
  interface Builder extends InputEventInit {
    @JsOverlay
    @Nonnull
    default Builder data(@Nullable final String data) {
      setData( data );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder inputType(@Nonnull final String inputType) {
      setInputType( inputType );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder isComposing(final boolean isComposing) {
      setIsComposing( isComposing );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder detail(final int detail) {
      setDetail( detail );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder view(@Nullable final Window view) {
      setView( view );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder which(final int which) {
      setWhich( which );
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
