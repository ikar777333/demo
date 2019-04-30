package com.example.demo.controllers

import javax.jws.WebMethod
import javax.jws.WebService

@WebService
interface MessageController {

    @WebMethod
    def test();

}