package akasha.gpu;

import akasha.lang.JsArray;
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
    name = "GPUBindGroupLayoutDescriptor"
)
public interface GPUBindGroupLayoutDescriptor extends GPUObjectDescriptorBase {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final JsArray<GPUBindGroupLayoutEntry> entries) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).entries( entries );
  }

  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final GPUBindGroupLayoutEntry[] entries) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).entries( entries );
  }

  @JsProperty(
      name = "entries"
  )
  @Nonnull
  JsArray<GPUBindGroupLayoutEntry> entries();

  @JsProperty
  void setEntries(@Nonnull JsArray<GPUBindGroupLayoutEntry> entries);

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
