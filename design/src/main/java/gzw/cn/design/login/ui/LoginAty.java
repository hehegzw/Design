package gzw.cn.design.login.ui;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import gzw.cn.design.R;
import gzw.cn.design.databinding.ActivityLoginAtyBinding;
import gzw.cn.design.main.ui.MainAty;

public class LoginAty extends AppCompatActivity {
    private Context context;
    private ActivityLoginAtyBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login_aty);
        context = this;
        initEvent();

    }

    private void initEvent() {
        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, MainAty.class));
            }
        });
        binding.password.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()>10){
                    binding.password.setError("密码长度不能超过10");
                    binding.password.setErrorEnabled(true);
                }
            }
        });
    }
}
