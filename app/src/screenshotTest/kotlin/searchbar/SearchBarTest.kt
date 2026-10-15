@file:OptIn(ExperimentalKompostoApi::class)

package searchbar

import androidx.compose.runtime.Composable
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.search.KPSearchBar
import com.trendyol.design.core.search.KPSearchBarRadius
import com.trendyol.design.core.search.KPSearchBarSize
import com.trendyol.design.core.search.KPSearchBarStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

private val sampleText = "Sample search text"

@PreviewTest
@DesignScreenshotPreview
@Composable
fun outlineAllVariantsTest() = DesignScreenshot(
    testName = "outlineAllVariants",
    contents = listOf(
        DesignScreenshotTestContainer("Outline SmallRadius SmallSize Empty") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = "",
                    style = KPSearchBarStyle.Outline,
                    size = KPSearchBarSize.Small,
                    radius = KPSearchBarRadius.Small,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
        DesignScreenshotTestContainer("Outline SmallRadius SmallSize WithText") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = sampleText,
                    style = KPSearchBarStyle.Outline,
                    size = KPSearchBarSize.Small,
                    radius = KPSearchBarRadius.Small,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
        DesignScreenshotTestContainer("Outline LargeRadius SmallSize Empty") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = "",
                    style = KPSearchBarStyle.Outline,
                    size = KPSearchBarSize.Small,
                    radius = KPSearchBarRadius.Large,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
        DesignScreenshotTestContainer("Outline LargeRadius SmallSize WithText") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = sampleText,
                    style = KPSearchBarStyle.Outline,
                    size = KPSearchBarSize.Small,
                    radius = KPSearchBarRadius.Large,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
        DesignScreenshotTestContainer("Outline SmallRadius MediumSize Empty") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = "",
                    style = KPSearchBarStyle.Outline,
                    size = KPSearchBarSize.Medium,
                    radius = KPSearchBarRadius.Small,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
        DesignScreenshotTestContainer("Outline SmallRadius MediumSize WithText") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = sampleText,
                    style = KPSearchBarStyle.Outline,
                    size = KPSearchBarSize.Medium,
                    radius = KPSearchBarRadius.Small,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
        DesignScreenshotTestContainer("Outline LargeRadius MediumSize Empty") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = "",
                    style = KPSearchBarStyle.Outline,
                    size = KPSearchBarSize.Medium,
                    radius = KPSearchBarRadius.Large,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
        DesignScreenshotTestContainer("Outline LargeRadius MediumSize WithText") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = sampleText,
                    style = KPSearchBarStyle.Outline,
                    size = KPSearchBarSize.Medium,
                    radius = KPSearchBarRadius.Large,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun filledAllVariantsTest() = DesignScreenshot(
    testName = "filledAllVariants",
    contents = listOf(
        DesignScreenshotTestContainer("Filled SmallRadius SmallSize Empty") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = "",
                    style = KPSearchBarStyle.Filled,
                    size = KPSearchBarSize.Small,
                    radius = KPSearchBarRadius.Small,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
        DesignScreenshotTestContainer("Filled SmallRadius SmallSize WithText") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = sampleText,
                    style = KPSearchBarStyle.Filled,
                    size = KPSearchBarSize.Small,
                    radius = KPSearchBarRadius.Small,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
        DesignScreenshotTestContainer("Filled LargeRadius SmallSize Empty") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = "",
                    style = KPSearchBarStyle.Filled,
                    size = KPSearchBarSize.Small,
                    radius = KPSearchBarRadius.Large,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
        DesignScreenshotTestContainer("Filled LargeRadius SmallSize WithText") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = sampleText,
                    style = KPSearchBarStyle.Filled,
                    size = KPSearchBarSize.Small,
                    radius = KPSearchBarRadius.Large,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
        DesignScreenshotTestContainer("Filled SmallRadius MediumSize Empty") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = "",
                    style = KPSearchBarStyle.Filled,
                    size = KPSearchBarSize.Medium,
                    radius = KPSearchBarRadius.Small,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
        DesignScreenshotTestContainer("Filled SmallRadius MediumSize WithText") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = sampleText,
                    style = KPSearchBarStyle.Filled,
                    size = KPSearchBarSize.Medium,
                    radius = KPSearchBarRadius.Small,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
        DesignScreenshotTestContainer("Filled LargeRadius MediumSize Empty") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = "",
                    style = KPSearchBarStyle.Filled,
                    size = KPSearchBarSize.Medium,
                    radius = KPSearchBarRadius.Large,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
        DesignScreenshotTestContainer("Filled LargeRadius MediumSize WithText") {
            BoxWithHorizontalPadding {
                KPSearchBar(
                    value = sampleText,
                    style = KPSearchBarStyle.Filled,
                    size = KPSearchBarSize.Medium,
                    radius = KPSearchBarRadius.Large,
                    onValueChange = {},
                    onTrailingIconClick = {},
                )
            }
        },
    )
)
