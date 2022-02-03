package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.hover
import org.jetbrains.compose.web.dom.*
import style.HomeStyle.HColumn
import style.HomeStyle.HPositionItem
import style.HomeStyle.HomeMain
import style.HomeStyle.enthusiasticText
import style.HomeStyle.profile
import style.MainStyle

@Composable
fun Home() {

    Section(
        attrs = {
            classes("full-height")
            style {
                position(Position.Relative)
            }
        }
    ) {
        Div(attrs = {
        }) {
            Div(attrs = {
                classes(HomeMain)
            })
            {

                Div(
                    attrs = {
                        classes(HColumn)
                    }
                ) {
                    Div(attrs = {
                        style {
                            backgroundColor(rgba(196, 196, 196, 0.47))
                            width(300.px)
                            height(300.px)
                            border {
                                style(LineStyle.Solid)
                                width(3.px)
                                color(Color("blue"))
                            }
                            borderRadius(100.percent)
                            display(DisplayStyle.Flex)
                            justifyContent(JustifyContent.Center)
                            alignItems(AlignItems.Center)
                            position(Position.Relative)
                            marginTop(100.px)
                        }
                    })
                    {


                        Div(attrs = {
                            classes(profile)
                        })
                        {
                            P(attrs = {
                                style {
                                    property("font-size","large")
                                    property("font-family", "Arima Madurai, cursive")
                                    property("color","white")
                                }
                            }) {
                                Text("Name Goes Here")
                            }
                        }


                        Img(src = "img_profile.png", attrs = {
                            style {
                                position(Position.Absolute)
                                width(100.percent)
                                height(100.percent)
                            }
                        })


                    }
                }

                Div(
                    attrs = {
                        classes(HColumn,enthusiasticText)
                    }
                ) {
                    P {
                        Text("Title Goes Here")
                    }
                    P{
                        Text("Extra Title Info")
                    }

                }

            }

        }

    }



}



fun StyleBuilder.visibility(value: String){
    property(
        "visibility",
        value
    )
}

