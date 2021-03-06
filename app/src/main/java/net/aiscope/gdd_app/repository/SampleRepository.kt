package net.aiscope.gdd_app.repository

import net.aiscope.gdd_app.model.Sample

interface SampleRepository {
    fun store(sample: Sample)
    fun load(id: String): Sample
    fun create(): Sample
    fun current(): Sample

    fun all(): List<Sample>
}
