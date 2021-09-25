package akasha.gpu;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
    name = "GPUBindGroupLayoutDescriptor"
)
@ApiStatus.Experimental
public interface GPUBindGroupLayoutDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder entries(@Nonnull final JsArray<GPUBindGroupLayoutEntry> entries) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).entries( entries );
  }

  @JsOverlay
  @Nonnull
  static Builder entries(@Nonnull final GPUBindGroupLayoutEntry[] entries) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).entries( entries );
  }

  @JsProperty(
      name = "entries"
  )
  @JsNonNull
  JsArray<GPUBindGroupLayoutEntry> entries();

  @JsProperty
  void setEntries(@JsNonNull JsArray<GPUBindGroupLayoutEntry> entries);

  @JsOverlay
  default void setEntries(@Nonnull final GPUBindGroupLayoutEntry... entries) {
    setEntries( Js.<JsArray<GPUBindGroupLayoutEntry>>uncheckedCast( entries ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUBindGroupLayoutDescriptor"
  )
  @ApiStatus.Experimental
  interface Builder extends GPUBindGroupLayoutDescriptor {
    @JsOverlay
    @Nonnull
    default Builder entries(@Nonnull final JsArray<GPUBindGroupLayoutEntry> entries) {
      setEntries( entries );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder entries(@Nonnull final GPUBindGroupLayoutEntry... entries) {
      setEntries( entries );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder label(@Nonnull final String label) {
      setLabel( label );
      return this;
    }
  }
}
