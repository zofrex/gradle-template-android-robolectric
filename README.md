# Android + Robolectric Gradle Project Template

A minimal barebones template for starting a new Android application using the new build tool and unit testing using the Robolectric framework.

## What

A Gradle-based Android project configured to use the latest versions of the build tools and the bleeding edge version of Robolectric (2.3). The project is configured as a single-project build, using the latest conventions for filesystem layout.

You can write your tests as plain JUnit 4 tests or as Robolectric tests, and you can then run or debug them with the gradle task "test".

Currently this completely replaces instrumentation tests as an option. A future version of this project will allow both types of testing to coexist.

## Why

The projects generated by Android Studio don't really line up with how I usually start an app: I want a single-project build, minimal cruft, and to test using Robolectric. I wanted to create a template from which I could start new projects, and figured it might be helpful for other people too.

## How

You can quickly get started by [downloading this project as a zipfile](https://github.com/zofrex/gradle-template-android-robolectric/archive/master.zip). You can use it as a basis for a new project, and it comes ready to be imported into Android Studio (should work in 0.5.\*).

This is all under the ISC license, which should give you enough freedom to use this as you wish - as a starting point, copy-pasting bits from it, or merely a reference.

## Guide

Put your java code in src/main/java, your resources in src/main/res, and your tests in src/androidTest/java.
