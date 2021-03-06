package net.aiscope.gdd_app.dagger

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import net.aiscope.gdd_app.ui.capture.CaptureImageActivity
import net.aiscope.gdd_app.ui.mask.MaskActivity
import net.aiscope.gdd_app.ui.metadata.MetadataActivity
import net.aiscope.gdd_app.ui.newHealthFacility.NewHealthFacilityActivity
import net.aiscope.gdd_app.ui.selectDisease.SelectDiseaseActivity

@Module
abstract class BuildersModule {
    @Binds
    @IntoMap
    @ClassKey(NewHealthFacilityActivity::class)
    abstract fun bindNewHealthFacilityActivityInjectorFactory(factory: HospitalSubComponents.Factory):
            AndroidInjector.Factory<*>

    @Binds
    @IntoMap
    @ClassKey(SelectDiseaseActivity::class)
    abstract fun bindSelectDiseaseActivityInjectorFactory(factory: SelectDiseaseSubComponents.Factory):
            AndroidInjector.Factory<*>

    @Binds
    @IntoMap
    @ClassKey(MetadataActivity::class)
    abstract fun bindMetadataActivityInjectorFactory(factory: MetadataSubComponents.Factory):
            AndroidInjector.Factory<*>

    @Binds
    @IntoMap
    @ClassKey(CaptureImageActivity::class)
    abstract fun bindCaptureImageActivityInjectorFactory(factory: CaptureImageSubComponents.Factory):
            AndroidInjector.Factory<*>

    @Binds
    @IntoMap
    @ClassKey(MaskActivity::class)
    abstract fun bindMaskActivityInjectorFactory(factory: MaskSubComponents.Factory):
            AndroidInjector.Factory<*>
}
