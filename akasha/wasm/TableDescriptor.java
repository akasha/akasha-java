package akasha.wasm;

import javax.annotation.Generated;
import javax.annotation.Nonnull;
import jsinterop.annotations.JsNonNull;
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
    name = "TableDescriptor"
)
public interface TableDescriptor {
  @JsOverlay
  @Nonnull
  static Step1 element(@TableKind @Nonnull final String element) {
    final Builder $tableDescriptor = Js.<Builder>uncheckedCast( JsPropertyMap.of() );
    $tableDescriptor.setElement( element );
    return Js.uncheckedCast( $tableDescriptor );
  }

  @JsProperty(
      name = "element"
  )
  @TableKind
  @JsNonNull
  String element();

  @JsProperty
  void setElement(@TableKind @JsNonNull String element);

  @JsProperty(
      name = "initial"
  )
  int initial();

  @JsProperty
  void setInitial(int initial);

  @JsProperty(
      name = "maximum"
  )
  int maximum();

  @JsProperty
  void setMaximum(int maximum);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "TableDescriptor"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Builder initial(int initial) {
      Js.<TableDescriptor>uncheckedCast( this ).setInitial( initial );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "TableDescriptor"
  )
  interface Builder extends TableDescriptor {
    @JsOverlay
    @Nonnull
    default Builder maximum(final int maximum) {
      setMaximum( maximum );
      return this;
    }
  }
}
