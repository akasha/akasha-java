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
    name = "FormDataEventInit"
)
public interface FormDataEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder formData(@Nonnull final FormData formData) {
    final Builder $formDataEventInit = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $formDataEventInit.setFormData( formData );
    return Js.uncheckedCast( $formDataEventInit );
  }

  @JsProperty(
      name = "formData"
  )
  @JsNonNull
  FormData formData();

  @JsProperty
  void setFormData(@JsNonNull FormData formData);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "FormDataEventInit"
  )
  interface Builder extends FormDataEventInit {
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
