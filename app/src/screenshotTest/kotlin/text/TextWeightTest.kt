package text

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

private val contents = listOf(
    DesignScreenshotTestContainer("TitleColorOnSurfaceVariant3 weights") {
        BoxWithHorizontalPadding {
            Column {
                KPText(
                    text = "Text",
                    style = KPDesign.typography.titleBoldColorOnSurfaceVariant3
                )
                KPText(
                    text = "Text",
                    style = KPDesign.typography.titleMediumColorOnSurfaceVariant3
                )
                KPText(
                    text = "Text",
                    style = KPDesign.typography.titleColorOnSurfaceVariant3
                )
            }
        }
    },
    DesignScreenshotTestContainer("OverLineColorOnSurfaceVariant3 weights") {
        BoxWithHorizontalPadding {
            Column {
                KPText(
                    text = "Text",
                    style = KPDesign.typography.overLineBoldColorOnSurfaceVariant3
                )
                KPText(
                    text = "Text",
                    style = KPDesign.typography.overLineMediumColorOnSurfaceVariant3
                )
                KPText(
                    text = "Text",
                    style = KPDesign.typography.overLineColorOnSurfaceVariant3
                )
            }
        }
    },
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun textWeightTests() = DesignScreenshot(
    testName = "Text weight test",
    contents = contents
)
