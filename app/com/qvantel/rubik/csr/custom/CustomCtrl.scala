package com.qvantel.rubik.csr.custom

import javax.inject.{Inject, Singleton}

import play.api.{Configuration, Logger}
import play.api.mvc.{Action, AnyContent, Controller}

@Singleton
class CustomCtrl @Inject()(configuration: Configuration) extends Controller {


  def sayHello(to: String): Action[AnyContent] = Action { implicit request =>
    Ok(s"Hello $to")
  }

  def sayGoodBy(to: String): Action[AnyContent] = Action { implicit request =>
    Ok(s"Good bye $to")
  }

  def customView: Action[AnyContent] = Action {
    Logger.info(s"Custom setting: ${configuration.getString("custom.setting").getOrElse("No setting")}")
    Logger.info(s"Base setting: ${configuration.getString("csr.channel").getOrElse("No channel")}")

    Ok(views.html.custom())
  }
}
