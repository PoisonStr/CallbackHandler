package callbackhandler.example.com.callbackhandler;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Button;

import java.util.jar.Attributes;

public class MyButton extends android.support.v7.widget.AppCompatButton {
public  MyButton(Context context, AttributeSet set){
    super(context,set);
}
    @Override
    public  boolean onKeyDown(int KeyCode, KeyEvent event){
    super.onKeyDown(KeyCode,event);
        Log.v("com.sise","the onKeyDown in MyButton");
        return true;

    }
}
