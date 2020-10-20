package mx.com.caressing.facebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements onitemClickListener{
    private RecyclerView rclvContatcos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rclvContatcos=findViewById(R.id.rclvContactos);
        rclvContatcos.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        rclvContatcos.setLayoutManager(linearLayoutManager);

        List<Contatco> contatcos=new ArrayList<>();
        contatcos.add(new Contatco("https://previews.123rf.com/images/jemastock/jemastock1707/jemastock170713946/82561873-hombre-de-dibujos-animados-masculino-de-pie-persona-de-car%C3%A1cter-superior-ilustraci%C3%B3n-vectorial.jpg","Luis Segura","https://i.ytimg.com/vi/IA_ENMbVqOc/maxresdefault.jpg","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRbtxf9gY3yI62bRbEar8yhjK32OBCPHO13UoN9z5YNR0OXwBmR","    Paisaje"));
        contatcos.add(new Contatco("https://media.istockphoto.com/vectors/business-man-cartoon-character-in-smart-clothes-office-style-young-vector-id846138242","Juanjo Coral","https://pbs.twimg.com/media/ChxVryEXAAARSuq.jpg","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRbtxf9gY3yI62bRbEar8yhjK32OBCPHO13UoN9z5YNR0OXwBmR","   #Vida"));
        contatcos.add(new Contatco("https://png.pngtree.com/png-clipart/20190515/original/pngtree-cartoon-style-people-jobs-formal-wear-png-image_3946262.jpg","Alonso Sanchez","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTAttSLpSxnQM1V4kSHy79XqckkOC4LR1JsXcx4YLcJi28qsFIY","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRbtxf9gY3yI62bRbEar8yhjK32OBCPHO13UoN9z5YNR0OXwBmR","   Que oso"));
        contatcos.add(new Contatco("https://image.freepik.com/vector-gratis/empresario-dibujos-animados-bombilla-idea_29190-4797.jpg","Juan Lopez","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSYznMb0VfeSuvcJaOqrmgS12enEmMGITVb72NGla4D0Y_UY6f3","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRbtxf9gY3yI62bRbEar8yhjK32OBCPHO13UoN9z5YNR0OXwBmR","  Entendi la referencia"));
        contatcos.add(new Contatco("https://thumbs.dreamstime.com/z/la-persona-del-personaje-de-dibujos-animados-del-hombre-de-negocios-del-muchacho-en-el-trabajador-blanco-del-uniforme-de-la-88071083.jpg","Claudio Perez","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSw7c8fWATi1WYoREpnGxMqiOdCOrXqXaE_8xx9qVJV2k9E31lD","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRbtxf9gY3yI62bRbEar8yhjK32OBCPHO13UoN9z5YNR0OXwBmR","  Que!!!!!!!"));
        contatcos.add(new Contatco("https://st2.depositphotos.com/1432405/11688/v/950/depositphotos_116888202-stock-illustration-unsuccessful-businessman-icon-cartoon-style.jpg","Leon Gomez","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSJQKHHmR82_t_BLSYpGRFSP5jpTA1Y-KnxxC6nFrqg8JZYcffc","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRbtxf9gY3yI62bRbEar8yhjK32OBCPHO13UoN9z5YNR0OXwBmR","  Dime que no es cierto 7_7"));
        rclvContatcos.setAdapter(new ContactoAdapter(contatcos,this));
    }

    @Override
    public void OnItemClick(Contatco contatco) {

    }

    @Override
    public void OnLongItemClick(Contatco contatco) {

    }
}
