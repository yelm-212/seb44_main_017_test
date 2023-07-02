package com.main.project.notifyBoard.entity;

import com.main.project.helper.audit.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class NotifyBoard extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boardId;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;
    @Column(columnDefinition = "integer default 0")
    private int view;

}