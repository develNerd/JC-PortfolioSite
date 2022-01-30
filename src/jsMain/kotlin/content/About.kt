package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*
import style.AboutStyle
import style.AboutStyle.AIColumn
import style.AboutStyle.InterestItemRow
import style.AboutStyle.InterestRowRoundItem
import style.AboutStyle.aboutMeMain
import style.HomeStyle
import style.MainStyle.Body1
import style.MainStyle.Header1
import style.SkillsStyle.skillsMain
import style.mainColor

@Composable
fun AboutMe() {
    Section(
        attrs = {
            classes("about-section")
            style {
                position(Position.Relative)
            }
        }
    ) {


        Div(attrs = {
            classes(aboutMeMain)
        })
        {

            Img(src = "ic_about_me.svg", attrs = {
                style {
                    width(50.px)
                    height(50.px)
                }
            })

            P(attrs = {
                classes(Header1)
            }) {
                Text("About Me")
            }

            P(attrs = {
                classes(Body1)
            }) {
                Text(
                    "I am an energetic software engineer and an excellent problem solver . I love to take up new challenges and also an early adopter of new technologies. \n" +
                            " I am  enthusiastic and ready to learn from my friends, superiors and co-workers.\n" +
                            "I enjoy what I do and hope to take on more challenging issues. \n" +
                            "I have always been an A Team player and love to work together with other team members to achieve a common goal. "
                )
            }

            P(attrs = {
                classes(Header1)
                style{
                    justifyContent(JustifyContent.Center)

                }
            }) {
                Text("Interests")
            }

            Div(
                attrs = {
                    style{
                        display(DisplayStyle.Flex)
                        justifyContent(JustifyContent.Center)
                        flexWrap(FlexWrap.Wrap)
                        flexDirection(FlexDirection.Column)
                        width(100.percent)
                        height(auto)
                    }
                }
            ) {
                Div(
                    attrs = {
                        style {
                            display(DisplayStyle.Flex)
                            width(100.percent)
                            flexWrap(FlexWrap.Wrap)
                            height(auto)
                            justifyContent(JustifyContent.Center)
                            alignItems(AlignItems.Center)
                        }
                    }
                ) {

                    val listOfInterests = listOf(
                        Interest("MUSIC", "ic_music.svg"),
                        Interest("GAMES", "ic_game.svg"),
                        Interest("TRAVEL", "ic_travel.svg")
                    )

                    listOfInterests.forEachIndexed { index,interest ->
                        Div(
                            attrs = {
                                classes(AIColumn)

                            }
                        ) {
                            InterestCard(interestName = interest.name) {
                                Img(src = interest.image, attrs = {
                                    classes(AboutStyle.InterestIconItem)
                                })
                            }

                        }
                    }

                }

                Div(
                    attrs = {
                        style {
                            display(DisplayStyle.Flex)
                            width(100.percent)
                            flexWrap(FlexWrap.Wrap)
                            height(auto)
                            justifyContent(JustifyContent.Center)
                            alignItems(AlignItems.Center)
                            marginTop(30.px)
                        }
                    }
                ) {

                    val listOfInterests = listOf(
                        Interest("MOVIES", "ic_movies.svg"),
                        Interest("CRAFT", "ic_photograph.svg"),
                        Interest("NATURE", "ic_nature.svg"),
                    )

                    listOfInterests.forEach { interest ->
                        Div(
                            attrs = {
                                classes(AIColumn)
                            }
                        ) {
                            InterestCard(interestName = interest.name) {
                                Img(src = interest.image, attrs = {
                                    classes(AboutStyle.InterestIconItem)
                                })
                            }

                        }
                    }

                }
            }




        }

    }
}

@Composable
fun InterestCard(interestName: String, imageContent: @Composable () -> Unit) {
    Div(
        attrs = {
            classes(InterestItemRow)
        }
    ) {

        Div(attrs = {
            classes(InterestRowRoundItem)
        }) {
            imageContent()
        }

        P(attrs = {
            classes(Header1)
        }) {
            Text(interestName)
        }

    }
}

data class Interest(val name: String, val image: String)

