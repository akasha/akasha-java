package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ClientOrServiceWorkerOrMessagePortUnion"
)
public interface ClientOrServiceWorkerOrMessagePortUnion {
  @JsOverlay
  @Nonnull
  static ClientOrServiceWorkerOrMessagePortUnion of(@Nonnull final Client value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ClientOrServiceWorkerOrMessagePortUnion of(@Nonnull final ServiceWorker value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ClientOrServiceWorkerOrMessagePortUnion of(@Nonnull final MessagePort value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isClient() {
    return ( (Object) this ) instanceof Client;
  }

  @JsOverlay
  default Client asClient() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isMessagePort() {
    return ( (Object) this ) instanceof MessagePort;
  }

  @JsOverlay
  default MessagePort asMessagePort() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isServiceWorker() {
    return ( (Object) this ) instanceof ServiceWorker;
  }

  @JsOverlay
  default ServiceWorker asServiceWorker() {
    return Js.cast( this );
  }
}
