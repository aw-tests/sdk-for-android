package io.appwrite.enums

enum class Browser(val value: String) {
    AVANT_BROWSER("aa"),
    ANDROID_WEB_VIEW_BETA("an"),
    GOOGLE_CHROME("ch"),
    GOOGLE_CHROME_(I_OS)("ci"),
    GOOGLE_CHROME_(MOBILE)("cm"),
    CHROMIUM("cr"),
    MOZILLA_FIREFOX("ff"),
    SAFARI("sf"),
    MOBILE_SAFARI("mf"),
    MICROSOFT_EDGE("ps"),
    MICROSOFT_EDGE_(I_OS)("oi"),
    OPERA_MINI("om"),
    OPERA("op"),
    OPERA_(NEXT)("on");

    override fun toString() = value
}