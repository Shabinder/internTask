package dev.shabinder.intern.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dev.shabinder.intern.R
import dev.shabinder.intern.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding:FragmentLoginBinding
    private val viewModel:LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater).apply {
            creatAccountButton.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_offersFragment)
            }
            loginButton.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_salesFragment)
            }
        }
        return binding.root
    }
}