package com.mascenes.store.view;

import java.util.ResourceBundle;

public enum FxmlView {

    ADMIN {
        @Override
        public String getTitle() {
            return getStringFromResourceBundle("admin.title");
        }

        @Override
        public String getFxmlFile() {
            return "/fxml/admin.fxml";
        }
    },
    SALES {
        @Override
        public String getTitle() {
            return getStringFromResourceBundle("sales.title");
        }

        @Override
        public String getFxmlFile() {
            return "/fxml/sales.fxml";
        }
    },
    LOGIN {
        @Override
        public String getTitle() {
            return getStringFromResourceBundle("login.title");
        }

        @Override
        public String getFxmlFile() {
            return "/fxml/login.fxml";
        }
    };

    public abstract String getTitle();
    public abstract String getFxmlFile();

    String getStringFromResourceBundle(String key){
        return ResourceBundle.getBundle("Bundle").getString(key);
    }

}