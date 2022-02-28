package akasha.xr;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = XRHandJoint.class
)
public @interface XRHandJoint {
  @Nonnull
  String index_finger_metacarpal = "index-finger-metacarpal";

  @Nonnull
  String index_finger_phalanx_distal = "index-finger-phalanx-distal";

  @Nonnull
  String index_finger_phalanx_intermediate = "index-finger-phalanx-intermediate";

  @Nonnull
  String index_finger_phalanx_proximal = "index-finger-phalanx-proximal";

  @Nonnull
  String index_finger_tip = "index-finger-tip";

  @Nonnull
  String middle_finger_metacarpal = "middle-finger-metacarpal";

  @Nonnull
  String middle_finger_phalanx_distal = "middle-finger-phalanx-distal";

  @Nonnull
  String middle_finger_phalanx_intermediate = "middle-finger-phalanx-intermediate";

  @Nonnull
  String middle_finger_phalanx_proximal = "middle-finger-phalanx-proximal";

  @Nonnull
  String middle_finger_tip = "middle-finger-tip";

  @Nonnull
  String pinky_finger_metacarpal = "pinky-finger-metacarpal";

  @Nonnull
  String pinky_finger_phalanx_distal = "pinky-finger-phalanx-distal";

  @Nonnull
  String pinky_finger_phalanx_intermediate = "pinky-finger-phalanx-intermediate";

  @Nonnull
  String pinky_finger_phalanx_proximal = "pinky-finger-phalanx-proximal";

  @Nonnull
  String pinky_finger_tip = "pinky-finger-tip";

  @Nonnull
  String ring_finger_metacarpal = "ring-finger-metacarpal";

  @Nonnull
  String ring_finger_phalanx_distal = "ring-finger-phalanx-distal";

  @Nonnull
  String ring_finger_phalanx_intermediate = "ring-finger-phalanx-intermediate";

  @Nonnull
  String ring_finger_phalanx_proximal = "ring-finger-phalanx-proximal";

  @Nonnull
  String ring_finger_tip = "ring-finger-tip";

  @Nonnull
  String thumb_metacarpal = "thumb-metacarpal";

  @Nonnull
  String thumb_phalanx_distal = "thumb-phalanx-distal";

  @Nonnull
  String thumb_phalanx_proximal = "thumb-phalanx-proximal";

  @Nonnull
  String thumb_tip = "thumb-tip";

  @Nonnull
  String wrist = "wrist";

  final class Util {
    private Util() {
    }

    @XRHandJoint
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return XRHandJoint.index_finger_metacarpal.equals( value ) || XRHandJoint.index_finger_phalanx_distal.equals( value ) || XRHandJoint.index_finger_phalanx_intermediate.equals( value ) || XRHandJoint.index_finger_phalanx_proximal.equals( value ) || XRHandJoint.index_finger_tip.equals( value ) || XRHandJoint.middle_finger_metacarpal.equals( value ) || XRHandJoint.middle_finger_phalanx_distal.equals( value ) || XRHandJoint.middle_finger_phalanx_intermediate.equals( value ) || XRHandJoint.middle_finger_phalanx_proximal.equals( value ) || XRHandJoint.middle_finger_tip.equals( value ) || XRHandJoint.pinky_finger_metacarpal.equals( value ) || XRHandJoint.pinky_finger_phalanx_distal.equals( value ) || XRHandJoint.pinky_finger_phalanx_intermediate.equals( value ) || XRHandJoint.pinky_finger_phalanx_proximal.equals( value ) || XRHandJoint.pinky_finger_tip.equals( value ) || XRHandJoint.ring_finger_metacarpal.equals( value ) || XRHandJoint.ring_finger_phalanx_distal.equals( value ) || XRHandJoint.ring_finger_phalanx_intermediate.equals( value ) || XRHandJoint.ring_finger_phalanx_proximal.equals( value ) || XRHandJoint.ring_finger_tip.equals( value ) || XRHandJoint.thumb_metacarpal.equals( value ) || XRHandJoint.thumb_phalanx_distal.equals( value ) || XRHandJoint.thumb_phalanx_proximal.equals( value ) || XRHandJoint.thumb_tip.equals( value ) || XRHandJoint.wrist.equals( value );
    }
  }
}
