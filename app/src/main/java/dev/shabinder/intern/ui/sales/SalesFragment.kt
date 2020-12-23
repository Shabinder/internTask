package dev.shabinder.intern.ui.sales

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dev.shabinder.intern.databinding.FragmentSalesBinding

class SalesFragment : Fragment() {

    private lateinit var binding: FragmentSalesBinding
    private val viewModel: SalesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSalesBinding.inflate(inflater,container,false)
        return binding.root
    }
}