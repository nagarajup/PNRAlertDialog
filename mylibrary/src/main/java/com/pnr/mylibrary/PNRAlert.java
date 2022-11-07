package com.pnr.mylibrary;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.Objects;

public class PNRAlert {
    public void myAlert(Context context){
        BottomSheetDialog alert_dialog_pay=new BottomSheetDialog(context,R.style.CloseBottomSheetDialogTheme);
        alert_dialog_pay.setContentView(R.layout.bt_dialog_alert);
        alert_dialog_pay.getBehavior().setDraggable(false);
        //alert_dialog_pay.getBehavior().getState() = BottomSheetBehavior.STATE_EXPANDED;

        ImageView close = alert_dialog_pay.findViewById(R.id.close);
        close.setOnClickListener(v -> alert_dialog_pay.dismiss());




        alert_dialog_pay.show();

    }
}
