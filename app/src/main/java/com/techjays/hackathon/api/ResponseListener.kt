package com.techjays.hackathon.api

import com.techjays.hackathon.api.Response

interface ResponseListener {

    /**
     * @param r - The model class that is passed on the parser
     */
    fun onResponse(r: Response?)
}
