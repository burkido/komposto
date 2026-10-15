package icon

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.ArrowDown
import com.trendyol.design.core.icon.icons.fill.Basket
import com.trendyol.design.core.icon.icons.fill.Bullet
import com.trendyol.design.core.icon.icons.fill.Campaign
import com.trendyol.design.core.icon.icons.fill.CampaignDownArrow
import com.trendyol.design.core.icon.icons.fill.Cancel
import com.trendyol.design.core.icon.icons.fill.Cargo
import com.trendyol.design.core.icon.icons.fill.CircleIcon
import com.trendyol.design.core.icon.icons.fill.Colon
import com.trendyol.design.core.icon.icons.fill.Coupon
import com.trendyol.design.core.icon.icons.fill.Credit
import com.trendyol.design.core.icon.icons.fill.Delivery
import com.trendyol.design.core.icon.icons.fill.FavoriteSelected
import com.trendyol.design.core.icon.icons.fill.FenomenGradient
import com.trendyol.design.core.icon.icons.fill.Help
import com.trendyol.design.core.icon.icons.fill.InfoIcon
import com.trendyol.design.core.icon.icons.fill.PauseButton
import com.trendyol.design.core.icon.icons.fill.Percentage
import com.trendyol.design.core.icon.icons.fill.PlayButton
import com.trendyol.design.core.icon.icons.fill.PlayGradient
import com.trendyol.design.core.icon.icons.fill.RunningOut
import com.trendyol.design.core.icon.icons.fill.SaveSelected
import com.trendyol.design.core.icon.icons.fill.Search
import com.trendyol.design.core.icon.icons.fill.Share
import com.trendyol.design.core.icon.icons.fill.Star
import com.trendyol.design.core.icon.icons.fill.StateOrder
import com.trendyol.design.core.icon.icons.fill.StatePin
import com.trendyol.design.core.icon.icons.fill.StateRefresh
import com.trendyol.design.core.icon.icons.fill.StateWarningInfoDefault
import com.trendyol.design.core.icon.icons.fill.Tick
import com.trendyol.design.core.icon.icons.fill.Trash
import com.trendyol.design.core.icon.icons.outline.*
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

class NamedIcon(val name: String, val icon: ImageVector) {
    override fun toString(): String = name
}

class AllIconsProvider : PreviewParameterProvider<NamedIcon> {
    override val values: Sequence<NamedIcon> = sequenceOf(
        NamedIcon("ArrowDown", KPIcons.Fill.ArrowDown),
        NamedIcon("Basket", KPIcons.Fill.Basket),
        NamedIcon("Bullet", KPIcons.Fill.Bullet),
        NamedIcon("Campaign", KPIcons.Fill.Campaign),
        NamedIcon("CampaignDownArrow", KPIcons.Fill.CampaignDownArrow),
        NamedIcon("Cancel", KPIcons.Fill.Cancel),
        NamedIcon("Cargo", KPIcons.Fill.Cargo),
        NamedIcon("CircleIcon", KPIcons.Fill.CircleIcon),
        NamedIcon("Colon", KPIcons.Fill.Colon),
        NamedIcon("Coupon", KPIcons.Fill.Coupon),
        NamedIcon("Credit", KPIcons.Fill.Credit),
        NamedIcon("Delivery", KPIcons.Fill.Delivery),
        NamedIcon("FavoriteSelected", KPIcons.Fill.FavoriteSelected),
        NamedIcon("FenomenGradient", KPIcons.Fill.FenomenGradient),
        NamedIcon("Help", KPIcons.Fill.Help),
        NamedIcon("InfoIcon", KPIcons.Fill.InfoIcon),
        NamedIcon("PauseButton", KPIcons.Fill.PauseButton),
        NamedIcon("Percentage", KPIcons.Fill.Percentage),
        NamedIcon("PlayButton", KPIcons.Fill.PlayButton),
        NamedIcon("PlayGradient", KPIcons.Fill.PlayGradient),
        NamedIcon("RunningOut", KPIcons.Fill.RunningOut),
        NamedIcon("SaveSelected", KPIcons.Fill.SaveSelected),
        NamedIcon("Search", KPIcons.Fill.Search),
        NamedIcon("Share", KPIcons.Fill.Share),
        NamedIcon("Star", KPIcons.Fill.Star),
        NamedIcon("StateOrder", KPIcons.Fill.StateOrder),
        NamedIcon("StatePin", KPIcons.Fill.StatePin),
        NamedIcon("StateRefresh", KPIcons.Fill.StateRefresh),
        NamedIcon("Tick", KPIcons.Fill.Tick),
        NamedIcon("Trash", KPIcons.Fill.Trash),
        NamedIcon("WarningInfoStateDefaultIcon", KPIcons.Fill.StateWarningInfoDefault),
        NamedIcon("Back", KPIcons.Outline.Back),
        NamedIcon("Cancel", KPIcons.Outline.Cancel),
        NamedIcon("Chevron", KPIcons.Outline.Chevron),
        NamedIcon("ErrorState", KPIcons.Outline.ErrorState),
        NamedIcon("FavoriteUnselected", KPIcons.Outline.FavoriteUnselected),
        NamedIcon("Info", KPIcons.Outline.Info),
        NamedIcon("SaveUnselected", KPIcons.Outline.SaveUnselected),
        NamedIcon("StateCaution", KPIcons.Outline.StateCaution),
        NamedIcon("SuccessState", KPIcons.Outline.SuccessState),
        NamedIcon("Union", KPIcons.Outline.Union),
    )
}

@PreviewTest
@DesignScreenshotPreview
@Composable
fun iconTest(@PreviewParameter(AllIconsProvider::class) icon: NamedIcon) = DesignScreenshot(
    testName = "${icon.name} Icon Tests",
    contents = iconContainers(icon.icon, Color.Unspecified),
)

private fun iconContainers(icon: ImageVector, tint: Color): List<DesignScreenshotTestContainer> {
    return listOf(
        DesignScreenshotTestContainer("XXSmall") {
            BoxWithHorizontalPadding {
                KPIcon(imageVector = icon, size = KPIconSize.XXSmall, tint = tint)
            }
        },
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                KPIcon(imageVector = icon, size = KPIconSize.XSmall, tint = tint)
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                KPIcon(imageVector = icon, size = KPIconSize.Small, tint = tint)
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                KPIcon(imageVector = icon, size = KPIconSize.Medium, tint = tint)
            }
        },
        DesignScreenshotTestContainer("Large") {
            BoxWithHorizontalPadding {
                KPIcon(imageVector = icon, size = KPIconSize.Large, tint = tint)
            }
        },
        DesignScreenshotTestContainer("XLarge") {
            BoxWithHorizontalPadding {
                KPIcon(imageVector = icon, size = KPIconSize.XLarge, tint = tint)
            }
        },
        DesignScreenshotTestContainer("XXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(imageVector = icon, size = KPIconSize.XXLarge, tint = tint)
            }
        },
        DesignScreenshotTestContainer("XXXLarge") {
            BoxWithHorizontalPadding {
                KPIcon(imageVector = icon, size = KPIconSize.XXXLarge, tint = tint)
            }
        }
    )
}
