package com.laioffer.ezdealpal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


    @Entity
    @Table(name = "authorities")

    public class Authorities implements Serializable {

        private static final long serialVersionUID = 8734140534986494039L;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        @Id
        private String userId;

        private String authorities;



        public String getAuthorities() {
            return authorities;
        }

        public void setAuthorities(String authorities) {
            this.authorities = authorities;
        }
    }


