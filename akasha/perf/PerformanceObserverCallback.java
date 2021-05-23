package akasha.perf;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOptional;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface PerformanceObserverCallback {
  void onInvoke(@Nonnull PerformanceObserverEntryList entries,
      @Nonnull PerformanceObserver observer,
      @Nonnull @JsOptional PerformanceObserverCallbackOptions options);
}
