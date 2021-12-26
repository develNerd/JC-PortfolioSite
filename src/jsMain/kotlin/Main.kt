import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import content.*
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import style.AppStylesheet

fun main() {

    renderComposable(rootElementId = "root") {
        Style(AppStylesheet)
        Nav()
        Home()
        AboutMe()
        Skills()
        Projects()
        Footer()
    }
}

