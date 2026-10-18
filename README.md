# AutoCAD MCQ Master — Release Candidate 1.0.0

A modern dark-navy / electric-blue AutoCAD practice quiz for Android tablets. The Android shell loads a bundled HTML app locally, so the quiz itself does not need an internet connection.

## Included
- Four fixed practice sets (Set 1–Set 4), 50 questions per set
- 20-minute countdown per test
- English MCQs with Hindi translation toggle
- Selectable answers with a visible tick mark
- Automatic scoring, skipped-question count, and answer review
- Best percentage saved separately for each set on the device
- Responsive tablet/mobile layout
- Android WebView wrapper and a GitHub Actions workflow for APK compilation

## Question-bank status — please read
The bank contains 200 question entries and four 50-question sets. Several entries use repeated command-recognition patterns, and the bank has not been independently reviewed against every supported AutoCAD version. Treat this as a practice prototype, not a certified or fully verified exam bank.

## Use it immediately without compiling
Open `app/src/main/assets/index.html` in a browser on a computer, or copy that file to the Android tablet and open it with a browser/file viewer that supports local HTML. Quiz features run locally. Browser storage availability can vary when opening a `file://` page, so best-score persistence is most reliable in the Android app/WebView.

## Build the Android APK with Android Studio
1. Install Android Studio and Android SDK Platform 35 / Build Tools 35.
2. Open this `autocad_mcq_master` folder as an existing project.
3. Allow Gradle sync to finish while connected to the internet.
4. Choose **Build → Build Bundle(s) / APK(s) → Build APK(s)**.
5. The debug APK should appear at `app/build/outputs/apk/debug/app-debug.apk`.

## Build through GitHub Actions
1. Upload this folder's contents to a GitHub repository.
2. Open **Actions → Build Android APK → Run workflow** (or push to `main`/`master`).
3. Wait for the workflow to complete successfully.
4. Open the workflow run and download the `AutoCAD-MCQ-Master-debug-APK` artifact. It contains `app-debug.apk`.

The workflow downloads Gradle and Android SDK components, so it requires network access on the GitHub runner.

## Build status
**No APK is included in this ZIP.** The current workspace has Java but no Android SDK, no installed Gradle distribution, and no network access to fetch the missing build components. The source and automated build workflow are provided, but the APK build has not been run or device-tested here.
