fun main() {
    val likes = 112111
    val msgLike = "Понравилось "
    val human = " человеку "
    val people = " людям "

    if (likes % 10 === 1 && likes % 100 != 11) println(msgLike + likes + human) else println(msgLike + likes + people)
}