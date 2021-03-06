package io.github.scalahackers.todo

object MapUtils {
  implicit class PimpMyMap[A,B](map: Map[A,B]) {
    def mapValue(a: A, f: B =>B) = map.map {
      case (`a`, b) => (a, f(b))
      case other => other
    }
  }
}
