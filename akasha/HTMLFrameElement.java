package akasha;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "HTMLFrameElement"
)
public class HTMLFrameElement extends HTMLElement {
  @JsNonNull
  public String frameBorder;

  @JsNonNull
  public String longDesc;

  @JsNonNull
  public String marginHeight;

  @JsNonNull
  public String marginWidth;

  @JsNonNull
  public String name;

  public boolean noResize;

  @JsNonNull
  public String scrolling;

  @JsNonNull
  public String src;

  protected HTMLFrameElement() {
  }

  @JsProperty(
      name = "contentDocument"
  )
  @Nullable
  public native Document contentDocument();

  @JsProperty(
      name = "contentWindow"
  )
  @Nullable
  public native Window contentWindow();
}
