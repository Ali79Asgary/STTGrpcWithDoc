// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: deepmine/speech/v1/speech.proto

package ir.deepmine.speech.v1;

/**
 * <pre>
 * The only message returned to the client by the `Recognize` and `StreamingRecognize` methods.
 * It contains the result as zero or more sequential `SpeechRecognitionResult` messages.
 * </pre>
 *
 * Protobuf type {@code deepmine.speech.v1.RecognizeResponse}
 */
public  final class RecognizeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:deepmine.speech.v1.RecognizeResponse)
    RecognizeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecognizeResponse.newBuilder() to construct.
  private RecognizeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecognizeResponse() {
    errorMessage_ = "";
    results_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecognizeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            errorMessage_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              results_ = new java.util.ArrayList<ir.deepmine.speech.v1.SpeechRecognitionResult>();
              mutable_bitField0_ |= 0x00000002;
            }
            results_.add(
                input.readMessage(ir.deepmine.speech.v1.SpeechRecognitionResult.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        results_ = java.util.Collections.unmodifiableList(results_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_RecognizeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_RecognizeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ir.deepmine.speech.v1.RecognizeResponse.class, ir.deepmine.speech.v1.RecognizeResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ERROR_MESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object errorMessage_;
  /**
   * <pre>
   * Output only. If set, returns a message that specifies the error for the operation.
   * </pre>
   *
   * <code>string error_message = 1;</code>
   */
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorMessage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. If set, returns a message that specifies the error for the operation.
   * </pre>
   *
   * <code>string error_message = 1;</code>
   */
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULTS_FIELD_NUMBER = 2;
  private java.util.List<ir.deepmine.speech.v1.SpeechRecognitionResult> results_;
  /**
   * <pre>
   * Output only. Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
   */
  public java.util.List<ir.deepmine.speech.v1.SpeechRecognitionResult> getResultsList() {
    return results_;
  }
  /**
   * <pre>
   * Output only. Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
   */
  public java.util.List<? extends ir.deepmine.speech.v1.SpeechRecognitionResultOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <pre>
   * Output only. Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
   */
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <pre>
   * Output only. Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
   */
  public ir.deepmine.speech.v1.SpeechRecognitionResult getResults(int index) {
    return results_.get(index);
  }
  /**
   * <pre>
   * Output only. Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
   */
  public ir.deepmine.speech.v1.SpeechRecognitionResultOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getErrorMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, errorMessage_);
    }
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(2, results_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getErrorMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, errorMessage_);
    }
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, results_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ir.deepmine.speech.v1.RecognizeResponse)) {
      return super.equals(obj);
    }
    ir.deepmine.speech.v1.RecognizeResponse other = (ir.deepmine.speech.v1.RecognizeResponse) obj;

    boolean result = true;
    result = result && getErrorMessage()
        .equals(other.getErrorMessage());
    result = result && getResultsList()
        .equals(other.getResultsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ERROR_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ir.deepmine.speech.v1.RecognizeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ir.deepmine.speech.v1.RecognizeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.RecognizeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ir.deepmine.speech.v1.RecognizeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.RecognizeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ir.deepmine.speech.v1.RecognizeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.RecognizeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ir.deepmine.speech.v1.RecognizeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.RecognizeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ir.deepmine.speech.v1.RecognizeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.RecognizeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ir.deepmine.speech.v1.RecognizeResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ir.deepmine.speech.v1.RecognizeResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The only message returned to the client by the `Recognize` and `StreamingRecognize` methods.
   * It contains the result as zero or more sequential `SpeechRecognitionResult` messages.
   * </pre>
   *
   * Protobuf type {@code deepmine.speech.v1.RecognizeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:deepmine.speech.v1.RecognizeResponse)
      ir.deepmine.speech.v1.RecognizeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_RecognizeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_RecognizeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ir.deepmine.speech.v1.RecognizeResponse.class, ir.deepmine.speech.v1.RecognizeResponse.Builder.class);
    }

    // Construct using ir.deepmine.speech.v1.RecognizeResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getResultsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      errorMessage_ = "";

      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_RecognizeResponse_descriptor;
    }

    @java.lang.Override
    public ir.deepmine.speech.v1.RecognizeResponse getDefaultInstanceForType() {
      return ir.deepmine.speech.v1.RecognizeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ir.deepmine.speech.v1.RecognizeResponse build() {
      ir.deepmine.speech.v1.RecognizeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ir.deepmine.speech.v1.RecognizeResponse buildPartial() {
      ir.deepmine.speech.v1.RecognizeResponse result = new ir.deepmine.speech.v1.RecognizeResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.errorMessage_ = errorMessage_;
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ir.deepmine.speech.v1.RecognizeResponse) {
        return mergeFrom((ir.deepmine.speech.v1.RecognizeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ir.deepmine.speech.v1.RecognizeResponse other) {
      if (other == ir.deepmine.speech.v1.RecognizeResponse.getDefaultInstance()) return this;
      if (!other.getErrorMessage().isEmpty()) {
        errorMessage_ = other.errorMessage_;
        onChanged();
      }
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000002);
            resultsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResultsFieldBuilder() : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ir.deepmine.speech.v1.RecognizeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ir.deepmine.speech.v1.RecognizeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object errorMessage_ = "";
    /**
     * <pre>
     * Output only. If set, returns a message that specifies the error for the operation.
     * </pre>
     *
     * <code>string error_message = 1;</code>
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. If set, returns a message that specifies the error for the operation.
     * </pre>
     *
     * <code>string error_message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. If set, returns a message that specifies the error for the operation.
     * </pre>
     *
     * <code>string error_message = 1;</code>
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. If set, returns a message that specifies the error for the operation.
     * </pre>
     *
     * <code>string error_message = 1;</code>
     */
    public Builder clearErrorMessage() {
      
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. If set, returns a message that specifies the error for the operation.
     * </pre>
     *
     * <code>string error_message = 1;</code>
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorMessage_ = value;
      onChanged();
      return this;
    }

    private java.util.List<ir.deepmine.speech.v1.SpeechRecognitionResult> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        results_ = new java.util.ArrayList<ir.deepmine.speech.v1.SpeechRecognitionResult>(results_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ir.deepmine.speech.v1.SpeechRecognitionResult, ir.deepmine.speech.v1.SpeechRecognitionResult.Builder, ir.deepmine.speech.v1.SpeechRecognitionResultOrBuilder> resultsBuilder_;

    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public java.util.List<ir.deepmine.speech.v1.SpeechRecognitionResult> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public ir.deepmine.speech.v1.SpeechRecognitionResult getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder setResults(
        int index, ir.deepmine.speech.v1.SpeechRecognitionResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder setResults(
        int index, ir.deepmine.speech.v1.SpeechRecognitionResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder addResults(ir.deepmine.speech.v1.SpeechRecognitionResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder addResults(
        int index, ir.deepmine.speech.v1.SpeechRecognitionResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder addResults(
        ir.deepmine.speech.v1.SpeechRecognitionResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder addResults(
        int index, ir.deepmine.speech.v1.SpeechRecognitionResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends ir.deepmine.speech.v1.SpeechRecognitionResult> values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public ir.deepmine.speech.v1.SpeechRecognitionResult.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public ir.deepmine.speech.v1.SpeechRecognitionResultOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public java.util.List<? extends ir.deepmine.speech.v1.SpeechRecognitionResultOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public ir.deepmine.speech.v1.SpeechRecognitionResult.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          ir.deepmine.speech.v1.SpeechRecognitionResult.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public ir.deepmine.speech.v1.SpeechRecognitionResult.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, ir.deepmine.speech.v1.SpeechRecognitionResult.getDefaultInstance());
    }
    /**
     * <pre>
     * Output only. Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .deepmine.speech.v1.SpeechRecognitionResult results = 2;</code>
     */
    public java.util.List<ir.deepmine.speech.v1.SpeechRecognitionResult.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ir.deepmine.speech.v1.SpeechRecognitionResult, ir.deepmine.speech.v1.SpeechRecognitionResult.Builder, ir.deepmine.speech.v1.SpeechRecognitionResultOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ir.deepmine.speech.v1.SpeechRecognitionResult, ir.deepmine.speech.v1.SpeechRecognitionResult.Builder, ir.deepmine.speech.v1.SpeechRecognitionResultOrBuilder>(
                results_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:deepmine.speech.v1.RecognizeResponse)
  }

  // @@protoc_insertion_point(class_scope:deepmine.speech.v1.RecognizeResponse)
  private static final ir.deepmine.speech.v1.RecognizeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ir.deepmine.speech.v1.RecognizeResponse();
  }

  public static ir.deepmine.speech.v1.RecognizeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecognizeResponse>
      PARSER = new com.google.protobuf.AbstractParser<RecognizeResponse>() {
    @java.lang.Override
    public RecognizeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecognizeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecognizeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecognizeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ir.deepmine.speech.v1.RecognizeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
