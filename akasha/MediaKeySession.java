package akasha;

import akasha.core.BufferSource;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * The MediaKeySession interface of the EncryptedMediaExtensions API represents a context for message exchange with a content decryption module (CDM).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession">MediaKeySession - MDN</a>
 * @see <a href="https://w3c.github.io/encrypted-media/#mediakeysession-interface"># mediakeysession-interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "MediaKeySession"
)
public class MediaKeySession extends EventTarget {
  @JsNullable
  public EventHandler onkeystatuseschange;

  @JsNullable
  public MediaKeyMessageEventHandler onmessage;

  protected MediaKeySession() {
  }

  /**
   * The MediaKeySession.closed read-only property returns a Promise signaling when a MediaKeySession closes. This promise can only be fulfilled and is never rejected. Closing a session means that licenses and keys associated with it are no longer valid for decrypting media data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/closed">MediaKeySession.closed - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeysession-closed">closed - Encrypted Media Extensions</a>
   */
  @JsProperty(
      name = "closed"
  )
  @Nonnull
  public native Promise<Void> closed();

  /**
   * The MediaKeySession.expiration read-only property returns the time after which the keys in the current session can no longer be used to decrypt media data, or NaN if no such time exists. This value is determined by the CDM and measured in milliseconds since January 1, 1970, UTC. This value may change during a session lifetime, such as when an action triggers the start of a window.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/expiration">MediaKeySession.expiration - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeysession-expiration">expiration - Encrypted Media Extensions</a>
   */
  @JsProperty(
      name = "expiration"
  )
  public native double expiration();

  /**
   * The MediaKeySession.keyStatuses read-only property returns a reference to a read-only MediaKeyStatusMap of the current session's keys and their statuses.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/keyStatuses">MediaKeySession.keyStatuses - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeysession-keystatuses">keyStatuses - Encrypted Media Extensions</a>
   */
  @JsProperty(
      name = "keyStatuses"
  )
  @Nonnull
  public native MediaKeyStatusMap keyStatuses();

  /**
   * The MediaKeySession.sessionId is a read-only property that contains a unique string generated by the content decryption module (CDM) for the current media object and its associated keys or licenses.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/sessionId">MediaKeySession.sessionId - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeysession-sessionid">sessionId - Encrypted Media Extensions</a>
   */
  @JsProperty(
      name = "sessionId"
  )
  @Nonnull
  public native String sessionId();

  /**
   * The MediaKeySession.close() method notifies that the current media session is no longer needed, and that the content decryption module should release any resources associated with this object and close it. Then, it returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/close">MediaKeySession.close - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeysession-close">close() - Encrypted Media Extensions</a>
   */
  @JsNonNull
  public native Promise<Void> close();

  /**
   * The MediaKeySession.generateRequest() method returns a Promise after generating a media request based on initialization data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/generateRequest">MediaKeySession.generateRequest - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeysession-generaterequest">generateRequest() - Encrypted Media Extensions</a>
   */
  @JsNonNull
  public native Promise<Void> generateRequest(@Nonnull String initDataType,
      @Nonnull BufferSource initData);

  /**
   * The MediaKeySession.load() method returns a Promise that resolves to a boolean value after loading data for a specified session object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/load">MediaKeySession.load - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeysession-load">load() - Encrypted Media Extensions</a>
   */
  @JsNonNull
  public native Promise<Boolean> load(@Nonnull String sessionId);

  /**
   * The MediaKeySession.remove() method returns a Promise after removing any session data associated with the current object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/remove">MediaKeySession.remove - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeysession-sessionid">remove() - Encrypted Media Extensions</a>
   */
  @JsNonNull
  public native Promise<Void> remove();

  /**
   * The MediaKeySession.update() method loads messages and licenses to the CDM, and then returns a Promise.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaKeySession/update">MediaKeySession.update - MDN</a>
   * @see <a href="https://w3c.github.io/encrypted-media/#dom-mediakeysession-update">update() - Encrypted Media Extensions</a>
   */
  @JsNonNull
  public native Promise<Void> update(@Nonnull BufferSource response);

  @JsOverlay
  public final void addMessageListener(@Nonnull final MediaKeyMessageEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MediaKeyMessageEventListener callback,
      final boolean useCapture) {
    addEventListener( "message", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addMessageListener(@Nonnull final MediaKeyMessageEventListener callback) {
    addEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MediaKeyMessageEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "message", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MediaKeyMessageEventListener callback,
      final boolean useCapture) {
    removeEventListener( "message", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeMessageListener(@Nonnull final MediaKeyMessageEventListener callback) {
    removeEventListener( "message", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addKeystatuseschangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "keystatuseschange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addKeystatuseschangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "keystatuseschange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addKeystatuseschangeListener(@Nonnull final EventListener callback) {
    addEventListener( "keystatuseschange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeKeystatuseschangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "keystatuseschange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeKeystatuseschangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "keystatuseschange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeKeystatuseschangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "keystatuseschange", Js.cast( callback ) );
  }
}
