package com.github.appintro.example.ui.permissions

import android.Manifest
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.github.appintro.AppIntro
import com.github.appintro.AppIntroFragment
import com.github.appintro.example.R

class PermissionsIntro : AppIntro() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addSlide(AppIntroFragment.createInstance(
                "Welcome!",
                "This is a demo of the AppIntro library, with permissions being requested on a slide!",
                imageDrawable = R.drawable.ic_slide1))

        addSlide(AppIntroFragment.createInstance(
                "Permission Request",
                "In order to access your camera, you must give permissions.",
                imageDrawable = R.drawable.ic_slide2))

        addSlide(AppIntroFragment.createInstance(
                "Simple, yet Customizable",
                "The library offers a lot of customization, while keeping it simple for those that like simple.",
                imageDrawable = R.drawable.ic_slide3))

        val calendarPermissionFragment = AppIntroFragment.createInstance(
            "Explore",
            "Feel free to explore the rest of the library demo!",
            imageDrawable = R.drawable.ic_slide4)
        addSlide(calendarPermissionFragment)


        addSlide(AppIntroFragment.createInstance(
            "Simple, yet Customizable",
            "The library offers a lot of customization, while keeping it simple for those that like simple.",
            imageDrawable = R.drawable.ic_slide3))


        // Here we ask for camera permission on slide 2
        askForPermissions(arrayOf(Manifest.permission.CAMERA), 2)

        // Here we ask for Calendar permission on slide 4, but we use the fragment instead of
        // slideNumber
        askForPermissions(arrayOf(Manifest.permission.READ_CALENDAR), calendarPermissionFragment)
    }



    public override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        finish()
    }

    public override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        finish()
    }
}