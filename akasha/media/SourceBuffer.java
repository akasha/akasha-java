package akasha.media;

import akasha.AddEventListenerOptions;
import akasha.AudioTrackList;
import akasha.EventHandler;
import akasha.EventListener;
import akasha.EventListenerOptions;
import akasha.EventTarget;
import akasha.TextTrackList;
import akasha.TimeRanges;
import akasha.VideoTrackList;
import akasha.core.BufferSource;
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
 * The SourceBuffer interface represents a chunk of media to be passed into an HTMLMediaElement and played, via a MediaSource object. This can be made up of one or several media segments.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer">SourceBuffer - MDN</a>
 * @see <a href="https://w3c.github.io/media-source/#sourcebuffer"># sourcebuffer</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SourceBuffer"
)
public class SourceBuffer extends EventTarget {
  /**
   * The appendWindowEnd property of the SourceBuffer interface controls the timestamp for the end of the append window, a timestamp range that can be used to filter what media data is appended to the SourceBuffer. Coded media frames with timestamps wthin this range will be appended, whereas those outside the range will be filtered out.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendWindowEnd">SourceBuffer.appendWindowEnd - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-appendwindowend">appendWindowEnd - Media Source Extensions</a>
   */
  public double appendWindowEnd;

  /**
   * The appendWindowStart property of the SourceBuffer interface controls the timestamp for the start of the append window, a timestamp range that can be used to filter what media data is appended to the SourceBuffer. Coded media frames with timestamps wthin this range will be appended, whereas those outside the range will be filtered out.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendWindowStart">SourceBuffer.appendWindowStart - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-appendwindowstart">appendWindowStart - Media Source Extensions</a>
   */
  public double appendWindowStart;

  /**
   * The mode property of the SourceBuffer interface controls whether media segments can be appended to the SourceBuffer in any order, or in a strict sequence.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/mode">SourceBuffer.mode - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-mode">mode - Media Source Extensions</a>
   */
  @JsNonNull
  @AppendMode
  public String mode;

  @JsNullable
  public EventHandler onabort;

  @JsNullable
  public EventHandler onerror;

  @JsNullable
  public EventHandler onupdate;

  @JsNullable
  public EventHandler onupdateend;

  @JsNullable
  public EventHandler onupdatestart;

  /**
   * The timestampOffset property of the SourceBuffer interface controls the offset applied to timestamps inside media segments that are appended to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/timestampOffset">SourceBuffer.timestampOffset - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-timestampoffset">timestampOffset - Media Source Extensions</a>
   */
  public double timestampOffset;

  protected SourceBuffer() {
  }

  /**
   * The audioTracks read-only property of the SourceBuffer interface returns a list of the audio tracks currently contained inside the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/audioTracks">SourceBuffer.audioTracks - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-audiotracks">audioTracks - Media Source Extensions</a>
   */
  @JsProperty(
      name = "audioTracks"
  )
  @Nonnull
  public native AudioTrackList audioTracks();

  /**
   * The buffered read-only property of the SourceBuffer interface returns the time ranges that are currently buffered in the SourceBuffer as a normalized TimeRanges object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/buffered">SourceBuffer.buffered - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-buffered">buffered - Media Source Extensions</a>
   */
  @JsProperty(
      name = "buffered"
  )
  @Nonnull
  public native TimeRanges buffered();

  /**
   * The textTracks read-only property of the SourceBuffer interface returns a list of the text tracks currently contained inside the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/textTracks">SourceBuffer.textTracks - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-texttracks">textTracks - Media Source Extensions</a>
   */
  @JsProperty(
      name = "textTracks"
  )
  @Nonnull
  public native TextTrackList textTracks();

  /**
   * The updating read-only property of the SourceBuffer interface indicates whether the SourceBuffer is currently being updated &mdash; i.e. whether an SourceBuffer.appendBuffer(),  SourceBuffer.appendStream(), or SourceBuffer.remove() operation is currently in progress.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/updating">SourceBuffer.updating - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-updating">updating - Media Source Extensions</a>
   */
  @JsProperty(
      name = "updating"
  )
  public native boolean updating();

  /**
   * The videoTracks read-only property of the SourceBuffer interface returns a list of the video tracks currently contained inside the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/videoTracks">SourceBuffer.videoTracks - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#idl-def-sourcebuffer-videotracks">videoTracks - Media Source Extensions</a>
   */
  @JsProperty(
      name = "videoTracks"
  )
  @Nonnull
  public native VideoTrackList videoTracks();

  /**
   * The abort() method of the SourceBuffer interface aborts the current segment and resets the segment parser.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/abort">SourceBuffer.abort - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#dom-sourcebuffer-abort">abort() - Media Source Extensions</a>
   */
  public native void abort();

  /**
   * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer or ArrayBufferView object to the SourceBuffer.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/appendBuffer">SourceBuffer.appendBuffer - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#dom-sourcebuffer-appendbuffer">appendBuffer() - Media Source Extensions</a>
   */
  public native void appendBuffer(@Nonnull BufferSource data);

  /**
   * The remove() method of the SourceBuffer interface removes media segments within a specific time range from the SourceBuffer. This method can only be called when SourceBuffer.updating equals false. If SourceBuffer.updating is not equal to false, call SourceBuffer.abort().
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SourceBuffer/remove">SourceBuffer.remove - MDN</a>
   * @see <a href="https://w3c.github.io/media-source/#dom-sourcebuffer-remove">remove() - Media Source Extensions</a>
   */
  public native void remove(double start, double end);

  @JsOverlay
  public final void addUpdateListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "update", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addUpdateListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "update", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addUpdateListener(@Nonnull final EventListener callback) {
    addEventListener( "update", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeUpdateListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "update", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeUpdateListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "update", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeUpdateListener(@Nonnull final EventListener callback) {
    removeEventListener( "update", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addUpdatestartListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "updatestart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addUpdatestartListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "updatestart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addUpdatestartListener(@Nonnull final EventListener callback) {
    addEventListener( "updatestart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeUpdatestartListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "updatestart", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeUpdatestartListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "updatestart", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeUpdatestartListener(@Nonnull final EventListener callback) {
    removeEventListener( "updatestart", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addUpdateendListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "updateend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addUpdateendListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "updateend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addUpdateendListener(@Nonnull final EventListener callback) {
    addEventListener( "updateend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeUpdateendListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "updateend", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeUpdateendListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "updateend", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeUpdateendListener(@Nonnull final EventListener callback) {
    removeEventListener( "updateend", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addErrorListener(@Nonnull final EventListener callback) {
    addEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "error", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "error", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeErrorListener(@Nonnull final EventListener callback) {
    removeEventListener( "error", Js.cast( callback ) );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "abort", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addAbortListener(@Nonnull final EventListener callback) {
    addEventListener( "abort", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "abort", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "abort", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeAbortListener(@Nonnull final EventListener callback) {
    removeEventListener( "abort", Js.cast( callback ) );
  }
}
