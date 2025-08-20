package com.luckyfriday.instagramclone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.luckyfriday.instagramclone.R
import com.luckyfriday.instagramclone.adapters.HomePostAdapter
import com.luckyfriday.instagramclone.adapters.HomeStoryAdapter
import com.luckyfriday.instagramclone.models.HomePostModel
import com.luckyfriday.instagramclone.models.HomeStoryModel

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val storyRecyclerView = view.findViewById<RecyclerView>(R.id.rv_home_story)
        storyRecyclerView.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        val storyAdapter = HomeStoryAdapter(getHomeStoryList())
        storyRecyclerView.adapter = storyAdapter

        val postRecyclerView = view.findViewById<RecyclerView>(R.id.rv_home_post)
        postRecyclerView.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        val postAdapter = HomePostAdapter(getHomePostList())
        postRecyclerView.adapter = postAdapter
    }

    private fun getHomeStoryList(): List<HomeStoryModel> {
        return listOf(
            HomeStoryModel(R.drawable.ic_avatar_big, "Codefive", false),
            HomeStoryModel(R.drawable.img_profile_picture_1, "Arthur", true),
            HomeStoryModel(R.drawable.img_profile_picture_2, "Arneo", false),
            HomeStoryModel(R.drawable.img_profile_picture_3, "Nicolas", false),
            HomeStoryModel(R.drawable.img_profile_picture_4, "barbie_girlzzz", false),
            HomeStoryModel(R.drawable.img_profile_picture_1, "Budi", true),
            HomeStoryModel(R.drawable.img_profile_picture_2, "Jojon", false),
            HomeStoryModel(R.drawable.img_profile_picture_3, "Dyren", false),
            HomeStoryModel(R.drawable.img_profile_picture_4, "Nunung", false)
        )
    }

    private fun getHomePostList(): List<HomePostModel> {
        return listOf(
            HomePostModel(
                R.drawable.img_profile_picture_2,
                R.drawable.img_content_1,
                "Areno Paris",
                "Arneoo",
                "Gabdu et d’autres personnes",
                "ArthurHazan Lorem Ipsum #Proud",
                35
            ),
            HomePostModel(
                R.drawable.img_profile_picture_2,
                R.drawable.img_content_1,
                "Nicolas",
                "Germany",
                "Gabdu et d’autres personnes",
                "Mungkin saja",
                108
            )
        )
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}