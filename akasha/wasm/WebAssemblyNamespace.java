package akasha.wasm;

import akasha.Response;
import akasha.core.BufferSource;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The WebAssembly JavaScript object acts as the namespace for all WebAssembly-related functionality.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly">WebAssembly - MDN</a>
 * @see <a href="https://webassembly.github.io/spec/js-api/#webassembly-namespace">WebAssembly - WebAssembly JavaScript Interface</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "WebAssembly"
)
public final class WebAssemblyNamespace {
  private WebAssemblyNamespace() {
  }

  /**
   * The WebAssembly.compile() function compiles WebAssembly binary code into a WebAssembly.Module object. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiate() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compile">WebAssembly.compile - MDN</a>
   * @see <a href="https://webassembly.github.io/spec/js-api/#dom-webassembly-compile">compile() - WebAssembly JavaScript Interface</a>
   */
  @Nonnull
  public native Promise<Module> compile(@Nonnull BufferSource bytes);

  /**
   * The WebAssembly.compileStreaming() function compiles a WebAssembly.Module directly from a streamed underlying source. This function is useful if it is necessary to a compile a module before it can be instantiated (otherwise, the WebAssembly.instantiateStreaming() function should be used).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/compileStreaming">WebAssembly.compileStreaming - MDN</a>
   * @see <a href="https://webassembly.org/docs/web/#webassemblycompilestreaming">compileStreaming() - WebAssembly features for web embedding</a>
   */
  @Nonnull
  public native Promise<Module> compileStreaming(@Nonnull Promise<Response> source);

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   * @see <a href="https://webassembly.github.io/spec/js-api/#dom-webassembly-instantiate">instantiate() - WebAssembly JavaScript Interface</a>
   */
  @Nonnull
  public native Promise<Instance> instantiate(@Nonnull Module moduleObject,
      @Nonnull Object importObject);

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   * @see <a href="https://webassembly.github.io/spec/js-api/#dom-webassembly-instantiate">instantiate() - WebAssembly JavaScript Interface</a>
   */
  @Nonnull
  public native Promise<Instance> instantiate(@Nonnull Module moduleObject);

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   * @see <a href="https://webassembly.github.io/spec/js-api/#dom-webassembly-instantiate">instantiate() - WebAssembly JavaScript Interface</a>
   */
  @Nonnull
  public native Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull BufferSource bytes,
      @Nonnull Object importObject);

  /**
   * The WebAssembly.instantiate() function allows you to compile and instantiate WebAssembly code. This function has two overloads:
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiate">WebAssembly.instantiate - MDN</a>
   * @see <a href="https://webassembly.github.io/spec/js-api/#dom-webassembly-instantiate">instantiate() - WebAssembly JavaScript Interface</a>
   */
  @Nonnull
  public native Promise<WebAssemblyInstantiatedSource> instantiate(@Nonnull BufferSource bytes);

  /**
   * The WebAssembly.instantiateStreaming() function compiles and instantiates a WebAssembly module directly from a streamed underlying source. This is the most efficient, optimized way to load wasm code.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiateStreaming">WebAssembly.instantiateStreaming - MDN</a>
   * @see <a href="https://webassembly.org/docs/web/#webassemblyinstantiatestreaming">instantiateStreaming() - WebAssembly features for web embedding</a>
   */
  @Nonnull
  public native Promise<WebAssemblyInstantiatedSource> instantiateStreaming(
      @Nonnull Promise<Response> source, @Nonnull Object importObject);

  /**
   * The WebAssembly.instantiateStreaming() function compiles and instantiates a WebAssembly module directly from a streamed underlying source. This is the most efficient, optimized way to load wasm code.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/instantiateStreaming">WebAssembly.instantiateStreaming - MDN</a>
   * @see <a href="https://webassembly.org/docs/web/#webassemblyinstantiatestreaming">instantiateStreaming() - WebAssembly features for web embedding</a>
   */
  @Nonnull
  public native Promise<WebAssemblyInstantiatedSource> instantiateStreaming(
      @Nonnull Promise<Response> source);

  /**
   * The WebAssembly.validate() function validates a given typed array of WebAssembly binary code, returning whether the bytes form a valid wasm module (true) or not (false).
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/WebAssembly/validate">WebAssembly.validate - MDN</a>
   * @see <a href="https://webassembly.github.io/spec/js-api/#dom-webassembly-validate">validate() - WebAssembly JavaScript Interface</a>
   */
  public native boolean validate(@Nonnull BufferSource bytes);
}
