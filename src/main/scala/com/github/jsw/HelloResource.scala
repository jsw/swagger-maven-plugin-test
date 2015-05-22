package com.github.jsw

import com.wordnik.swagger.annotations.Api
import com.wordnik.swagger.annotations.ApiOperation
import com.wordnik.swagger.annotations.ApiResponse
import com.wordnik.swagger.annotations.ApiResponses
import javax.ws.rs.GET
import javax.ws.rs.Path


case class MyWorld(x: String, y: Int)

@Api(value="/hello", description="Hello Operations")
class HelloResource {
   
   @ApiOperation(value="say hello", response=classOf[MyWorld])
   @GET
   @Path("/world")
   def hello () = MyWorld("hello", 0)
}
