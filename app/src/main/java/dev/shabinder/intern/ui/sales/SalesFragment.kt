package dev.shabinder.intern.ui.sales

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayout
import dev.shabinder.intern.Adapter
import dev.shabinder.intern.R
import dev.shabinder.intern.databinding.FragmentSalesBinding

class SalesFragment : Fragment() {

    private lateinit var binding: FragmentSalesBinding
    private val viewModel: SalesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSalesBinding.inflate(inflater,container,false).apply {
            tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    when(tab?.position){
                        0-> Toast.makeText(requireContext(),"Implementation Required",Toast.LENGTH_SHORT).show()
                        else -> Toast.makeText(requireContext(),"Implementation Required",Toast.LENGTH_SHORT).show()
                    }
                }
                override fun onTabReselected(tab: TabLayout.Tab?) {}
                override fun onTabUnselected(tab: TabLayout.Tab?) {}
            })
            recyclerView.adapter = Adapter(R.layout.sales_item)
        }
        return binding.root
    }
}