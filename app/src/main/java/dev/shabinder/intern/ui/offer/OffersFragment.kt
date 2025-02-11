package dev.shabinder.intern.ui.offer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dev.shabinder.intern.Adapter
import dev.shabinder.intern.R
import dev.shabinder.intern.databinding.FragmentOffersBinding

class OffersFragment : Fragment() {

    private lateinit var binding: FragmentOffersBinding
    private val viewModel: OffersViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOffersBinding.inflate(layoutInflater).apply {
            /*
            * Temp Adapter just for Demonstration
            * */
            recyclerView.adapter = Adapter(R.layout.offer_item)

        }
        return binding.root
    }
}