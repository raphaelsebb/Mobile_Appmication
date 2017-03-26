package fr.esilv.s8.tubeyou.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.List;

import fr.esilv.s8.tubeyou.Adapters.ElementAdapter;
import fr.esilv.s8.tubeyou.DeveloperKey;
import fr.esilv.s8.tubeyou.Interfaces.OnElementSelectedListener;
import fr.esilv.s8.tubeyou.Models.Element_video;
import fr.esilv.s8.tubeyou.Models.Item_video;
import fr.esilv.s8.tubeyou.Models.SearchResult;
import fr.esilv.s8.tubeyou.Models.VideoList;
import fr.esilv.s8.tubeyou.R;

public class ResultElementActivity extends AppCompatActivity implements OnElementSelectedListener {

    private String URL_QUERY;
    private RecyclerView recyclerView;
    private List<Item_video> item_videos;
    private VideoList videoList = new VideoList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_element);

        String query = getIntent().getStringExtra("query");
        query = query.replaceAll("\\s", "+");
        URL_QUERY = "https://www.googleapis.com/youtube/v3/search?part=snippet&q="
                    + query
                    + "&maxResults=50&type=video&key="
                    + DeveloperKey.apiKey;

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        getVideos(query);
    }

    private void getVideos(String query) {
        final StringRequest videosRequest = new StringRequest(URL_QUERY, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                SearchResult searchResult = new Gson().fromJson(response, SearchResult.class);
                item_videos = searchResult.getItem_videos();
                Log.d("json", URL_QUERY);
                for(int i = 0; i < item_videos.size(); i++) {
                    Element_video element_video = new Element_video();

                    element_video.setTitle(item_videos.get(i).getSnippet().getTitle());
                    element_video.setId(item_videos.get(i).getId().getVideoId());
                    videoList.add(i,element_video);
                }
                setAdapter(videoList);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Videos", "error");
            }
        });

        Volley.newRequestQueue(this).add(videosRequest);
    }

    private void setAdapter(VideoList videoList) {
        ElementAdapter adapter = new ElementAdapter(videoList);
        adapter.setOnElementSelectedListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onElementSelected(Element_video element_video) {

    }
}
