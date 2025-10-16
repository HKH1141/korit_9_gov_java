package com.korit.study.실습문제;

import com.korit.study.ch21.Singleton;

import java.util.Objects;

public class GameConfigManager {
    // TODO: 싱글톤 구현을 위한 필드들

    // 설정 정보 필드들
    private int soundVolume;           // 기본값 50
    private String resolution; // 기본 해상도
    private static GameConfigManager instance;

    // TODO: 생성자 구현
    private GameConfigManager(int soundVolume, String resolution) {
        this.soundVolume = soundVolume;
        this.resolution = resolution;
    }


    // TODO: 싱글톤 인스턴스 반환 메서드 구현
    static synchronized GameConfigManager getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (GameConfigManager.class) {
                if (Objects.isNull(instance)) {
                    instance = new GameConfigManager(50, "1280x720");
                }
            }
        }
        return instance;
    }

    // Getter/Setter 메서드들
    public void setSoundVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.soundVolume = volume;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public String getConfigInfo() {
        return String.format("Sound: %d, Resolution: %s" ,
                soundVolume, resolution);
    }
}