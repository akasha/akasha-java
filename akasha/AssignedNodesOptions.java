package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AssignedNodesOptions"
)
public interface AssignedNodesOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "flatten"
  )
  boolean flatten();

  @JsProperty
  void setFlatten(boolean flatten);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AssignedNodesOptions"
  )
  interface Builder extends AssignedNodesOptions {
    @JsOverlay
    @Nonnull
    default Builder flatten(final boolean flatten) {
      setFlatten( flatten );
      return this;
    }
  }
}
