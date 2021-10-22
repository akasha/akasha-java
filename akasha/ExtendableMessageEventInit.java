package akasha;

import akasha.lang.JsArray;
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
    name = "ExtendableMessageEventInit"
)
public interface ExtendableMessageEventInit extends ExtendableEventInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "data"
  )
  @JsNullable
  Any data();

  @JsProperty
  void setData(@DoNotAutobox @JsNullable Object data);

  @JsProperty(
      name = "lastEventId"
  )
  String lastEventId();

  @JsProperty
  void setLastEventId(@JsNonNull String lastEventId);

  @JsProperty(
      name = "origin"
  )
  String origin();

  @JsProperty
  void setOrigin(@JsNonNull String origin);

  @JsProperty(
      name = "ports"
  )
  JsArray<MessagePort> ports();

  @JsProperty
  void setPorts(@JsNonNull JsArray<MessagePort> ports);

  @JsOverlay
  default void setPorts(@Nonnull final MessagePort... ports) {
    setPorts( Js.<JsArray<MessagePort>>uncheckedCast( ports ) );
  }

  @JsProperty(
      name = "source"
  )
  @JsNullable
  ExtendableMessageEventSource source();

  @JsProperty
  void setSource(@JsNullable ExtendableMessageEventSource source);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ExtendableMessageEventInit"
  )
  interface Builder extends ExtendableMessageEventInit {
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
    default Builder source(@Nullable final ExtendableMessageEventSource source) {
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
