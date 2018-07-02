package com.qvantel.rubik.csr.custom

import javax.inject.{Inject, Singleton}

import com.qvantel.rubik.api.CustomRouter
import play.api.mvc.{Action, AnyContent, RequestHeader}
import play.api.routing.sird._

@Singleton
class SomeCustomRouter @Inject()(controller: CustomCtrl) extends CustomRouter {
  override def routes: PartialFunction[RequestHeader, Action[AnyContent]] = {
    case GET(p"/hello/$to") => controller.sayHello(to)
    case GET(p"/bye/$to") => controller.sayGoodBy(to)
    case GET(p"/view") => controller.customView()
  }
}


