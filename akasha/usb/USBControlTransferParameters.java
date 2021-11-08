package akasha.usb;

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
    name = "USBControlTransferParameters"
)
public interface USBControlTransferParameters {
  @JsOverlay
  @Nonnull
  static Step1 requestType(@USBRequestType @Nonnull final String requestType) {
    final USBControlTransferParameters $usbControlTransferParameters = Js.<USBControlTransferParameters>uncheckedCast( JsPropertyMap.of() );
    $usbControlTransferParameters.setRequestType( requestType );
    return Js.uncheckedCast( $usbControlTransferParameters );
  }

  @JsProperty(
      name = "requestType"
  )
  @USBRequestType
  @JsNonNull
  String requestType();

  @JsProperty
  void setRequestType(@USBRequestType @JsNonNull String requestType);

  @JsProperty(
      name = "recipient"
  )
  @USBRecipient
  @JsNonNull
  String recipient();

  @JsProperty
  void setRecipient(@USBRecipient @JsNonNull String recipient);

  @JsProperty(
      name = "request"
  )
  short request();

  @JsProperty
  void setRequest(short request);

  @JsProperty(
      name = "value"
  )
  int value();

  @JsProperty
  void setValue(int value);

  @JsProperty(
      name = "index"
  )
  int index();

  @JsProperty
  void setIndex(int index);

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "USBControlTransferParameters"
  )
  interface Step1 {
    @JsOverlay
    @Nonnull
    default Step2 recipient(@USBRecipient @Nonnull String recipient) {
      Js.<USBControlTransferParameters>uncheckedCast( this ).setRecipient( recipient );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "USBControlTransferParameters"
  )
  interface Step2 {
    @JsOverlay
    @Nonnull
    default Step3 request(short request) {
      Js.<USBControlTransferParameters>uncheckedCast( this ).setRequest( request );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "USBControlTransferParameters"
  )
  interface Step3 {
    @JsOverlay
    @Nonnull
    default Step4 value(int value) {
      Js.<USBControlTransferParameters>uncheckedCast( this ).setValue( value );
      return Js.uncheckedCast( this );
    }
  }

  @JsType(
      isNative = true,
      namespace = JsPackage.GLOBAL,
      name = "USBControlTransferParameters"
  )
  interface Step4 {
    @JsOverlay
    @Nonnull
    default USBControlTransferParameters index(int index) {
      Js.<USBControlTransferParameters>uncheckedCast( this ).setIndex( index );
      return Js.uncheckedCast( this );
    }
  }
}
