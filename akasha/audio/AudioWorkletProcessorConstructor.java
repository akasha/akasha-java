package akasha.audio;

import akasha.core.JsObject;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsNonNull;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface AudioWorkletProcessorConstructor {
  @JsNonNull
  AudioWorkletProcessor onInvoke(@Nonnull JsObject options);
}
