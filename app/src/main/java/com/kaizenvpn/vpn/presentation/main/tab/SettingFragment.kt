package com.kaizenvpn.vpn.presentation.main.tab

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import androidx.navigation.fragment.findNavController
import com.kaizenvpn.vpn.BuildConfig
import com.kaizenvpn.vpn.R
import com.kaizenvpn.vpn.core.base.BaseFragment
import com.kaizenvpn.vpn.core.base.IndicatorState
import com.kaizenvpn.vpn.databinding.FragmentSettingBinding
import com.kaizenvpn.vpn.presentation.main.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


/**
 * Created by Furuichi on 25/09/2023
 */
@AndroidEntryPoint
class SettingFragment : BaseFragment<MainViewModel, FragmentSettingBinding>(FragmentSettingBinding::inflate) {

    override val viewModel: MainViewModel by hiltNavGraphViewModels(R.id.nav_main_graph)

    override fun onFragmentCreated(view: View, savedInstanceState: Bundle?) {
        setupViews()

    }

    override fun handleError(error: IndicatorState.Error) {}

    /**
     * SETUP VIEWS
     */
    private fun setupViews() {
        viewBinding.rateUs.setOnClickListener {
            val uri = Uri.parse("market://details?id=" + BuildConfig.APPLICATION_ID)
            val goToMarket = Intent(Intent.ACTION_VIEW, uri)
            goToMarket.addFlags(
                Intent.FLAG_ACTIVITY_NO_HISTORY or
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT or
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK
            )
            try {
                startActivity(goToMarket)
            } catch (e: ActivityNotFoundException) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID)
                    )
                )
            }
        }
        viewBinding.shareApp.setOnClickListener {
            try {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.setType("text/plain")
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, resources.getString(R.string.app_name))
                var shareMessage = "\nEnjoy and Share...\n\n"
                shareMessage =
                    shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n"
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
                startActivity(Intent.createChooser(shareIntent, "choose one"))
            } catch (e: Exception) {
                //e.toString();
            }
        }
        viewBinding.privacyPolicy.setOnClickListener {
            findNavController().navigate(R.id.action_to_privatePolicyFragment)
        }
        viewBinding.contactUs.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.setData(Uri.parse("mailto:"))
            intent.putExtra(
                Intent.EXTRA_EMAIL,
                arrayOf<String>(getString(R.string.developer_email))
            )

            intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback for " + getString(R.string.app_name))
            intent.putExtra(
                Intent.EXTRA_TEXT,
                """
                            You can send problems or suggestions to us.
                            VersionName:  ${Build.VERSION.RELEASE}
                            VersionCode:  ${Build.MODEL}
                            Device Brand/Model:   ${Build.MODEL}
                            Describe issue you faced:
                            
                            """.trimIndent()
            )


            try {
                startActivity(Intent.createChooser(intent, "Send E-mail"))
            } catch (ex: ActivityNotFoundException) {
                Toast.makeText(context, "No email app found.", Toast.LENGTH_SHORT).show()
            } catch (ex: java.lang.Exception) {
                Toast.makeText(context, "Network Error", Toast.LENGTH_SHORT).show()
            }
        }

    }



}