package ratingbar

import androidx.compose.runtime.Composable
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.rating.KPRatingBar
import com.trendyol.design.core.rating.KPRatingBarSize
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

@PreviewTest
@DesignScreenshotPreview
@Composable
fun ratingBarSizeTest() = DesignScreenshot(
    testName = "ratingBarSizeTest",
    contents = listOf(
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                KPRatingBar(
                    rating = 3.5f,
                    size = KPRatingBarSize.Small,
                    reviewCount = "277",
                    showRating = false,
                    showCameraIcon = false,
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                KPRatingBar(
                    rating = 3.5f,
                    size = KPRatingBarSize.Medium,
                    reviewCount = "277",
                    showRating = false,
                    showCameraIcon = false,
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun ratingBarCameraTest() = DesignScreenshot(
    testName = "ratingBarCameraTest",
    contents = listOf(
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                KPRatingBar(
                    rating = 3.5f,
                    size = KPRatingBarSize.Small,
                    reviewCount = "277",
                    showRating = true,
                    showCameraIcon = true,
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                KPRatingBar(
                    rating = 3.5f,
                    size = KPRatingBarSize.Medium,
                    reviewCount = "277",
                    showRating = true,
                    showCameraIcon = true,
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun ratingBarRatingTest() = DesignScreenshot(
    testName = "ratingBarRatingTest",
    contents = listOf(
        DesignScreenshotTestContainer("Show Rating") {
            BoxWithHorizontalPadding {
                KPRatingBar(
                    rating = 3.5f,
                    size = KPRatingBarSize.Small,
                    reviewCount = "277",
                    showRating = true,
                    showCameraIcon = false,
                )
            }
        },
        DesignScreenshotTestContainer("Unshow Rating") {
            BoxWithHorizontalPadding {
                KPRatingBar(
                    rating = 3.5f,
                    size = KPRatingBarSize.Small,
                    reviewCount = "277",
                    showRating = false,
                    showCameraIcon = false,
                )
            }
        }
    )
)
