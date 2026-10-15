@file:OptIn(ExperimentalKompostoApi::class)

package bottomsheet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.R
import com.trendyol.design.bottomsheet.KPBottomSheetImageContent
import com.trendyol.design.bottomsheet.KPBottomSheetListContent
import com.trendyol.design.bottomsheet.KPBottomSheetSliderContent
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer
import kotlinx.collections.immutable.persistentListOf

private val headerTitle = "Title"
private val testItemList = persistentListOf(
    R.drawable.image1,
    R.drawable.image2,
    R.drawable.image3,
    R.drawable.image4,
    R.drawable.image5
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun bottomSheetStyleTest() = DesignScreenshot(
    testName = "BottomSheet Style Test",
    contents = listOf(
        DesignScreenshotTestContainer("BottomSheet Image Content") {
            BoxWithHorizontalPadding {
                KPBottomSheetImageContent(
                    title = headerTitle,
                    onCloseIconClick = { },
                    model = null
                )
            }
        },
        DesignScreenshotTestContainer("BottomSheet List Content") {
            BoxWithHorizontalPadding {
                KPBottomSheetListContent(
                    title = headerTitle,
                    onCloseIconClick = {},
                    itemList = testItemList,
                    itemContent = { index, item ->
                        Column(
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Text(
                                text = "Index: $index",
                                modifier = Modifier.padding(bottom = 1.dp)
                            )
                            Image(
                                painter = painterResource(id = item),
                                contentDescription = "Image at index $index",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(24.dp)
                            )
                        }
                    }
                )
            }
        },
        DesignScreenshotTestContainer("BottomSheet Slider Content") {
            BoxWithHorizontalPadding {
                KPBottomSheetSliderContent(
                    title = headerTitle,
                    onCloseIconClick = { },
                    itemList = testItemList,
                    itemContent = { index, item ->
                        Column(
                            modifier = Modifier.padding(8.dp)
                        ) {
                            Text(
                                text = "Index: $index",
                                modifier = Modifier.padding(bottom = 1.dp)
                            )
                            Image(
                                painter = painterResource(id = item),
                                contentDescription = "Image at index $index",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(44.dp)
                            )
                        }
                    }
                )
            }
        }
    )
)
