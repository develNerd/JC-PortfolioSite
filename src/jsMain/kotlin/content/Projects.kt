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
                    name = "Project Name",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut" +
                            " enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                    githubLink = "https://github.com/develNerd/AnimatingCompoables",
                    articleLink = "",
                    playstoreLink = "",
                    image = "ic_github.svg"
                ),
                Project(
                    name = "Project Name",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut" +
                            " enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                    githubLink = "https://github.com/develNerd/AnimatingCompoables",
                    articleLink = "",
                    playstoreLink = "",
                    image = "ic_github.svg"
                ),
                Project(
                    name = "Project Name",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut" +
                            " enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                    githubLink = "https://github.com/develNerd/AnimatingCompoables",
                    articleLink = "",
                    playstoreLink = "",
                    image = "ic_github.svg"
                ),

                Project(
                    name = "Project Name",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut" +
                            " enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                    githubLink = "https://github.com/develNerd/AnimatingCompoables",
                    articleLink = "",
                    playstoreLink = "",
                    image = "ic_github.svg"
                ),
                Project(
                    name = "Project Name",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut" +
                            " enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                    githubLink = "https://github.com/develNerd/AnimatingCompoables",
                    articleLink = "",
                    playstoreLink = "",
                    image = "ic_github.svg"
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

                        if (project.articleLink.isNotEmpty()) {
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