package akasha.clipboard;

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
    name = "ClipboardItemOptions"
)
public interface ClipboardItemOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "presentationStyle"
  )
  @PresentationStyle
  String presentationStyle();

  @JsProperty
  void setPresentationStyle(@PresentationStyle @JsNonNull String presentationStyle);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ClipboardItemOptions"
  )
  interface Builder extends ClipboardItemOptions {
    @JsOverlay
    @Nonnull
    default Builder presentationStyle(@PresentationStyle @Nonnull final String presentationStyle) {
      setPresentationStyle( presentationStyle );
      return this;
    }
  }
}
