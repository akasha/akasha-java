package akasha;

import akasha.core.JsObject;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsNullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

/**
 * An XSLTProcessor applies an XSLT stylesheet transformation to an XML document to produce a new XML document as output. It has methods to load the XSLT stylesheet, to manipulate &lt;xsl:param&gt; parameter values, and to apply the transformation to documents.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/XSLTProcessor">XSLTProcessor - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "XSLTProcessor"
)
public class XSLTProcessor extends JsObject {
  public XSLTProcessor() {
  }

  public native void clearParameters();

  @JsNullable
  public native Any getParameter(@Nonnull String namespaceURI, @Nonnull String localName);

  public native void importStylesheet(@Nonnull Node style);

  public native void removeParameter(@Nonnull String namespaceURI, @Nonnull String localName);

  public native void reset();

  public native void setParameter(@Nonnull String namespaceURI, @Nonnull String localName,
      @DoNotAutobox @Nullable Object value);

  @JsNonNull
  public native Document transformToDocument(@Nonnull Node source);

  @JsNonNull
  public native DocumentFragment transformToFragment(@Nonnull Node source,
      @Nonnull Document output);
}
