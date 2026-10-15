@file:OptIn(ExperimentalKompostoApi::class)

package inputfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.fill.Cancel
import com.trendyol.design.core.icon.icons.fill.Search
import com.trendyol.design.core.inputfield.KPOutlinedTextFieldStyle
import com.trendyol.design.core.inputfield.KPSingleLineOutlinedTextField
import com.trendyol.design.core.inputfield.container.TextFieldScope
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

private val sampleText = "Sample text"
private val measurementText = "175"
private val shortTrailingText = "OK"
private val longTrailingText = "Really long trailing text for test"

// Custom visual transformation that adds unit suffix
private class UnitVisualTransformation(private val unit: String) : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val transformedText = if (text.text.isNotEmpty()) "${text.text} $unit" else text.text
        return TransformedText(
            AnnotatedString(transformedText),
            object : OffsetMapping {
                override fun originalToTransformed(offset: Int): Int = offset
                override fun transformedToOriginal(offset: Int): Int = 
                    minOf(offset, text.length)
            }
        )
    }
}

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpSingleLineOutlinedTextFieldStyleTest() = DesignScreenshot(
    testName = "KPSingleLineOutlinedTextField Style Test",
    contents = listOf(
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                    value = "asd",
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "asd",
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("Filled") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "asd",
                    onValueChange = { },
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpSingleLineOutlinedTextFieldLabelTest() = DesignScreenshot(
    testName = "KPSingleLineOutlinedTextField Label Test",
    contents = listOf(
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                    value = "",
                    label = "label",
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                    value = "asd",
                    label = "label",
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "asd",
                    label = "label",
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("Filled") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "asd",
                    label = "label",
                    onValueChange = { },
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpSingleLineOutlinedTextFieldPlaceholderTest() = DesignScreenshot(
    testName = "KPSingleLineOutlinedTextField Placeholder Test",
    contents = listOf(
        DesignScreenshotTestContainer("FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                    value = "",
                    placeholder = "placeholder",
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "",
                    placeholder = "placeholder",
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("Filled") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "",
                    placeholder = "placeholder",
                    onValueChange = { },
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpSingleLineOutlinedTextFieldErrorLabelTest() = DesignScreenshot(
    testName = "KPSingleLineOutlinedTextField ErrorLabel Test",
    contents = listOf(
        DesignScreenshotTestContainer("Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "",
                    errorLabel = "errorLabel",
                    isError = true,
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("SmallError|Filled") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "",
                    errorLabel = "errorLabel",
                    isError = true,
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("LongError|Filled") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "",
                    errorLabel = LoremIpsum().values.joinToString(),
                    isError = true,
                    onValueChange = { },
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpSingleLineOutlinedTextFieldEnabledTest() = DesignScreenshot(
    testName = "KPSingleLineOutlinedTextField Enabled Test",
    contents = listOf(
        DesignScreenshotTestContainer("enabled=true|Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "",
                    enabled = true,
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("enabled=true|Filled") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "asd",
                    enabled = true,
                    onValueChange = { },
                )
            }
        },

        DesignScreenshotTestContainer("enabled=false|Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "asd",
                    enabled = false,
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("enabled=false|Filled") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = "",
                    enabled = false,
                    onValueChange = { },
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpSingleLineOutlinedTextFieldVisualTransformationTest() = DesignScreenshot(
    testName = "KPSingleLineOutlinedTextField VisualTransformation Test",
    contents = listOf(
        DesignScreenshotTestContainer("None|FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                    value = sampleText,
                    visualTransformation = VisualTransformation.None,
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("None|Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = sampleText,
                    visualTransformation = VisualTransformation.None,
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("None|Filled") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = sampleText,
                    visualTransformation = VisualTransformation.None,
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("UnitCm|FloatingLabelOutlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.FloatingLabelOutlined,
                    value = measurementText,
                    visualTransformation = UnitVisualTransformation("cm"),
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("UnitKg|Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "75",
                    visualTransformation = UnitVisualTransformation("kg"),
                    onValueChange = { },
                )
            }
        },
        DesignScreenshotTestContainer("UnitCm|Filled") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = measurementText,
                    visualTransformation = UnitVisualTransformation("cm"),
                    onValueChange = { },
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpSingleLineOutlinedTextFieldTrailingContentTest() = DesignScreenshot(
    testName = "KPSingleLineOutlinedTextField TrailingContent Test",
    contents = listOf(
        DesignScreenshotTestContainer("ShortText|Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = sampleText,
                    onValueChange = { },
                    trailingContent = {
                        TextFieldScope.Text(
                            text = shortTrailingText,
                            onClick = { }
                        )
                    }
                )
            }
        },
        DesignScreenshotTestContainer("LongText|Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = sampleText,
                    onValueChange = { },
                    trailingContent = {
                        TextFieldScope.Text(
                            text = longTrailingText,
                            onClick = { }
                        )
                    }
                )
            }
        },
        DesignScreenshotTestContainer("LongText|Filled") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = sampleText,
                    onValueChange = { },
                    trailingContent = {
                        TextFieldScope.Text(
                            text = longTrailingText,
                            onClick = { }
                        )
                    }
                )
            }
        },
        DesignScreenshotTestContainer("Icon|Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = sampleText,
                    onValueChange = { },
                    trailingContent = {
                        TextFieldScope.Icon(
                            imageVector = KPIcons.Fill.Search,
                            onClick = { }
                        )
                    }
                )
            }
        },
        DesignScreenshotTestContainer("Icon|Filled") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Filled,
                    value = sampleText,
                    onValueChange = { },
                    trailingContent = {
                        TextFieldScope.Icon(
                            imageVector = KPIcons.Fill.Cancel,
                            onClick = { }
                        )
                    }
                )
            }
        },
        DesignScreenshotTestContainer("VeryLongTextFieldContent|Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "This is a very long text field content, so let's see how it behaves with trailing content",
                    onValueChange = { },
                    trailingContent = {
                        TextFieldScope.Text(
                            text = longTrailingText,
                            onClick = { }
                        )
                    }
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpSingleLineOutlinedTextFieldAnimatedTrailingContentTest() = DesignScreenshot(
    testName = "KPSingleLineOutlinedTextField AnimatedTrailingContent Test",
    contents = listOf(
        DesignScreenshotTestContainer("Empty|IconSwap|Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "",
                    onValueChange = { },
                    trailingContent = {
                        AnimatedContent(targetState = false) { hasQuery ->
                            if (hasQuery) {
                                Icon(imageVector = KPIcons.Fill.Cancel, onClick = { })
                            } else {
                                Icon(imageVector = KPIcons.Fill.Search, onClick = { })
                            }
                        }
                    }
                )
            }
        },
        DesignScreenshotTestContainer("Filled|IconSwap|Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = sampleText,
                    onValueChange = { },
                    trailingContent = {
                        AnimatedContent(targetState = true) { hasQuery ->
                            if (hasQuery) {
                                Icon(imageVector = KPIcons.Fill.Cancel, onClick = { })
                            } else {
                                Icon(imageVector = KPIcons.Fill.Search, onClick = { })
                            }
                        }
                    }
                )
            }
        },
        DesignScreenshotTestContainer("Empty|EmptyElse|Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = "",
                    onValueChange = { },
                    trailingContent = {
                        AnimatedContent(targetState = false) { hasQuery ->
                            if (hasQuery) {
                                Icon(imageVector = KPIcons.Fill.Cancel, onClick = { })
                            }
                        }
                    }
                )
            }
        },
        DesignScreenshotTestContainer("Filled|EmptyElse|Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = sampleText,
                    onValueChange = { },
                    trailingContent = {
                        AnimatedContent(targetState = true) { hasQuery ->
                            if (hasQuery) {
                                Icon(imageVector = KPIcons.Fill.Cancel, onClick = { })
                            }
                        }
                    }
                )
            }
        },
        DesignScreenshotTestContainer("Filled|IconTextMix|Outlined") {
            BoxWithHorizontalPadding {
                KPSingleLineOutlinedTextField(
                    style = KPOutlinedTextFieldStyle.Outlined,
                    value = sampleText,
                    onValueChange = { },
                    trailingContent = {
                        AnimatedContent(targetState = true) { hasQuery ->
                            if (hasQuery) {
                                Text(text = shortTrailingText, onClick = { })
                            } else {
                                Icon(imageVector = KPIcons.Fill.Search, onClick = { })
                            }
                        }
                    }
                )
            }
        },
    )
)
