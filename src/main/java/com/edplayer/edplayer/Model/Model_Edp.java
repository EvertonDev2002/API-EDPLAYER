package com.edplayer.edplayer.Model;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_infor_sound")
public class Model_Edp implements Serializable {

        private static final long serialVersionUID = 1L;

        @Getter
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @Getter
        @Setter
        @NotNull
        private String title;

        @Getter
        @Setter
        @NotNull
        private String author;

        @Getter
        @Setter
        @NotNull
        private String time;

        @Getter
        @Setter
        @NotNull
        private String albumcover;

        @Getter
        @Setter
        @NotNull
        private String sound;
}
