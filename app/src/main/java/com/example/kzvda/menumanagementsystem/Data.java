package com.example.kzvda.menumanagementsystem;

import android.annotation.SuppressLint;
import android.content.Context;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Data {
    private static final String DESCRIPTION = "Lorem ipsum dolor sit amet," +
            "consectetur adipiscing elit, sed do" +
            "eiusmod tempor incididunt ut" +
            "labore et dolore magna aliqua.";

    public static Map<Integer, HashMap<String,Object>> getData() {
        @SuppressLint("UseSparseArrays") Map<Integer, HashMap<String,Object>> hashMap = new HashMap<>();
        HashMap<String, Object> innerHashMap = new HashMap<>();
        innerHashMap.put("name","Cacio e Vino");
        innerHashMap.put("subname","Italian Restaurant");
        innerHashMap.put("icon",R.drawable.cacio_e_vino);
        Object[][] menu = new Object[3][4];
        menu[0][0] = R.drawable.food_example;
        menu[0][1] = "Pizza Diavola";
        menu[0][2] = DESCRIPTION;
        menu[0][3] = "300 P";
        menu[1][0] = R.drawable.food_example;
        menu[1][1] = "Pizza Margherita";
        menu[1][2] = DESCRIPTION;
        menu[1][3] = "300 P";
        menu[2][0] = R.drawable.food_example;
        menu[2][1] = "Noodles soup";
        menu[2][2] = DESCRIPTION;
        menu[2][3] = "300 P";
        innerHashMap.put("menu",menu);
        innerHashMap.put("description", DESCRIPTION);
        innerHashMap.put("phone_num", "+78432453020");
        innerHashMap.put("location", "geo:0,0?q=Cacio e Vino, Innopolis, Russia");
        innerHashMap.put("website","https://t.me/CacioeVinoInno");

        hashMap.put(0,innerHashMap);

        innerHashMap = new HashMap<>();
        innerHashMap.put("name","OMC");
        innerHashMap.put("subname","Canteen in University builing");
        innerHashMap.put("icon",R.drawable.omc);
        menu = new Object[3][4];
        menu[0][0] = R.drawable.food_example;
        menu[0][1] = "Borsch";
        menu[0][2] = DESCRIPTION;
        menu[0][3] = "300 P";
        menu[1][0] = R.drawable.food_example;
        menu[1][1] = "Salad";
        menu[1][2] = DESCRIPTION;
        menu[1][3] = "300 P";
        menu[2][0] = R.drawable.food_example;
        menu[2][1] = "Noodles soup";
        menu[2][2] = DESCRIPTION;
        menu[2][3] = "300 P";
        innerHashMap.put("menu",menu);
        innerHashMap.put("description", DESCRIPTION);
        innerHashMap.put("phone_num", "42");
        innerHashMap.put("location", "geo:0,0?q=ОМС, Innopolis, Russia");
        innerHashMap.put("website","https://telegram.me/joinchat/Av77aUAFkVZKStnjfWD7NA");

        hashMap.put(1, innerHashMap);

        innerHashMap = new HashMap<>();
        innerHashMap.put("name","Wrap & Go");
        innerHashMap.put("subname","Ne Shaurmichnaya");
        innerHashMap.put("icon",R.drawable.wrap_and_go);
        menu = new Object[3][4];
        menu[0][0] = R.drawable.food_example;
        menu[0][1] = "Wrap";
        menu[0][2] = DESCRIPTION;
        menu[0][3] = "300 P";
        menu[1][0] = R.drawable.food_example;
        menu[1][1] = "Another Wrap";
        menu[1][2] = DESCRIPTION;
        menu[1][3] = "300 P";
        menu[2][0] = R.drawable.food_example;
        menu[2][1] = "Still not Shaurma";
        menu[2][2] = DESCRIPTION;
        menu[2][3] = "300 P";
        innerHashMap.put("menu",menu);
        innerHashMap.put("description", DESCRIPTION);
        innerHashMap.put("phone_num", "42");
        innerHashMap.put("location", "geo:0,0?q=Wrap and Go, Innopolis, Russia");
        innerHashMap.put("website","https://telegram.me/joinchat/DA8vV0CGBulCOEpoyMK_vA");

        hashMap.put(2, innerHashMap);
        return hashMap;
    }


    public static void setDB(Context context) {
        DBHelper db = new DBHelper(context);
        Event event = new Event(0,"Wrap",DESCRIPTION,300,null);
        db.addEvent(event);
        event = new Event(0,"Wrap",DESCRIPTION,300,null);
    }

    public static LinkedList<Object[]> getSettingsList() {
        LinkedList<Object[]> settingsList = new LinkedList<>();
        Object[] setting = new Object[3];
        setting[0] = R.string.change_personal_info;
        setting[1] = new boolean[]{true, true, true};
        setting[2] = 1;
        settingsList.add(setting);
        setting = new Object[3];
        setting[0] = R.string.manage_notifications;
        setting[1] = new boolean[]{true, false, false};
        setting[2] = 2;
        settingsList.add(setting);
        setting = new Object[3];
        setting[0] = R.string.support;
        setting[1] = new boolean[]{true, true, false};
        setting[2] = 3;
        settingsList.add(setting);
        setting = new Object[3];
        setting[0] = R.string.delete_account;
        setting[1] = new boolean[]{true, true, true};
        setting[2] = 4;
        settingsList.add(setting);
        setting = new Object[3];
        setting[0] = R.string.log_out;
        setting[1] = new boolean[]{true, true, true};
        setting[2] = 5;
        settingsList.add(setting);

        return settingsList;
    }

    public static LinkedList<Object[]> getAdminPageList() {
        LinkedList<Object[]> settingsList = new LinkedList<>();
        Object[] setting = new Object[2];
        setting[0] = R.string.change_menu;
        setting[1] = 6;
        settingsList.add(setting);
        setting = new Object[2];
        setting[0] = R.string.send_notification;
        setting[1] = 7;
        settingsList.add(setting);
        setting = new Object[2];
        setting[0] = R.string.edit_restaurant_info;
        setting[1] = 8;
        settingsList.add(setting);
        setting = new Object[2];
        setting[0] = R.string.manage_templates;
        setting[1] = 9;
        settingsList.add(setting);

        return settingsList;
    }
}
