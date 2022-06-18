package com.github.xingkongqwq.javalint.services

import com.intellij.openapi.project.Project
import com.github.xingkongqwq.javalint.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
