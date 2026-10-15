@file:OptIn(ExperimentalKompostoApi::class)

package input

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.inputfield.phone.KPInputPhoneNumberField
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

private val minWidth = 280.dp
private val label = "Label"
private val placeholder = "Write here"
private val phoneNumber = "5551234567"
private val countryCode = "+90"

@PreviewTest
@DesignScreenshotPreview
@Composable
fun phoneNumberFieldTest() = DesignScreenshot(
    testName = "phoneNumberFieldTest",
    contents = listOf(
        DesignScreenshotTestContainer("Unfocused") {
            BoxWithHorizontalPadding {
                Column {
                    var number by remember { mutableStateOf("") }
                    KPInputPhoneNumberField(
                        modifier = Modifier.width(minWidth),
                        countryCode = countryCode,
                        number = placeholder,
                        onCountryCodeClick = { },
                        onValueChange = { number = it }
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    KPInputPhoneNumberField(
                        modifier = Modifier.width(minWidth),
                        countryCode = "",
                        number = number,
                        onCountryCodeClick = { },
                        onValueChange = { number = it },
                        countryCodeLabel = label,
                        numberLabel = label,
                    )
                }
            }
        },
        DesignScreenshotTestContainer("Filled") {
            BoxWithHorizontalPadding {
                Column {
                    var number by remember { mutableStateOf(phoneNumber) }
                    KPInputPhoneNumberField(
                        modifier = Modifier.width(minWidth),
                        countryCode = countryCode,
                        number = number,
                        onCountryCodeClick = { },
                        onValueChange = { number = it }
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    KPInputPhoneNumberField(
                        modifier = Modifier.width(minWidth),
                        countryCode = countryCode,
                        number = number,
                        onCountryCodeClick = { },
                        onValueChange = { number = it },
                        countryCodeLabel = label,
                        numberLabel = label,
                    )
                }
            }
        },
        DesignScreenshotTestContainer("Disabled") {
            BoxWithHorizontalPadding {
                Column {
                    var number by remember { mutableStateOf(phoneNumber) }
                    KPInputPhoneNumberField(
                        modifier = Modifier.width(minWidth),
                        countryCode = countryCode,
                        number = number,
                        onCountryCodeClick = { },
                        onValueChange = { number = it },
                        enabled = false,
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    KPInputPhoneNumberField(
                        modifier = Modifier.width(minWidth),
                        countryCode = countryCode,
                        number = number,
                        onCountryCodeClick = { },
                        onValueChange = { number = it },
                        countryCodeLabel = label,
                        numberLabel = label,
                        enabled = false,
                    )
                }
            }
        },
        DesignScreenshotTestContainer("Error") {
            BoxWithHorizontalPadding {
                Column {
                    var number by remember { mutableStateOf(phoneNumber) }
                    KPInputPhoneNumberField(
                        modifier = Modifier.width(minWidth),
                        countryCode = countryCode,
                        number = number,
                        onCountryCodeClick = { },
                        onValueChange = { number = it },
                        error = "Error message goes here",
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    KPInputPhoneNumberField(
                        modifier = Modifier.width(minWidth),
                        countryCode = countryCode,
                        number = number,
                        onCountryCodeClick = { },
                        onValueChange = { number = it },
                        countryCodeLabel = label,
                        numberLabel = label,
                        error = "Error message goes here",
                    )
                }
            }
        }
    )
)
