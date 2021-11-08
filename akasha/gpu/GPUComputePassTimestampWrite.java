package akasha.gpu;

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
    name = "GPUComputePassTimestampWrite"
)
@ApiStatus.Experimental
public interface GPUComputePassTimestampWrite {
  @JsOverlay
  @Nonnull
  static Step1 querySet(@Nonnull final GPUQuerySet querySet) {
    final GPUComputePassTimestampWrite $gpuComputePassTimestampWrite = Js.<GPUComputePassTimestampWrite>uncheckedCast( JsPropertyMap.of() );
    $gpuComputePassTimestampWrite.setQuerySet( querySet );
    return Js.uncheckedCast( $gpuComputePassTimestampWrite );
  }

  @JsProperty(
      name = "querySet"
  )
  @JsNonNull
  GPUQuerySet querySet();

  @JsProperty
  void setQuerySet(@JsNonNull GPUQuerySet querySet);

  @JsProperty(
      name = "queryIndex"
  )
  int queryIndex();

  @JsProperty
  void setQueryIndex(int queryIndex);

  @JsProperty(
      name = "location"
  )
  @GPUComputePassTimestampLocation
  @JsNonNull
  String location();

  @JsProperty
  void setLocation(@GPUComputePassTimestampLocation @JsNonNull String location);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUComputePassTimestampWrite"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 queryIndex(int queryIndex) {
      Js.<GPUComputePassTimestampWrite>uncheckedCast( this ).setQueryIndex( queryIndex );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPUComputePassTimestampWrite"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default GPUComputePassTimestampWrite location(
        @GPUComputePassTimestampLocation @Nonnull String location) {
      Js.<GPUComputePassTimestampWrite>uncheckedCast( this ).setLocation( location );
      return Js.uncheckedCast( this );
    }
  }
}
