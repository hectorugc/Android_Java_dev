package fr.univ_lorraine.iutmetz.wmce.dmcd0.connection;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;


public class CategorieDAO {
    public static void findAll(Ordering.Context activite){
        RequestQueue queue = Volley.newRequestQueue(activite);
        String url = "https://devweb.iutmetz.univ-lorraine.fr/~garciaco2u/WS_PM/php/categories/bdd.php";
        JsonArrayRequest jsonRequest = new JsonArrayRequest(Request.Method.GET,url,null,
                (com.android.volley.Response.Listener<JSONArray>)activite,
                (com.android.volley.Response.ErrorListener)activite);
        queue.add(jsonRequest);
    }
}
