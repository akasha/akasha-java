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
    name = "FormDataEventInit"
)
public interface FormDataEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final FormData formData) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).formData( formData );
  }

  @JsProperty(
      name = "formData"
  )
  @Nonnull
  FormData formData();

  @JsProperty
  void setFormData(@Nonnull FormData formData);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "FormDataEventInit"
  )
  interface Builder extends FormDataEventInit {
    @JsOverlay
    @Nonnull
    default Builder formData(@Nonnull final FormData formData) {
      setFormData( formData );
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
