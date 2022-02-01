package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*
import style.FooterStyle.footerStyle
import style.FooterStyle.openSourceFooterStyle
import style.MainStyle
import style.ProjectsStyle
import style.mainColor

@Composable
fun footer() {
    Section(
        attrs = {
            style {
                position(Position.Relative)
                height(auto)
            }
        }
    ) {

        Div(
            attrs = {
                classes(footerStyle)
            }
        ) {

            val socials = listOf(
                SocialMedia(name = "isaacakakpo4@gmail.com", icon = "ic_email.svg", link = ""),
                SocialMedia(name = "develNerd", icon = "ic_github_social.svg", link = "https://github.com/develNerd"),
                SocialMedia(
                    name = "@_edemkoku",
                    icon = "ic_instagram.svg",
                    link = "https://www.instagram.com/_edemkoku/"
                ),
                SocialMedia(name = "@_edem", icon = "ic_twitter.svg", link = "https://twitter.com/_edem"),
                SocialMedia(
                    name = "isaacakakpo",
                    icon = "ic_linkedin.svg",
                    link = "https://www.linkedin.com/in/isaac-akakpo/"
                ),
            )


            socials.forEach { social ->
                socialInfoItem(social.icon, social.name, social.link)
            }
        }


    }
}

@Composable
fun openSourceFooter() {
    Section(
        attrs = {
            style {
                position(Position.Fixed)
                property("bottom","0")
                height(auto)
                width(100.percent)
            }
        }
    ) {

        Div(
            attrs = {
                classes(openSourceFooterStyle)
                style {
                    display(DisplayStyle.Flex)
                    flexDirection(FlexDirection.Row)
                    justifyContent(JustifyContent.Center)
                    alignItems(AlignItems.Center)
                    height(auto)
                    width(auto)
                }
            }
        ) {

            A(href = "https://github.com/develNerd/JC-PortfolioSite/tree/main",
                attrs = {
                    target(ATarget.Blank)
                }) {
                P(attrs = {
                    classes(MainStyle.normalTextsInfo)
                    style {
                        marginTop(10.px)
                        color(Color.white)
                    }
                }) {
                    Text("Built with Jetpack Compose. Clone Here")
                }
            }
        }


    }
}

@Composable
fun socialInfoItem(icon: String, name: String, link: String) {
    Div(
        attrs = {
            style {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Row)
                justifyContent(JustifyContent.Center)
                alignItems(AlignItems.Center)
                padding(5.px)
                height(auto)
                width(auto)
            }
        }
    ) {

        A(href = link, attrs = {

            classes(ProjectsStyle.projectGitLink)
            target(ATarget.Blank)
            style {
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Row)
                justifyContent(JustifyContent.Center)
                alignItems(AlignItems.Center)
                padding(5.px)
                height(auto)
                width(auto)
                margin(20.px)
            }
        }) {


            Img(src = icon, attrs = {
                style {
                    width(20.px)
                    height(20.px)
                }
            })

            P(attrs = {
                style {
                    textAlign("center")
                    fontWeight(300)
                    margin(5.px)
                    property("font-family", "Open Sans, sans-serif")
                    property("color", "white")
                    property("font-size", "small")
                }
            }) {
                Text(name)
            }


        }


    }


}


data class SocialMedia(val name: String, val icon: String, val link: String = "")
