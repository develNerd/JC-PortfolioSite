package style

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import style.AppStylesheet

object SkillsStyle : StyleSheet(AppStylesheet) {


    val skillsMain by style {
        flexDirection(FlexDirection.Column)
        display(DisplayStyle.Flex)
        paddingLeft(20.px)
        paddingRight(20.px)
        paddingTop(10.px)
        paddingBottom(20.px)
        height(100.percent)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        textAlign("center")
    }

    val skillsSection by style {
        height(auto)
        backgroundColor(Color(skillBgColor))
        backgroundSize("cover")
    }

    val skillsSectionItems by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        flexDirection(FlexDirection.Row)
        height(auto)

        media(mediaMaxWidth(420.px)){
            self style {
                flexDirection(FlexDirection.Column)
            }
        }
    }

    val skillsColumn1 by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        textAlign("center")
        paddingLeft(30.px)
        marginLeft(10.px)
        marginRight(10.px)
        paddingRight(30.px)
        paddingTop(30.px)
        paddingBottom(30.px)
        height(auto)
        width(300.px)
    }

    val skillProficientText by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.FlexStart)
        fontWeight(300)
        marginTop(20.px)
        property("font-family", "Raleway, sans-serif")
        property("font-size", "large")
    }


    val skillHeaderText by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.FlexStart)
        fontWeight(700)
        marginTop(20.px)
        property("font-size", "xx-large")
        property("font-family", "Raleway, sans-serif")
    }

    val skillRatingBox by style {
        width(100.percent)
        position(Position.Relative)
        height(30.px)
        marginTop(25.px)
        borderRadius(25.px)
    }

    val skillRating by style {
        height(30.px)
        position(Position.Absolute)
        borderRadius(25.px)
    }




}
