package akasha.idb;

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
    name = "Object"
)
public interface IDBTransactionOptions {
  @JsOverlay
  @Nonnull
  static Builder create() {
    return Js.uncheckedCast( JsPropertyMap.of() );
  }

  @JsProperty(
      name = "durability"
  )
  @IDBTransactionDurability
  String durability();

  @JsProperty
  void setDurability(@IDBTransactionDurability @Nonnull String durability);

  @Generated("org.realityforge.webtack")
  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "Object"
  )
  interface Builder extends IDBTransactionOptions {
    @JsOverlay
    @Nonnull
    default Builder durability(@IDBTransactionDurability @Nonnull final String durability) {
      setDurability( durability );
      return this;
    }
  }
}
