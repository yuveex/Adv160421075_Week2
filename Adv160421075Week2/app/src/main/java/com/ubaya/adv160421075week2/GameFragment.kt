package com.ubaya.adv160421075week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ubaya.adv160421075week2.databinding.FragmentGameBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GameFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GameFragment : Fragment() {
    private lateinit var binding: FragmentGameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentGameBinding.inflate(inflater, container, false)
        return binding.root

//        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        arguments?.let{
//            val playerName = GameFragmentArgs.fromBundle(requireArguments()).playerName
//            binding.txtScore.text = "$playerName's Turn"
//        }

            arguments?.let{
                val playerScore = GameFragmentArgs.fromBundle(requireArguments()).playerScore
                binding.txtScore.text = "Your Score is $playerScore"
            }

        binding.buttonBack.setOnClickListener{
            val action = GameFragmentDirections.actionGameFragmentToMainFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}