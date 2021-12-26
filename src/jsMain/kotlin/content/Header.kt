package content

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*
import org.w3c.dom.url.URL
import style.WtContainer



@Composable
fun Layout(content: @Composable () -> Unit) {
    Div({

    }) {
        content()
    }
}





@Composable
fun Nav() {

    val listOfNavs by mutableStateOf(listOf("HOME", "ABOUT", "SKILLS", "CONTACT"))

    Div(
        attrs = {
            classes("navBar")
            style {
                position(Position.Fixed)
                overflow("hidden")
                marginTop(0.px)
                width(100.percent)
            }
        }
    ) {

        Div(
            attrs = {
                style {

                    backgroundColor(rgba(8, 48, 66, 0.58))
                    width(100.percent)
                    padding(10.px)
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Row)
                }
            }
        ) {

            Div(
                attrs = {
                    style {
                        flexGrow(1)
                        fontWeight(600)
                        property("font-size","x-large")
                        property("font-family", "Arima Madurai, cursive")
                        property("color","white")
                    }

                }
            ) {
                Text("Isaac Akakpo")
            }

            /*Div(
                attrs = {
                    style {
                        display(DisplayStyle.Flex)
                        flexGrow(8)
                        alignItems(AlignItems.Center)
                        justifyContent(JustifyContent.FlexEnd)
                        paddingRight(30.px)
                    }

                }
            ) {
                listOfNavs.forEach {
                    Div(attrs = {
                        style {
                            property("font-family", "Open Sans, sans-serif")
                            fontWeight(700)
                            marginLeft(20.px)
                        }
                    }) {
                        Text("${it}")
                    }
                }
            }*/

        }
    }


}

@Composable
fun HeaderFake() {


    Section(
        attrs = {
            classes("full-height")
            style {
                position(Position.Relative)
            }
        }
    ) {

    }


}

