package org.example.jsoupParser

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

fun main() {

    val doc: Document =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get()

    val quotesLines: Elements = doc.select("div.sc-2aegk7-2")

    for (quotes in quotesLines) {
        println(quotes.text())
    }
}