package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*
import style.*
import style.MainStyle.itemNormalHeaderTexts
import style.SkillsStyle.skillHeaderText
import style.SkillsStyle.skillProficientText
import style.SkillsStyle.skillRating
import style.SkillsStyle.skillRatingBox
import style.SkillsStyle.skillsColumn1
import style.SkillsStyle.skillsMain
import style.SkillsStyle.skillsSection
import style.SkillsStyle.skillsSectionItems

@Composable
fun Skills() {
    Section(
        attrs = {
            classes(skillsSection)
            style {
                position(Position.Relative)
            }
        }
    ) {

        Div(attrs = {
            classes(skillsMain)
        })
        {

            Img(src = "ic_skills.svg", attrs = {
                style {
                    width(50.px)
                    height(50.px)
                }
            })

            P(attrs = {
                classes(MainStyle.skillsHeader)
            }) {
                Text("Skills")
            }

            Div(
                attrs = {
                    style {
                       classes(skillsSectionItems)
                    }
                }
            ) {

                val skillSet =
                    listOf(
                        Skill(
                            image = "ic_android.svg",
                            name = "Android Engineering",
                            skillLevel = 83,
                            experience = 3,
                            proficiency = "Proficient",
                            mainColor = androidSkillsColor,
                            rgbaColor = colorSkills1,
                            ratingBgColor = androidRatingBgColor
                        ),
                        Skill(
                            image = "ic_devops.svg",
                            name = "DevOps (CI/CD)",
                            skillLevel = 48,
                            experience = 2,
                            proficiency = "Intermediate",
                            mainColor = devOpsSkillsColor,
                            rgbaColor = bgSkillsDevOps,
                            ratingBgColor = devOpsRatingBgColor
                        ),
                        Skill(
                            image = "ic_webdev.svg",
                            name = "Web Development",
                            skillLevel = 30,
                            experience = 3,
                            proficiency = "Junior",
                            mainColor = webSkillsColor,
                            rgbaColor = bgSkillsWeb,
                            ratingBgColor = webRatingBgColor
                        )
                    )

                skillSet.forEach { skill ->
                    Div(
                        attrs = {
                            classes(skillsColumn1)
                            style {
                                backgroundColor(skill.rgbaColor)
                            }
                        }
                    ) {

                        Img(src = skill.image, attrs = {
                            style {
                                width(48.px)
                                height(48.px)
                            }
                        })

                        P(attrs = {
                            classes(skillHeaderText)
                            style {
                                property("color", skill.mainColor)
                            }
                        }) {
                            Text(skill.name)
                        }

                        P(attrs = {
                            classes(skillProficientText)
                            style {
                                property("color", skill.mainColor)
                            }
                        }) {
                            Text("Proficiency Level - ${skill.proficiency}")
                        }

                        Div(
                            attrs = {
                                classes(skillRatingBox)
                                style {
                                    backgroundColor(skill.ratingBgColor)
                                }
                            }
                        ) {
                            Div(
                                attrs = {
                                    classes(skillRating)
                                    style {
                                        width(skill.skillLevel.percent)
                                        backgroundColor(Color(skill.mainColor))
                                    }
                                }
                            ) {

                            }

                        }

                        P(attrs = {
                            classes(itemNormalHeaderTexts)
                            style {
                                property("color", skill.mainColor)
                            }
                        }) {
                            Text("Experience")
                        }

                        P(attrs = {
                            classes(skillProficientText)
                            style {
                                property("color", androidSkillsColor)
                            }
                        }) {
                            Text("${skill.experience} Plus Years")
                        }

                    }

                }


            }
        }

    }
}

data class Skill(
    val image: String,
    val name: String,
    val skillLevel: Int,
    val experience: Int,
    val proficiency: String,
    val mainColor: String,
    val rgbaColor: CSSColorValue,
    val ratingBgColor: CSSColorValue
)