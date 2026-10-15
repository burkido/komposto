@file:OptIn(ExperimentalKompostoApi::class)

package price

import androidx.compose.runtime.Composable
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Basket
import com.trendyol.design.core.icon.icons.fill.CampaignDownArrow
import com.trendyol.design.core.price.KPPrice
import com.trendyol.design.core.price.KPPriceStyle
import com.trendyol.design.ui.theme.TrendyolTheme
import com.trendyol.theme.KPDesign
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

@PreviewTest
@DesignScreenshotPreview
@Composable
fun singlePrice() = DesignScreenshot(
    testName = "singlePrice",
    contents = listOf(
        DesignScreenshotTestContainer("Single Price") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.SinglePrice(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun singlePriceWithBottomInfo() = DesignScreenshot(
    testName = "singlePriceWithBottomInfo",
    contents = listOf(
        DesignScreenshotTestContainer("Single Price With Bottom Info") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.SinglePriceWithBottomInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                        bottomInfoText = "(99.90 TL / Kapsül)",
                        bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun singlePriceWithUpperInfoBasketCampaign() = DesignScreenshot(
    testName = "singlePriceWithUpperInfoBasketCampaign",
    contents = listOf(
        DesignScreenshotTestContainer("Single Price With Upper Info-Basket Campaign") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.SinglePriceWithUpperInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                        upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                        upperInfoText = "9999 TL’ye 999 TL İndirim",
                        icon = KPIcons.Fill.Basket,
                        iconSize = KPIconSize.XXSmall,
                        iconTint = KPDesign.colors.colorPrimary
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun singlePriceWithUpperInfoLowestPriceCampaign() = DesignScreenshot(
    testName = "singlePriceWithUpperInfoLowestPriceCampaign",
    contents = listOf(
        DesignScreenshotTestContainer("Single Price With Upper Info-Lowest Price Campaign") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.SinglePriceWithUpperInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                        upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                        upperInfoText = "Son 30 Günün En Düşük Fiyatı",
                        icon = KPIcons.Fill.CampaignDownArrow,
                        iconSize = KPIconSize.XXSmall,
                        iconTint = KPDesign.colors.colorWarning
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun singlePriceWithUpperAndBottomInfoBasketCampaign() = DesignScreenshot(
    testName = "singlePriceWithUpperAndBottomInfoBasketCampaign",
    contents = listOf(
        DesignScreenshotTestContainer("Single Price With Upper And Bottom Info-Basket Campaign") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.SinglePriceWithUpperAndBottomInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                        upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                        upperInfoText = "9999 TL’ye 999 TL İndirim",
                        icon = KPIcons.Fill.Basket,
                        iconSize = KPIconSize.XXSmall,
                        iconTint = KPDesign.colors.colorPrimary,
                        bottomInfoText = "(99.90 TL / Kapsül)",
                        bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun singlePriceWithUpperAndBottomInfoLowestPriceCampaign() = DesignScreenshot(
    testName = "singlePriceWithUpperAndBottomInfoLowestPriceCampaign",
    contents = listOf(
        DesignScreenshotTestContainer("Single Price With Upper And Bottom Info-Lowest Price Campaign") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.SinglePriceWithUpperAndBottomInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                        upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                        upperInfoText = "9999 TL’ye 999 TL İndirim",
                        icon = KPIcons.Fill.CampaignDownArrow,
                        iconSize = KPIconSize.XXSmall,
                        iconTint = KPDesign.colors.colorWarning,
                        bottomInfoText = "(99.90 TL / Kapsül)",
                        bottomInfoTextStyle = KPDesign.typography.body2ColorWarning,
                    )
                )
            }
        },
    )
)
