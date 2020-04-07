package mal8e

import org.scalajs.dom
import org.scalajs.dom.document
import scala.scalajs.js.annotation.JSExportTopLevel

import Mallacht._

object Main {

  // def appendPar(targetNode: dom.Node, text: String): Unit = {
  //   val parNode = document.createElement("p")
  //   parNode.textContent = text
  //   targetNode.appendChild(parNode)
  // }

  def changePar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.getElementById("mallacht")
    parNode.textContent = text
  }

  def addClickedMessage(): Unit = {
    val mallacht = abair()
    changePar(document.body, mallacht)
  }

  def setupUI(): Unit = {

    val button = document.createElement("button")
    button.textContent = "Brúigh an cnaipe!"

    button.addEventListener("click", { (e: dom.MouseEvent) =>
      addClickedMessage()
    })

    val p = document.createElement("h2")
    p.textContent = "Conas taoi inniú?"
    p.setAttribute("id", "mallacht")

    val centrediv = document.createElement("div")
    centrediv.setAttribute("id", "mydiv")
    centrediv.setAttribute("align", "center")

    document.body.appendChild(centrediv)
    document.getElementById("mydiv").appendChild(button)
    document.getElementById("mydiv").appendChild(p)

  }

  def main(args: Array[String]): Unit = {
    document.addEventListener("DOMContentLoaded", { (e: dom.Event) =>
      setupUI()
    })
  }

}
