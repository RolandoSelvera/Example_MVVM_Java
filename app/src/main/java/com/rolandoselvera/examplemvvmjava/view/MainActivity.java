package com.rolandoselvera.examplemvvmjava.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.rolandoselvera.examplemvvmjava.databinding.ActivityMainBinding;
import com.rolandoselvera.examplemvvmjava.viewmodel.QuoteViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private QuoteViewModel quoteViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        quoteViewModel = new ViewModelProvider(this).get(QuoteViewModel.class);

        // Observador de la cita textual:
        quoteViewModel.quoteModel.observe(this, currentQuote -> {
            binding.txtQuote.setText(currentQuote.getQuote());
            binding.txtBook.setText(currentQuote.getBook());
            binding.txtAuthor.setText(currentQuote.getAuthor());
        });

        // Observador para el color:
        quoteViewModel.colorView.observe(this, randomColor -> {
            // Establece un color de fondo en el contenedor:
            binding.viewContainer.setBackgroundColor(randomColor);

            // Establece el mismo color de fondo del contenedor al status bar:
            getWindow().setStatusBarColor(randomColor);
        });

        // Acción al presionar el botón siguiente:
        binding.btnNext.setOnClickListener(v -> {
            quoteViewModel.randomQuote();
            quoteViewModel.randomBackgroundColor();
        });
    }
}