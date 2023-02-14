package org.snd.mediaserver.kavita.model

import org.snd.mediaserver.model.mediaserver.MediaServerLibraryId

@JvmInline
value class KavitaLibraryId(val id: Int)

fun MediaServerLibraryId.kavitaLibraryId() = KavitaLibraryId(id.toInt())
