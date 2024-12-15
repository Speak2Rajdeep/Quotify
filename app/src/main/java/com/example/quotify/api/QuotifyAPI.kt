package com.example.quotify.api

import com.example.quotify.models.QuoteListItem
import retrofit2.Response
import retrofit2.http.GET

interface QuotifyAPI {

    @GET("/v3/b/67571310acd3cb34a8b6b4cd?meta=false")
    suspend fun getQuotes(category : String) : Response<List<QuoteListItem>>
}