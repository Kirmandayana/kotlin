/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.resolve.jvm.extensions

import com.intellij.openapi.project.Project
import org.jetbrains.kotlin.analyzer.AnalysisResult
import org.jetbrains.kotlin.analyzer.ModuleInfo
import org.jetbrains.kotlin.descriptors.ModuleDescriptor
import org.jetbrains.kotlin.extensions.ProjectExtensionDescriptor
import org.jetbrains.kotlin.psi.JetFile
import org.jetbrains.kotlin.resolve.BindingContext

public interface AnalysisCompletedHandlerExtension {
    companion object : ProjectExtensionDescriptor<AnalysisCompletedHandlerExtension>(
            "org.jetbrains.kotlin.analyzeCompleteHandlerExtension",
            javaClass<AnalysisCompletedHandlerExtension>()
    )

    public fun analysisCompleted(
            project: Project,
            module: ModuleDescriptor,
            bindingContext: BindingContext,
            files: Collection<JetFile>): AnalysisResult?
}