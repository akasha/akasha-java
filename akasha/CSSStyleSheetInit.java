package akasha;

import akasha.media.MediaListOrStringUnion;
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
    name = "CSSStyleSheetInit"
)
public interface CSSStyleSheetInit {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "baseURL"
  )
  String baseURL();

  @JsProperty
  void setBaseURL(@JsNonNull String baseURL);

  @JsProperty(
      name = "disabled"
  )
  boolean disabled();

  @JsProperty
  void setDisabled(boolean disabled);

  @JsProperty(
      name = "media"
  )
  MediaListOrStringUnion media();

  @JsProperty
  void setMedia(@JsNonNull MediaListOrStringUnion media);

  @JsOverlay
  default void setMedia(@Nonnull final MediaList media) {
    setMedia( MediaListOrStringUnion.of( media ) );
  }

  @JsOverlay
  default void setMedia(@Nonnull final String media) {
    setMedia( MediaListOrStringUnion.of( media ) );
  }

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "CSSStyleSheetInit"
  )
  interface Builder extends CSSStyleSheetInit {
    @JsOverlay
    @Nonnull
    default Builder baseURL(@Nonnull final String baseURL) {
      setBaseURL( baseURL );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder disabled(final boolean disabled) {
      setDisabled( disabled );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder media(@Nonnull final MediaListOrStringUnion media) {
      setMedia( media );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder media(@Nonnull final MediaList media) {
      setMedia( media );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder media(@Nonnull final String media) {
      setMedia( media );
      return this;
    }
  }
}
