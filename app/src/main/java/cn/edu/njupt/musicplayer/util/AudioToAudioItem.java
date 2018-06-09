package cn.edu.njupt.musicplayer.util;

import cn.edu.njupt.musicplayer.entity.Audio;
import cn.edu.njupt.musicplayer.entity.AudioItem;


public interface AudioToAudioItem {
    AudioItem apply(Audio audio);
}
