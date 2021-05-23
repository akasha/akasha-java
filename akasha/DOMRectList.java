package akasha;

import akasha.core.JsObject;
import javaemul.internal.annotations.HasNoSideEffects;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "DOMRectList"
)
public class DOMRectList extends JsObject {
  protected DOMRectList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @HasNoSideEffects
  @Nullable
  public native DOMRect item(int index);
}
