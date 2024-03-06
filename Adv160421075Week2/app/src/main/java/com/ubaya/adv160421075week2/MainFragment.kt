package com.ubaya.adv160421075week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ubaya.adv160421075week2.databinding.FragmentMainBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    private var playerScore = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        playerScore = 0

        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root

//        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        playerScore = 0
        var number1 = (0..100).random()
        var number2 = (0..100).random()

        binding.txtQuestion.text = "$number1 + $number2"

        binding.buttonAnswer.setOnClickListener{
//            val playerName = binding.txtName.text.toString()
//            val action = MainFragmentDirections.actionMainFragmentToGameFragment(playerName)
//            Navigation.findNavController(it).navigate(action)

            var playerAnswer = binding.txtAnswer.text.toString()

            if(playerAnswer.toInt() == (number1+number2)){
                playerScore += 1
                number1 = (0..100).random()
                number2 = (0..100).random()
                binding.txtQuestion.text = "$number1 + $number2"
                binding.txtAnswer.setText("")
            }
            else{
                val action = MainFragmentDirections.actionMainFragmentToGameFragment(playerScore.toString())
                Navigation.findNavController(it).navigate(action)
            }
        }
    }
}