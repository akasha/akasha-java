package akasha.wasm;

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
    name = "MemoryDescriptor"
)
public interface MemoryDescriptor {
  @JsOverlay
  @Nonnull
  static Builder create(final int initial) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).initial( initial );
  }

  @JsProperty(
      name = "initial"
  )
  int initial();

  @JsProperty
  void setInitial(int initial);

  @JsProperty(
      name = "maximum"
  )
  int maximum();

  @JsProperty
  void setMaximum(int maximum);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MemoryDescriptor"
  )
  interface Builder extends MemoryDescriptor {
    @JsOverlay
    @Nonnull
    default Builder initial(final int initial) {
      setInitial( initial );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder maximum(final int maximum) {
      setMaximum( maximum );
      return this;
    }
  }
}
