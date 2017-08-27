package com.allaboutscala.chapter.one.tutorial_10


import com.typesafe.scalalogging.LazyLogging

/**
  * Created by Administrator on 2017/8/25 0025.
  */
object HelloWorldWithScalaLogging extends App with LazyLogging{
  logger.info("Hello World from Scala Logging")
  var a:String = _
  a = "bb"
  logger.info(a)
}
