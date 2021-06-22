package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUVertexFormat.class
)
public @interface GPUVertexFormat {
  @Nonnull
  String float16x2 = "float16x2";

  @Nonnull
  String float16x4 = "float16x4";

  @Nonnull
  String float32 = "float32";

  @Nonnull
  String float32x2 = "float32x2";

  @Nonnull
  String float32x3 = "float32x3";

  @Nonnull
  String float32x4 = "float32x4";

  @Nonnull
  String sint16x2 = "sint16x2";

  @Nonnull
  String sint16x4 = "sint16x4";

  @Nonnull
  String sint32 = "sint32";

  @Nonnull
  String sint32x2 = "sint32x2";

  @Nonnull
  String sint32x3 = "sint32x3";

  @Nonnull
  String sint32x4 = "sint32x4";

  @Nonnull
  String sint8x2 = "sint8x2";

  @Nonnull
  String sint8x4 = "sint8x4";

  @Nonnull
  String snorm16x2 = "snorm16x2";

  @Nonnull
  String snorm16x4 = "snorm16x4";

  @Nonnull
  String snorm8x2 = "snorm8x2";

  @Nonnull
  String snorm8x4 = "snorm8x4";

  @Nonnull
  String uint16x2 = "uint16x2";

  @Nonnull
  String uint16x4 = "uint16x4";

  @Nonnull
  String uint32 = "uint32";

  @Nonnull
  String uint32x2 = "uint32x2";

  @Nonnull
  String uint32x3 = "uint32x3";

  @Nonnull
  String uint32x4 = "uint32x4";

  @Nonnull
  String uint8x2 = "uint8x2";

  @Nonnull
  String uint8x4 = "uint8x4";

  @Nonnull
  String unorm16x2 = "unorm16x2";

  @Nonnull
  String unorm16x4 = "unorm16x4";

  @Nonnull
  String unorm8x2 = "unorm8x2";

  @Nonnull
  String unorm8x4 = "unorm8x4";

  final class Util {
    private Util() {
    }

    @GPUVertexFormat
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUVertexFormat.float16x2.equals( value ) || GPUVertexFormat.float16x4.equals( value ) || GPUVertexFormat.float32.equals( value ) || GPUVertexFormat.float32x2.equals( value ) || GPUVertexFormat.float32x3.equals( value ) || GPUVertexFormat.float32x4.equals( value ) || GPUVertexFormat.sint16x2.equals( value ) || GPUVertexFormat.sint16x4.equals( value ) || GPUVertexFormat.sint32.equals( value ) || GPUVertexFormat.sint32x2.equals( value ) || GPUVertexFormat.sint32x3.equals( value ) || GPUVertexFormat.sint32x4.equals( value ) || GPUVertexFormat.sint8x2.equals( value ) || GPUVertexFormat.sint8x4.equals( value ) || GPUVertexFormat.snorm16x2.equals( value ) || GPUVertexFormat.snorm16x4.equals( value ) || GPUVertexFormat.snorm8x2.equals( value ) || GPUVertexFormat.snorm8x4.equals( value ) || GPUVertexFormat.uint16x2.equals( value ) || GPUVertexFormat.uint16x4.equals( value ) || GPUVertexFormat.uint32.equals( value ) || GPUVertexFormat.uint32x2.equals( value ) || GPUVertexFormat.uint32x3.equals( value ) || GPUVertexFormat.uint32x4.equals( value ) || GPUVertexFormat.uint8x2.equals( value ) || GPUVertexFormat.uint8x4.equals( value ) || GPUVertexFormat.unorm16x2.equals( value ) || GPUVertexFormat.unorm16x4.equals( value ) || GPUVertexFormat.unorm8x2.equals( value ) || GPUVertexFormat.unorm8x4.equals( value );
    }
  }
}
