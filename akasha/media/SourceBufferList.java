package akasha.media;

import akasha.AddEventListenerOptions;
import akasha.EventHandler;
import akasha.EventListener;
import akasha.EventListenerOptions;
import akasha.EventTarget;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

/**
 * The SourceBufferList interface represents a simple container list for multiple SourceBuffer objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBufferList">SourceBufferList - MDN</a>
 * @see <a href="https://w3c.github.io/media-source/#sourcebufferlist"># sourcebufferlist</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SourceBufferList"
)
public class SourceBufferList extends EventTarget {
  @JsNullable
  public EventHandler onaddsourcebuffer;

  @JsNullable
  public EventHandler onremovesourcebuffer;

  protected SourceBufferList() {
  }

  /**
   * The length read-only property of the SourceBufferList interface returns the number of SourceBuffer objects in the list.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBufferList/length">SourceBufferList.length - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebufferlist-length">length - Media Source Extensions</a>
   */
  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsOverlay
  @JsNonNull
  public final SourceBuffer getAt(final int index) {
    return Js.<JsArrayLike<SourceBuffer>>cast( this ).getAt( index );
  }

  @JsOverlay
  public final void addAddsourcebufferListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "addsourcebuffer", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAddsourcebufferListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "addsourcebuffer", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAddsourcebufferListener(@Nonnull final EventListener callback) {
    addEventListener( "addsourcebuffer", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAddsourcebufferListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "addsourcebuffer", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAddsourcebufferListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "addsourcebuffer", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAddsourcebufferListener(@Nonnull final EventListener callback) {
    removeEventListener( "addsourcebuffer", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addRemovesourcebufferListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "removesourcebuffer", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addRemovesourcebufferListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "removesourcebuffer", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addRemovesourcebufferListener(@Nonnull final EventListener callback) {
    addEventListener( "removesourcebuffer", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeRemovesourcebufferListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "removesourcebuffer", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeRemovesourcebufferListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "removesourcebuffer", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeRemovesourcebufferListener(@Nonnull final EventListener callback) {
    removeEventListener( "removesourcebuffer", Js.cast( callback ) );
  }
}
