package akasha;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ExtendableMessageEventHandlerOrMessageEventHandlerUnion"
)
@ApiStatus.Internal
interface ExtendableMessageEventHandlerOrMessageEventHandlerUnion {
  @JsOverlay
  @Nullable
  static ExtendableMessageEventHandlerOrMessageEventHandlerUnion of(
      @Nullable final ExtendableMessageEventHandler value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nullable
  static ExtendableMessageEventHandlerOrMessageEventHandlerUnion of(
      @Nullable final MessageEventHandler value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isExtendableMessageEventHandler() {
    return ( (Object) this ) instanceof ExtendableMessageEventHandler;
  }

  @JsOverlay
  default ExtendableMessageEventHandler asExtendableMessageEventHandler() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isMessageEventHandler() {
    return ( (Object) this ) instanceof MessageEventHandler;
  }

  @JsOverlay
  default MessageEventHandler asMessageEventHandler() {
    return Js.cast( this );
  }
}
