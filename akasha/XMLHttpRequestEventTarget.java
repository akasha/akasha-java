package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * XMLHttpRequestEventTarget is the interface that describes the event handlers shared on XMLHttpRequest and XMLHttpRequestUpload.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequestEventTarget">XMLHttpRequestEventTarget - MDN</a>
 * @see <a href="https://xhr.spec.whatwg.org/#xmlhttprequesteventtarget"># xmlhttprequesteventtarget</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XMLHttpRequestEventTarget"
)
public class XMLHttpRequestEventTarget extends EventTarget {
  /**
   * The XMLHttpRequestEventTarget.onabort is the function called when an XMLHttpRequest transaction is aborted, such as when the XMLHttpRequest.abort() function is called.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequestEventTarget/onabort">XMLHttpRequestEventTarget.onabort - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#handler-xhr-onabort">XMLHttpRequest</a>
   */
  @JsNullable
  public ProgressEventHandler onabort;

  /**
   * The XMLHttpRequestEventTarget.onerror is the function called when an XMLHttpRequest transaction fails due to an error.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequestEventTarget/onerror">XMLHttpRequestEventTarget.onerror - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#handler-xhr-onerror">XMLHttpRequest</a>
   */
  @JsNullable
  public ProgressEventHandler onerror;

  /**
   * The XMLHttpRequestEventTarget.onload is the function called when an XMLHttpRequest transaction completes successfully.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequestEventTarget/onload">XMLHttpRequestEventTarget.onload - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#handler-xhr-onload">XMLHttpRequest</a>
   */
  @JsNullable
  public ProgressEventHandler onload;

  @JsNullable
  public ProgressEventHandler onloadend;

  /**
   * The XMLHttpRequestEventTarget.onloadstart is the function called when an XMLHttpRequest transaction starts transferring data.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequestEventTarget/onloadstart">XMLHttpRequestEventTarget.onloadstart - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#handler-xhr-onloadstart">XMLHttpRequest</a>
   */
  @JsNullable
  public ProgressEventHandler onloadstart;

  /**
   * The XMLHttpRequestEventTarget.onprogress is the function called periodically with information when an XMLHttpRequest before success completely.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequestEventTarget/onprogress">XMLHttpRequestEventTarget.onprogress - MDN</a>
   * @see <a href="https://xhr.spec.whatwg.org/#handler-xhr-onload">XMLHttpRequest</a>
   */
  @JsNullable
  public ProgressEventHandler onprogress;

  @JsNullable
  public ProgressEventHandler ontimeout;

  protected XMLHttpRequestEventTarget() {
  }

  @JsOverlay
  public final void addLoadstartListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "loadstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadstartListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    addEventListener( "loadstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addLoadstartListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "loadstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLoadstartListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "loadstart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadstartListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    removeEventListener( "loadstart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeLoadstartListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "loadstart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    addEventListener( "load", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addLoadListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "load", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "load", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    removeEventListener( "load", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeLoadListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "load", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addLoadendListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "loadend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addLoadendListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    addEventListener( "loadend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addLoadendListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "loadend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeLoadendListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "loadend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeLoadendListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    removeEventListener( "loadend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeLoadendListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "loadend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    addEventListener( "abort", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "abort", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    removeEventListener( "abort", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "abort", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addProgressListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "progress", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addProgressListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    addEventListener( "progress", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addProgressListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "progress", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeProgressListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "progress", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeProgressListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    removeEventListener( "progress", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeProgressListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "progress", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    addEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    removeEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addTimeoutListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "timeout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addTimeoutListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    addEventListener( "timeout", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addTimeoutListener(@Nonnull final ProgressEventListener callback) {
    addEventListener( "timeout", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeTimeoutListener(@Nonnull final ProgressEventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "timeout", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeTimeoutListener(@Nonnull final ProgressEventListener callback,
      final boolean useCapture) {
    removeEventListener( "timeout", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeTimeoutListener(@Nonnull final ProgressEventListener callback) {
    removeEventListener( "timeout", Js.cast( callback ) );
  }
}
