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
    name = "ValidityStateFlags"
)
public interface ValidityStateFlags {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "badInput"
  )
  boolean badInput();

  @JsProperty
  void setBadInput(boolean badInput);

  @JsProperty(
      name = "customError"
  )
  boolean customError();

  @JsProperty
  void setCustomError(boolean customError);

  @JsProperty(
      name = "patternMismatch"
  )
  boolean patternMismatch();

  @JsProperty
  void setPatternMismatch(boolean patternMismatch);

  @JsProperty(
      name = "rangeOverflow"
  )
  boolean rangeOverflow();

  @JsProperty
  void setRangeOverflow(boolean rangeOverflow);

  @JsProperty(
      name = "rangeUnderflow"
  )
  boolean rangeUnderflow();

  @JsProperty
  void setRangeUnderflow(boolean rangeUnderflow);

  @JsProperty(
      name = "stepMismatch"
  )
  boolean stepMismatch();

  @JsProperty
  void setStepMismatch(boolean stepMismatch);

  @JsProperty(
      name = "tooLong"
  )
  boolean tooLong();

  @JsProperty
  void setTooLong(boolean tooLong);

  @JsProperty(
      name = "tooShort"
  )
  boolean tooShort();

  @JsProperty
  void setTooShort(boolean tooShort);

  @JsProperty(
      name = "typeMismatch"
  )
  boolean typeMismatch();

  @JsProperty
  void setTypeMismatch(boolean typeMismatch);

  @JsProperty(
      name = "valueMissing"
  )
  boolean valueMissing();

  @JsProperty
  void setValueMissing(boolean valueMissing);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "ValidityStateFlags"
  )
  interface Builder extends ValidityStateFlags {
    @JsOverlay
    @Nonnull
    default Builder badInput(final boolean badInput) {
      setBadInput( badInput );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder customError(final boolean customError) {
      setCustomError( customError );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder patternMismatch(final boolean patternMismatch) {
      setPatternMismatch( patternMismatch );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rangeOverflow(final boolean rangeOverflow) {
      setRangeOverflow( rangeOverflow );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder rangeUnderflow(final boolean rangeUnderflow) {
      setRangeUnderflow( rangeUnderflow );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder stepMismatch(final boolean stepMismatch) {
      setStepMismatch( stepMismatch );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder tooLong(final boolean tooLong) {
      setTooLong( tooLong );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder tooShort(final boolean tooShort) {
      setTooShort( tooShort );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder typeMismatch(final boolean typeMismatch) {
      setTypeMismatch( typeMismatch );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder valueMissing(final boolean valueMissing) {
      setValueMissing( valueMissing );
      return this;
    }
  }
}
