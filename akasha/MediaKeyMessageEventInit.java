package akasha;

import akasha.core.ArrayBuffer;
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
public interface MediaKeyMessageEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final ArrayBuffer message,
      @MediaKeyMessageType @Nonnull final String messageType) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).message( message ).messageType( messageType );
  }

  @JsProperty(
      name = "message"
  )
  @Nonnull
  ArrayBuffer message();

  @JsProperty
  void setMessage(@Nonnull ArrayBuffer message);

  @JsProperty(
      name = "messageType"
  )
  @MediaKeyMessageType
  @Nonnull
  String messageType();

  @JsProperty
  void setMessageType(@MediaKeyMessageType @Nonnull String messageType);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends MediaKeyMessageEventInit {
    @JsOverlay
    @Nonnull
    default Builder message(@Nonnull final ArrayBuffer message) {
      setMessage( message );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder messageType(@MediaKeyMessageType @Nonnull final String messageType) {
      setMessageType( messageType );
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
