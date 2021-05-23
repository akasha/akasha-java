package akasha;

import akasha.lang.JsArray;
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
    name = "ShareData"
)
public interface ShareData {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "files"
  )
  JsArray<File> files();

  @JsProperty
  void setFiles(@Nonnull JsArray<File> files);

  @JsOverlay
  default void setFiles(@Nonnull final File... files) {
    setFiles( Js.<JsArray<File>>uncheckedCast( files ) );
  }

  @JsProperty(
      name = "text"
  )
  String text();

  @JsProperty
  void setText(@Nonnull String text);

  @JsProperty(
      name = "title"
  )
  String title();

  @JsProperty
  void setTitle(@Nonnull String title);

  @JsProperty(
      name = "url"
  )
  String url();

  @JsProperty
  void setUrl(@Nonnull String url);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ShareData"
  )
  interface Builder extends ShareData {
    @JsOverlay
    @Nonnull
    default Builder files(@Nonnull final JsArray<File> files) {
      setFiles( files );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder files(@Nonnull final File... files) {
      setFiles( files );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder text(@Nonnull final String text) {
      setText( text );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder title(@Nonnull final String title) {
      setTitle( title );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder url(@Nonnull final String url) {
      setUrl( url );
      return this;
    }
  }
}
