package akasha;

import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * The CustomElementRegistry interface provides methods for registering custom elements and querying registered elements. To get an instance of it, use the window.customElements property.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomElementRegistry">CustomElementRegistry - MDN</a>
 * @see <a href="https://html.spec.whatwg.org/multipage/custom-elements.html#customelementregistry">CustomElementRegistry - HTML Living Standard</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "CustomElementRegistry"
)
public class CustomElementRegistry {
  protected CustomElementRegistry() {
  }

  /**
   * The define() method of the CustomElementRegistry interface defines a new custom element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomElementRegistry/define">CustomElementRegistry.define - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/custom-elements.html#dom-customelementregistry-define">customElements.define() - HTML Living Standard</a>
   */
  public native void define(@Nonnull String name, @Nonnull CustomElementConstructor constructor,
      @Nonnull ElementDefinitionOptions options);

  /**
   * The define() method of the CustomElementRegistry interface defines a new custom element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomElementRegistry/define">CustomElementRegistry.define - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/custom-elements.html#dom-customelementregistry-define">customElements.define() - HTML Living Standard</a>
   */
  public native void define(@Nonnull String name, @Nonnull CustomElementConstructor constructor);

  /**
   * The get() method of the CustomElementRegistry interface returns the constructor for a previously-defined custom element.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomElementRegistry/get">CustomElementRegistry.get - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/custom-elements.html#dom-customelementregistry-get">customElements.get() - HTML Living Standard</a>
   */
  @Nonnull
  public native CustomElementConstructorOrUndefinedUnion get(@Nonnull String name);

  /**
   * The upgrade() method of the CustomElementRegistry interface upgrades all shadow-containing custom elements in a Node subtree, even before they are connected to the main document.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomElementRegistry/upgrade">CustomElementRegistry.upgrade - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/custom-elements.html#dom-customelementregistry-upgrade">customElements.upgrade() - HTML Living Standard</a>
   */
  public native void upgrade(@Nonnull Node root);

  /**
   * The whenDefined() method of the CustomElementRegistry interface returns a Promise that resolves when the named element is defined.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/CustomElementRegistry/whenDefined">CustomElementRegistry.whenDefined - MDN</a>
   * @see <a href="https://html.spec.whatwg.org/multipage/#dom-customelementregistry-whendefined">customElements.whenDefined() - HTML Living Standard</a>
   */
  @Nonnull
  public native Promise<CustomElementConstructor> whenDefined(@Nonnull String name);
}
