package net.aiscope.gdd_app.ui.capture

import java.io.File

interface CaptureImageView {

    fun takePhoto(imageName: String, onPhotoReceived: (File?) -> Unit)

    fun notifyImageCouldNotBeTaken()

//    fun goToMetadata()
    fun goToMask(imagePath: String, nextMaskName: String)
}
