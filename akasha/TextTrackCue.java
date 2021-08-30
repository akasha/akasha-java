package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/**
 * TextTrackCue is an abstract class which is used as the basis for the various derived cue types, such as VTTCue; you will instead work with those derived types. These cues represent strings of text presented for some duration of time during the performance of a TextTrack. The cue includes the start time (the time at which the text will be displayed) and the end time (the time at which it will be removed from the display), as well as other information.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/TextTrackCue">TextTrackCue - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/media.html#texttrackcue">(HTML) # texttrackcue</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "TextTrackCue"
)
public class TextTrackCue extends EventTarget {
  public double endTime;

  @JsNonNull
  public String id;

  @JsNullable
  public EventHandler onenter;

  @JsNullable
  public EventHandler onexit;

  public boolean pauseOnExit;

  public double startTime;

  protected TextTrackCue() {
  }

  @JsProperty(
      name = "track"
  )
  @Nullable
  public native TextTrack track();

  @JsOverlay
  public final void addExitListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "exit", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addExitListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "exit", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addExitListener(@Nonnull final EventListener callback) {
    addEventListener( "exit", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeExitListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "exit", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeExitListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "exit", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeExitListener(@Nonnull final EventListener callback) {
    removeEventListener( "exit", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addEnterListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "enter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addEnterListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "enter", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addEnterListener(@Nonnull final EventListener callback) {
    addEventListener( "enter", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeEnterListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "enter", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeEnterListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "enter", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeEnterListener(@Nonnull final EventListener callback) {
    removeEventListener( "enter", Js.cast( callback ) );
  }
}
