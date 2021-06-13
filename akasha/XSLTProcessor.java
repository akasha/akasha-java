package akasha;

import akasha.core.JsObject;
import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

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

  @Nullable
  public native Any getParameter(@Nonnull String namespaceURI, @Nonnull String localName);

  public native void importStylesheet(@Nonnull Node style);

  public native void removeParameter(@Nonnull String namespaceURI, @Nonnull String localName);

  public native void reset();

  public native void setParameter(@Nonnull String namespaceURI, @Nonnull String localName,
      @DoNotAutobox @Nullable Object value);

  @Nonnull
  public native Document transformToDocument(@Nonnull Node source);

  @Nonnull
  public native DocumentFragment transformToFragment(@Nonnull Node source,
      @Nonnull Document output);
}