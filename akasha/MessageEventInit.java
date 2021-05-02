package akasha;

import akasha.lang.JsArray;
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
    name = "Object"
)
public interface MessageEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "data"
  )
  @Nullable
  Any data();

  @JsProperty
  void setData(@DoNotAutobox @Nullable Object data);

  @JsProperty(
      name = "lastEventId"
  )
  String lastEventId();

  @JsProperty
  void setLastEventId(@Nonnull String lastEventId);

  @JsProperty(
      name = "origin"
  )
  String origin();

  @JsProperty
  void setOrigin(@Nonnull String origin);

  @JsProperty(
      name = "ports"
  )
  JsArray<MessagePort> ports();

  @JsProperty
  void setPorts(@Nonnull JsArray<MessagePort> ports);

  @JsOverlay
  default void setPorts(@Nonnull final MessagePort... ports) {
    setPorts( Js.<JsArray<MessagePort>>uncheckedCast( ports ) );
  }

  @JsProperty(
      name = "source"
  )
  @Nullable
  MessageEventSource source();

  @JsProperty
  void setSource(@Nullable MessageEventSource source);

  @JsOverlay
  default void setSource(@Nonnull final Window source) {
    setSource( MessageEventSource.of( source ) );
  }

  @JsOverlay
  default void setSource(@Nonnull final MessagePort source) {
    setSource( MessageEventSource.of( source ) );
  }

  @JsOverlay
  default void setSource(@Nonnull final ServiceWorker source) {
    setSource( MessageEventSource.of( source ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends MessageEventInit {
    @JsOverlay
    @Nonnull
    default Builder data(@DoNotAutobox @Nullable final Object data) {
      setData( data );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder lastEventId(@Nonnull final String lastEventId) {
      setLastEventId( lastEventId );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder origin(@Nonnull final String origin) {
      setOrigin( origin );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ports(@Nonnull final JsArray<MessagePort> ports) {
      setPorts( ports );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ports(@Nonnull final MessagePort... ports) {
      setPorts( ports );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder source(@Nullable final MessageEventSource source) {
      setSource( source );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder source(@Nonnull final Window source) {
      setSource( source );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder source(@Nonnull final MessagePort source) {
      setSource( source );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder source(@Nonnull final ServiceWorker source) {
      setSource( source );
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