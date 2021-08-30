package akasha;

import akasha.core.JsObject;
import akasha.promise.Promise;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsArrayLike;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ImageTrackList"
)
public class ImageTrackList extends JsObject {
  protected ImageTrackList() {
  }

  @JsProperty(
      name = "length"
  )
  public native int length();

  @JsProperty(
      name = "ready"
  )
  @Nonnull
  public native Promise<Void> ready();

  @JsProperty(
      name = "selectedIndex"
  )
  public native int selectedIndex();

  @JsProperty(
      name = "selectedTrack"
  )
  @Nullable
  public native ImageTrack selectedTrack();

  @JsOverlay
  @JsNonNull
  public final ImageTrack getAt(final int index) {
    return Js.<JsArrayLike<ImageTrack>>cast( this ).getAt( index );
  }
}
