/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package unstable.app

import unstable.utilities.StringUtils

import org.apache.commons.text.WordUtils

fun main() {
    val tokens = StringUtils.split(MessageUtils.getMessage())
    val result = StringUtils.join(tokens)
    println(WordUtils.capitalize(result))
}
