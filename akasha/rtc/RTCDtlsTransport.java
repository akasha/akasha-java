package akasha.rtc;

import akasha.AddEventListenerOptions;
import akasha.EventHandler;
import akasha.EventListener;
import akasha.EventListenerOptions;
import akasha.EventTarget;
import akasha.core.ArrayBuffer;
import akasha.lang.JsArray;
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
 * The RTCDtlsTransport interface provides access to information about the Datagram Transport Layer Security (DTLS) transport over which a RTCPeerConnection's RTP and RTCP packets are sent and received by its RTCRtpSender and RTCRtpReceiver objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDtlsTransport">RTCDtlsTransport - MDN</a>
 * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdtlstransport"># dom-rtcdtlstransport</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "RTCDtlsTransport"
)
public class RTCDtlsTransport extends EventTarget {
  @JsNullable
  public RTCErrorEventHandler onerror;

  @JsNullable
  public EventHandler onstatechange;

  protected RTCDtlsTransport() {
  }

  /**
   * The read-only RTCDtlsTransport property iceTransport contains a reference to the underlying RTCIceTransport.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDtlsTransport/iceTransport">RTCDtlsTransport.iceTransport - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdtlstransport-icetransport">RTCDtlsTransport.iceTransport - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "iceTransport"
  )
  @Nonnull
  public native RTCIceTransport iceTransport();

  /**
   * The state read-only property of the RTCDtlsTransport interface provides information which describes a Datagram Transport Layer Security (DTLS) transport state.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/RTCDtlsTransport/state">RTCDtlsTransport.state - MDN</a>
   * @see <a href="https://w3c.github.io/webrtc-pc/#dom-rtcdtlstransport-state">RTCDtlsTransport.state - WebRTC 1.0: Real-time Communication Between Browsers</a>
   */
  @JsProperty(
      name = "state"
  )
  @Nonnull
  @RTCDtlsTransportState
  public native String state();

  @JsNonNull
  public native JsArray<ArrayBuffer> getRemoteCertificates();

  @JsOverlay
  public final void addErrorListener(@Nonnull final RTCErrorEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final RTCErrorEventListener callback,
      final boolean useCapture) {
    addEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final RTCErrorEventListener callback) {
    addEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final RTCErrorEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final RTCErrorEventListener callback,
      final boolean useCapture) {
    removeEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final RTCErrorEventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addStatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "statechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addStatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "statechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addStatechangeListener(@Nonnull final EventListener callback) {
    addEventListener( "statechange", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeStatechangeListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "statechange", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeStatechangeListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "statechange", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeStatechangeListener(@Nonnull final EventListener callback) {
    removeEventListener( "statechange", Js.cast( callback ) );
  }
}
