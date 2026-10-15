@file:OptIn(ExperimentalKompostoApi::class)

package inputfield.dropdown

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.inputfield.KPDropdown
import com.trendyol.design.core.inputfield.KPDropdownStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpDropdownStyleTest() = DesignScreenshot(
    testName = "KPDropdown Style Test",
    contents = listOf(
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.FloatingLabelOutlined,
                    value = "abc",
                    onClick = { },
                )
            }
        },
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.Outlined,
                    value = "abc",
                    onClick = { },
                )
            }
        },
        DesignScreenshotTestContainer("Filled") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.Filled,
                    value = "abc",
                    onClick = { },
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpDropdownLabelTest() = DesignScreenshot(
    testName = "KPDropdown Label Test",
    contents = listOf(
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.FloatingLabelOutlined,
                    value = "",
                    label = "label",
                    onClick = { },
                )
            }
        },
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.FloatingLabelOutlined,
                    value = "abc",
                    label = "label",
                    onClick = { },
                )
            }
        },
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.Outlined,
                    value = "abc",
                    label = "label",
                    onClick = { },
                )
            }
        },
        DesignScreenshotTestContainer("Filled") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.Filled,
                    value = "abc",
                    label = "label",
                    onClick = { },
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpDropdownPlaceholderTest() = DesignScreenshot(
    testName = "KPDropdown Placeholder Test",
    contents = listOf(
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.FloatingLabelOutlined,
                    value = "",
                    placeholder = "placeholder",
                    onClick = { },
                )
            }
        },
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.Outlined,
                    value = "",
                    placeholder = "placeholder",
                    onClick = { },
                )
            }
        },
        DesignScreenshotTestContainer("Filled") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.Filled,
                    value = "",
                    placeholder = "placeholder",
                    onClick = { },
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpDropdownErrorLabelTest() = DesignScreenshot(
    testName = "KPDropdown ErrorLabel Test",
    contents = listOf(
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.FloatingLabelOutlined,
                    value = "",
                    errorLabel = "errorLabel",
                    isError = true,
                    onClick = { },
                )
            }
        },
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.Outlined,
                    value = "",
                    errorLabel = "errorLabel",
                    isError = true,
                    onClick = { },
                )
            }
        },
        DesignScreenshotTestContainer("SmallError|Filled") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.Filled,
                    value = "",
                    errorLabel = "errorLabel",
                    isError = true,
                    onClick = { },
                )
            }
        },
        DesignScreenshotTestContainer("LongError|Filled") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.Filled,
                    value = "",
                    errorLabel = LoremIpsum().values.joinToString(),
                    isError = true,
                    onClick = { },
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpDropdownEnabledTest() = DesignScreenshot(
    testName = "KPDropdown Enabled Test",
    contents = listOf(
        DesignScreenshotTestContainer("enabled=true|Outlined") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.Outlined,
                    value = "",
                    enabled = true,
                    onClick = { },
                )
            }
        },
        DesignScreenshotTestContainer("enabled=true|Filled") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.Filled,
                    value = "123",
                    enabled = true,
                    onClick = { },
                )
            }
        },
        DesignScreenshotTestContainer("enabled=false|Outlined") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.Outlined,
                    value = "123",
                    enabled = false,
                    onClick = { },
                )
            }
        },
        DesignScreenshotTestContainer("enabled=false|Filled") {
            BoxWithHorizontalPadding {
                KPDropdown(
                    style = KPDropdownStyle.Filled,
                    value = "",
                    enabled = false,
                    onClick = { },
                )
            }
        },
    )
)
