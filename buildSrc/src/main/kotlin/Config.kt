import java.util.Date

/**
 * Created by Furuichi on 15/09/2023
 */
val _autoGenVersionCode: Int
    get() = (Date().time / 60000).toInt()

object Config {
    val applicationId: String = "com.kaizenvpn.vpn"
    val versionName: String = "1.0"
    val admobId = "ca-app-pub-4723331789662981~4559644223"

    object Version {
        val minSdk = 26
        val targetSdk = 33
        val compileSdk = 33
    }

}
