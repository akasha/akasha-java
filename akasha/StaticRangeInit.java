package akasha;

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
    name = "StaticRangeInit"
)
public interface StaticRangeInit {
  @JsOverlay
  @Nonnull
  static Step1 startContainer(@Nonnull final Node startContainer) {
    final StaticRangeInit $staticRangeInit = Js.<StaticRangeInit>uncheckedCast( JsPropertyMap.of() );
    $staticRangeInit.setStartContainer( startContainer );
    return Js.uncheckedCast( $staticRangeInit );
  }

  @JsProperty(
      name = "startContainer"
  )
  @JsNonNull
  Node startContainer();

  @JsProperty
  void setStartContainer(@JsNonNull Node startContainer);

  @JsProperty(
      name = "startOffset"
  )
  int startOffset();

  @JsProperty
  void setStartOffset(int startOffset);

  @JsProperty(
      name = "endContainer"
  )
  @JsNonNull
  Node endContainer();

  @JsProperty
  void setEndContainer(@JsNonNull Node endContainer);

  @JsProperty(
      name = "endOffset"
  )
  int endOffset();

  @JsProperty
  void setEndOffset(int endOffset);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "StaticRangeInit"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 startOffset(int startOffset) {
      Js.<StaticRangeInit>uncheckedCast( this ).setStartOffset( startOffset );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "StaticRangeInit"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 endContainer(@Nonnull Node endContainer) {
      Js.<StaticRangeInit>uncheckedCast( this ).setEndContainer( endContainer );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "StaticRangeInit"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default StaticRangeInit endOffset(int endOffset) {
      Js.<StaticRangeInit>uncheckedCast( this ).setEndOffset( endOffset );
      return Js.uncheckedCast( this );
    }
  }
}
