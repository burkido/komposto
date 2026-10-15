@file:OptIn(ExperimentalKompostoApi::class)

package infobox

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.infobox.KPInfoBox
import com.trendyol.design.core.infobox.KPInfoBoxStyle
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

private val TEXT =
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus eget metus commodo."

@PreviewTest
@DesignScreenshotPreview
@Composable
fun infoBoxIconPositionTest() = DesignScreenshot(
    testName = "infoBoxIconPositionTest",
    contents = listOf(
        DesignScreenshotTestContainer("LeftIcon") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Orange,
                    text = TEXT,
                    iconPosition = Arrangement.Start
                )
            }
        },
        DesignScreenshotTestContainer("RightIcon") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Orange,
                    text = TEXT,
                    iconPosition = Arrangement.End
                )
            }
        },
        DesignScreenshotTestContainer("NoIcon") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Orange,
                    text = TEXT
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun infoBoxIconPositionWithBorderTest() = DesignScreenshot(
    testName = "infoBoxIconPositionBorderTest",
    contents = listOf(
        DesignScreenshotTestContainer("LeftIconWithBorder") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Orange,
                    text = TEXT,
                    iconPosition = Arrangement.Start,
                    showBorder = true
                )
            }
        },
        DesignScreenshotTestContainer("RightIconWithBorder") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Orange,
                    text = TEXT,
                    iconPosition = Arrangement.End,
                    showBorder = true
                )
            }
        },
        DesignScreenshotTestContainer("NoIconWithBorder") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Orange,
                    text = TEXT,
                    showBorder = true
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun infoBoxBorderTest() = DesignScreenshot(
    testName = "infoBoxBorderTest",
    contents = listOf(
        DesignScreenshotTestContainer("RightIconWithBorder") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Orange,
                    text = TEXT,
                    iconPosition = Arrangement.End,
                    showBorder = true
                )
            }
        },
        DesignScreenshotTestContainer("RightIconWithoutBorder") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Orange,
                    text = TEXT,
                    iconPosition = Arrangement.End,
                    showBorder = false
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun infoBoxIconPositionWithDashBorderTest() = DesignScreenshot(
    testName = "infoBoxDashBorderIconPositionTest",
    contents = listOf(
        DesignScreenshotTestContainer("LeftIconWithDashBorder") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Orange,
                    text = TEXT,
                    iconPosition = Arrangement.Start,
                    showDashedBorder = true
                )
            }
        },
        DesignScreenshotTestContainer("RightIconWithDashBorder") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Orange,
                    text = TEXT,
                    iconPosition = Arrangement.End,
                    showDashedBorder = true
                )
            }
        },
        DesignScreenshotTestContainer("NoIconWithDashBorder") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Orange,
                    text = TEXT,
                    showDashedBorder = true
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun infoBoxDashBorderTest() = DesignScreenshot(
    testName = "infoBoxDashBorderTest",
    contents = listOf(
        DesignScreenshotTestContainer("RightIconWithDashBorder") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Orange,
                    text = TEXT,
                    iconPosition = Arrangement.End,
                    showDashedBorder = true
                )
            }
        },
        DesignScreenshotTestContainer("RightIconWithoutDashBorder") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Orange,
                    text = TEXT,
                    iconPosition = Arrangement.End,
                    showDashedBorder = false
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun infoBoxTwoTextIconPositionTest() = DesignScreenshot(
    testName = "infoBoxTwoTexIconPositionTest",
    contents = listOf(
        DesignScreenshotTestContainer("infoBoxTwoTextWithLeftIcon") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Pink,
                    iconPosition = Arrangement.Start
                ) {
                    Text(
                        text = TEXT
                    )
                    Text(
                        modifier = Modifier.padding(top = 8.dp),
                        text = TEXT
                    )
                }
            }
        },
        DesignScreenshotTestContainer("infoBoxTwoTextWithRightIcon") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Pink,
                    iconPosition = Arrangement.End
                ) {
                    Text(
                        text = TEXT
                    )
                    Text(
                        modifier = Modifier.padding(top = 8.dp),
                        text = TEXT
                    )
                }
            }
        },
        DesignScreenshotTestContainer("infoBoxTwoTextWithNoIcon") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Pink,
                    iconPosition = Arrangement.End
                ) {
                    Text(
                        text = TEXT
                    )
                    Text(
                        modifier = Modifier.padding(top = 8.dp),
                        text = TEXT
                    )
                }
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun infoBoxSingleLineTwoTextWithPositionTest() = DesignScreenshot(
    testName = "infoBoxSingleLineTwoTextWithPositionTest",
    contents = listOf(
        DesignScreenshotTestContainer("infoBoxSingleLineTwoTextWithLeftIcon") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Pink,
                    iconPosition = Arrangement.Start
                ) {
                    Text(
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
                    )
                    Text(
                        modifier = Modifier.padding(top = 8.dp),
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
                    )
                }
            }
        },
        DesignScreenshotTestContainer("infoBoxSingleLineTwoTextWithRightIcon") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Pink,
                    iconPosition = Arrangement.End
                ) {
                    Text(
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
                    )
                    Text(
                        modifier = Modifier.padding(top = 8.dp),
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
                    )
                }
            }
        },
        DesignScreenshotTestContainer("infoBoxSingleLineTwoTextWithNoIcon") {
            BoxWithHorizontalPadding {
                KPInfoBox(
                    style = KPInfoBoxStyle.Pink,
                ) {
                    Text(
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
                    )
                    Text(
                        modifier = Modifier.padding(top = 8.dp),
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
                    )
                }
            }
        }
    )
)
