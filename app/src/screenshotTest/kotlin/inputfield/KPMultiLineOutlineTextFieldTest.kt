@file:OptIn(ExperimentalKompostoApi::class)

package inputfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.inputfield.KPMultiLineOutlineTextField
import com.trendyol.design.core.inputfield.KPOutlinedTextFieldStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpMultiLineOutlineTextFieldStyleTest() = DesignScreenshot(
    testName = "KPMultiLineOutlineTextField Style Test",
    contents = listOf(
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                    value = "asd",
                ) { }
            }
        },
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "asd",
                ) { }
            }
        },
        DesignScreenshotTestContainer("Filled") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "asd",
                ) { }
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpMultiLineOutlineTextFieldMaxCharTest() = DesignScreenshot(
    testName = "KPMultiLineOutlineTextField MaxChar Test",
    contents = listOf(
        DesignScreenshotTestContainer("maxChar=11|Outlined") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "asd",
                    maxChar = 11,
                ) { }
            }
        },
        DesignScreenshotTestContainer("maxChar=11|Filled") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "asd",
                    maxChar = 11,
                ) { }
            }
        },
    )
)

// Not run: was @Ignore("ANDDEV-8473") in Shot. Add @PreviewTest once fixed.
@DesignScreenshotPreview
@Composable
fun kpMultiLineOutlineTextFieldLabelTest() = DesignScreenshot(
    testName = "KPMultiLineOutlineTextField Label Test",
    contents = listOf(
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                    value = "",
                    label = "label"
                ) { }
            }
        },
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                    value = "asd",
                    label = "label",
                ) { }
            }
        },
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "asd",
                    label = "label",
                ) { }
            }
        },
        DesignScreenshotTestContainer("Filled") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "asd",
                    label = "label",
                ) { }
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpMultiLineOutlineTextFieldPlaceholderTest() = DesignScreenshot(
    testName = "KPMultiLineOutlineTextField Placeholder Test",
    contents = listOf(
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                    value = "",
                    placeholder = "placeholder"
                ) { }
            }
        },
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "",
                    placeholder = "placeholder",
                ) { }
            }
        },
        DesignScreenshotTestContainer("Filled") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "",
                    placeholder = "placeholder",
                ) { }
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpMultiLineOutlineTextFieldErrorLabelTest() = DesignScreenshot(
    testName = "KPMultiLineOutlineTextField ErrorLabel Test",
    contents = listOf(
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "",
                    errorLabel = "errorLabel",
                    isError = true,
                ) { }
            }
        },
        DesignScreenshotTestContainer("SmallError|Filled") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "",
                    errorLabel = "errorLabel",
                    isError = true,
                ) { }
            }
        },
        DesignScreenshotTestContainer("LongError|Filled") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "",
                    errorLabel = LoremIpsum().values.joinToString(),
                    isError = true,
                ) { }
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpMultiLineOutlineTextFieldEnabledTest() = DesignScreenshot(
    testName = "KPMultiLineOutlineTextField Enabled Test",
    contents = listOf(
        DesignScreenshotTestContainer("enabled=true|Outlined") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "",
                    enabled = true,
                ) { }
            }
        },
        DesignScreenshotTestContainer("enabled=true|Filled") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "asd",
                    enabled = true,
                ) { }
            }
        },

        DesignScreenshotTestContainer("enabled=false|Outlined") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "asd",
                    enabled = false,
                ) { }
            }
        },
        DesignScreenshotTestContainer("enabled=false|Filled") {
            BoxWithHorizontalPadding {
                KPMultiLineOutlineTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "",
                    enabled = false,
                ) { }
            }
        },
    )
)
