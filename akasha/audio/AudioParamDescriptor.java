package akasha.audio;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * The AudioParamDescriptor dictionary of the Web Audio API specifies properties for AudioParam objects.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParamDescriptor">AudioParamDescriptor - MDN</a>
 */
@Generated("org.realityforge.webtack")
@JsType(
    isNative = true,
    namespace = JsPackage.GLOBAL,
    name = "AudioParamDescriptor"
)
public interface AudioParamDescriptor {
  @JsOverlay
  @Nonnull
  static Builder create(@Nonnull final String name) {
    return Js.<Builder>uncheckedCast( JsPropertyMap.of() ).name( name );
  }

  @JsProperty(
      name = "name"
  )
  @JsNonNull
  String name();

  @JsProperty
  void setName(@JsNonNull String name);

  @JsProperty(
      name = "automationRate"
  )
  @AutomationRate
  String automationRate();

  @JsProperty
  void setAutomationRate(@AutomationRate @JsNonNull String automationRate);

  @JsProperty(
      name = "defaultValue"
  )
  float defaultValue();

  @JsProperty
  void setDefaultValue(float defaultValue);

  @JsProperty(
      name = "maxValue"
  )
  float maxValue();

  @JsProperty
  void setMaxValue(float maxValue);

  @JsProperty(
      name = "minValue"
  )
  float minValue();

  @JsProperty
  void setMinValue(float minValue);

  /**
   * The AudioParamDescriptor dictionary of the Web Audio API specifies properties for AudioParam objects.
   *
   * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/AudioParamDescriptor">AudioParamDescriptor - MDN</a>
   */
  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AudioParamDescriptor"
  )
  interface Builder extends AudioParamDescriptor {
    @JsOverlay
    @Nonnull
    default Builder name(@Nonnull final String name) {
      setName( name );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder automationRate(@AutomationRate @Nonnull final String automationRate) {
      setAutomationRate( automationRate );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder defaultValue(final float defaultValue) {
      setDefaultValue( defaultValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder maxValue(final float maxValue) {
      setMaxValue( maxValue );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder minValue(final float minValue) {
      setMinValue( minValue );
      return this;
    }
  }
}
