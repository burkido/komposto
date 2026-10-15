package checkbox;

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.checkbox.CheckboxContainerType
import com.trendyol.design.core.checkbox.KPCheckbox
import com.trendyol.design.core.checkbox.KPCheckboxSize
import com.trendyol.design.core.checkbox.KPCheckboxStyle
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
        DesignScreenshotTestContainer("Primary None") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Primary,
                    size = KPCheckboxSize.Medium,
                    containerType = CheckboxContainerType.None,
                    checked = true,
                    onCheckedChange = {}
                )
            }
        },
        DesignScreenshotTestContainer("Primary Text") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Primary,
                    size = KPCheckboxSize.Medium,
                    containerType = CheckboxContainerType.Text(text),
                    checked = true,
                    onCheckedChange = {}
                )
            }
        },
        DesignScreenshotTestContainer("Primary Content") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Primary,
                    size = KPCheckboxSize.Medium,
                    containerType = CheckboxContainerType.Content {
                        Column {
                            KPText(text)
                        }
                    },
                    checked = true,
                    onCheckedChange = {}
                )
            }
        },
        DesignScreenshotTestContainer("Secondary None") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Secondary,
                    size = KPCheckboxSize.Medium,
                    containerType = CheckboxContainerType.None,
                    checked = true,
                    onCheckedChange = {}
                )
            }
        },
        DesignScreenshotTestContainer("Secondary Text") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Secondary,
                    size = KPCheckboxSize.Medium,
                    containerType = CheckboxContainerType.Text(text),
                    checked = true,
                    onCheckedChange = {}
                )
            }
        },
        DesignScreenshotTestContainer("Secondary Content") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Secondary,
                    size = KPCheckboxSize.Medium,
                    containerType = CheckboxContainerType.Content {
                        Column {
                            KPText(text)
                        }
                    },
                    checked = true,
                    onCheckedChange = {}
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
        DesignScreenshotTestContainer("Primary Medium") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Primary,
                    size = KPCheckboxSize.Medium,
                    containerType = CheckboxContainerType.Text(text),
                    checked = true,
                    onCheckedChange = {}
                )
            }
        },
        DesignScreenshotTestContainer("Primary Small") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Primary,
                    size = KPCheckboxSize.Small,
                    containerType = CheckboxContainerType.Text(text),
                    checked = true,
                    onCheckedChange = {}
                )
            }
        },
        DesignScreenshotTestContainer("Primary XSmall") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Primary,
                    size = KPCheckboxSize.XSmall,
                    containerType =CheckboxContainerType.Text(text),
                    checked = true,
                    onCheckedChange = {}
                )
            }
        },
        DesignScreenshotTestContainer("Secondary Medium") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Secondary,
                    size = KPCheckboxSize.Medium,
                    containerType = CheckboxContainerType.Text(text),
                    checked = true,
                    onCheckedChange = {}
                )
            }
        },
        DesignScreenshotTestContainer("Secondary Small") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Secondary,
                    size = KPCheckboxSize.Small,
                    containerType = CheckboxContainerType.Text(text),
                    checked = true,
                    onCheckedChange = {}
                )
            }
        },
        DesignScreenshotTestContainer("Secondary XSmall") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Secondary,
                    size = KPCheckboxSize.XSmall,
                    containerType =CheckboxContainerType.Text(text),
                    checked = true,
                    onCheckedChange = {}
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun checkedTest() = DesignScreenshot(
    testName = "checkedTest",
    contents = listOf(
        DesignScreenshotTestContainer("Checked") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Primary,
                    size = KPCheckboxSize.Medium,
                    containerType = CheckboxContainerType.Text(text),
                    checked = true,
                    onCheckedChange = {}
                )
            }
        },
        DesignScreenshotTestContainer("Unchecked") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Primary,
                    size = KPCheckboxSize.Medium,
                    containerType = CheckboxContainerType.Text(text),
                    checked = false,
                    onCheckedChange = {}
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun uncheckedBoxColorTest() = DesignScreenshot(
    testName = "uncheckedBoxColorTest",
    contents = listOf(
        DesignScreenshotTestContainer("Default Unchecked") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.Primary,
                    size = KPCheckboxSize.Medium,
                    containerType = CheckboxContainerType.Text(text),
                    checked = false,
                    onCheckedChange = {}
                )
            }
        },
        DesignScreenshotTestContainer("Custom Unchecked Box Color") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.primary(uncheckedBoxColor = Color.LightGray),
                    size = KPCheckboxSize.Medium,
                    containerType = CheckboxContainerType.Text(text),
                    checked = false,
                    onCheckedChange = {}
                )
            }
        },
        DesignScreenshotTestContainer("Custom Unchecked Box Color Checked") {
            BoxWithHorizontalPadding {
                KPCheckbox(
                    style = KPCheckboxStyle.primary(uncheckedBoxColor = Color.LightGray),
                    size = KPCheckboxSize.Medium,
                    containerType = CheckboxContainerType.Text(text),
                    checked = true,
                    onCheckedChange = {}
                )
            }
        }
    )
)
