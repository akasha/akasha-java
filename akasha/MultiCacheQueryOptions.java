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
    name = "MultiCacheQueryOptions"
)
public interface MultiCacheQueryOptions extends CacheQueryOptions {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "cacheName"
  )
  String cacheName();

  @JsProperty
  void setCacheName(@JsNonNull String cacheName);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "MultiCacheQueryOptions"
  )
  interface Builder extends MultiCacheQueryOptions {
    @JsOverlay
    @Nonnull
    default Builder cacheName(@Nonnull final String cacheName) {
      setCacheName( cacheName );
      return this;
    }

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
