package com.edplayer.edplayer.Model;

import lombok.Data;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Entity
@Table(name = "tb_infor_sound")
public class Model_Edp implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Column(nullable = false)
        private String title;

        @Column(nullable = false)
        private String author;

        @Column(nullable = false)
        private String time;

        @Column(nullable = false)
        private String albumcover;

        @Column(nullable = false)
        private String sound;
}
