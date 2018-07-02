package com.qvantel.rubik.csr.custom

import com.qvantel.rubik.api.CustomRouter
import play.api.{Configuration, Environment}
import play.api.inject.{Binding, Module}

class CustomModule extends Module {
  def bindings(environment: Environment, configuration: Configuration): Seq[Binding[CustomRouter]] = {
    Seq(bind[CustomRouter].to[SomeCustomRouter])
  }
}
