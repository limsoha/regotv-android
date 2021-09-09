package com.regoworld.regotv.ui.cast

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.regoworld.regotv.databinding.FragmentCastlistBinding
import com.regoworld.regotv.extensions.getViewModelFactory

class CastListFragment : Fragment() {

    private lateinit var viewDataBinding: FragmentCastlistBinding
    private val viewModel by viewModels<CastListViewModel> { getViewModelFactory() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        viewDataBinding = FragmentCastlistBinding.inflate(inflater, container, false).apply {
            viewmodel = viewModel
            // Set the lifecycle owner to the lifecycle of the view
            lifecycleOwner = this@CastListFragment.viewLifecycleOwner
        }
//        val remonCast = RemonCast.builder().context(context).build()
//        remonCast.fetchCasts()
//        remonCast.onFetch { casts ->
//        }
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
}