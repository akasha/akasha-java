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
    name = "Object"
)
public interface CacheQueryOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "ignoreMethod"
  )
  boolean ignoreMethod();

  @JsProperty
  void setIgnoreMethod(boolean ignoreMethod);

  @JsProperty(
      name = "ignoreSearch"
  )
  boolean ignoreSearch();

  @JsProperty
  void setIgnoreSearch(boolean ignoreSearch);

  @JsProperty(
      name = "ignoreVary"
  )
  boolean ignoreVary();

  @JsProperty
  void setIgnoreVary(boolean ignoreVary);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends CacheQueryOptions {
    @JsOverlay
    @Nonnull
    default Builder ignoreMethod(final boolean ignoreMethod) {
      setIgnoreMethod( ignoreMethod );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ignoreSearch(final boolean ignoreSearch) {
      setIgnoreSearch( ignoreSearch );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder ignoreVary(final boolean ignoreVary) {
      setIgnoreVary( ignoreVary );
      return this;
    }
  }
}
