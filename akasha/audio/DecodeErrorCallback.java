package akasha.audio;

import akasha.DOMException;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface DecodeErrorCallback {
  void onInvoke(@Nonnull DOMException error);
}