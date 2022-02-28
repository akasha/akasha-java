package akasha.gpu;

import akasha.StringOrUndefinedUnion;
import akasha.core.JsObject;
import javax.annotation.Generated;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@ApiStatus.Experimental
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUExternalTexture"
)
public class GPUExternalTexture extends JsObject implements GPUBindingResource {
  @JsNonNull
  public StringOrUndefinedUnion label;

  protected GPUExternalTexture() {
  }

  @JsProperty(
      name = "expired"
  )
  public native boolean expired();
}
