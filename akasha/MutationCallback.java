package akasha;

import akasha.lang.JsArray;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface MutationCallback {
  void onInvoke(@Nonnull JsArray<MutationRecord> mutations, @Nonnull MutationObserver observer);
}
