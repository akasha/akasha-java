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
    name = "GetAnimationsOptions"
)
public interface GetAnimationsOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "subtree"
  )
  boolean subtree();

  @JsProperty
  void setSubtree(boolean subtree);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GetAnimationsOptions"
  )
  interface Builder extends GetAnimationsOptions {
    @JsOverlay
    @Nonnull
    default Builder subtree(final boolean subtree) {
      setSubtree( subtree );
      return this;
    }
  }
}
