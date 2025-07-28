# 一个使用Android studio开发的Android studio插件
[English Document](readme-en.md "english")

前言
-----------
  开发 Android Studio 插件需要安装另一个编译器(IntelliJ IDEA)？
  不！！！这太蠢了


这是什么?
-----------
 一个Android studio的工程，内部包含一个Android studio的插件(Intellij Plugin)

快速使用
-----------
使用命令gradlew :plugin:jar可以直接打包出一个插件,并自动将插件拷贝到本地的Android Studio的插件目录

首次安装插件需重启Android Studio
更新插件只需在插件管理器disable插件，然后enable

## 模块描述
```language
├── app/          # Empty module
└── plugin/       # Plugin implementation
    └── src/
        ├── main/java/com/dfz/plugin/
        │   └── DfzAction.java  # 按钮事件响应
        └── resources/META-INF/
            └── plugin.xml      # 插件配置文件
    └── build.gradle # 插件gradle构建文件

```
