package akasha.gpu;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUCompilationMessage"
)
public class GPUCompilationMessage extends JsObject {
  protected GPUCompilationMessage() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "lineNum"
  )
  public native int lineNum();

  @JsProperty(
      name = "linePos"
  )
  public native int linePos();

  @JsProperty(
      name = "message"
  )
  @Nonnull
  public native String message();

  @JsProperty(
      name = "offset"
  )
  public native int offset();

  @JsProperty(
      name = "type"
  )
  @Nonnull
  @GPUCompilationMessageType
  public native String type();
}
