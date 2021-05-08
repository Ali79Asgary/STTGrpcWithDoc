// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: deepmine/speech/v1/speech.proto

package ir.deepmine.speech.v1;

/**
 * <pre>
 * Provides information to the recognizer that specifies how to process the request.
 * </pre>
 *
 * Protobuf type {@code deepmine.speech.v1.StreamingRecognitionConfig}
 */
public  final class StreamingRecognitionConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:deepmine.speech.v1.StreamingRecognitionConfig)
    StreamingRecognitionConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamingRecognitionConfig.newBuilder() to construct.
  private StreamingRecognitionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamingRecognitionConfig() {
    accessToken_ = "";
    singleUtterance_ = false;
    interimResults_ = false;
    interimResultsIntervalMilliseconds_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StreamingRecognitionConfig(
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
            ir.deepmine.speech.v1.RecognitionConfig.Builder subBuilder = null;
            if (config_ != null) {
              subBuilder = config_.toBuilder();
            }
            config_ = input.readMessage(ir.deepmine.speech.v1.RecognitionConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(config_);
              config_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            accessToken_ = s;
            break;
          }
          case 24: {

            singleUtterance_ = input.readBool();
            break;
          }
          case 32: {

            interimResults_ = input.readBool();
            break;
          }
          case 40: {

            interimResultsIntervalMilliseconds_ = input.readInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_StreamingRecognitionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_StreamingRecognitionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ir.deepmine.speech.v1.StreamingRecognitionConfig.class, ir.deepmine.speech.v1.StreamingRecognitionConfig.Builder.class);
  }

  public static final int CONFIG_FIELD_NUMBER = 1;
  private ir.deepmine.speech.v1.RecognitionConfig config_;
  /**
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
   */
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
   */
  public ir.deepmine.speech.v1.RecognitionConfig getConfig() {
    return config_ == null ? ir.deepmine.speech.v1.RecognitionConfig.getDefaultInstance() : config_;
  }
  /**
   * <pre>
   * *Required* Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
   */
  public ir.deepmine.speech.v1.RecognitionConfigOrBuilder getConfigOrBuilder() {
    return getConfig();
  }

  public static final int ACCESS_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object accessToken_;
  /**
   * <pre>
   * *Required* The access token for authentication.
   * </pre>
   *
   * <code>string access_token = 2;</code>
   */
  public java.lang.String getAccessToken() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * *Required* The access token for authentication.
   * </pre>
   *
   * <code>string access_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAccessTokenBytes() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      accessToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SINGLE_UTTERANCE_FIELD_NUMBER = 3;
  private boolean singleUtterance_;
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
  public boolean getSingleUtterance() {
    return singleUtterance_;
  }

  public static final int INTERIM_RESULTS_FIELD_NUMBER = 4;
  private boolean interimResults_;
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
  public boolean getInterimResults() {
    return interimResults_;
  }

  public static final int INTERIM_RESULTS_INTERVAL_MILLISECONDS_FIELD_NUMBER = 5;
  private int interimResultsIntervalMilliseconds_;
  /**
   * <pre>
   * *Optional* If `interim_results` was true, then the interim results will
   * returned in `interim_results_interval_milliseconds` intervals in milliseconds.
   * The minimum and default value for this parameter is `500 ms`.
   * </pre>
   *
   * <code>int32 interim_results_interval_milliseconds = 5;</code>
   */
  public int getInterimResultsIntervalMilliseconds() {
    return interimResultsIntervalMilliseconds_;
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
    if (config_ != null) {
      output.writeMessage(1, getConfig());
    }
    if (!getAccessTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, accessToken_);
    }
    if (singleUtterance_ != false) {
      output.writeBool(3, singleUtterance_);
    }
    if (interimResults_ != false) {
      output.writeBool(4, interimResults_);
    }
    if (interimResultsIntervalMilliseconds_ != 0) {
      output.writeInt32(5, interimResultsIntervalMilliseconds_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConfig());
    }
    if (!getAccessTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, accessToken_);
    }
    if (singleUtterance_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, singleUtterance_);
    }
    if (interimResults_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, interimResults_);
    }
    if (interimResultsIntervalMilliseconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, interimResultsIntervalMilliseconds_);
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
    if (!(obj instanceof ir.deepmine.speech.v1.StreamingRecognitionConfig)) {
      return super.equals(obj);
    }
    ir.deepmine.speech.v1.StreamingRecognitionConfig other = (ir.deepmine.speech.v1.StreamingRecognitionConfig) obj;

    boolean result = true;
    result = result && (hasConfig() == other.hasConfig());
    if (hasConfig()) {
      result = result && getConfig()
          .equals(other.getConfig());
    }
    result = result && getAccessToken()
        .equals(other.getAccessToken());
    result = result && (getSingleUtterance()
        == other.getSingleUtterance());
    result = result && (getInterimResults()
        == other.getInterimResults());
    result = result && (getInterimResultsIntervalMilliseconds()
        == other.getInterimResultsIntervalMilliseconds());
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
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    hash = (37 * hash) + ACCESS_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAccessToken().hashCode();
    hash = (37 * hash) + SINGLE_UTTERANCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSingleUtterance());
    hash = (37 * hash) + INTERIM_RESULTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getInterimResults());
    hash = (37 * hash) + INTERIM_RESULTS_INTERVAL_MILLISECONDS_FIELD_NUMBER;
    hash = (53 * hash) + getInterimResultsIntervalMilliseconds();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ir.deepmine.speech.v1.StreamingRecognitionConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ir.deepmine.speech.v1.StreamingRecognitionConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.StreamingRecognitionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ir.deepmine.speech.v1.StreamingRecognitionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.StreamingRecognitionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ir.deepmine.speech.v1.StreamingRecognitionConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.StreamingRecognitionConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ir.deepmine.speech.v1.StreamingRecognitionConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.StreamingRecognitionConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ir.deepmine.speech.v1.StreamingRecognitionConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.StreamingRecognitionConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ir.deepmine.speech.v1.StreamingRecognitionConfig parseFrom(
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
  public static Builder newBuilder(ir.deepmine.speech.v1.StreamingRecognitionConfig prototype) {
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
   * Provides information to the recognizer that specifies how to process the request.
   * </pre>
   *
   * Protobuf type {@code deepmine.speech.v1.StreamingRecognitionConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:deepmine.speech.v1.StreamingRecognitionConfig)
      ir.deepmine.speech.v1.StreamingRecognitionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_StreamingRecognitionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_StreamingRecognitionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ir.deepmine.speech.v1.StreamingRecognitionConfig.class, ir.deepmine.speech.v1.StreamingRecognitionConfig.Builder.class);
    }

    // Construct using ir.deepmine.speech.v1.StreamingRecognitionConfig.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (configBuilder_ == null) {
        config_ = null;
      } else {
        config_ = null;
        configBuilder_ = null;
      }
      accessToken_ = "";

      singleUtterance_ = false;

      interimResults_ = false;

      interimResultsIntervalMilliseconds_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_StreamingRecognitionConfig_descriptor;
    }

    @java.lang.Override
    public ir.deepmine.speech.v1.StreamingRecognitionConfig getDefaultInstanceForType() {
      return ir.deepmine.speech.v1.StreamingRecognitionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public ir.deepmine.speech.v1.StreamingRecognitionConfig build() {
      ir.deepmine.speech.v1.StreamingRecognitionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ir.deepmine.speech.v1.StreamingRecognitionConfig buildPartial() {
      ir.deepmine.speech.v1.StreamingRecognitionConfig result = new ir.deepmine.speech.v1.StreamingRecognitionConfig(this);
      if (configBuilder_ == null) {
        result.config_ = config_;
      } else {
        result.config_ = configBuilder_.build();
      }
      result.accessToken_ = accessToken_;
      result.singleUtterance_ = singleUtterance_;
      result.interimResults_ = interimResults_;
      result.interimResultsIntervalMilliseconds_ = interimResultsIntervalMilliseconds_;
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
      if (other instanceof ir.deepmine.speech.v1.StreamingRecognitionConfig) {
        return mergeFrom((ir.deepmine.speech.v1.StreamingRecognitionConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ir.deepmine.speech.v1.StreamingRecognitionConfig other) {
      if (other == ir.deepmine.speech.v1.StreamingRecognitionConfig.getDefaultInstance()) return this;
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
      }
      if (!other.getAccessToken().isEmpty()) {
        accessToken_ = other.accessToken_;
        onChanged();
      }
      if (other.getSingleUtterance() != false) {
        setSingleUtterance(other.getSingleUtterance());
      }
      if (other.getInterimResults() != false) {
        setInterimResults(other.getInterimResults());
      }
      if (other.getInterimResultsIntervalMilliseconds() != 0) {
        setInterimResultsIntervalMilliseconds(other.getInterimResultsIntervalMilliseconds());
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
      ir.deepmine.speech.v1.StreamingRecognitionConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ir.deepmine.speech.v1.StreamingRecognitionConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ir.deepmine.speech.v1.RecognitionConfig config_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        ir.deepmine.speech.v1.RecognitionConfig, ir.deepmine.speech.v1.RecognitionConfig.Builder, ir.deepmine.speech.v1.RecognitionConfigOrBuilder> configBuilder_;
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
     */
    public boolean hasConfig() {
      return configBuilder_ != null || config_ != null;
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
     */
    public ir.deepmine.speech.v1.RecognitionConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null ? ir.deepmine.speech.v1.RecognitionConfig.getDefaultInstance() : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
     */
    public Builder setConfig(ir.deepmine.speech.v1.RecognitionConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
     */
    public Builder setConfig(
        ir.deepmine.speech.v1.RecognitionConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
     */
    public Builder mergeConfig(ir.deepmine.speech.v1.RecognitionConfig value) {
      if (configBuilder_ == null) {
        if (config_ != null) {
          config_ =
            ir.deepmine.speech.v1.RecognitionConfig.newBuilder(config_).mergeFrom(value).buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        configBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        config_ = null;
        onChanged();
      } else {
        config_ = null;
        configBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
     */
    public ir.deepmine.speech.v1.RecognitionConfig.Builder getConfigBuilder() {
      
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
     */
    public ir.deepmine.speech.v1.RecognitionConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null ?
            ir.deepmine.speech.v1.RecognitionConfig.getDefaultInstance() : config_;
      }
    }
    /**
     * <pre>
     * *Required* Provides information to the recognizer that specifies how to
     * process the request.
     * </pre>
     *
     * <code>.deepmine.speech.v1.RecognitionConfig config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ir.deepmine.speech.v1.RecognitionConfig, ir.deepmine.speech.v1.RecognitionConfig.Builder, ir.deepmine.speech.v1.RecognitionConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ir.deepmine.speech.v1.RecognitionConfig, ir.deepmine.speech.v1.RecognitionConfig.Builder, ir.deepmine.speech.v1.RecognitionConfigOrBuilder>(
                getConfig(),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
    }

    private java.lang.Object accessToken_ = "";
    /**
     * <pre>
     * *Required* The access token for authentication.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     */
    public java.lang.String getAccessToken() {
      java.lang.Object ref = accessToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * *Required* The access token for authentication.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAccessTokenBytes() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        accessToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * *Required* The access token for authentication.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     */
    public Builder setAccessToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      accessToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Required* The access token for authentication.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     */
    public Builder clearAccessToken() {
      
      accessToken_ = getDefaultInstance().getAccessToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Required* The access token for authentication.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     */
    public Builder setAccessTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      accessToken_ = value;
      onChanged();
      return this;
    }

    private boolean singleUtterance_ ;
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
    public boolean getSingleUtterance() {
      return singleUtterance_;
    }
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
    public Builder setSingleUtterance(boolean value) {
      
      singleUtterance_ = value;
      onChanged();
      return this;
    }
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
    public Builder clearSingleUtterance() {
      
      singleUtterance_ = false;
      onChanged();
      return this;
    }

    private boolean interimResults_ ;
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
    public boolean getInterimResults() {
      return interimResults_;
    }
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
    public Builder setInterimResults(boolean value) {
      
      interimResults_ = value;
      onChanged();
      return this;
    }
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
    public Builder clearInterimResults() {
      
      interimResults_ = false;
      onChanged();
      return this;
    }

    private int interimResultsIntervalMilliseconds_ ;
    /**
     * <pre>
     * *Optional* If `interim_results` was true, then the interim results will
     * returned in `interim_results_interval_milliseconds` intervals in milliseconds.
     * The minimum and default value for this parameter is `500 ms`.
     * </pre>
     *
     * <code>int32 interim_results_interval_milliseconds = 5;</code>
     */
    public int getInterimResultsIntervalMilliseconds() {
      return interimResultsIntervalMilliseconds_;
    }
    /**
     * <pre>
     * *Optional* If `interim_results` was true, then the interim results will
     * returned in `interim_results_interval_milliseconds` intervals in milliseconds.
     * The minimum and default value for this parameter is `500 ms`.
     * </pre>
     *
     * <code>int32 interim_results_interval_milliseconds = 5;</code>
     */
    public Builder setInterimResultsIntervalMilliseconds(int value) {
      
      interimResultsIntervalMilliseconds_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * *Optional* If `interim_results` was true, then the interim results will
     * returned in `interim_results_interval_milliseconds` intervals in milliseconds.
     * The minimum and default value for this parameter is `500 ms`.
     * </pre>
     *
     * <code>int32 interim_results_interval_milliseconds = 5;</code>
     */
    public Builder clearInterimResultsIntervalMilliseconds() {
      
      interimResultsIntervalMilliseconds_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:deepmine.speech.v1.StreamingRecognitionConfig)
  }

  // @@protoc_insertion_point(class_scope:deepmine.speech.v1.StreamingRecognitionConfig)
  private static final ir.deepmine.speech.v1.StreamingRecognitionConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ir.deepmine.speech.v1.StreamingRecognitionConfig();
  }

  public static ir.deepmine.speech.v1.StreamingRecognitionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamingRecognitionConfig>
      PARSER = new com.google.protobuf.AbstractParser<StreamingRecognitionConfig>() {
    @java.lang.Override
    public StreamingRecognitionConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StreamingRecognitionConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StreamingRecognitionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamingRecognitionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ir.deepmine.speech.v1.StreamingRecognitionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

