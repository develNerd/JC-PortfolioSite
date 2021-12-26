package style

import content.visibility
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.hover
import style.AppStylesheet

object HomeStyle : StyleSheet(AppStylesheet) {


    val HColumn by style {
        flex(50.percent)
        flexDirection(FlexDirection.Column)
        height(300.px)
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        textAlign("center")
    }

    val HPositionItem by style {
        position(Position.Absolute)
    }

    val enthusiasticText by style {
        fontWeight(400)
        fontSize(300.percent)
        property("font-size","300%")
        property("font-family", "Satisfy, cursive")
        property("color","white")
    }

    val profile by style {
        backgroundColor(rgba(8, 48, 66, 0.58))
        width(300.px)
        height(300.px)
        borderRadius(100.percent)
        position(Position.Absolute)
        property("z-index","2")
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        opacity(0)
        property("transition","visibility 0s linear 300ms, opacity 300ms")

        hover(self) style{
            opacity(1)
            property("transition","visibility 0s linear 0s, opacity 300ms")
        }

    }



}
