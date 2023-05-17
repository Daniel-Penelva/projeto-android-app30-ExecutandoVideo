package com.example.executandovideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);

        // Configura os controladores
        videoView.setMediaController(new MediaController(this));

        /* Configura o vídeo a partir de um Path que permite definir um caminho ou o local do vídeo para fazer a execução. */
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);

        // Para executar o vídeo
        videoView.start();
    }
}

/* Anotações:

    1º Vamos configurar os controladores (que aparece os botões play, stop, avançar e voltar)

    2º Configura o vídeo a partir de um objeto URI ou de um Path que permite definir um caminho ou o local do vídeo
        para fazer a execução.

        Endereço de recurso padrão que acessa os recursos que estão dentro do seu app:
        android.resource://

        Depois é definido o pacote que iremos acessar o vídeo, que é acessado através do método getPackageName(), ou seja,
        esse método recupera o nome do pacote onde está o nosso vídeo.

        Por fim colocar no nome do nosso vídeo, que define que o vídeo está dentro do raw: R.raw.video

    3º startizar o vídeo

    * */
