package com.niiiico.monitor

import org.gradle.api.Plugin
import org.gradle.api.Project;

public class MonitorPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.android.registerTransform(new MonitorTransform(project))
    }
}