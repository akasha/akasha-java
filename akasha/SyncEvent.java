package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The SyncEvent interface represents a sync action that is dispatched on the ServiceWorkerGlobalScope of a ServiceWorker.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SyncEvent">SyncEvent - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "SyncEvent"
)
public class SyncEvent extends ExtendableEvent {
  /**
   * The SyncEvent() constructor creates a new SyncEvent object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SyncEvent/SyncEvent">SyncEvent.SyncEvent - MDN</a>
   */
  public SyncEvent(@Nonnull final String type, @Nonnull final SyncEventInit init) {
    super( null );
  }

  /**
   * The SyncEvent.lastChance read-only property of the SyncEvent interface returns true if the user agent will not make further synchronization attempts after the current attempt. This is the value passed in the lastChance parameter of the SyncEvent() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SyncEvent/lastChance">SyncEvent.lastChance - MDN</a>
   */
  @JsProperty(
      name = "lastChance"
  )
  public native boolean lastChance();

  /**
   * The SyncEvent.tag read-only property of the SyncEvent interface returns the developer-defined identifier for this SyncEvent. This is the value passed in the tag parameter of the SyncEvent() constructor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/SyncEvent/tag">SyncEvent.tag - MDN</a>
   * @see <a href="https://wicg.github.io/background-sync/spec/#sync-event">tag - Web Background Synchronization</a>
   */
  @JsProperty(
      name = "tag"
  )
  @Nonnull
  public native String tag();
}
