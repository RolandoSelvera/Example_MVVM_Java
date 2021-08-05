package com.rolandoselvera.examplemvvmjava.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.rolandoselvera.examplemvvmjava.model.QuoteModel;
import com.rolandoselvera.examplemvvmjava.model.QuoteProvider;
import com.rolandoselvera.examplemvvmjava.utils.ColorViewUtil;

// ViewModel de la vista (MainActivity):
public class QuoteViewModel extends ViewModel {
    public MutableLiveData<QuoteModel> quoteModel = new MutableLiveData<>();
    public MutableLiveData<Integer> colorView = new MutableLiveData<>();

    // Inicializa ViewModel con una cita y un color de fondo al ejecutar/abrir la app por primera vez:
    public QuoteViewModel() {
        randomQuote();
        randomBackgroundColor();
    }

    // Establece una cita de forma aleatoria:
    public void randomQuote() {
        QuoteModel currentQuote = QuoteProvider.random();
        quoteModel.postValue(currentQuote);
    }

    // Establece un color de forma aleatoria:
    public void randomBackgroundColor() {
        int randomColor = ColorViewUtil.randomColor();
        colorView.postValue(randomColor);
    }
}