// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: deepmine/speech/v1/speech.proto

package ir.deepmine.speech.v1;

public interface StreamingRecognitionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:deepmine.speech.v1.StreamingRecognitionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
   */
  boolean hasConfig();
  /**
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
   */
  ir.deepmine.speech.v1.RecognitionConfig getConfig();
  /**
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
   */
  ir.deepmine.speech.v1.RecognitionConfigOrBuilder getConfigOrBuilder();

  /**
   * <pre>
   * *Required* The access token for authentication.
   * </pre>
   *
   * <code>string access_token = 2;</code>
   */
  java.lang.String getAccessToken();
  /**
   * <pre>
   * *Required* The access token for authentication.
   * </pre>
   *
   * <code>string access_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getAccessTokenBytes();

  /**
   * <pre>
   * *Optional* If `false` or omitted, the recognizer will perform continuous
   * recognition (continuing to wait for and process audio even if the user
   * pauses speaking) until the client closes the input stream or
   * until the maximum time limit has been reached. May return multiple
   * `StreamingRecognitionResult`s with the `is_final` flag set to `true`.
   * If `true`, the recognizer will detect a single spoken utterance. When it
   * detects that the user has paused or stopped speaking, it will return an
   * `END_OF_SINGLE_UTTERANCE` event and cease recognition. It will return no
   * more than one `StreamingRecognitionResult` with the `is_final` flag set to
   * `true`.
   * </pre>
   *
   * <code>bool single_utterance = 3;</code>
   */
  boolean getSingleUtterance();

  /**
   * <pre>
   * *Optional* If `true`, interim results (tentative hypotheses) may be
   * returned as they become available (these interim results are indicated with
   * the `is_final=false` flag).
   * If `false` or omitted, only `is_final=true` result(s) are returned.
   * </pre>
   *
   * <code>bool interim_results = 4;</code>
   */
  boolean getInterimResults();

  /**
   * <pre>
   * *Optional* If `interim_results` was true, then the interim results will
   * returned in `interim_results_interval_milliseconds` intervals in milliseconds.
   * The minimum and default value for this parameter is `500 ms`.
   * </pre>
   *
   * <code>int32 interim_results_interval_milliseconds = 5;</code>
   */
  int getInterimResultsIntervalMilliseconds();
}
