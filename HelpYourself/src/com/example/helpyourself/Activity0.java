package com.example.helpyourself;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.example.helpyourself.MyAdapter.ViewHolder;

public class Activity0 extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.hello_display);
	    GridView gridView = (GridView)findViewById(R.id.gridview);
	    setTitle("Help Yourself");
	    
	    Resources res = getResources();
        List<AppInfo> listAppInfo = new ArrayList<AppInfo>();
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_0), "Dog Bites"));
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_1), "Fractures"));
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_2), "Earthquake"));
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_3), "Bleeding"));
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_4), "Bomb Blast"));
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_5), "Electric Shocks"));
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_6), "Floods"));
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_7), "Gas Leakage"));
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_8), "Burns"));
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_9), "Heart attack"));
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_10), "Accidents"));
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_11), "Snake bites"));
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_12), "Choking"));
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_13), "Tsunami"));
        listAppInfo.add(new AppInfo(BitmapFactory.decodeResource(res, R.drawable.sample_14), "Elevator Breakdowns"));

	    
	    
	    gridView.setAdapter(new MyAdapter(this, listAppInfo));
	    
	    gridView.setOnItemClickListener(mItemClickListener); // add a ItemClickListener
	}

	private OnItemClickListener mItemClickListener = new OnItemClickListener() {
	     
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
        	ViewHolder holder = (ViewHolder)view.getTag();
            if(holder == null) {
                return;
            }
            String p=Integer.toString(pos);
            int flag=0;
            Intent i=null;
    try{
            if (p.equals("0")) {
            	i = new Intent(getApplicationContext(), Activity00.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            } if (p.equals("1")) {
                i = new Intent(getApplicationContext(), Activity01.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            }  if (p.equals("2")) {
            	i = new Intent(getApplicationContext(), Activity02.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            } if(p.equals("3")) {
            	i = new Intent(getApplicationContext(), Activity03.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            } if (p.equals("4")) {
            	i = new Intent(getApplicationContext(), Activity04.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            } if (p.equals("5")) {
            	i = new Intent(getApplicationContext(), Activity05.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            }  if (p.equals("6")) {
            	i = new Intent(getApplicationContext(), Activity06.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            } if (p.equals("7")) {
            	i = new Intent(getApplicationContext(), Activity07.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            }  if (p.equals("8")) {
            	i = new Intent(getApplicationContext(), Activity08.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            } if (p.equals("9")) {
            	i = new Intent(getApplicationContext(), Activity09.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            }if (p.equals("10")) {
            	i = new Intent(getApplicationContext(), Activity10.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            } if (p.equals("11")) {
            	i = new Intent(getApplicationContext(), Activity11.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            } if (p.equals("12")) {
            	i = new Intent(getApplicationContext(), Activity12.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            } if (p.equals("13")) {
            	i = new Intent(getApplicationContext(), Activity13.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            } if (p.equals("14")) {
            	i = new Intent(getApplicationContext(), Activity14.class);
            	i.putExtra("id", pos);
            	flag=1;
            	  startActivity(i);
            }
    }
    catch(Exception e){
    	e.printStackTrace();
    	//Toast.makeText(Activity0.this, "You have clicked on item '" + holder.tvName.getText() + "'", Toast.LENGTH_SHORT).show();
        }
        }
    };
    public void onBackPressed() {
	    new AlertDialog.Builder(this)
	        .setIcon(android.R.drawable.ic_dialog_alert)
	        .setTitle("Are you sure?")
	        .setMessage("Are you sure you want to close the app?")
	        .setPositiveButton("Yes", new DialogInterface.OnClickListener()
	    {
	        @Override
	        public void onClick(DialogInterface dialog, int which) {
	            finish();    
	        }

	    })
	    .setNegativeButton("No", null)
	    .show();
	}
}