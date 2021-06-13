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
    name = "AudioDataCopyToOptions"
)
public interface AudioDataCopyToOptions {
  @JsOverlay
  @Nonnull
  static Builder create(final int planeIndex) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).planeIndex( planeIndex );
  }

  @JsProperty(
      name = "frameCount"
  )
  int frameCount();

  @JsProperty
  void setFrameCount(int frameCount);

  @JsProperty(
      name = "frameOffset"
  )
  int frameOffset();

  @JsProperty
  void setFrameOffset(int frameOffset);

  @JsProperty(
      name = "planeIndex"
  )
  int planeIndex();

  @JsProperty
  void setPlaneIndex(int planeIndex);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioDataCopyToOptions"
  )
  interface Builder extends AudioDataCopyToOptions {
    @JsOverlay
    @Nonnull
    default Builder frameCount(final int frameCount) {
      setFrameCount( frameCount );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder frameOffset(final int frameOffset) {
      setFrameOffset( frameOffset );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder planeIndex(final int planeIndex) {
      setPlaneIndex( planeIndex );
      return this;
    }
  }
}
