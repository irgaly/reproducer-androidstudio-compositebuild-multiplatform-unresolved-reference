
reproducer of https://issuetracker.google.com/issues/272334479

**2023/08/28: This issue has been fixed from Kotlin 1.8.20 and confirmed with Android Studio Giraffe 2022.3.1 Patch 1 \~**

# reproducer-androidstudio-compositebuild-multiplatform-unresolved-reference

* `:app` is an Android Application module
* `:compositebuild-library` is an included composite build module
* `:compositebuild-library:library` is an Android Library module (Multiplatform + ios())
* `:compositebuild-library:core` is an Multiplatform module (Multiplatform + ios())

then, `:compositebuild-library:core`'s Classes are `Unresolved reference`
from `:compositebuild-library:library` module.

![image](https://user-images.githubusercontent.com/1311446/224027772-38e1a901-1f76-4671-92f4-86e3de9ce445.png)

# Android Studio version

```
Android Studio Giraffe | 2022.3.1 Canary 8
Build #AI-223.8617.56.2231.9687552, built on March 4, 2023
Runtime version: 17.0.6+0-17.0.6b802.4-9586694 aarch64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
macOS 13.2.1
GC: G1 Young Generation, G1 Old Generation
Memory: 4096M
Cores: 8
Metal Rendering is ON
Registry:
    external.system.auto.import.disabled=true
    debugger.new.tool.window.layout=true
    ide.text.editor.with.preview.show.floating.toolbar=false
    ide.instant.shutdown=false
    ide.experimental.ui=true

Non-Bundled Plugins:
    detekt (1.22.2)
    IdeaVIM (2.1.0)
    kotest-plugin-intellij (1.3.67-IC-2022.3)
    com.squareup.sqldelight (1.5.5)
```
