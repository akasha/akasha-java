package akasha.gpu;

import java.lang.annotation.Documented;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.intellij.lang.annotations.MagicConstant;

@Generated("org.realityforge.webtack")
@Documented
@MagicConstant(
    valuesFromClass = GPUTextureFormat.class
)
public @interface GPUTextureFormat {
  @Nonnull
  String bc1_rgba_unorm = "bc1-rgba-unorm";

  @Nonnull
  String bc1_rgba_unorm_srgb = "bc1-rgba-unorm-srgb";

  @Nonnull
  String bc2_rgba_unorm = "bc2-rgba-unorm";

  @Nonnull
  String bc2_rgba_unorm_srgb = "bc2-rgba-unorm-srgb";

  @Nonnull
  String bc3_rgba_unorm = "bc3-rgba-unorm";

  @Nonnull
  String bc3_rgba_unorm_srgb = "bc3-rgba-unorm-srgb";

  @Nonnull
  String bc4_r_snorm = "bc4-r-snorm";

  @Nonnull
  String bc4_r_unorm = "bc4-r-unorm";

  @Nonnull
  String bc5_rg_snorm = "bc5-rg-snorm";

  @Nonnull
  String bc5_rg_unorm = "bc5-rg-unorm";

  @Nonnull
  String bc6h_rgb_float = "bc6h-rgb-float";

  @Nonnull
  String bc6h_rgb_ufloat = "bc6h-rgb-ufloat";

  @Nonnull
  String bc7_rgba_unorm = "bc7-rgba-unorm";

  @Nonnull
  String bc7_rgba_unorm_srgb = "bc7-rgba-unorm-srgb";

  @Nonnull
  String bgra8unorm = "bgra8unorm";

  @Nonnull
  String bgra8unorm_srgb = "bgra8unorm-srgb";

  @Nonnull
  String depth16unorm = "depth16unorm";

  @Nonnull
  String depth24plus = "depth24plus";

  @Nonnull
  String depth24plus_stencil8 = "depth24plus-stencil8";

  @Nonnull
  String depth24unorm_stencil8 = "depth24unorm-stencil8";

  @Nonnull
  String depth32float = "depth32float";

  @Nonnull
  String depth32float_stencil8 = "depth32float-stencil8";

  @Nonnull
  String r16float = "r16float";

  @Nonnull
  String r16sint = "r16sint";

  @Nonnull
  String r16uint = "r16uint";

  @Nonnull
  String r32float = "r32float";

  @Nonnull
  String r32sint = "r32sint";

  @Nonnull
  String r32uint = "r32uint";

  @Nonnull
  String r8sint = "r8sint";

  @Nonnull
  String r8snorm = "r8snorm";

  @Nonnull
  String r8uint = "r8uint";

  @Nonnull
  String r8unorm = "r8unorm";

  @Nonnull
  String rg11b10ufloat = "rg11b10ufloat";

  @Nonnull
  String rg16float = "rg16float";

  @Nonnull
  String rg16sint = "rg16sint";

  @Nonnull
  String rg16uint = "rg16uint";

  @Nonnull
  String rg32float = "rg32float";

  @Nonnull
  String rg32sint = "rg32sint";

  @Nonnull
  String rg32uint = "rg32uint";

  @Nonnull
  String rg8sint = "rg8sint";

  @Nonnull
  String rg8snorm = "rg8snorm";

  @Nonnull
  String rg8uint = "rg8uint";

  @Nonnull
  String rg8unorm = "rg8unorm";

  @Nonnull
  String rgb10a2unorm = "rgb10a2unorm";

  @Nonnull
  String rgb9e5ufloat = "rgb9e5ufloat";

  @Nonnull
  String rgba16float = "rgba16float";

  @Nonnull
  String rgba16sint = "rgba16sint";

  @Nonnull
  String rgba16uint = "rgba16uint";

  @Nonnull
  String rgba32float = "rgba32float";

  @Nonnull
  String rgba32sint = "rgba32sint";

  @Nonnull
  String rgba32uint = "rgba32uint";

  @Nonnull
  String rgba8sint = "rgba8sint";

  @Nonnull
  String rgba8snorm = "rgba8snorm";

  @Nonnull
  String rgba8uint = "rgba8uint";

  @Nonnull
  String rgba8unorm = "rgba8unorm";

  @Nonnull
  String rgba8unorm_srgb = "rgba8unorm-srgb";

  @Nonnull
  String stencil8 = "stencil8";

  final class Util {
    private Util() {
    }

    @GPUTextureFormat
    public static String requireValid(final String value) {
      assertValid( value );
      return value;
    }

    public static void assertValid(@Nonnull final String value) {
      assert isValid( value );
    }

    public static boolean isValid(@Nonnull final String value) {
      return GPUTextureFormat.bc1_rgba_unorm.equals( value ) || GPUTextureFormat.bc1_rgba_unorm_srgb.equals( value ) || GPUTextureFormat.bc2_rgba_unorm.equals( value ) || GPUTextureFormat.bc2_rgba_unorm_srgb.equals( value ) || GPUTextureFormat.bc3_rgba_unorm.equals( value ) || GPUTextureFormat.bc3_rgba_unorm_srgb.equals( value ) || GPUTextureFormat.bc4_r_snorm.equals( value ) || GPUTextureFormat.bc4_r_unorm.equals( value ) || GPUTextureFormat.bc5_rg_snorm.equals( value ) || GPUTextureFormat.bc5_rg_unorm.equals( value ) || GPUTextureFormat.bc6h_rgb_float.equals( value ) || GPUTextureFormat.bc6h_rgb_ufloat.equals( value ) || GPUTextureFormat.bc7_rgba_unorm.equals( value ) || GPUTextureFormat.bc7_rgba_unorm_srgb.equals( value ) || GPUTextureFormat.bgra8unorm.equals( value ) || GPUTextureFormat.bgra8unorm_srgb.equals( value ) || GPUTextureFormat.depth16unorm.equals( value ) || GPUTextureFormat.depth24plus.equals( value ) || GPUTextureFormat.depth24plus_stencil8.equals( value ) || GPUTextureFormat.depth24unorm_stencil8.equals( value ) || GPUTextureFormat.depth32float.equals( value ) || GPUTextureFormat.depth32float_stencil8.equals( value ) || GPUTextureFormat.r16float.equals( value ) || GPUTextureFormat.r16sint.equals( value ) || GPUTextureFormat.r16uint.equals( value ) || GPUTextureFormat.r32float.equals( value ) || GPUTextureFormat.r32sint.equals( value ) || GPUTextureFormat.r32uint.equals( value ) || GPUTextureFormat.r8sint.equals( value ) || GPUTextureFormat.r8snorm.equals( value ) || GPUTextureFormat.r8uint.equals( value ) || GPUTextureFormat.r8unorm.equals( value ) || GPUTextureFormat.rg11b10ufloat.equals( value ) || GPUTextureFormat.rg16float.equals( value ) || GPUTextureFormat.rg16sint.equals( value ) || GPUTextureFormat.rg16uint.equals( value ) || GPUTextureFormat.rg32float.equals( value ) || GPUTextureFormat.rg32sint.equals( value ) || GPUTextureFormat.rg32uint.equals( value ) || GPUTextureFormat.rg8sint.equals( value ) || GPUTextureFormat.rg8snorm.equals( value ) || GPUTextureFormat.rg8uint.equals( value ) || GPUTextureFormat.rg8unorm.equals( value ) || GPUTextureFormat.rgb10a2unorm.equals( value ) || GPUTextureFormat.rgb9e5ufloat.equals( value ) || GPUTextureFormat.rgba16float.equals( value ) || GPUTextureFormat.rgba16sint.equals( value ) || GPUTextureFormat.rgba16uint.equals( value ) || GPUTextureFormat.rgba32float.equals( value ) || GPUTextureFormat.rgba32sint.equals( value ) || GPUTextureFormat.rgba32uint.equals( value ) || GPUTextureFormat.rgba8sint.equals( value ) || GPUTextureFormat.rgba8snorm.equals( value ) || GPUTextureFormat.rgba8uint.equals( value ) || GPUTextureFormat.rgba8unorm.equals( value ) || GPUTextureFormat.rgba8unorm_srgb.equals( value ) || GPUTextureFormat.stencil8.equals( value );
    }
  }
}
