package style

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.css.selectors.hover
import style.AppStylesheet

object MainStyle : StyleSheet(AppStylesheet) {



    val Header1 by style {
        textAlign("center")
        fontWeight(700)
        margin(15.px)
        property("font-family", "Open Sans, sans-serif")
        property("color", "white")
    }

    val skillsHeader by style {
        textAlign("center")
        fontWeight(700)
        margin(15.px)
        property("font-family", "Open Sans, sans-serif")
        property("color", mainColor)
    }

    val Body1 by style {
        textAlign("center")
        fontWeight(500)
        margin(15.px)
        property("font-family", "Open Sans, sans-serif")
        property("color", "white")
    }

    val itemNormalHeaderTexts by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.FlexStart)
        fontWeight(600)
        marginTop(20.px)
        property("font-size", "x-large")
        property("font-family", "Raleway, sans-serif")
    }

    val normalTexts by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.FlexStart)
        fontWeight(400)
        marginTop(20.px)
        lineHeight("1.5")
        property("font-family", "Raleway, sans-serif")
        property("font-size", "large")
    }

    val opensourceInfo by style {
        display(DisplayStyle.Flex)
        borderRadius(20.px)
        width(auto)
        height(auto)
        padding(20.px)
        margin(15.px)
        flexDirection(FlexDirection.Row)
        backgroundColor(Color("white"))
        property("z-index", "10")
        property("bottom", "0")
        opacity(0.7)
        property("transition","visibility 0s linear 300ms, opacity 300ms")

        hover(self) style {
            opacity(1)
            property("transition","visibility 0s linear 0s, opacity 300ms")
        }
    }

    val normalTextsInfo by style {
        fontWeight(300)
        lineHeight("1.5")
        property("font-family", "Raleway, sans-serif")
        property("font-size", "small")
    }


}
