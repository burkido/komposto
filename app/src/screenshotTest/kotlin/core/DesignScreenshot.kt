package core

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.trendyol.design.ui.theme.TrendyolTheme

/**
 * Preview configuration shared by every screenshot test: the app window of a Pixel 6 (1080 x 2295 px
 * below the system bars, 420 dpi) on the #FAFAFA window background, matching the emulator the
 * screenshots used to be recorded on.
 */
@Preview(
    showBackground = true,
    backgroundColor = 0xFFFAFAFA,
    device = "spec:width=1080px,height=2295px,dpi=420", // old Shot references had API 32 Pixel 6
)
annotation class DesignScreenshotPreview

/**
 * Renders [contents] under a [testName] header inside [TrendyolTheme].
 */
@Composable
fun DesignScreenshot(
    testName: String,
    contents: List<DesignScreenshotTestContainer>,
) {
    TrendyolTheme {
        DesignScreenshotTestScreen(title = testName, containers = contents)
    }
}
