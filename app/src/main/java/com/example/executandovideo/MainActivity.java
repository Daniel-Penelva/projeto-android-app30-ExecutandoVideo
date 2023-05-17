package com.example.executandovideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirVideo(View view){
        //Vamos utilizar um Intent para abrir o activity
        startActivity(new Intent(this, PlayerActivity.class));
    }
}

/* Anotação:
 * Para executar o vídeo vamos criar uma Empty Activity, e nela vamos adicionar o componente 'VideoView' que vai
 * executar o nosso vídeo
 *
 * Em relação ao Intent - pode fazer de duas maneiras:
 *
 * 1º Diretamente pelo startActivity como está exemplificado acima, ou
 *
 * 2º Criando um objeto Intent e passando ele no StarActivity, por exemplo:
 *
    Intent intent = new Intent(this, PlayerActivity.class);
    startActivity(intent);

 * */