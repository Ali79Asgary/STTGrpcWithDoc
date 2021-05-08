// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: deepmine/speech/v1/speech.proto

package ir.deepmine.speech.v1;

public interface SpeechRecognitionAlternativeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:deepmine.speech.v1.SpeechRecognitionAlternative)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Transcript text representing the words that the user spoke.
   * </pre>
   *
   * <code>string transcript = 1;</code>
   */
  java.lang.String getTranscript();
  /**
   * <pre>
   * Output only. Transcript text representing the words that the user spoke.
   * </pre>
   *
   * <code>string transcript = 1;</code>
   */
  com.google.protobuf.ByteString
      getTranscriptBytes();

  /**
   * <pre>
   * Output only. The confidence estimate between 0.0 and 1.0. A higher number
   * indicates an estimated greater likelihood that the recognized words are
   * correct. This field is set only for the top alternative of a non-streaming
   * result or, of a streaming result where `is_final=true`.
   * This field is not guaranteed to be accurate and users should not rely on it
   * to be always provided.
   * The default of 0.0 is a sentinel value indicating `confidence` was not set.
   * </pre>
   *
   * <code>float confidence = 2;</code>
   */
  float getConfidence();

  /**
   * <pre>
   * Output only. A list of word-specific information for each recognized word.
   * Note: When `enable_speaker_diarization` is true, you will see all the words
   * from the beginning of the audio.
   * </pre>
   *
   * <code>repeated .deepmine.speech.v1.WordInfo words = 3;</code>
   */
  java.util.List<ir.deepmine.speech.v1.WordInfo> 
      getWordsList();
  /**
   * <pre>
   * Output only. A list of word-specific information for each recognized word.
   * Note: When `enable_speaker_diarization` is true, you will see all the words
   * from the beginning of the audio.
   * </pre>
   *
   * <code>repeated .deepmine.speech.v1.WordInfo words = 3;</code>
   */
  ir.deepmine.speech.v1.WordInfo getWords(int index);
  /**
   * <pre>
   * Output only. A list of word-specific information for each recognized word.
   * Note: When `enable_speaker_diarization` is true, you will see all the words
   * from the beginning of the audio.
   * </pre>
   *
   * <code>repeated .deepmine.speech.v1.WordInfo words = 3;</code>
   */
  int getWordsCount();
  /**
   * <pre>
   * Output only. A list of word-specific information for each recognized word.
   * Note: When `enable_speaker_diarization` is true, you will see all the words
   * from the beginning of the audio.
   * </pre>
   *
   * <code>repeated .deepmine.speech.v1.WordInfo words = 3;</code>
   */
  java.util.List<? extends ir.deepmine.speech.v1.WordInfoOrBuilder> 
      getWordsOrBuilderList();
  /**
   * <pre>
   * Output only. A list of word-specific information for each recognized word.
   * Note: When `enable_speaker_diarization` is true, you will see all the words
   * from the beginning of the audio.
   * </pre>
   *
   * <code>repeated .deepmine.speech.v1.WordInfo words = 3;</code>
   */
  ir.deepmine.speech.v1.WordInfoOrBuilder getWordsOrBuilder(
      int index);
}
