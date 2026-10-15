@file:OptIn(ExperimentalKompostoApi::class)

package inputfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.inputfield.KPOutlinedTextFieldStyle
import com.trendyol.design.core.inputfield.password.KPInputPasswordField
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpInputPasswordFieldStyleTest() = DesignScreenshot(
    testName = "KPInputPasswordField Style Test",
    contents = listOf(
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                    password = "123",
                    onValueChange = {},
                )
            }
        },
        DesignScreenshotTestContainer("Filled") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    password = "123",
                    onValueChange = {},
                )
            }
        },
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    password = "123",
                    onValueChange = {},
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpInputPasswordFieldPlaceholderTest() = DesignScreenshot(
    testName = "KPInputPasswordField Placeholder Test",
    contents = listOf(
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                    password = "",
                    onValueChange = {},
                    placeHolder = "placeholder"
                )
            }
        },
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    password = "",
                    onValueChange = {},
                    placeHolder = "placeholder"
                )
            }
        },
        DesignScreenshotTestContainer("Filled") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    password = "",
                    onValueChange = {},
                    placeHolder = "placeholder"
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpInputPasswordFieldLabelTest() = DesignScreenshot(
    testName = "KPInputPasswordField Label Test",
    contents = listOf(
        DesignScreenshotTestContainer("FloatingLabelOutlined|EmptyPassword") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                    password = "",
                    onValueChange = {},
                    label = "label"
                )
            }
        },
        DesignScreenshotTestContainer("FloatingLabelOutlined|WithPassword") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                    password = "123",
                    onValueChange = {},
                    label = "label"
                )
            }
        },
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    password = "",
                    onValueChange = {},
                    label = "label"
                )
            }
        },
        DesignScreenshotTestContainer("Filled") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    password = "",
                    onValueChange = {},
                    label = "label"
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpInputPasswordFieldErrorTest() = DesignScreenshot(
    testName = "KPInputPasswordField Error Test",
    contents = listOf(
        DesignScreenshotTestContainer("SmallError|Outlined") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    password = "",
                    onValueChange = {},
                    errorText = "error",
                )
            }
        },
        DesignScreenshotTestContainer("LongError|Filled") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    password = "",
                    onValueChange = {},
                    errorText = LoremIpsum().values.joinToString(),
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpInputPasswordFieldEnabledTest() = DesignScreenshot(
    testName = "KPInputPasswordField Enabled Test",
    contents = listOf(
        DesignScreenshotTestContainer("enabled=true|Outlined") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    password = "",
                    onValueChange = {},
                    enabled = true,
                )
            }
        },
        DesignScreenshotTestContainer("enabled=true|Filled") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    password = "123",
                    onValueChange = {},
                    enabled = true,
                )
            }
        },
        DesignScreenshotTestContainer("enabled=false|Outlined") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    password = "123",
                    onValueChange = {},
                    enabled = false,
                )
            }
        },
        DesignScreenshotTestContainer("enabled=true|Filled") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    password = "",
                    onValueChange = {},
                    enabled = false,
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpInputPasswordFieldMaskTest() = DesignScreenshot(
    testName = "KPInputPasswordField Mask Test",
    contents = listOf(
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    password = "123456",
                    onValueChange = {},
                    mask = '#',
                )
            }
        },
        DesignScreenshotTestContainer("Filled") {
            BoxWithHorizontalPadding {
                KPInputPasswordField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    password = "123456",
                    onValueChange = {},
                    mask = 'X',
                )
            }
        },
    )
)
