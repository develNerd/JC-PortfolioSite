package style

import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import style.AppStylesheet

object ProjectsStyle : StyleSheet(AppStylesheet) {


    val projectsMain by style {
        flexDirection(FlexDirection.Column)
        display(DisplayStyle.Flex)
        paddingLeft(20.px)
        paddingRight(20.px)
        paddingTop(10.px)
        paddingBottom(20.px)
        height(auto)
        width(auto)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        textAlign("center")
    }

    val projectsSection by style {
        height(auto)
        backgroundColor(projectMainBg)
        backgroundSize("cover")
    }

    val projectsColumn1 by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        justifyContent(JustifyContent.FlexStart)
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


    val projectsHeaders by style {
        textAlign("center")
        fontWeight(700)
        margin(15.px)
        property("font-family", "Open Sans, sans-serif")
        property("color", onWhiteColor)
        property("font-size", "xx-large")

    }

    val PColumn1 by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        flexBasis(50.percent)
        margin(15.px)
        width(auto)
        flexDirection(FlexDirection.Column)
        height(300.px)
        backgroundColor(rgba(0, 0, 0, 0.09))
        borderRadius(10.px)
        alignItems(AlignItems.Center)
        textAlign("center")
    }

    val PColumnText by style {
        flexBasis(50.percent)
        margin(15.px)
        flexDirection(FlexDirection.Column)
        height(300.px)
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.FlexStart)
        textAlign("start")
    }

    val projectGitLink by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.FlexStart)
        fontWeight(500)
        marginTop(20.px)
        property("font-family", "Raleway, sans-serif")
        property("font-size", "large")
    }

    val projectImageBg by style {
        backgroundColor(Color("white"))
        width(150.px)
        height(150.px)
        borderRadius(100.percent)
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
    }


}
