package com.luckyfriday.instagramclone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.luckyfriday.instagramclone.R
import com.luckyfriday.instagramclone.adapters.ProfileCollectionAdapter
import com.luckyfriday.instagramclone.adapters.ProfileHighlightAdapter
import com.luckyfriday.instagramclone.models.ProfileCollectionModel
import com.luckyfriday.instagramclone.models.ProfileHighlightModel

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val highlightRecyclerView = view.findViewById<RecyclerView>(R.id.rv_profile_highlight)
        highlightRecyclerView.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        val highlightAdapter = ProfileHighlightAdapter(getProfileHighlightList())
        highlightRecyclerView.adapter = highlightAdapter

        val profileRecyclerView = view.findViewById<RecyclerView>(R.id.rv_profile_content)
        profileRecyclerView.layoutManager = GridLayoutManager(activity, 3)
        val profileAdapter = ProfileCollectionAdapter(getProfileCollectionList())
        profileRecyclerView.adapter = profileAdapter

    }

    private fun getProfileHighlightList(): List<ProfileHighlightModel> {
        return listOf(
            ProfileHighlightModel(R.drawable.img_highlight_1, "Design Tips"),
            ProfileHighlightModel(R.drawable.img_highlight_2, "Portfolio"),
            ProfileHighlightModel(R.drawable.img_highlight_3, "Resource"),
            ProfileHighlightModel(R.drawable.img_highlight_4, "UI Basic"),
            ProfileHighlightModel(R.drawable.img_highlight_5, "Web Design"),
            ProfileHighlightModel(R.drawable.img_highlight_1, "Interior"),
            ProfileHighlightModel(R.drawable.img_highlight_2, "DIY")
        )
    }

    private fun getProfileCollectionList(): ArrayList<ProfileCollectionModel> {
        return arrayListOf(
            ProfileCollectionModel(R.drawable.img_profile_content_1),
            ProfileCollectionModel(R.drawable.img_profile_content_2),
            ProfileCollectionModel(R.drawable.img_profile_content_3),
            ProfileCollectionModel(R.drawable.img_profile_content_4),
            ProfileCollectionModel(R.drawable.img_profile_content_5),
            ProfileCollectionModel(R.drawable.img_profile_content_6),
            ProfileCollectionModel(R.drawable.img_profile_content_7),
            ProfileCollectionModel(R.drawable.img_profile_content_8),
            ProfileCollectionModel(R.drawable.img_profile_content_9),
            ProfileCollectionModel(R.drawable.img_profile_content_10),
            ProfileCollectionModel(R.drawable.img_profile_content_11),
            ProfileCollectionModel(R.drawable.img_profile_content_12),
            ProfileCollectionModel(R.drawable.img_profile_content_13),
            ProfileCollectionModel(R.drawable.img_profile_content_14),
            ProfileCollectionModel(R.drawable.img_profile_content_15),
            ProfileCollectionModel(R.drawable.img_profile_content_16),
            ProfileCollectionModel(R.drawable.img_profile_content_17),
            ProfileCollectionModel(R.drawable.img_profile_content_18)
        )
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment ProfileFragment.
         */
        @JvmStatic
        fun newInstance() = ProfileFragment()
    }
}