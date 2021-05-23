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
    name = "EventSourceInit"
)
public interface EventSourceInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "withCredentials"
  )
  boolean withCredentials();

  @JsProperty
  void setWithCredentials(boolean withCredentials);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "EventSourceInit"
  )
  interface Builder extends EventSourceInit {
    @JsOverlay
    @Nonnull
    default Builder withCredentials(final boolean withCredentials) {
      setWithCredentials( withCredentials );
      return this;
    }
  }
}
