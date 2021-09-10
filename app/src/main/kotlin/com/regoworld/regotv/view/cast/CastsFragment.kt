package com.regoworld.regotv.view.cast

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.regoworld.regotv.R
import com.regoworld.regotv.core.extensions.observe
import com.regoworld.regotv.databinding.FragmentCastsBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_casts.*
import javax.inject.Inject

@AndroidEntryPoint
class CastsFragment : Fragment() {

    private lateinit var viewDataBinding: FragmentCastsBinding
    private val viewModel: CastsViewModel by viewModels()//hiltNavGraphViewModels(navGraphId = R.id.nav_host_fragment_activity_main)

    @Inject
    lateinit var castsAdapter: CastsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        viewDataBinding = FragmentCastsBinding.inflate(inflater, container, false).apply {
            viewmodel = viewModel
            // Set the lifecycle owner to the lifecycle of the view
            lifecycleOwner = this@CastsFragment.viewLifecycleOwner
        }
//
//        val viewer = RemonCast.builder()
//            .context(context)
//            .remoteView(root.remote_video_view)
//            .serviceId(ServiceConfig.remoteServerKey)
//            .key(ServiceConfig.secretKey)
//            .build()
//        root.run.setOnClickListener {
//            viewer.join("CHc2ddaf76753c4f45b475bd925003d92c")
//        }
        return viewDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initializeView()
    }

    private fun initializeView() {
        casts.adapter = castsAdapter
//        castsAdapter.clickListener = { movie, navigationExtras ->
//            navigator.showMovieDetails(requireActivity(), movie, navigationExtras)
//        }
    }
}