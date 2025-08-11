package com.strings;

import java.io.File;
import java.io.IOException;
import javafx.fxml.FXML;
import ws.schild.jave.Encoder;
import ws.schild.jave.EncoderException;
import ws.schild.jave.InputFormatException;
import ws.schild.jave.MultimediaObject;
import ws.schild.jave.encode.AudioAttributes;
import ws.schild.jave.encode.EncodingAttributes;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {

        // tests pour voir si ffmpeg marche bien

        //File source = new File("source.wav");
        //File target = new File("target.mp3");
        //AudioAttributes audio = new AudioAttributes();
        //audio.setCodec("libmp3lame");
        //audio.setBitRate(new Integer(128000));
        //audio.setChannels(new Integer(2));
        //EncodingAttributes attrs = new EncodingAttributes();
        //audio.setSamplingRate(new Integer(44100));
        //attrs.setInputFormat("wav");
        //attrs.setOutputFormat("mp3");
        //Encoder encoder = new Encoder();
        //attrs.setAudioAttributes(audio);
        //encoder.encode(new MultimediaObject(source), target, attrs);
        

        App.setRoot("secondary");
    }
}
