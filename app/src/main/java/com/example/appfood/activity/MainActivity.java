package com.example.appfood.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.appfood.R;
import com.example.appfood.adapter.MonNgauNhienAdapter;
import com.example.appfood.adapter.NavAdapter;
import com.example.lib.InterfaceResponsitory.AppFoodMethods;
import com.example.lib.NavForm;
import com.example.lib.RetrofitClient;
import com.example.lib.common.NetworkConnection;
import com.example.lib.common.Show;
import com.example.lib.common.Url;
import com.example.lib.model.Mon;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {


    Toolbar toolbar_Home;
    ViewFlipper viewFlipper;
    RecyclerView recycleView_MonNgauNhien;
    NavigationView navigationView;
    ListView listView_NavHome;
    DrawerLayout drawerLayout;
    NavAdapter navAdapter;

    CompositeDisposable compositeDisposable = new CompositeDisposable();
    AppFoodMethods appFoodMethods;

    List<Mon.Result> listMonNgauNhienResult;
    MonNgauNhienAdapter monNgauNhienAdapter;

    boolean isLoading = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getViewId();
        actionToolbar();
        khoitao();
        setNav();

        //check network
        if(NetworkConnection.isConnected(this)) {
            Slider();
            GetMonNgauNhien();
//            GetMonNgauNhien2();
            ChuyenTrang();
        }else{
            Show.Notify(this,getString(R.string.error_network));
            finish();
        }
    }

    private void setNav() {
        //list t??y ch???n nav
        navAdapter = new NavAdapter(MainActivity.this,R.layout.item_list_nav);
        listView_NavHome.setAdapter(navAdapter);

        navAdapter.add(new NavForm(R.drawable.ic_menu_res,getString(R.string.menu)));
        navAdapter.add(new NavForm(R.drawable.ic_info,getString(R.string.introduce)));
        navAdapter.add(new NavForm(R.drawable.ic_baseline_feedback_24,getString(R.string.contact)));
        navAdapter.add(new NavForm(R.drawable.ic_baseline_map_24,getString(R.string.map)));
        navAdapter.add(new NavForm(R.drawable.ic_logout,getString(R.string.logout)));

    }

    private void ChuyenTrang() {
        listView_NavHome.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (i) {
                    case 0:
                        Intent danhmuc = new Intent(getApplicationContext(),DanhMucActivity.class);
                        startActivity(danhmuc);
                        break;
                    case 1:
                        Intent gioithieuchung = new Intent(getApplicationContext(), GioiThieuChungActivity.class);
                        startActivity(gioithieuchung);
                        break;
                    case 2:
                        Intent lienhe = new Intent(getApplicationContext(),LienHeActivity.class);
                        startActivity(lienhe);
                        break;
                    case 3:
                        Intent diachi = new Intent(getApplicationContext(),MapActivity.class);
                        startActivity(diachi);
                        break;
                    case 4:
                        Intent dangxuat = new Intent(getApplicationContext(),LoginActivity.class);
                        startActivity(dangxuat);
                        break;

                }
            }
        });
    }

    //GET API - PHP (Private Server)
    private void GetMonNgauNhien() {
        compositeDisposable.add(appFoodMethods.GET_MonNgauNhien()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(
                mon -> {
                    if(mon.isSuccess()) {
                        listMonNgauNhienResult = mon.getResult();
                        monNgauNhienAdapter = new MonNgauNhienAdapter(this,listMonNgauNhienResult);
                        recycleView_MonNgauNhien.setAdapter(monNgauNhienAdapter);
                    }
                },
                throwable -> {
                    Show.Notify(this,"Kh??ng th??? k???t n???i v???i Server!");
                }
        ));
    }

    //Get API - NodeJS (Local)
    private void GetMonNgauNhien2() {
        compositeDisposable.add(appFoodMethods.GET_MonNgauNhien2()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        mon -> {
                            if(mon.isSuccess()) {
                                listMonNgauNhienResult = mon.getResult();
                                monNgauNhienAdapter = new MonNgauNhienAdapter(this,listMonNgauNhienResult);
                                recycleView_MonNgauNhien.setAdapter(monNgauNhienAdapter);
                                Show.Notify(this,"Day la API backend NODEJS!");
                            }
                        },
                        throwable -> {
                            Show.Notify(this,"Kh??ng th??? k???t n???i v???i Server!");
                        }
                ));
    }

    public void khoitao() {
        listMonNgauNhienResult = new ArrayList<>();
        appFoodMethods = RetrofitClient.getRetrofit(Url.AppFood_Url).create(AppFoodMethods.class); //lay URL GOC

        //set layout 2 c???t
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recycleView_MonNgauNhien.setLayoutManager(layoutManager);
        recycleView_MonNgauNhien.setHasFixedSize(true);

        //gi??? h??ng
        if(Show.listGiohang == null) {
            Show.listGiohang = new ArrayList<>();
        }
    }

    private void Slider() {
        List<String> slider = new ArrayList<>();
        slider.add(getString(R.string.slide_1));
        slider.add(getString(R.string.slide_2));
        slider.add(getString(R.string.slide_3));
        slider.add(getString(R.string.slide_4));
        for (int i = 0; i< slider.size();i++) {
            ImageView imageView = new ImageView(getApplicationContext());
            Glide.with(getApplicationContext()).load(slider.get(i)).into(imageView);

            //fix imageView v??o ViewFlipper
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
        Animation animation_slide_step_1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slider_step_1);
        Animation animation_slide_step_2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slider_step_2);

        viewFlipper.setInAnimation(animation_slide_step_1);
        viewFlipper.setOutAnimation(animation_slide_step_2);
    }

    private void actionToolbar() {
        setSupportActionBar(toolbar_Home);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar_Home.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    private void getViewId() {
        toolbar_Home = findViewById(R.id.toolbar_Home);
        viewFlipper = findViewById(R.id.viewFlipper);
        recycleView_MonNgauNhien = findViewById(R.id.recycleView_MonNgauNhien);
        navigationView = findViewById(R.id.navigationView);
        listView_NavHome = findViewById(R.id.listView_NavHome);
        drawerLayout = findViewById(R.id.drawerLayout);
    }


    public void openCart(View view) {
        Intent giohang = new Intent(getApplicationContext(),GioHangActivity.class);
        startActivity(giohang);
    }

    public void ToHome(View view) {
        Intent trangchu = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(trangchu);
    }



    @Override
    protected void onDestroy() {
        compositeDisposable.clear();
        super.onDestroy();
    }
}