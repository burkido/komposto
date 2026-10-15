@file:OptIn(ExperimentalKompostoApi::class)

package inputfield

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.inputfield.KPOutlinedTextFieldStyle
import com.trendyol.design.core.inputfield.password.KPInputPasswordField
import com.trendyol.design.core.inputfield.phone.KPInputPhoneNumberField
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpInputPhoneNumberFieldCountryCodeTest() = DesignScreenshot(
    testName = "KPInputPhoneNumberField CountryCode Test",
    contents = listOf(
        DesignScreenshotTestContainer("2 Chars") {
            BoxWithHorizontalPadding {
                KPInputPhoneNumberField(
                    countryCode = "12",
                    number = "5551112233",
                    onCountryCodeClick = {},
                    onValueChange = {},
                )
            }
        },
        DesignScreenshotTestContainer("3 Chars") {
            BoxWithHorizontalPadding {
                KPInputPhoneNumberField(
                    countryCode = "123",
                    number = "555111223",
                    onCountryCodeClick = {},
                    onValueChange = {},
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpInputPhoneNumberFieldEnabledTest() = DesignScreenshot(
    testName = "KPInputPhoneNumberField Enabled Test",
    contents = listOf(
        DesignScreenshotTestContainer("enabled=true") {
            BoxWithHorizontalPadding {
                KPInputPhoneNumberField(
                    countryCode = "12",
                    number = "5551112233",
                    onCountryCodeClick = {},
                    onValueChange = {},
                    enabled = true,
                )
            }
        },
        DesignScreenshotTestContainer("enabled=false") {
            BoxWithHorizontalPadding {
                KPInputPhoneNumberField(
                    countryCode = "12",
                    number = "5551112233",
                    onCountryCodeClick = {},
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
fun kpInputPhoneNumberFieldCountryCodeLabelTest() = DesignScreenshot(
    testName = "KPInputPhoneNumberField CountryCodeLabel Test",
    contents = listOf(
        DesignScreenshotTestContainer("CountryCodeLabel") {
            BoxWithHorizontalPadding {
                KPInputPhoneNumberField(
                    countryCode = "12",
                    number = "5551112233",
                    onCountryCodeClick = {},
                    onValueChange = {},
                    countryCodeLabel = "CountryCodeLabel"
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpInputPhoneNumberFieldNumberLabelTest() = DesignScreenshot(
    testName = "KPInputPhoneNumberField NumberLabel Test",
    contents = listOf(
        DesignScreenshotTestContainer("NumberLabel") {
            BoxWithHorizontalPadding {
                KPInputPhoneNumberField(
                    countryCode = "12",
                    number = "5551112233",
                    onCountryCodeClick = {},
                    onValueChange = {},
                    numberLabel = "NumberLabel"
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpInputPhoneNumberFieldErrorTest() = DesignScreenshot(
    testName = "KPInputPhoneNumberField Error Test",
    contents = listOf(
        DesignScreenshotTestContainer("SmallError") {
            BoxWithHorizontalPadding {
                KPInputPhoneNumberField(
                    countryCode = "12",
                    number = "5551112233",
                    onCountryCodeClick = {},
                    onValueChange = {},
                    error = "error"
                )
            }
        },
        DesignScreenshotTestContainer("LongError") {
            BoxWithHorizontalPadding {
                KPInputPhoneNumberField(
                    countryCode = "12",
                    number = "5551112233",
                    onCountryCodeClick = {},
                    onValueChange = {},
                    error = LoremIpsum().values.joinToString(),
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpInputPhoneNumberFieldShapeTest() = DesignScreenshot(
    testName = "KPInputPhoneNumberField Shape Test",
    contents = listOf(
        DesignScreenshotTestContainer("RoundedCornerShape") {
            BoxWithHorizontalPadding {
                KPInputPhoneNumberField(
                    countryCode = "12",
                    number = "5551112233",
                    onCountryCodeClick = {},
                    onValueChange = {},
                    shape = RoundedCornerShape(16.dp),
                )
            }
        },
        DesignScreenshotTestContainer("RectangleShape") {
            BoxWithHorizontalPadding {
                KPInputPhoneNumberField(
                    countryCode = "12",
                    number = "5551112233",
                    onCountryCodeClick = {},
                    onValueChange = {},
                    shape = RectangleShape,
                )
            }
        },
        DesignScreenshotTestContainer("CutCornerShape") {
            BoxWithHorizontalPadding {
                KPInputPhoneNumberField(
                    countryCode = "12",
                    number = "5551112233",
                    onCountryCodeClick = {},
                    onValueChange = {},
                    shape = CutCornerShape(8.dp),
                )
            }
        },
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun kpInputPhoneNumberFieldMaxNumberLengthTest() = DesignScreenshot(
    testName = "KPInputPhoneNumberField MaxNumberLength Test",
    contents = listOf(
        DesignScreenshotTestContainer("maxPhoneNumberLength=6") {
            BoxWithHorizontalPadding {
                KPInputPhoneNumberField(
                    countryCode = "12",
                    number = "123456",
                    onCountryCodeClick = {},
                    onValueChange = {},
                    maxPhoneNumberLength = 6,
                )
            }
        },
    )
)
