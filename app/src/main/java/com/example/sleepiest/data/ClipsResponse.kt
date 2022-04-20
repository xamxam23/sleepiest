package com.example.sleepiest.data

class ClipsResponse(
    val window: Int,
    val version: Int,
    val apiWarning: String,
    val body: Body
) {

    class Body(
        val totals: Totals,
        val clips: List<Clip>
    ) {

    }

    class Totals(
        val count: Long,
        val offset: Int
    )

    class Clip(
        val id: Long,
        val seasonNumber: Int?,
        val episodeNumber: Int?,
        val title: String,
        val user: User
    ) {

        class User(
            val id: Long,
            val username: String,
            val urls: Urls
        ) {
            class Urls(
                val profile: String,
                val image: String,
            )
        }
    }
}
