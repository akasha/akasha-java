package akasha.gpu;

import akasha.core.JsObject;
import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUCompilationInfo"
)
public class GPUCompilationInfo extends JsObject {
  protected GPUCompilationInfo() {
  }

  @JsProperty(
      name = "messages"
  )
  @Nonnull
  public native JsArray<GPUCompilationMessage> messages();
}
