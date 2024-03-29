package com.mikomaric.dentalassistant.form.component.myfield;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MyInputDateField extends MyInputTextField{
    
    private final SimpleDateFormat dateFormat;
    
    public MyInputDateField(String fieldName, String info, String pattern,boolean require) {
        super(fieldName, info, "",require);
        dateFormat = new SimpleDateFormat(pattern);
    }

    @Override
    public void setValue(Object value) {
        txtField.setText(value==null?"":dateFormat.format((Date)value));
    }
    
    @Override
    public boolean validInput() {
        try{
            dateFormat.parse(txtField.getText().trim());
            return true;
        }catch(ParseException e){
            return false;
        }
    }

    @Override
    public Object getValue() {
        try {
            return dateFormat.parse((String)super.getValue());
        } catch (Exception ex) {
            return null;
        }
    }
    
}
