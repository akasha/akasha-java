package akasha;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface IntersectionObserverCallback {
  void onInvoke(@Nonnull JsArray<IntersectionObserverEntry> entries,
      @Nonnull IntersectionObserver observer);
}
