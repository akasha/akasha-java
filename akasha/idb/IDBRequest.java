package akasha.idb;

import akasha.AddEventListenerOptions;
import akasha.DOMException;
import akasha.EventHandler;
import akasha.EventListener;
import akasha.EventListenerOptions;
import akasha.EventTarget;
import akasha.indexeddb.IDBObjectStoreOrIDBIndexOrIDBCursorUnion;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

/**
 * The IDBRequest interface of the IndexedDB API provides access to results of asynchronous requests to databases and database objects using event handler attributes. Each reading and writing operation on a database is done using a request.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest">IDBRequest - MDN</a>
 * @see <a href="https://www.w3.org/TR/IndexedDB/#idbrequest">IDBRequest - Indexed Database API 2.0</a>
 * @see <a href="https://www.w3.org/TR/IndexedDB/#request-api">IDBRequest - Indexed Database API 2.0</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "IDBRequest"
)
public class IDBRequest extends EventTarget {
  /**
   * The following example requests a given record title, onsuccess gets the associated record from the IDBObjectStore (made available as objectStoreTitleRequest.result), updates one property of the record, and then puts the updated record back into the object store. Also included at the bottom is an onerror function that reports what the error was if the request fails. For a full working example, see our To-do Notifications app (view example live.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/onerror">IDBRequest.onerror - MDN</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-idbrequest-onerror">onerror - Indexed Database API 2.0</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-idbrequest-onerror">onerror - Indexed Database API Draft</a>
   */
  @Nullable
  public EventHandler onerror;

  /**
   * The following example requests a given record title, onsuccess gets the associated record from the IDBObjectStore (made available as objectStoreTitleRequest.result), updates one property of the record, and then puts the updated record back into the object store. For a full working example, see our To-do Notifications app (view example live.)
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/onsuccess">IDBRequest.onsuccess - MDN</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-idbrequest-onsuccess">onsuccess - Indexed Database API 2.0</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-idbrequest-onsuccess">onsuccess - Indexed Database API Draft</a>
   */
  @Nullable
  public EventHandler onsuccess;

  protected IDBRequest() {
  }

  /**
   * A DOMError containing the relevant error. In Chrome 48+/Firefox 58+ this property returns a DOMException because DOMError has been removed from the DOM standard. The following error codes are returned under certain conditions:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/error">IDBRequest.error - MDN</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-idbrequest-error">error - Indexed Database API 2.0</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-idbrequest-error">error - Indexed Database API Draft</a>
   */
  @JsProperty(
      name = "error"
  )
  @Nullable
  public native DOMException error();

  /**
   * The IDBRequestReadyState of the request, which takes one of the following two values:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/readyState">IDBRequest.readyState - MDN</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-idbrequest-readystate">readyState - Indexed Database API 2.0</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-idbrequest-readystate">readyState - Indexed Database API Draft</a>
   */
  @JsProperty(
      name = "readyState"
  )
  @Nonnull
  @IDBRequestReadyState
  public native String readyState();

  /**
   * any
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/result">IDBRequest.result - MDN</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-idbrequest-result">result - Indexed Database API 2.0</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-idbrequest-result">result - Indexed Database API Draft</a>
   */
  @JsProperty(
      name = "result"
  )
  @Nullable
  public native Any result();

  /**
   * An object representing the source of the request, such as an IDBIndex, IDBObjectStore or IDBCursor.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/source">IDBRequest.source - MDN</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-idbrequest-source">source - Indexed Database API 2.0</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-idbrequest-source">source - Indexed Database API Draft</a>
   */
  @JsProperty(
      name = "source"
  )
  @Nullable
  public native IDBObjectStoreOrIDBIndexOrIDBCursorUnion source();

  /**
   * An IDBTransaction.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/IDBRequest/transaction">IDBRequest.transaction - MDN</a>
   * @see <a href="https://www.w3.org/TR/IndexedDB/#dom-idbrequest-transaction">transaction - Indexed Database API 2.0</a>
   * @see <a href="https://w3c.github.io/IndexedDB/#dom-idbrequest-transaction">transaction - Indexed Database API Draft</a>
   */
  @JsProperty(
      name = "transaction"
  )
  @Nullable
  public native IDBTransaction transaction();

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
  public final void addSuccessListener(@Nonnull final EventListener callback,
      @Nonnull final AddEventListenerOptions options) {
    addEventListener( "success", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void addSuccessListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    addEventListener( "success", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void addSuccessListener(@Nonnull final EventListener callback) {
    addEventListener( "success", Js.cast( callback ) );
  }

  @JsOverlay
  public final void removeSuccessListener(@Nonnull final EventListener callback,
      @Nonnull final EventListenerOptions options) {
    removeEventListener( "success", Js.cast( callback ), options );
  }

  @JsOverlay
  public final void removeSuccessListener(@Nonnull final EventListener callback,
      final boolean useCapture) {
    removeEventListener( "success", Js.cast( callback ), useCapture );
  }

  @JsOverlay
  public final void removeSuccessListener(@Nonnull final EventListener callback) {
    removeEventListener( "success", Js.cast( callback ) );
  }
}
