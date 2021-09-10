package com.regoworld.presentation.view.cast

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.regoworld.domain.model.cast.CastView
import com.regoworld.presentation.R
import com.regoworld.presentation.core.extensions.inflate
import kotlinx.android.synthetic.main.row_cast.view.*
import javax.inject.Inject
import kotlin.properties.Delegates

class CastsAdapter
@Inject constructor() : RecyclerView.Adapter<CastsAdapter.ViewHolder>() {

    internal var collection: List<CastView> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }

    internal var clickListener: (CastView) -> Unit = { _ -> }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(parent.inflate(R.layout.row_cast))

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) =
        viewHolder.bind(collection[position], clickListener)

    override fun getItemCount() = collection.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(castView: CastView, clickListener: (CastView) -> Unit) {

            with(itemView) {
                title.text = castView.name
                castId.text = castView.id
                status.text = castView.status
//            itemView.moviePoster.loadFromUrl(movieView.poster)
                setOnClickListener {
                    clickListener(
                        castView//,
//                    Navigator.Extras(itemView.moviePoster)
                    )
                }
            }
        }

    }
}
