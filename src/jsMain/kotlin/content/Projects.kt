package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*
import style.MainStyle.itemNormalHeaderTexts
import style.MainStyle.normalTexts
import style.ProjectsStyle.PColumn1
import style.ProjectsStyle.PColumnText
import style.ProjectsStyle.projectGitLink
import style.ProjectsStyle.projectImageBg
import style.ProjectsStyle.projectStyleItem
import style.ProjectsStyle.projectsHeaders
import style.ProjectsStyle.projectsMain
import style.ProjectsStyle.projectsSection
import style.SkillsStyle
import style.SkillsStyle.skillsSection
import style.mainColor
import style.onWhiteColor

@Composable
fun Projects() {
    Section(
        attrs = {
            classes(projectsSection)
            style {
                position(Position.Relative)
            }
        }
    ) {

        Div(attrs = {
            classes(projectsMain)
        })
        {


            P(attrs = {
                classes(projectsHeaders)
            }) {
                Text("Open Source Projects and Articles")
            }

            val openSourceProjects = listOf(
                Project(
                    name = "JC-Switch",
                    description = "JC-Switch is Jetpack Compose Custom Switch Library built to enble fellow android developers implement a more customisable switch aside the orthodox android switch  provided\n" +
                            "provided by android or the material design libraries. It is easy to use and has a pretty staright forward documentation. Fill free to use it in any project and fork or make a pull request if you wish to contribute.",
                    githubLink = "https://github.com/develNerd/JC-CustomSwitch",
                    articleLink = "",
                    playstoreLink = "",
                    image = "jc_switch.gif"
                ),
                Project(
                    name = "Savit Authenticator",
                    description = "Savit Authenticator is probably the first open source Jetpack Compose Only Authenticator App deployed using Jenkins CI built to Encourage the use Offline Time / Counter Based One Time Passwords. (This project made great use of the open source Google Authenticator project)",
                    githubLink = "https://github.com/develNerd/SavitAuthenticator",
                    articleLink = "",
                    playstoreLink = "",
                    image = "ic_savit_authenticator.png"
                ),
                Project(
                    name = "JC-PortolioSite",
                    description = "JC-PortolioSite is a static website template built jetpack compose (Compose for Web) to help fellow developers extend their compose abilities to web development. Feel free to use this ",
                    githubLink = "https://github.com/develNerd/JC-PortfolioSite",
                    articleLink = "",
                    playstoreLink = "",
                    image = "ic_compose_web.svg"
                ),

                Project(
                    name = "Android 12 Animation Clone",
                    description = "This project is a clone of the Android 12 Clock Animation in the settings app." +
                            " It helps provide in depth knowledge about  Android's Touch Input Geometry in General." +
                            "You learn how to implement Rotation related stuff using Jetpack compose with touch events" +
                            "" +
                            "",
                    githubLink = "https://github.com/develNerd/AnimatingCompoables",
                    articleLink = "",
                    playstoreLink = "",
                    image = "clock_image.gif"
                ),
                Project(
                    name = "Animating Composables (Coming Soon)",
                    description = "A Beginners Tutorial for Animating Jetpack Compose Views. The article focuses on helping beginners understand the basics of animations in compose and also how it could be effectively used to enrich user interfaces wjen building android apps.\n",
                    githubLink = "https://github.com/develNerd/AnimatingCompoables",
                    articleLink = "https://github.com/develNerd/AnimatingCompoables",
                    playstoreLink = ""
                ),


                )

            openSourceProjects.forEachIndexed { index, project ->
                Div(
                    attrs = {
                        classes(projectStyleItem)

                    }
                ) {

                    Div(
                        attrs = {
                            classes(PColumn1)
                        }
                    ) {

                        Div(attrs = {
                            classes(projectImageBg)
                        }) {
                            Img(src = project.image.ifEmpty { "ic_github.svg" }, attrs = {
                                style {
                                    width(100.px)
                                    height(100.px)
                                }
                            })
                        }
                    }

                    Div(
                        attrs = {
                            classes(PColumnText)
                        }
                    ) {

                        P(attrs = {
                            classes(itemNormalHeaderTexts)
                            style {
                                property("color", onWhiteColor)
                            }
                        }) {
                            Text(project.name)
                        }

                        P(attrs = {
                            classes(normalTexts)
                            style {
                                property("color", onWhiteColor)
                            }
                        }) {
                            Text(project.description)
                        }


                        A(href = project.githubLink, attrs = {
                            classes(projectGitLink)
                            target(ATarget.Blank)
                        }) {
                            Text("Github Link")
                        }

                        if (project.articleLink.isNotEmpty()){
                            A(href = project.githubLink, attrs = {
                                classes(projectGitLink)
                                target(ATarget.Blank)
                            }) {
                                Text("Article Link")
                            }
                        }

                    }
                }
            }


        }

    }
}

data class Project(
    val name: String,
    val description: String,
    val githubLink: String,
    val articleLink: String = "",
    val playstoreLink: String = "",
    val image: String = "ic_github.svg"
)