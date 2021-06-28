package akasha.gpu;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;
import org.jetbrains.annotations.ApiStatus;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "GPUMultisampleState"
)
@ApiStatus.Experimental
public interface GPUMultisampleState {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "alphaToCoverageEnabled"
  )
  boolean alphaToCoverageEnabled();

  @JsProperty
  void setAlphaToCoverageEnabled(boolean alphaToCoverageEnabled);

  @JsProperty(
      name = "count"
  )
  int count();

  @JsProperty
  void setCount(int count);

  @JsProperty(
      name = "mask"
  )
  int mask();

  @JsProperty
  void setMask(int mask);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUMultisampleState"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUMultisampleState {
    @JsOverlay
    @Nonnull
    default Builder alphaToCoverageEnabled(final boolean alphaToCoverageEnabled) {
      setAlphaToCoverageEnabled( alphaToCoverageEnabled );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder count(final int count) {
      setCount( count );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder mask(final int mask) {
      setMask( mask );
      return this;
    }
  }
}
