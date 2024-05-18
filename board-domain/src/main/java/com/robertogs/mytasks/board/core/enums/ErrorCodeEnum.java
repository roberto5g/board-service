package com.robertogs.mytasks.board.core.enums;

import java.util.Locale;
import java.util.ResourceBundle;

public enum ErrorCodeEnum {
    BS400001,
    BS422001,
    BS500001;
    public String getMessage(final Locale messageLocale){
        return ResourceBundle.getBundle("messages/exceptions", messageLocale).getString(this.name()+".message");
    }
}
