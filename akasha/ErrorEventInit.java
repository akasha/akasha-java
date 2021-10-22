package akasha;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
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
    name = "ErrorEventInit"
)
public interface ErrorEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "colno"
  )
  int colno();

  @JsProperty
  void setColno(int colno);

  @JsProperty(
      name = "error"
  )
  @JsNullable
  Any error();

  @JsProperty
  void setError(@DoNotAutobox @JsNullable Object error);

  @JsProperty(
      name = "filename"
  )
  String filename();

  @JsProperty
  void setFilename(@JsNonNull String filename);

  @JsProperty(
      name = "lineno"
  )
  int lineno();

  @JsProperty
  void setLineno(int lineno);

  @JsProperty(
      name = "message"
  )
  String message();

  @JsProperty
  void setMessage(@JsNonNull String message);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ErrorEventInit"
  )
  interface Builder extends ErrorEventInit {
    @JsOverlay
    @Nonnull
    default Builder colno(final int colno) {
      setColno( colno );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder error(@DoNotAutobox @Nullable final Object error) {
      setError( error );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder filename(@Nonnull final String filename) {
      setFilename( filename );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder lineno(final int lineno) {
      setLineno( lineno );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder message(@Nonnull final String message) {
      setMessage( message );
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
