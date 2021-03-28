package akasha;

import akasha.lang.JsArray;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The Cache interface provides a persistent storage mechanism for Request / Response object pairs that are cached in long lived memory. How long a Cache lives is browser dependent, but a single origin's scripts can typically rely on the presence of a previously populated Cache. Note that the Cache interface is exposed to windowed scopes as well as workers. You don't have to use it in conjunction with service workers, even though it is defined in the service worker spec.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache">Cache - MDN</a>
 * @see <a href="https://w3c.github.io/ServiceWorker/#cache">Cache - Service Workers</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "Cache"
)
public class Cache {
  protected Cache() {
  }

  /**
   * The add() method of the Cache interface takes a URL, retrieves it, and adds the resulting response object to the given cache.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/add">Cache.add - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-add">Cache: add - Service Workers</a>
   */
  @Nonnull
  public native Promise<Void> add(@Nonnull RequestInfo request);

  /**
   * The add() method of the Cache interface takes a URL, retrieves it, and adds the resulting response object to the given cache.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/add">Cache.add - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-add">Cache: add - Service Workers</a>
   */
  @Nonnull
  public native Promise<Void> add(@Nonnull Request request);

  /**
   * The add() method of the Cache interface takes a URL, retrieves it, and adds the resulting response object to the given cache.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/add">Cache.add - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-add">Cache: add - Service Workers</a>
   */
  @Nonnull
  public native Promise<Void> add(@Nonnull String request);

  /**
   * The addAll() method of the Cache interface takes an array of URLs, retrieves them, and adds the resulting response objects to the given cache. The request objects created during retrieval become keys to the stored response operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/addAll">Cache.addAll - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-addAll">Cache: addAll - Service Workers</a>
   */
  @Nonnull
  public native Promise<Void> addAll(@Nonnull JsArray<RequestInfo> requests);

  /**
   * The addAll() method of the Cache interface takes an array of URLs, retrieves them, and adds the resulting response objects to the given cache. The request objects created during retrieval become keys to the stored response operations.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/addAll">Cache.addAll - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-addAll">Cache: addAll - Service Workers</a>
   */
  @Nonnull
  public native Promise<Void> addAll(@Nonnull RequestInfo[] requests);

  /**
   * The delete() method of the Cache interface finds the Cache entry whose key is the request, and if found, deletes the Cache entry and returns a Promise that resolves to true. If no Cache entry is found, it resolves to false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/delete">Cache.delete - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-delete">Cache: delete - Service Workers</a>
   */
  @Nonnull
  public native Promise<Boolean> delete(@Nonnull RequestInfo request,
      @Nonnull CacheQueryOptions options);

  /**
   * The delete() method of the Cache interface finds the Cache entry whose key is the request, and if found, deletes the Cache entry and returns a Promise that resolves to true. If no Cache entry is found, it resolves to false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/delete">Cache.delete - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-delete">Cache: delete - Service Workers</a>
   */
  @Nonnull
  public native Promise<Boolean> delete(@Nonnull Request request,
      @Nonnull CacheQueryOptions options);

  /**
   * The delete() method of the Cache interface finds the Cache entry whose key is the request, and if found, deletes the Cache entry and returns a Promise that resolves to true. If no Cache entry is found, it resolves to false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/delete">Cache.delete - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-delete">Cache: delete - Service Workers</a>
   */
  @Nonnull
  public native Promise<Boolean> delete(@Nonnull String request,
      @Nonnull CacheQueryOptions options);

  /**
   * The delete() method of the Cache interface finds the Cache entry whose key is the request, and if found, deletes the Cache entry and returns a Promise that resolves to true. If no Cache entry is found, it resolves to false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/delete">Cache.delete - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-delete">Cache: delete - Service Workers</a>
   */
  @Nonnull
  public native Promise<Boolean> delete(@Nonnull RequestInfo request);

  /**
   * The delete() method of the Cache interface finds the Cache entry whose key is the request, and if found, deletes the Cache entry and returns a Promise that resolves to true. If no Cache entry is found, it resolves to false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/delete">Cache.delete - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-delete">Cache: delete - Service Workers</a>
   */
  @Nonnull
  public native Promise<Boolean> delete(@Nonnull Request request);

  /**
   * The delete() method of the Cache interface finds the Cache entry whose key is the request, and if found, deletes the Cache entry and returns a Promise that resolves to true. If no Cache entry is found, it resolves to false.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/delete">Cache.delete - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-delete">Cache: delete - Service Workers</a>
   */
  @Nonnull
  public native Promise<Boolean> delete(@Nonnull String request);

  /**
   * The keys() method of the Cache interface returns a Promise that resolves to an array of Cache keys.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/keys">Cache.keys - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-keys">Cache: keys - Service Workers</a>
   */
  @Nonnull
  public native Promise<JsArray<Request>> keys(@Nonnull RequestInfo request,
      @Nonnull CacheQueryOptions options);

  /**
   * The keys() method of the Cache interface returns a Promise that resolves to an array of Cache keys.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/keys">Cache.keys - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-keys">Cache: keys - Service Workers</a>
   */
  @Nonnull
  public native Promise<JsArray<Request>> keys(@Nonnull Request request,
      @Nonnull CacheQueryOptions options);

  /**
   * The keys() method of the Cache interface returns a Promise that resolves to an array of Cache keys.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/keys">Cache.keys - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-keys">Cache: keys - Service Workers</a>
   */
  @Nonnull
  public native Promise<JsArray<Request>> keys(@Nonnull String request,
      @Nonnull CacheQueryOptions options);

  /**
   * The keys() method of the Cache interface returns a Promise that resolves to an array of Cache keys.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/keys">Cache.keys - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-keys">Cache: keys - Service Workers</a>
   */
  @Nonnull
  public native Promise<JsArray<Request>> keys(@Nonnull RequestInfo request);

  /**
   * The keys() method of the Cache interface returns a Promise that resolves to an array of Cache keys.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/keys">Cache.keys - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-keys">Cache: keys - Service Workers</a>
   */
  @Nonnull
  public native Promise<JsArray<Request>> keys(@Nonnull Request request);

  /**
   * The keys() method of the Cache interface returns a Promise that resolves to an array of Cache keys.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/keys">Cache.keys - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-keys">Cache: keys - Service Workers</a>
   */
  @Nonnull
  public native Promise<JsArray<Request>> keys(@Nonnull String request);

  /**
   * The keys() method of the Cache interface returns a Promise that resolves to an array of Cache keys.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/keys">Cache.keys - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-keys">Cache: keys - Service Workers</a>
   */
  @Nonnull
  public native Promise<JsArray<Request>> keys();

  /**
   * The match() method of the Cache interface returns a Promise that resolves to the Response associated with the first matching request in the Cache object. If no match is found, the Promise resolves to undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/match">Cache.match - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-match">Cache match - Service Workers</a>
   */
  @Nonnull
  public native Promise<ResponseOrUndefinedUnion> match(@Nonnull RequestInfo request,
      @Nonnull CacheQueryOptions options);

  /**
   * The match() method of the Cache interface returns a Promise that resolves to the Response associated with the first matching request in the Cache object. If no match is found, the Promise resolves to undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/match">Cache.match - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-match">Cache match - Service Workers</a>
   */
  @Nonnull
  public native Promise<ResponseOrUndefinedUnion> match(@Nonnull Request request,
      @Nonnull CacheQueryOptions options);

  /**
   * The match() method of the Cache interface returns a Promise that resolves to the Response associated with the first matching request in the Cache object. If no match is found, the Promise resolves to undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/match">Cache.match - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-match">Cache match - Service Workers</a>
   */
  @Nonnull
  public native Promise<ResponseOrUndefinedUnion> match(@Nonnull String request,
      @Nonnull CacheQueryOptions options);

  /**
   * The match() method of the Cache interface returns a Promise that resolves to the Response associated with the first matching request in the Cache object. If no match is found, the Promise resolves to undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/match">Cache.match - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-match">Cache match - Service Workers</a>
   */
  @Nonnull
  public native Promise<ResponseOrUndefinedUnion> match(@Nonnull RequestInfo request);

  /**
   * The match() method of the Cache interface returns a Promise that resolves to the Response associated with the first matching request in the Cache object. If no match is found, the Promise resolves to undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/match">Cache.match - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-match">Cache match - Service Workers</a>
   */
  @Nonnull
  public native Promise<ResponseOrUndefinedUnion> match(@Nonnull Request request);

  /**
   * The match() method of the Cache interface returns a Promise that resolves to the Response associated with the first matching request in the Cache object. If no match is found, the Promise resolves to undefined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/match">Cache.match - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-match">Cache match - Service Workers</a>
   */
  @Nonnull
  public native Promise<ResponseOrUndefinedUnion> match(@Nonnull String request);

  /**
   * The matchAll() method of the Cache interface returns a Promise that resolves to an array of all matching responses in the Cache object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/matchAll">Cache.matchAll - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-matchall">Cache: matchAll - Service Workers</a>
   */
  @Nonnull
  public native Promise<JsArray<Response>> matchAll(@Nonnull RequestInfo request,
      @Nonnull CacheQueryOptions options);

  /**
   * The matchAll() method of the Cache interface returns a Promise that resolves to an array of all matching responses in the Cache object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/matchAll">Cache.matchAll - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-matchall">Cache: matchAll - Service Workers</a>
   */
  @Nonnull
  public native Promise<JsArray<Response>> matchAll(@Nonnull Request request,
      @Nonnull CacheQueryOptions options);

  /**
   * The matchAll() method of the Cache interface returns a Promise that resolves to an array of all matching responses in the Cache object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/matchAll">Cache.matchAll - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-matchall">Cache: matchAll - Service Workers</a>
   */
  @Nonnull
  public native Promise<JsArray<Response>> matchAll(@Nonnull String request,
      @Nonnull CacheQueryOptions options);

  /**
   * The matchAll() method of the Cache interface returns a Promise that resolves to an array of all matching responses in the Cache object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/matchAll">Cache.matchAll - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-matchall">Cache: matchAll - Service Workers</a>
   */
  @Nonnull
  public native Promise<JsArray<Response>> matchAll(@Nonnull RequestInfo request);

  /**
   * The matchAll() method of the Cache interface returns a Promise that resolves to an array of all matching responses in the Cache object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/matchAll">Cache.matchAll - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-matchall">Cache: matchAll - Service Workers</a>
   */
  @Nonnull
  public native Promise<JsArray<Response>> matchAll(@Nonnull Request request);

  /**
   * The matchAll() method of the Cache interface returns a Promise that resolves to an array of all matching responses in the Cache object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/matchAll">Cache.matchAll - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-matchall">Cache: matchAll - Service Workers</a>
   */
  @Nonnull
  public native Promise<JsArray<Response>> matchAll(@Nonnull String request);

  /**
   * The matchAll() method of the Cache interface returns a Promise that resolves to an array of all matching responses in the Cache object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/matchAll">Cache.matchAll - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-matchall">Cache: matchAll - Service Workers</a>
   */
  @Nonnull
  public native Promise<JsArray<Response>> matchAll();

  /**
   * The put() method of the Cache interface allows key/value pairs to be added to the current Cache object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/put">Cache.put - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-put">Cache: put - Service Workers</a>
   */
  @Nonnull
  public native Promise<Void> put(@Nonnull RequestInfo request, @Nonnull Response response);

  /**
   * The put() method of the Cache interface allows key/value pairs to be added to the current Cache object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/put">Cache.put - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-put">Cache: put - Service Workers</a>
   */
  @Nonnull
  public native Promise<Void> put(@Nonnull Request request, @Nonnull Response response);

  /**
   * The put() method of the Cache interface allows key/value pairs to be added to the current Cache object.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/Cache/put">Cache.put - MDN</a>
   * @see <a href="https://w3c.github.io/ServiceWorker/#cache-put">Cache: put - Service Workers</a>
   */
  @Nonnull
  public native Promise<Void> put(@Nonnull String request, @Nonnull Response response);
}
