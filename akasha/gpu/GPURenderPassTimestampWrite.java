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
    name = "GPURenderPassTimestampWrite"
)
@ApiStatus.Experimental
public interface GPURenderPassTimestampWrite {
  @JsOverlay
  @Nonnull
  static Step1 querySet(@Nonnull final GPUQuerySet querySet) {
    final GPURenderPassTimestampWrite $gpuRenderPassTimestampWrite = Js.<GPURenderPassTimestampWrite>uncheckedCast( JsPropertyMap.of() );
    $gpuRenderPassTimestampWrite.setQuerySet( querySet );
    return Js.uncheckedCast( $gpuRenderPassTimestampWrite );
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
  @GPURenderPassTimestampLocation
  @JsNonNull
  String location();

  @JsProperty
  void setLocation(@GPURenderPassTimestampLocation @JsNonNull String location);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassTimestampWrite"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 queryIndex(int queryIndex) {
      Js.<GPURenderPassTimestampWrite>uncheckedCast( this ).setQueryIndex( queryIndex );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "GPURenderPassTimestampWrite"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default GPURenderPassTimestampWrite location(
        @GPURenderPassTimestampLocation @Nonnull String location) {
      Js.<GPURenderPassTimestampWrite>uncheckedCast( this ).setLocation( location );
      return Js.uncheckedCast( this );
    }
  }
}
