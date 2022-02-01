package style

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto

object FooterStyle : StyleSheet(AppStylesheet) {

    val footerStyle by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        backgroundColor(Color(mainColor))
        height(auto)
        media(mediaMaxWidth(420.px)){
            self style {
                flexDirection(FlexDirection.Column)
            }
        }
    }

    val openSourceFooterStyle by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        backgroundColor(Color.black)
        opacity(0.5)
        color(Color.white)
        media(mediaMaxWidth(420.px)){
            self style {
                flexDirection(FlexDirection.Column)
            }
        }
    }


}