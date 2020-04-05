package mal8e

import scala.util.Random

object Mallacht{

  val random = new Random()

  val mal8e: List[(String, String)] = List(
    ("Loscadh is dó ort","That you may be burned and scorched"),
    ("Droch chrích ort","Bad ending upon you"),
    ("Imeacht gan teacht ort","That you may leave without returning"),
    ("Go dtuitfeadh an tigh ort","That your house will fall upon you"),
    ("Go mbrise an diabhal do chnámha","That the Devil will break your bones"),
    ("Droch áird chúgat lá gaoithe","That you may be badly positioned on a windy day"),
    ("Nár chuire Dia ar do leas thú","That God will never grant you peace"),
    ("Mallacht mo chait ort","My cat’s curse upon you"),
    ("Mallacht na baintrí ort","A widow’s curse upon you"),
    ("Mallacht Dé ort","God’s curse upon you"),
    ("Go mbrise an diabhal do dhá chois","That the Devil may break your legs"),
    ("Go ndéana an diabhal dréimire do chnámh do dhroma","That the Devil will make a ladder out of your spine"),
    ("Fán fada ort","Long may you be astray"),
    ("Léan ort","Sorrow betide you"),
    ("Go mbrise an diabhal cnámh do dhroma","That the Devil may break your spine"),
    ("Go dtitfidh an oíche ort","That night will befall you"),
    ("Briseadh agus brú ort","Strife and stress upon you"),
    ("Go ndéanfaidh an diabhal cipín dod’ dhá chois","That the Devil makes splinters of your legs"),
    ("Dó agus bascadh ort","May you burn and be severely injured"),
    ("An áit thíos atá ceapaithe duit, a dhiabhal","It is the place below that is meant for you, you devil"),
    ("Go ndalladh an diabhal thú","That the Devil may blind you"),
    ("Lagú cléibh ort","Weariness of heart upon you"),
    ("Breith i bpoll cúng ort","That you may be caught in the grave"),
    ("Go stolladh an diabhal thú","That the Devil may lacerate you"),
    ("Go séideadh an diabhal san aer tú","May the Devil blow you into the air"),
    ("Lomad an Luain ort","Woe betide you"),
    ("Nár eirigh an lá leat","That you may not be successful on the day"),
    ("Go dtachtfadh an diabhal thú","May the Devil choke you"),
    ("A chonách san ort","It serves you right!"),
    ("Go bhfaghaine bás gan an sagart","I hope you die without a priest"),
    ("Galar an bháis ort","The disease of death upon you"),
    ("Nára bheire an mhaidin ort","That you may not see the morning"),
    ("Nár thagair abhaile slán","That you may not come home safe"),
    ("Imeacht gan do thuairisc ort","That you may never be heard of again"),
    ("Go marbhaí an diabhal tú","That the Devil may kill you"),
    ("Náire agus aithir chugat","That you may be shamed and disgraced"),
    ("Ualach sé chapall de chré na h-úire ort","Six horseloads of graveyard clay upon you"),
    ("Imeacht go fánach ort féin is ar do chnapán miúlach","Off with you and your lousy lump"),
    ("Tuirse ort","That you may tire"),
    ("Go n-ullamhuighe an diabhal teinne dhuit","That the Devil may prepare a fire for you"),
    ("Nár a cuire Dia aon crích cóir ort","That God does not grant you a proper end"),
    ("Go n-imi an droch aimsir leat","That the bad weather leaves with you"),
    ("Dul go h-olc ort","Bad luck to you"),
    ("Go mbeire an dá dhiabhal deag leo tú","That the twelve devils take you with them"),
    ("Go n-imigh na seacht diabhail deag atá i n-Ifrionn i’d dhiaidh","May hell’s 17 devils go after you"),
    ("Nách mór an diabhal thú","Aren’t you the devil"),
    ("Is ceann de’s na h-óinseacha diabhail thú","You are one of the Devil’s fools"),
    ("Mullach do chinn fút","That you may fall on your head"),
    ("Go dtachtar le d’anáil thú","That you may choke on your breath"),
    ("Buineach dhearg go dtigidh ort","That you may have red diarrhoea"))

  def abair(): String = {
    val idx = random.nextInt(mal8e.length)
    val curse = mal8e(idx)
    curse._1 + " - " + curse._2
  }

}