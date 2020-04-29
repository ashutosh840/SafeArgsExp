package com.example.safeargsexp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_firstpage.*

/**
 * A simple [Fragment] subclass.
 */
class firstpage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_firstpage, container, false)






    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Navigate.setOnClickListener{
            val info=Info(name.text.toString(),message.text.toString(),number.text.toString().toInt())
            val arg= bundleOf("info" to info)
            view?.findNavController()?.navigate(R.id.action_firstpage_to_secondpage,arg)


        }

    }
}
