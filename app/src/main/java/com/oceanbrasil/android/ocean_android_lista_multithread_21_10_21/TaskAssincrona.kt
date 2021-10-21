package com.oceanbrasil.android.ocean_android_lista_multithread_21_10_21

import android.os.AsyncTask
import android.view.View

class TaskAssincrona : AsyncTask<String,String,String>() {

    override fun onPreExecute() {
        super.onPreExecute()
        // Executa algo antes de iniciar a task
    }

    override fun doInBackground(vararg params: String?): String {

        // Implementacao do seu algoritmo super potente..

        return ""
    }

    override fun onProgressUpdate(vararg values: String?) {
        super.onProgressUpdate(*values)

        // Notifica a thread principal sobre algo..
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)

        // Executa algo quando a task termina..

    }

    override fun onCancelled(result: String?) {
        super.onCancelled(result)

        // O que fazer quando algum método encerra a task..
    }
}