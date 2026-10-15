package boxbadge

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.badge.boxbadge.BoxBadge
import com.trendyol.design.core.badge.boxbadge.KPBoxBadge
import com.trendyol.design.core.badge.boxbadge.KPBoxBadgeType
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

class NamedBadge(val name: String, val badge: BoxBadge) {
    override fun toString(): String = name
}

class SingleBadgesProvider : PreviewParameterProvider<NamedBadge> {
    override val values: Sequence<NamedBadge> = sequenceOf(
        NamedBadge("Coupon", KPBoxBadgeType.Defaults.Coupon()),
        NamedBadge("FreeDelivery", KPBoxBadgeType.Defaults.FreeDelivery()),
        NamedBadge("FastDelivery", KPBoxBadgeType.Defaults.FastDelivery()),
        NamedBadge("BuyMorePayLess", KPBoxBadgeType.Defaults.BuyMorePayLess()),
        NamedBadge("BuyTogether", KPBoxBadgeType.Defaults.BuyTogether()),
        NamedBadge("Video", KPBoxBadgeType.Defaults.Video()),
        NamedBadge("TodayDelivery", KPBoxBadgeType.Defaults.TodayDelivery()),
        NamedBadge("Credit", KPBoxBadgeType.Defaults.Credit()),
        NamedBadge("InfluencerChoice", KPBoxBadgeType.Defaults.InfluencerChoice()),
    )
}

@OptIn(ExperimentalKompostoApi::class)
@PreviewTest
@DesignScreenshotPreview
@Composable
fun badgeTest(@PreviewParameter(SingleBadgesProvider::class) badge: NamedBadge) = DesignScreenshot(
    testName = "${badge.name}BadgeTest",
    contents = listOf(
        DesignScreenshotTestContainer(badge.name) {
            BoxWithHorizontalPadding {
                KPBoxBadge(badge.badge)
            }
        }
    )
)
