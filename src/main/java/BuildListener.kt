
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ex.ToolWindowManagerListener


class BuildListener(project: Project) : ToolWindowManagerListener {
    private val project: Project
    override fun stateChanged() {
        // handle the state change
    }

    init {
        this.project = project
    }
}