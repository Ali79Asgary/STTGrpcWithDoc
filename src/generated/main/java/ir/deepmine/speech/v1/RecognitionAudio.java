// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: deepmine/speech/v1/speech.proto

package ir.deepmine.speech.v1;

/**
 * <pre>
 * Contains audio data in the encoding specified in the `RecognitionConfig`.
 * Either `content` or `uri` must be supplied. Supplying both or neither
 * returns an error.
 * </pre>
 *
 * Protobuf type {@code deepmine.speech.v1.RecognitionAudio}
 */
public  final class RecognitionAudio extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:deepmine.speech.v1.RecognitionAudio)
    RecognitionAudioOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecognitionAudio.newBuilder() to construct.
  private RecognitionAudio(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecognitionAudio() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecognitionAudio(
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
            audioSourceCase_ = 1;
            audioSource_ = input.readBytes();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            audioSourceCase_ = 2;
            audioSource_ = s;
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
    return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_RecognitionAudio_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_RecognitionAudio_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ir.deepmine.speech.v1.RecognitionAudio.class, ir.deepmine.speech.v1.RecognitionAudio.Builder.class);
  }

  private int audioSourceCase_ = 0;
  private java.lang.Object audioSource_;
  public enum AudioSourceCase
      implements com.google.protobuf.Internal.EnumLite {
    CONTENT(1),
    URI(2),
    AUDIOSOURCE_NOT_SET(0);
    private final int value;
    private AudioSourceCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AudioSourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static AudioSourceCase forNumber(int value) {
      switch (value) {
        case 1: return CONTENT;
        case 2: return URI;
        case 0: return AUDIOSOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public AudioSourceCase
  getAudioSourceCase() {
    return AudioSourceCase.forNumber(
        audioSourceCase_);
  }

  public static final int CONTENT_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The audio data bytes encoded as specified in
   * `RecognitionConfig`. Note: as with all bytes fields, protobuffers use a
   * pure binary representation, whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   */
  public com.google.protobuf.ByteString getContent() {
    if (audioSourceCase_ == 1) {
      return (com.google.protobuf.ByteString) audioSource_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int URI_FIELD_NUMBER = 2;
  /**
   * <pre>
   * URI that points to a file that contains audio data bytes as specified in
   * `RecognitionConfig`. The file must not be compressed (for example, gzip).
   * </pre>
   *
   * <code>string uri = 2;</code>
   */
  public java.lang.String getUri() {
    java.lang.Object ref = "";
    if (audioSourceCase_ == 2) {
      ref = audioSource_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (audioSourceCase_ == 2) {
        audioSource_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * URI that points to a file that contains audio data bytes as specified in
   * `RecognitionConfig`. The file must not be compressed (for example, gzip).
   * </pre>
   *
   * <code>string uri = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUriBytes() {
    java.lang.Object ref = "";
    if (audioSourceCase_ == 2) {
      ref = audioSource_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (audioSourceCase_ == 2) {
        audioSource_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (audioSourceCase_ == 1) {
      output.writeBytes(
          1, (com.google.protobuf.ByteString) audioSource_);
    }
    if (audioSourceCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, audioSource_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (audioSourceCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            1, (com.google.protobuf.ByteString) audioSource_);
    }
    if (audioSourceCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, audioSource_);
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
    if (!(obj instanceof ir.deepmine.speech.v1.RecognitionAudio)) {
      return super.equals(obj);
    }
    ir.deepmine.speech.v1.RecognitionAudio other = (ir.deepmine.speech.v1.RecognitionAudio) obj;

    boolean result = true;
    result = result && getAudioSourceCase().equals(
        other.getAudioSourceCase());
    if (!result) return false;
    switch (audioSourceCase_) {
      case 1:
        result = result && getContent()
            .equals(other.getContent());
        break;
      case 2:
        result = result && getUri()
            .equals(other.getUri());
        break;
      case 0:
      default:
    }
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
    switch (audioSourceCase_) {
      case 1:
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContent().hashCode();
        break;
      case 2:
        hash = (37 * hash) + URI_FIELD_NUMBER;
        hash = (53 * hash) + getUri().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ir.deepmine.speech.v1.RecognitionAudio parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ir.deepmine.speech.v1.RecognitionAudio parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.RecognitionAudio parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ir.deepmine.speech.v1.RecognitionAudio parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.RecognitionAudio parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ir.deepmine.speech.v1.RecognitionAudio parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.RecognitionAudio parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ir.deepmine.speech.v1.RecognitionAudio parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.RecognitionAudio parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ir.deepmine.speech.v1.RecognitionAudio parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ir.deepmine.speech.v1.RecognitionAudio parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ir.deepmine.speech.v1.RecognitionAudio parseFrom(
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
  public static Builder newBuilder(ir.deepmine.speech.v1.RecognitionAudio prototype) {
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
   * Contains audio data in the encoding specified in the `RecognitionConfig`.
   * Either `content` or `uri` must be supplied. Supplying both or neither
   * returns an error.
   * </pre>
   *
   * Protobuf type {@code deepmine.speech.v1.RecognitionAudio}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:deepmine.speech.v1.RecognitionAudio)
      ir.deepmine.speech.v1.RecognitionAudioOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_RecognitionAudio_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_RecognitionAudio_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ir.deepmine.speech.v1.RecognitionAudio.class, ir.deepmine.speech.v1.RecognitionAudio.Builder.class);
    }

    // Construct using ir.deepmine.speech.v1.RecognitionAudio.newBuilder()
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
      audioSourceCase_ = 0;
      audioSource_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ir.deepmine.speech.v1.SpeechProto.internal_static_deepmine_speech_v1_RecognitionAudio_descriptor;
    }

    @java.lang.Override
    public ir.deepmine.speech.v1.RecognitionAudio getDefaultInstanceForType() {
      return ir.deepmine.speech.v1.RecognitionAudio.getDefaultInstance();
    }

    @java.lang.Override
    public ir.deepmine.speech.v1.RecognitionAudio build() {
      ir.deepmine.speech.v1.RecognitionAudio result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ir.deepmine.speech.v1.RecognitionAudio buildPartial() {
      ir.deepmine.speech.v1.RecognitionAudio result = new ir.deepmine.speech.v1.RecognitionAudio(this);
      if (audioSourceCase_ == 1) {
        result.audioSource_ = audioSource_;
      }
      if (audioSourceCase_ == 2) {
        result.audioSource_ = audioSource_;
      }
      result.audioSourceCase_ = audioSourceCase_;
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
      if (other instanceof ir.deepmine.speech.v1.RecognitionAudio) {
        return mergeFrom((ir.deepmine.speech.v1.RecognitionAudio)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ir.deepmine.speech.v1.RecognitionAudio other) {
      if (other == ir.deepmine.speech.v1.RecognitionAudio.getDefaultInstance()) return this;
      switch (other.getAudioSourceCase()) {
        case CONTENT: {
          setContent(other.getContent());
          break;
        }
        case URI: {
          audioSourceCase_ = 2;
          audioSource_ = other.audioSource_;
          onChanged();
          break;
        }
        case AUDIOSOURCE_NOT_SET: {
          break;
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
      ir.deepmine.speech.v1.RecognitionAudio parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ir.deepmine.speech.v1.RecognitionAudio) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int audioSourceCase_ = 0;
    private java.lang.Object audioSource_;
    public AudioSourceCase
        getAudioSourceCase() {
      return AudioSourceCase.forNumber(
          audioSourceCase_);
    }

    public Builder clearAudioSource() {
      audioSourceCase_ = 0;
      audioSource_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * The audio data bytes encoded as specified in
     * `RecognitionConfig`. Note: as with all bytes fields, protobuffers use a
     * pure binary representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     */
    public com.google.protobuf.ByteString getContent() {
      if (audioSourceCase_ == 1) {
        return (com.google.protobuf.ByteString) audioSource_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * The audio data bytes encoded as specified in
     * `RecognitionConfig`. Note: as with all bytes fields, protobuffers use a
     * pure binary representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     */
    public Builder setContent(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  audioSourceCase_ = 1;
      audioSource_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The audio data bytes encoded as specified in
     * `RecognitionConfig`. Note: as with all bytes fields, protobuffers use a
     * pure binary representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     */
    public Builder clearContent() {
      if (audioSourceCase_ == 1) {
        audioSourceCase_ = 0;
        audioSource_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * URI that points to a file that contains audio data bytes as specified in
     * `RecognitionConfig`. The file must not be compressed (for example, gzip).
     * </pre>
     *
     * <code>string uri = 2;</code>
     */
    public java.lang.String getUri() {
      java.lang.Object ref = "";
      if (audioSourceCase_ == 2) {
        ref = audioSource_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (audioSourceCase_ == 2) {
          audioSource_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URI that points to a file that contains audio data bytes as specified in
     * `RecognitionConfig`. The file must not be compressed (for example, gzip).
     * </pre>
     *
     * <code>string uri = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = "";
      if (audioSourceCase_ == 2) {
        ref = audioSource_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (audioSourceCase_ == 2) {
          audioSource_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URI that points to a file that contains audio data bytes as specified in
     * `RecognitionConfig`. The file must not be compressed (for example, gzip).
     * </pre>
     *
     * <code>string uri = 2;</code>
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  audioSourceCase_ = 2;
      audioSource_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URI that points to a file that contains audio data bytes as specified in
     * `RecognitionConfig`. The file must not be compressed (for example, gzip).
     * </pre>
     *
     * <code>string uri = 2;</code>
     */
    public Builder clearUri() {
      if (audioSourceCase_ == 2) {
        audioSourceCase_ = 0;
        audioSource_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * URI that points to a file that contains audio data bytes as specified in
     * `RecognitionConfig`. The file must not be compressed (for example, gzip).
     * </pre>
     *
     * <code>string uri = 2;</code>
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      audioSourceCase_ = 2;
      audioSource_ = value;
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


    // @@protoc_insertion_point(builder_scope:deepmine.speech.v1.RecognitionAudio)
  }

  // @@protoc_insertion_point(class_scope:deepmine.speech.v1.RecognitionAudio)
  private static final ir.deepmine.speech.v1.RecognitionAudio DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ir.deepmine.speech.v1.RecognitionAudio();
  }

  public static ir.deepmine.speech.v1.RecognitionAudio getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecognitionAudio>
      PARSER = new com.google.protobuf.AbstractParser<RecognitionAudio>() {
    @java.lang.Override
    public RecognitionAudio parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecognitionAudio(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecognitionAudio> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecognitionAudio> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ir.deepmine.speech.v1.RecognitionAudio getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

