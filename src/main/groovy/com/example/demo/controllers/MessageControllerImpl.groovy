package com.example.demo.controllers

import javax.jws.WebService

@WebService(endpointInterface = "com.example.demo.controllers.MessageController")
class MessageControllerImpl implements MessageController {


    @Override
    def test() {
        return null
    }
}
