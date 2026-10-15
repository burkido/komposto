@file:OptIn(ExperimentalKompostoApi::class)

package typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.text.KPText
import com.trendyol.theme.KPDesign
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

private val sampleText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
private val longText = "This is a very long text that should demonstrate how the typography handles multiple lines and text wrapping in different scenarios."
private val longTextMaxLines = "This is a very long text that should demonstrate how the \n typography handles  \n multiple lines and text wrapping in different scenarios."

@PreviewTest
@DesignScreenshotPreview
@Composable
fun headerStylesTest() = DesignScreenshot(
    testName = "headerStylesTest",
    contents = listOf(
        DesignScreenshotTestContainer("Header") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.header,
                    maxLines = 3,
                )
            }
        },
        DesignScreenshotTestContainer("Header Bold") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.headerBold,
                    maxLines = 3,
                )
            }
        },
        DesignScreenshotTestContainer("Header Medium") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.headerMedium,
                    maxLines = 3,
                )
            }
        },
        DesignScreenshotTestContainer("Header Medium One Line") {
            BoxWithHorizontalPadding {
                KPText(
                    text = longText,
                    style = KPDesign.typography.headerMedium,
                    maxLines = 1,
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun titleStylesTest() = DesignScreenshot(
    testName = "titleStylesTest",
    contents = listOf(
        DesignScreenshotTestContainer("Title") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.title,
                    maxLines = 2,
                )
            }
        },
        DesignScreenshotTestContainer("Title Medium") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.titleMedium,
                    maxLines = 2,
                )
            }
        },
        DesignScreenshotTestContainer("Title Bold") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.titleBold,
                    maxLines = 2,
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun subtitleStylesTest() = DesignScreenshot(
    testName = "subtitleStylesTest",
    contents = listOf(
        DesignScreenshotTestContainer("Subtitle") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.subtitle,
                    maxLines = 2,
                )
            }
        },
        DesignScreenshotTestContainer("Subtitle Medium") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.subtitleMedium,
                    maxLines = 2,
                )
            }
        },
        DesignScreenshotTestContainer("Subtitle Bold") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.subtitleBold,
                    maxLines = 2,
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun body1StylesTest() = DesignScreenshot(
    testName = "body1StylesTest",
    contents = listOf(
        DesignScreenshotTestContainer("Body 1") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.body1,
                    maxLines = 3,
                )
            }
        },

        DesignScreenshotTestContainer("Body1 Medium") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.body1Medium,
                    maxLines = 3,
                )
            }
        },
        DesignScreenshotTestContainer("Body1 Bold") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.body1Bold,
                    maxLines = 3,
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun body2StylesTest() = DesignScreenshot(
    testName = "body2StylesTest",
    contents = listOf(
        DesignScreenshotTestContainer("Body2 Bold") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.body2Bold,
                    maxLines = 2,
                )
            }
        },
        DesignScreenshotTestContainer("Body 2") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.body2,
                    maxLines = 3,
                )
            }
        },
        DesignScreenshotTestContainer("Body2 Medium") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.body2Medium,
                    maxLines = 3,
                )
            }
        }
    )

)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun textAlignmentTest() = DesignScreenshot(
    testName = "textAlignmentTest",
    contents = listOf(
        DesignScreenshotTestContainer("Left Aligned") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.body1,
                    textAlign = TextAlign.Start,
                    maxLines = 2,
                )
            }
        },
        DesignScreenshotTestContainer("Center Aligned") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.body1,
                    textAlign = TextAlign.Center,
                    maxLines = 2,
                )
            }
        },
        DesignScreenshotTestContainer("Right Aligned") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.body1,
                    textAlign = TextAlign.End,
                    maxLines = 2,
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun textColorTest() = DesignScreenshot(
    testName = "textColorTest",
    contents = listOf(
        DesignScreenshotTestContainer("Primary Color") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.body1,
                    color = KPDesign.colors.colorPrimary,
                    maxLines = 2,
                )
            }
        },
        DesignScreenshotTestContainer("Secondary Color") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.body1,
                    color = KPDesign.colors.colorOnSurfaceVariant1,
                    maxLines = 2,
                )
            }
        },
        DesignScreenshotTestContainer("Error Color") {
            BoxWithHorizontalPadding {
                KPText(
                    text = sampleText,
                    style = KPDesign.typography.body1,
                    color = KPDesign.colors.colorWarning,
                    maxLines = 2,
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun maxLinesTest() = DesignScreenshot(
    testName = "maxLinesTest",
    contents = listOf(
        DesignScreenshotTestContainer("Single Line") {
            BoxWithHorizontalPadding {
                KPText(
                    text = longText,
                    style = KPDesign.typography.body1,
                    maxLines = 1,
                )
            }
        },
        DesignScreenshotTestContainer("Two Lines") {
            BoxWithHorizontalPadding {
                KPText(
                    text = longText,
                    style = KPDesign.typography.body1,
                    maxLines = 2,
                )
            }
        },
        DesignScreenshotTestContainer("Three Lines") {
            BoxWithHorizontalPadding {
                KPText(
                    text = longTextMaxLines,
                    style = KPDesign.typography.body1,
                    maxLines = 3,
                )
            }
        },
        DesignScreenshotTestContainer("Unlimited Lines") {
            BoxWithHorizontalPadding {
                KPText(
                    text = longText,
                    style = KPDesign.typography.body1,
                    maxLines = Int.MAX_VALUE,
                )
            }
        }
    )
)
