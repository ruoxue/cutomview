package xyz.ruoxue.animator.constract.activity;

import android.util.Log;

import java.util.List;

import xyz.ruoxue.animator.BaseActivity;
import xyz.ruoxue.animator.R;
import xyz.ruoxue.animator.constract.ConstractUtil;
import xyz.ruoxue.animator.constract.bean.PhoneBean;

/**
 *
 */
public class ContractActivity extends BaseActivity {


    private static final String TAG = ContractActivity.class.getSimpleName();

    @Override
    protected void initView() {
       List<PhoneBean> l= ConstractUtil.getConstract(this);
       while (l.iterator().hasNext()){
           l.iterator().next();
         Log.e(TAG,l.iterator().next().toString());
       }

    }

    @Override
    protected int initLayout() {
        return R.layout.activity_contract                                                                                                                                                       ;
    }
}
