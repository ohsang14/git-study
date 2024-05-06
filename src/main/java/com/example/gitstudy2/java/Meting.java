package com.example.gitstudy2.java;

import java.time.ZonedDateTime;
import java.util.Set;

public class Meting {
    private String title;
    private ZonedDateTime startAt;
    private ZonedDateTime endAt;
    private boolean deletedYn;

    private String meetingRoom;
    private String agenda;
    private Set<String> participant;
}

    public void update(String title, ZonedDateTime startAt,
                       String meetingRoom, String agenda, Set<String> participant){
        if (this.deletedYn){
            throw new RuntimeException("이미 삭제된 데이터이기 때문에 값을요업데이트 해주세")

        }
        this.title = title;
        this.startAt = startAt;
        this.endAt = endAt;
        this.deletedYn = deletedYn;
        this.meetingRoom = meetingRoom;
        this.agenda = agenda;
        this.participant = participant;
    }
}
