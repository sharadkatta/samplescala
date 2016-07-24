package com.kraft.datalake.sales.tap

import org.joda.time.LocalTime

object SampleScalaObject {
  def main(args: Array[String]) {
    println("Hello, world")

    var localTime: LocalTime = new LocalTime()
    println("Current time is" + localTime);
    localTime.plusHours(3);
    println("Current time is plus 3 hours is" + localTime.plusHours(3));
  }
}