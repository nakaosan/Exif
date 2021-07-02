package com.example.exif

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {

    companion object {
        private const val TAG = "FirstFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.first_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toSecondButton = view.findViewById<Button>(R.id.to_second_fragment_button)
        toSecondButton.setOnClickListener{
            Log.d(TAG, "toSecondButton pressed!")
            val secondFragment = SecondFragment()
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.replace(R.id.fragment_container, secondFragment)
            fragmentTransaction?.commit()
        }

        super.onViewCreated(view, savedInstanceState)
        val toAlbumButton = view.findViewById<Button>(R.id.to_album_fragment_button)
        toAlbumButton.setOnClickListener{
            Log.d(TAG, "toAlbumButton pressed!")
            val AlbumFragment = AlbumFragment()
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.replace(R.id.fragment_container, AlbumFragment)
            fragmentTransaction?.commit()
        }
    }
}