package akasha.gpu;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUQuerySet"
)
public class GPUQuerySet extends JsObject {
  @Nullable
  public String label;

  protected GPUQuerySet() {
  }

  public native void destroy();
}
