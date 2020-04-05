package mal8e

import org.scalajs.dom
import org.scalajs.dom.document
import scala.scalajs.js.annotation.JSExportTopLevel

import Mallacht._

object Main {

  def appendPar(targetNode: dom.Node, text: String): Unit = {

    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

  def addClickedMessage(): Unit = {
    val mallacht = abair()
    appendPar(document.body, mallacht)
  }

  def setupUI(): Unit = {
    val button = document.createElement("button")
    button.textContent = "Brúigh an cnaipe"

    button.addEventListener("click", { (e: dom.MouseEvent) =>
      addClickedMessage()
    })

    document.body.appendChild(button)

  }

  def main(args: Array[String]): Unit = {
    document.addEventListener("DOMContentLoaded", { (e: dom.Event) => 
      setupUI()
    })
  }

}
