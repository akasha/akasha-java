package akasha;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "ElementOrProcessingInstructionUnion"
)
public interface ElementOrProcessingInstructionUnion {
  @JsOverlay
  @Nonnull
  static ElementOrProcessingInstructionUnion of(@Nonnull final Element value) {
    return Js.cast( value );
  }

  @JsOverlay
  @Nonnull
  static ElementOrProcessingInstructionUnion of(@Nonnull final ProcessingInstruction value) {
    return Js.cast( value );
  }

  @JsOverlay
  default boolean isElement() {
    return ( (Object) this ) instanceof Element;
  }

  @JsOverlay
  default Element asElement() {
    return Js.cast( this );
  }

  @JsOverlay
  default boolean isProcessingInstruction() {
    return ( (Object) this ) instanceof ProcessingInstruction;
  }

  @JsOverlay
  default ProcessingInstruction asProcessingInstruction() {
    return Js.cast( this );
  }
}
