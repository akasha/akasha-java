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
    name = "ProgressEventInit"
)
public interface ProgressEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "lengthComputable"
  )
  boolean lengthComputable();

  @JsProperty
  void setLengthComputable(boolean lengthComputable);

  @JsProperty(
      name = "loaded"
  )
  int loaded();

  @JsProperty
  void setLoaded(int loaded);

  @JsProperty(
      name = "total"
  )
  int total();

  @JsProperty
  void setTotal(int total);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ProgressEventInit"
  )
  interface Builder extends ProgressEventInit {
    @JsOverlay
    @Nonnull
    default Builder lengthComputable(final boolean lengthComputable) {
      setLengthComputable( lengthComputable );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder loaded(final int loaded) {
      setLoaded( loaded );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder total(final int total) {
      setTotal( total );
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
