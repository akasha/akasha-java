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
    name = "TextEncoderEncodeIntoResult"
)
public interface TextEncoderEncodeIntoResult {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "read"
  )
  int read();

  @JsProperty
  void setRead(int read);

  @JsProperty(
      name = "written"
  )
  int written();

  @JsProperty
  void setWritten(int written);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "TextEncoderEncodeIntoResult"
  )
  interface Builder extends TextEncoderEncodeIntoResult {
    @JsOverlay
    @Nonnull
    default Builder read(final int read) {
      setRead( read );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder written(final int written) {
      setWritten( written );
      return this;
    }
  }
}
