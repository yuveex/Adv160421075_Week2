package com.ubaya.adv160421075week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.ubaya.adv160421075week2.databinding.FragmentOptionBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [OptionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OptionFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentOptionBinding
    private val level = arrayOf("Easy", "Medium", "Hard")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOptionBinding.inflate(inflater, container, false)
        return binding.root
//        return inflater.inflate(R.layout.fragment_option, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ArrayAdapter<String>(requireContext(),android.R.layout.simple_dropdown_item_1line, level)
        binding.txtLevel.setAdapter(adapter)
    }

}