package akasha.clipboard;

import akasha.DataTransfer;
import akasha.EventInit;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import jsinterop.annotations.JsNullable;
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
    name = "ClipboardEventInit"
)
public interface ClipboardEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "clipboardData"
  )
  @JsNullable
  DataTransfer clipboardData();

  @JsProperty
  void setClipboardData(@JsNullable DataTransfer clipboardData);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ClipboardEventInit"
  )
  interface Builder extends ClipboardEventInit {
    @JsOverlay
    @Nonnull
    default Builder clipboardData(@Nullable final DataTransfer clipboardData) {
      setClipboardData( clipboardData );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder bubbles(final boolean bubbles) {
      setBubbles( bubbles );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder cancelable(final boolean cancelable) {
      setCancelable( cancelable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder composed(final boolean composed) {
      setComposed( composed );
      return this;
    }
  }
}
