package com.kabouzeid.dev.gramophone.service.playback;

import android.media.MediaPlayer;
import android.support.annotation.Nullable;

/**
 * @author Karim Abou Zeid (kabouzeid)
 */
public interface Playback {

    boolean setDataSource(String path);

    void setNextDataSource(@Nullable String path);

    void setCallbacks(PlaybackCallbacks callbacks);

    boolean isInitialized();

    boolean start();

    void stop();

    void release();

    boolean pause();

    boolean isPlaying();

    int duration();

    int position();

    int seek(int whereto);

    boolean setVolume(float vol);

    void setTempo(float tempo);

    boolean setAudioSessionId(int sessionId);

    int getAudioSessionId();

    interface PlaybackCallbacks {
        void onTrackWentToNext();

        void onTrackEnded();
    }
}
