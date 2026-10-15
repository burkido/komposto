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
fun verticalDualPrice() = DesignScreenshot(
    testName = "verticalDualPrice",
    contents = listOf(
        DesignScreenshotTestContainer("Vertical Dual Price") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.DualPrice(
                        salePriceText = "999999.90 TL",
                        marketPriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                        marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                        isPriceViewVertical = true
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun horizontalDualPrice() = DesignScreenshot(
    testName = "horizontalDualPrice",
    contents = listOf(
        DesignScreenshotTestContainer("Horizontal Dual Price") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.DualPrice(
                        salePriceText = "999999.90 TL",
                        marketPriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                        marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                        isPriceViewVertical = false
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun verticalDualPriceWithBottomInfo() = DesignScreenshot(
    testName = "verticalDualPriceWithBottomInfo",
    contents = listOf(
        DesignScreenshotTestContainer("Vertical Dual Price With Bottom Info") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.DualPriceWithBottomInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                        bottomInfoText = "(99.90 TL / Kapsül)",
                        bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
                        marketPriceText = "999999.90 TL",
                        marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                        isPriceViewVertical = true
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun horizontalDualPriceWithBottomInfo() = DesignScreenshot(
    testName = "horizontalDualPriceWithBottomInfo",
    contents = listOf(
        DesignScreenshotTestContainer("Horizontal Dual Price With Bottom Info") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.DualPriceWithBottomInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                        bottomInfoText = "(99.90 TL / Kapsül)",
                        bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
                        marketPriceText = "999999.90 TL",
                        marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                        isPriceViewVertical = false
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun verticalDualPriceWithUpperInfoBasket() = DesignScreenshot(
    testName = "verticalDualPriceWithUpperInfoBasket",
    contents = listOf(
        DesignScreenshotTestContainer("Vertical Dual Price With Upper Info-Basket Campaign") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.DualPriceWithUpperInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                        upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                        upperInfoText = "9999 TL’ye 999 TL İndirim",
                        icon = KPIcons.Fill.Basket,
                        iconSize = KPIconSize.XXSmall,
                        iconTint = KPDesign.colors.colorPrimary,
                        marketPriceText = "999999.90 TL",
                        marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                        isPriceViewVertical = true
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun horizontalDualPriceWithUpperInfoBasket() = DesignScreenshot(
    testName = "horizontalDualPriceWithUpperInfoBasket",
    contents = listOf(
        DesignScreenshotTestContainer("Horizontal Dual Price With Upper Info-Basket Campaign") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.DualPriceWithUpperInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                        upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                        upperInfoText = "9999 TL’ye 999 TL İndirim",
                        icon = KPIcons.Fill.Basket,
                        iconSize = KPIconSize.XXSmall,
                        iconTint = KPDesign.colors.colorPrimary,
                        marketPriceText = "999999.90 TL",
                        marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                        isPriceViewVertical = false
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun verticalDualPriceWithUpperInfoLowestPriceCampaign() = DesignScreenshot(
    testName = "verticalDualPriceWithUpperInfoLowestPriceCampaign",
    contents = listOf(
        DesignScreenshotTestContainer("Vertical Dual Price With Upper Info-Lowest Price Campaign") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.DualPriceWithUpperInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                        upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                        upperInfoText = "Son 30 Günün En Düşük Fiyatı",
                        icon = KPIcons.Fill.CampaignDownArrow,
                        iconSize = KPIconSize.XXSmall,
                        iconTint = KPDesign.colors.colorWarning,
                        marketPriceText = "999999.90 TL",
                        marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                        isPriceViewVertical = true
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun horizontalDualPriceWithUpperInfoLowestPriceCampaign() = DesignScreenshot(
    testName = "horizontalDualPriceWithUpperInfoLowestPriceCampaign",
    contents = listOf(
        DesignScreenshotTestContainer("Horizontal Dual Price With Upper Info-Lowest Price Campaign") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.DualPriceWithUpperInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                        upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                        upperInfoText = "Son 30 Günün En Düşük Fiyatı",
                        icon = KPIcons.Fill.CampaignDownArrow,
                        iconSize = KPIconSize.XXSmall,
                        iconTint = KPDesign.colors.colorWarning,
                        marketPriceText = "999999.90 TL",
                        marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                        isPriceViewVertical = false
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun verticalDualPriceWithUpperAndBottomInfoBasketCampaign() = DesignScreenshot(
    testName = "verticalDualPriceWithUpperAndBottomInfoBasketCampaign",
    contents = listOf(
        DesignScreenshotTestContainer("Vertical Dual Price With Upper And Bottom Info-Basket Campaign") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.DualPriceWithUpperAndBottomInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                        upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                        upperInfoText = "9999 TL’ye 999 TL İndirim",
                        icon = KPIcons.Fill.Basket,
                        iconSize = KPIconSize.XXSmall,
                        iconTint = KPDesign.colors.colorPrimary,
                        bottomInfoText = "(99.90 TL / Kapsül)",
                        bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
                        marketPriceText = "999999.90 TL",
                        marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                        isPriceViewVertical = true
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun horizontalDualPriceWithUpperAndBottomInfoBasketCampaign() = DesignScreenshot(
    testName = "horizontalDualPriceWithUpperAndBottomInfoBasketCampaign",
    contents = listOf(
        DesignScreenshotTestContainer("Horizontal Dual Price With Upper And Bottom Info-Basket Campaign") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.DualPriceWithUpperAndBottomInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorPrimary,
                        upperInfoTextStyle = KPDesign.typography.body2MediumColorPrimary,
                        upperInfoText = "9999 TL’ye 999 TL İndirim",
                        icon = KPIcons.Fill.Basket,
                        iconSize = KPIconSize.XXSmall,
                        iconTint = KPDesign.colors.colorPrimary,
                        bottomInfoText = "(99.90 TL / Kapsül)",
                        bottomInfoTextStyle = KPDesign.typography.body2ColorPrimary,
                        marketPriceText = "999999.90 TL",
                        marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                        isPriceViewVertical = false
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun verticalDualPriceWithUpperAndBottomInfoLowestPriceCampaign() = DesignScreenshot(
    testName = "verticalDualPriceWithUpperAndBottomInfoLowestPriceCampaign",
    contents = listOf(
        DesignScreenshotTestContainer("Vertical Dual Price With Upper And Bottom Info-Lowest Price Campaign") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.DualPriceWithUpperAndBottomInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                        upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                        upperInfoText = "9999 TL’ye 999 TL İndirim",
                        iconSize = KPIconSize.XXSmall,
                        iconTint = KPDesign.colors.colorWarning,
                        icon = KPIcons.Fill.CampaignDownArrow,
                        bottomInfoText = "(99.90 TL / Kapsül)",
                        bottomInfoTextStyle = KPDesign.typography.body2ColorWarning,
                        marketPriceText = "999999.90 TL",
                        marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                        isPriceViewVertical = true
                    )
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun horizontalDualPriceWithUpperAndBottomInfoLowestPriceCampaign() = DesignScreenshot(
    testName = "horizontalDualPriceWithUpperAndBottomInfoLowestPriceCampaign",
    contents = listOf(
        DesignScreenshotTestContainer("Horizontal Dual Price With Upper And Bottom Info-Lowest Price Campaign") {
            TrendyolTheme {
                KPPrice(
                    style = KPPriceStyle.DualPriceWithUpperAndBottomInfo(
                        salePriceText = "999999.90 TL",
                        salePriceTextStyle = KPDesign.typography.subtitleMediumColorWarning,
                        upperInfoTextStyle = KPDesign.typography.body2MediumColorWarning,
                        upperInfoText = "9999 TL’ye 999 TL İndirim",
                        iconSize = KPIconSize.XXSmall,
                        iconTint = KPDesign.colors.colorWarning,
                        icon = KPIcons.Fill.CampaignDownArrow,
                        bottomInfoText = "(99.90 TL / Kapsül)",
                        bottomInfoTextStyle = KPDesign.typography.body2ColorWarning,
                        marketPriceText = "999999.90 TL",
                        marketPriceTextStyle = KPDesign.typography.subtitleColorOnSurfaceVariant1,
                        isPriceViewVertical = false
                    )
                )
            }
        },
    )
)
