package radiobutton;

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.radiobutton.KPRadioButton
import com.trendyol.design.core.radiobutton.KPRadioButtonContainerType
import com.trendyol.design.core.radiobutton.KPRadioButtonSize
import com.trendyol.design.core.text.KPText
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

private val text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod"

@PreviewTest
@DesignScreenshotPreview
@Composable
fun styleTest() = DesignScreenshot(
    testName = "styleTest",
    contents = listOf(
        DesignScreenshotTestContainer("None") {
            BoxWithHorizontalPadding {
                KPRadioButton(
                    selected = true,
                    containerType = KPRadioButtonContainerType.None,
                    size = KPRadioButtonSize.Medium,
                    onClick = { }
                )
            }
        },
        DesignScreenshotTestContainer("Text") {
            BoxWithHorizontalPadding {
                KPRadioButton(
                    selected = false,
                    containerType = KPRadioButtonContainerType.Text(text),
                    size = KPRadioButtonSize.Medium,
                    onClick = { }
                )
            }
        },
        DesignScreenshotTestContainer("Content") {
            BoxWithHorizontalPadding {
                KPRadioButton(
                    selected = false,
                    containerType = KPRadioButtonContainerType.Content{
                        Column {
                            KPText(text)
                        }
                    },
                    size = KPRadioButtonSize.Medium,
                    onClick = { }
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun sizeTest() = DesignScreenshot(
    testName = "sizeTest",
    contents = listOf(
        DesignScreenshotTestContainer("XSmall") {
            BoxWithHorizontalPadding {
                KPRadioButton(
                    selected = true,
                    containerType = KPRadioButtonContainerType.Text(text),
                    size = KPRadioButtonSize.XSmall,
                    onClick = { }
                )
            }
        },
        DesignScreenshotTestContainer("Small") {
            BoxWithHorizontalPadding {
                KPRadioButton(
                    selected = false,
                    containerType = KPRadioButtonContainerType.Text(text),
                    size = KPRadioButtonSize.Small,
                    onClick = { }
                )
            }
        },
        DesignScreenshotTestContainer("Medium") {
            BoxWithHorizontalPadding {
                KPRadioButton(
                    selected = false,
                    containerType = KPRadioButtonContainerType.Text(text),
                    size = KPRadioButtonSize.Medium,
                    onClick = { }
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun selectedTest() = DesignScreenshot(
    testName = "selectedTest",
    contents = listOf(
        DesignScreenshotTestContainer("Selected") {
            BoxWithHorizontalPadding {
                KPRadioButton(
                    selected = true,
                    containerType = KPRadioButtonContainerType.None,
                    size = KPRadioButtonSize.Medium,
                    onClick = { }
                )
            }
        },
        DesignScreenshotTestContainer("Unselected") {
            BoxWithHorizontalPadding {
                KPRadioButton(
                    selected = false,
                    containerType = KPRadioButtonContainerType.None,
                    size = KPRadioButtonSize.Medium,
                    onClick = { }
                )
            }
        }
    )
)
