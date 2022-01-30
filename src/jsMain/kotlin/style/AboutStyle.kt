package style

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import style.AppStylesheet

object AboutStyle : StyleSheet(AppStylesheet) {


    val aboutMeMain by style {
        flexDirection(FlexDirection.Column)
        display(DisplayStyle.Flex)
        paddingLeft(20.px)
        paddingRight(20.px)
        paddingTop(10.px)
        paddingBottom(20.px)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        textAlign("center")


    }


    val AIColumn by style {
        display(DisplayStyle.Flex)
        height(auto)
        width(300.px)
        media(mediaMaxWidth(420.px)){
            self style {
                marginTop(5.px)
                width(auto)
            }
        }
    }


    val InterestItemRow by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        textAlign("center")
        height(auto)
        width(auto)
    }

    val InterestRowRoundItem by style {
        height(100.px)
        width(100.px)
        border {
            style(LineStyle.Solid)
            color(Color(interestCardColor))
            borderRadius(100.percent)
        }
        property("box-shadow"," 0 4px 8px 0 rgba(0,0,0,0.2)")
        property("transition","0.3s")
        backgroundColor(Color(interestCardColor))
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        media(mediaMaxWidth(600.px)){
            self style {
                height(60.px)
                width(60.px)
            }

        }
    }

    val InterestIconItem by style {
        height(40.px)
        width(40.px)
        media(mediaMaxWidth(600.px)){
            self style {
                height(24.px)
                width(24.px)
            }

        }

    }


}
