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
    name = "TextDecoderOptions"
)
public interface TextDecoderOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "fatal"
  )
  boolean fatal();

  @JsProperty
  void setFatal(boolean fatal);

  @JsProperty(
      name = "ignoreBOM"
  )
  boolean ignoreBOM();

  @JsProperty
  void setIgnoreBOM(boolean ignoreBOM);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "TextDecoderOptions"
  )
  interface Builder extends TextDecoderOptions {
    @JsOverlay
    @Nonnull
    default Builder fatal(final boolean fatal) {
      setFatal( fatal );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ignoreBOM(final boolean ignoreBOM) {
      setIgnoreBOM( ignoreBOM );
      return this;
    }
  }
}
