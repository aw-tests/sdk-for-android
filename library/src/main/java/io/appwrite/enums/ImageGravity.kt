package io.appwrite.enums

enum class ImageGravity(val value: String) {
    CENTER("center"),
    TOP-LEFT("top-left"),
    TOP("top"),
    TOP-RIGHT("top-right"),
    LEFT("left"),
    RIGHT("right"),
    BOTTOM-LEFT("bottom-left"),
    BOTTOM("bottom"),
    BOTTOM-RIGHT("bottom-right");

    override fun toString() = value
}