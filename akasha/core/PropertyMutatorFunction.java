package akasha.core;

import javaemul.internal.annotations.DoNotAutobox;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import jsinterop.annotations.JsFunction;

@Generated("org.realityforge.webtack")
@JsFunction
@FunctionalInterface
public interface PropertyMutatorFunction {
  void onInvoke(@DoNotAutobox @Nullable Object value);
}
