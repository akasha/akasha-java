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
  static Builder create(@Nonnull final Node endContainer, final int endOffset,
      @Nonnull final Node startContainer, final int startOffset) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).endContainer( endContainer ).endOffset( endOffset ).startContainer( startContainer ).startOffset( startOffset );
  }

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

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "StaticRangeInit"
  )
  interface Builder extends StaticRangeInit {
    @JsOverlay
    @Nonnull
    default Builder endContainer(@Nonnull final Node endContainer) {
      setEndContainer( endContainer );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder endOffset(final int endOffset) {
      setEndOffset( endOffset );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder startContainer(@Nonnull final Node startContainer) {
      setStartContainer( startContainer );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder startOffset(final int startOffset) {
      setStartOffset( startOffset );
      return this;
    }
  }
}
