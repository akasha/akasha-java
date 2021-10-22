package akasha;

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
    name = "AnimationPlaybackEventInit"
)
public interface AnimationPlaybackEventInit extends EventInit {
  @JsOverlay
  @Nonnull
  static Builder of() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "currentTime"
  )
  @JsNullable
  Double currentTime();

  @JsProperty
  void setCurrentTime(@JsNullable Double currentTime);

  @JsProperty(
      name = "timelineTime"
  )
  @JsNullable
  Double timelineTime();

  @JsProperty
  void setTimelineTime(@JsNullable Double timelineTime);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "AnimationPlaybackEventInit"
  )
  interface Builder extends AnimationPlaybackEventInit {
    @JsOverlay
    @Nonnull
    default Builder currentTime(@Nullable final Double currentTime) {
      setCurrentTime( currentTime );
      return this;
    }

    @JsOverlay
    @Nonnull
    default Builder timelineTime(@Nullable final Double timelineTime) {
      setTimelineTime( timelineTime );
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
