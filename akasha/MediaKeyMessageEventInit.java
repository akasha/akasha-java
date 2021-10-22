package akasha;

import akasha.core.ArrayBuffer;
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
    name = "MediaKeyMessageEventInit"
)
public interface MediaKeyMessageEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Step1 message(@Nonnull final ArrayBuffer message) {
    final Builder $mediaKeyMessageEventInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $mediaKeyMessageEventInit.setMessage( message );
    return Js.uncheckedCast( $mediaKeyMessageEventInit );
  }

  @JsProperty(
      name = "message"
  )
  @JsNonNull
  ArrayBuffer message();

  @JsProperty
  void setMessage(@JsNonNull ArrayBuffer message);

  @JsProperty(
      name = "messageType"
  )
  @MediaKeyMessageType
  @JsNonNull
  String messageType();

  @JsProperty
  void setMessageType(@MediaKeyMessageType @JsNonNull String messageType);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MediaKeyMessageEventInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder messageType(@MediaKeyMessageType @Nonnull String messageType) {
      Js.<MediaKeyMessageEventInit>uncheckedCast( this ).setMessageType( messageType );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MediaKeyMessageEventInit"
  )
  interface Builder extends MediaKeyMessageEventInit {
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
