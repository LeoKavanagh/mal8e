package mal8e

import org.scalajs.dom
import org.scalajs.dom.document

import Mallacht._

object Main {

  // def appendPar(targetNode: dom.Node, text: String): Unit = {
  //   val parNode = document.createElement("p")
  //   parNode.textContent = text
  //   targetNode.appendChild(parNode)
  // }

  def appendTextNode(targetNode: dom.Node, level: String, text: String): Unit = {
    val newNode = document.createElement(level)
    newNode.textContent = text
    newNode.setAttribute("style", "text-align: center")

    targetNode.appendChild(newNode)
  }


  def setHeaders(targetNode: dom.Node): Unit = {
    appendTextNode(targetNode, "h1", "Mal8")
    appendTextNode(targetNode, "h2", "Mal-Ocht")
    appendTextNode(targetNode, "h3", "Mallacht")
    appendTextNode(targetNode, "p", "Curse")
  }


  def changePar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.getElementById("mallacht")
    parNode.textContent = text
  }

  def addClickedMessage(): Unit = {
    val mallacht = abair()
    changePar(document.body, mallacht)
  }

  def setupUI(): Unit = {

    val centrediv = document.createElement("div")
    centrediv.setAttribute("id", "mydiv")
    centrediv.setAttribute("style", "display: flex; flex-direction: column; justify-content: center; text-align: center;")

    // setHeaders(document.getElementById("mydiv"))
    setHeaders(document.body)

    val button = document.createElement("button")
    button.textContent = "Brúigh an cnaipe!"
    button.setAttribute("class", "block")

    button.addEventListener("click", { (e: dom.MouseEvent) =>
      addClickedMessage()
    })

    val p = document.createElement("h2")
    p.textContent = "Fáilte"
    p.setAttribute("id", "mallacht")

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
