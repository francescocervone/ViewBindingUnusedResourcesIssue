# ViewBindingUnusedResourcesIssue

A sample project to demonstrate that https://issuetracker.google.com/issues/142004503 was not fixed in Android Gradle Plugin 4.1

## Steps to reproduce
Just run:

```bash
./gradlew lint
```

`R.layout.activity_main.xml` will be reported as unused even if it is used with viewBinding in `MainActivity.kt` like this:

```kotlin
val binding by viewBinding(ActivityMainBinding::inflate)
```
