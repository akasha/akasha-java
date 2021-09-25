package akasha.media;

import akasha.Blob;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
    name = "BlobEventInit"
)
public interface BlobEventInit {
  @JsOverlay
  @Nonnull
  static Builder data(@Nonnull final Blob data) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).data( data );
  }

  @JsProperty(
      name = "data"
  )
  @JsNonNull
  Blob data();

  @JsProperty
  void setData(@JsNonNull Blob data);

  @JsProperty(
      name = "timecode"
  )
  double timecode();

  @JsProperty
  void setTimecode(double timecode);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "BlobEventInit"
  )
  interface Builder extends BlobEventInit {
    @JsOverlay
    @Nonnull
    default Builder data(@Nonnull final Blob data) {
      setData( data );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder timecode(final double timecode) {
      setTimecode( timecode );
      return this;
    }
  }
}
