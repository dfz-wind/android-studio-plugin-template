# An Android Studio plugin developed using Android Studio
[中文文档入口](README.md "中文")

Why?
-----------
Need another IDE to develop Android Studio plugins? No!!!  
This template solves the problem of developing AS plugins within Android Studio itself.


What is this?
-----------
An Android Studio project containing a fully functional IntelliJ Platform Plugin implementation.

Quick Start
-----------
```bash
# Build and deploy plugin
./gradlew :plugin:jar

# Restart Android Studio after first installation
# Update plugin by disabling then re-enabling in Plugin Manager
````

## Project Structure
```
├── app/          # Empty module
└── plugin/       # Plugin implementation
    └── src/
        ├── main/java/com/dfz/plugin/
        │   └── DfzAction.java  # Right-click handler
        └── resources/META-INF/
            └── plugin.xml      # Plugin configuration
    └── build.gradle # Build configuration in gradle

```
