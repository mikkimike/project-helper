package com.github.mikkimike.projecthelper.services

import com.intellij.openapi.project.Project
import com.github.mikkimike.projecthelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
