@file:Suppress("FunctionName", "UNUSED")

package com.adamglin.composecontinuousroundedcornershape

import androidx.annotation.FloatRange
import androidx.annotation.IntRange
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

/**
 * A shape describing the rectangle with continuous rounded corners similar to the Apple system.
 *
 * This shape will not automatically mirror the corner sizes in [LayoutDirection.Rtl], use
 * [ContinuousRoundedCornerShape] for the layout direction aware version of this shape.
 *
 * @param topLeft a size of the top left corner
 * @param topRight a size of the top right corner
 * @param bottomRight a size of the bottom right corner
 * @param bottomLeft a size of the bottom left corner
 * @param smooth a value to apply a smooth transition to the corners for a more seamless rounded effect.
 *               When set to 0, the effect is the same as [AbsoluteRoundedCornerShape], with no smoothness applied.
 *               The maximum value is 1, which provides the maximum smoothness for the rounded corners.
 *               The default value is 00.6f, which is commonly used in iOS-like designs to achieve a smooth yet subtle effect.
 */
internal expect fun AbsoluteContinuousRoundedCornerShapeImpl(
    topLeft: CornerSize,
    topRight: CornerSize,
    bottomRight: CornerSize,
    bottomLeft: CornerSize,
    smooth: Float,
): CornerBasedShape

/**
 * Creates [AbsoluteContinuousRoundedCornerShape] with the same size applied for all four corners.
 *
 * @param corner [CornerSize] to apply.
 * @param smooth a value to apply a smooth transition to the corners for a more seamless rounded effect.
 *               When set to 0, the effect is the same as [AbsoluteRoundedCornerShape], with no smoothness applied.
 *               The maximum value is 1, which provides the maximum smoothness for the rounded corners.
 *               The default value is 00.6f, which is commonly used in iOS-like designs to achieve a smooth yet subtle effect.
 */
fun AbsoluteContinuousRoundedCornerShape(
    corner: CornerSize,
    @FloatRange(from = 0.1, to = 1.0) smooth: Float = 0.6f
) =
    AbsoluteContinuousRoundedCornerShapeImpl(corner, corner, corner, corner, smooth)

/**
 * Creates [AbsoluteContinuousRoundedCornerShape] with the same size applied for all four corners.
 *
 * @param size Size in [Dp] to apply.
 * @param smooth a value to apply a smooth transition to the corners for a more seamless rounded effect.
 *               When set to 0, the effect is the same as [AbsoluteRoundedCornerShape], with no smoothness applied.
 *               The maximum value is 1, which provides the maximum smoothness for the rounded corners.
 *               The default value is 00.6f, which is commonly used in iOS-like designs to achieve a smooth yet subtle effect.
 */
fun AbsoluteContinuousRoundedCornerShape(
    size: Dp, @FloatRange(from = 0.1, to = 1.0)
    smooth: Float = 0.6f
) =
    AbsoluteContinuousRoundedCornerShape(CornerSize(size), smooth)

/**
 * Creates [AbsoluteContinuousRoundedCornerShape] with the same size applied for all four corners.
 *
 * @param size Size in pixels to apply.
 * @param smooth a value to apply a smooth transition to the corners for a more seamless rounded effect.
 *               When set to 0, the effect is the same as [AbsoluteRoundedCornerShape], with no smoothness applied.
 *               The maximum value is 1, which provides the maximum smoothness for the rounded corners.
 *               The default value is 00.6f, which is commonly used in iOS-like designs to achieve a smooth yet subtle effect.
 */
fun AbsoluteContinuousRoundedCornerShape(
    size: Float, @FloatRange(from = 0.1, to = 1.0)
    smooth: Float = 0.6f
) =
    AbsoluteContinuousRoundedCornerShape(CornerSize(size), smooth)

/**
 * Creates [AbsoluteContinuousRoundedCornerShape] with the same size applied for all four corners.
 *
 * @param percent Size in percents to apply.
 * @param smooth a value to apply a smooth transition to the corners for a more seamless rounded effect.
 *               When set to 0, the effect is the same as [AbsoluteRoundedCornerShape], with no smoothness applied.
 *               The maximum value is 1, which provides the maximum smoothness for the rounded corners.
 *               The default value is 00.6f, which is commonly used in iOS-like designs to achieve a smooth yet subtle effect.
 */
fun AbsoluteContinuousRoundedCornerShape(
    percent: Int, @FloatRange(from = 0.1, to = 1.0)
    smooth: Float = 0.6f
) =
    AbsoluteContinuousRoundedCornerShape(CornerSize(percent), smooth)


/**
 * Creates [AbsoluteContinuousRoundedCornerShape] with sizes defined in [Dp].
 * @param smooth a value to apply a smooth transition to the corners for a more seamless rounded effect.
 *               When set to 0, the effect is the same as [AbsoluteRoundedCornerShape], with no smoothness applied.
 *               The maximum value is 1, which provides the maximum smoothness for the rounded corners.
 *               The default value is 00.6f, which is commonly used in iOS-like designs to achieve a smooth yet subtle effect.
 */
fun AbsoluteContinuousRoundedCornerShape(
    topLeft: Dp = 0.dp,
    topRight: Dp = 0.dp,
    bottomRight: Dp = 0.dp,
    bottomLeft: Dp = 0.dp,
    @FloatRange(from = 0.1, to = 1.0) smooth: Float = 0.6f
) =
    AbsoluteContinuousRoundedCornerShapeImpl(
        topLeft = CornerSize(topLeft),
        topRight = CornerSize(topRight),
        bottomRight = CornerSize(bottomRight),
        bottomLeft = CornerSize(bottomLeft),
        smooth = smooth,
    )


/**
 * Creates [RoundedCornerShape] with sizes defined in pixels.
 * @param smooth a value to apply a smooth transition to the corners for a more seamless rounded effect.
 *               When set to 0, the effect is the same as [AbsoluteRoundedCornerShape], with no smoothness applied.
 *               The maximum value is 1, which provides the maximum smoothness for the rounded corners.
 *               The default value is 00.6f, which is commonly used in iOS-like designs to achieve a smooth yet subtle effect.
 */
fun AbsoluteContinuousRoundedCornerShape(
    topLeft: Float = 0.0f,
    topRight: Float = 0.0f,
    bottomRight: Float = 0.0f,
    bottomLeft: Float = 0.0f,
    @FloatRange(from = 0.1, to = 1.0) smooth: Float = 0.6f
) =
    AbsoluteContinuousRoundedCornerShapeImpl(
        topLeft = CornerSize(topLeft),
        topRight = CornerSize(topRight),
        bottomRight = CornerSize(bottomRight),
        bottomLeft = CornerSize(bottomLeft),
        smooth = smooth
    )

/**
 * Creates [AbsoluteContinuousRoundedCornerShape] with sizes defined in percents of the shape's smaller side.
 *
 * @param topLeftPercent The top left corner radius as a percentage of the smaller side, with a
 *   range of 0 - 100.
 * @param topRightPercent The top right corner radius as a percentage of the smaller side, with a
 *   range of 0 - 100.
 * @param bottomRightPercent The bottom right corner radius as a percentage of the smaller side,
 *   with a range of 0 - 100.
 * @param bottomLeftPercent The bottom left corner radius as a percentage of the smaller side, with
 *   a range of 0 - 100.
 * @param smooth a value to apply a smooth transition to the corners for a more seamless rounded effect.
 *               When set to 0, the effect is the same as [AbsoluteRoundedCornerShape], with no smoothness applied.
 *               The maximum value is 1, which provides the maximum smoothness for the rounded corners.
 *               The default value is 00.6f, which is commonly used in iOS-like designs to achieve a smooth yet subtle effect.
 */
fun AbsoluteContinuousRoundedCornerShape(
    @IntRange(from = 0, to = 100) topLeftPercent: Int = 0,
    @IntRange(from = 0, to = 100) topRightPercent: Int = 0,
    @IntRange(from = 0, to = 100) bottomRightPercent: Int = 0,
    @IntRange(from = 0, to = 100) bottomLeftPercent: Int = 0,
    @FloatRange(from = 0.1, to = 1.0) smooth: Float = 0.6f
) =
    AbsoluteContinuousRoundedCornerShapeImpl(
        topLeft = CornerSize(topLeftPercent),
        topRight = CornerSize(topRightPercent),
        bottomRight = CornerSize(bottomRightPercent),
        bottomLeft = CornerSize(bottomLeftPercent),
        smooth = smooth
    )