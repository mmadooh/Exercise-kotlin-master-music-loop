val songs = mutableListOf<String>()

fun initializePlaylist() {
    songs.add("Paradise")
    songs.add("Umbrella")
}

fun playAll(songs: List<String>) {
    for (song in songs) {
        println("Now playing: $song")
    }
}

fun addSong(songTitle: String) {
    songs.add(songTitle)
}

fun shuffleSongs() {
    songs.shuffle()
}

fun removeSong(songTitle: String) {
    songs.remove(songTitle)
}

fun findByArtist(artistName: String): List<String> {
    return songs.filter { it.contains(artistName, ignoreCase = true) }
}

fun showPlaylist() {
    println("Your Playlist:")
    for (song in songs) {
        println(song)
    }
}

fun main() {

    initializePlaylist()

    showPlaylist()

    playAll(songs)

    shuffleSongs()
    println("Shuffled Playlist:")
    showPlaylist()

    addSong("Yellow")
    println("After Adding a New Song:")
    showPlaylist()

    removeSong("Yellow")
    println("After Removing a Song:")
    showPlaylist()

    val artistSongs = findByArtist("Umbrella")
    println("Songs by Umbrella:")
    artistSongs.forEach { println(it) }
}
