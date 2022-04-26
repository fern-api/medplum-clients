package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link CommunicationRequest_Payload}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCommunicationRequest_Payload.builder()}.
 */
@Generated(from = "CommunicationRequest_Payload", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCommunicationRequest_Payload
    implements CommunicationRequest_Payload {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Attachment contentAttachment;
  private final @Nullable String id;
  private final @Nullable Reference contentReference;
  private final @Nullable List<Extension> extension;
  private final @Nullable String contentString;

  private ImmutableCommunicationRequest_Payload(
      @Nullable List<Extension> modifierExtension,
      @Nullable Attachment contentAttachment,
      @Nullable String id,
      @Nullable Reference contentReference,
      @Nullable List<Extension> extension,
      @Nullable String contentString) {
    this.modifierExtension = modifierExtension;
    this.contentAttachment = contentAttachment;
    this.id = id;
    this.contentReference = contentReference;
    this.extension = extension;
    this.contentString = contentString;
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code contentAttachment} attribute
   */
  @JsonProperty("contentAttachment")
  @Override
  public Optional<Attachment> contentAttachment() {
    return Optional.ofNullable(contentAttachment);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code contentReference} attribute
   */
  @JsonProperty("contentReference")
  @Override
  public Optional<Reference> contentReference() {
    return Optional.ofNullable(contentReference);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code contentString} attribute
   */
  @JsonProperty("contentString")
  @Override
  public Optional<String> contentString() {
    return Optional.ofNullable(contentString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest_Payload#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest_Payload withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCommunicationRequest_Payload(
        newValue,
        this.contentAttachment,
        this.id,
        this.contentReference,
        this.extension,
        this.contentString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest_Payload#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest_Payload withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCommunicationRequest_Payload(
        value,
        this.contentAttachment,
        this.id,
        this.contentReference,
        this.extension,
        this.contentString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest_Payload#contentAttachment() contentAttachment} attribute.
   * @param value The value for contentAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest_Payload withContentAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "contentAttachment");
    if (this.contentAttachment == newValue) return this;
    return new ImmutableCommunicationRequest_Payload(
        this.modifierExtension,
        newValue,
        this.id,
        this.contentReference,
        this.extension,
        this.contentString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest_Payload#contentAttachment() contentAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest_Payload withContentAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.contentAttachment == value) return this;
    return new ImmutableCommunicationRequest_Payload(
        this.modifierExtension,
        value,
        this.id,
        this.contentReference,
        this.extension,
        this.contentString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest_Payload#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest_Payload withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCommunicationRequest_Payload(
        this.modifierExtension,
        this.contentAttachment,
        newValue,
        this.contentReference,
        this.extension,
        this.contentString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest_Payload#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest_Payload withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCommunicationRequest_Payload(
        this.modifierExtension,
        this.contentAttachment,
        value,
        this.contentReference,
        this.extension,
        this.contentString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest_Payload#contentReference() contentReference} attribute.
   * @param value The value for contentReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest_Payload withContentReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "contentReference");
    if (this.contentReference == newValue) return this;
    return new ImmutableCommunicationRequest_Payload(
        this.modifierExtension,
        this.contentAttachment,
        this.id,
        newValue,
        this.extension,
        this.contentString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest_Payload#contentReference() contentReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest_Payload withContentReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.contentReference == value) return this;
    return new ImmutableCommunicationRequest_Payload(
        this.modifierExtension,
        this.contentAttachment,
        this.id,
        value,
        this.extension,
        this.contentString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest_Payload#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest_Payload withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCommunicationRequest_Payload(
        this.modifierExtension,
        this.contentAttachment,
        this.id,
        this.contentReference,
        newValue,
        this.contentString);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest_Payload#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest_Payload withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCommunicationRequest_Payload(
        this.modifierExtension,
        this.contentAttachment,
        this.id,
        this.contentReference,
        value,
        this.contentString);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest_Payload#contentString() contentString} attribute.
   * @param value The value for contentString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest_Payload withContentString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "contentString");
    if (Objects.equals(this.contentString, newValue)) return this;
    return new ImmutableCommunicationRequest_Payload(
        this.modifierExtension,
        this.contentAttachment,
        this.id,
        this.contentReference,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest_Payload#contentString() contentString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest_Payload withContentString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.contentString, value)) return this;
    return new ImmutableCommunicationRequest_Payload(
        this.modifierExtension,
        this.contentAttachment,
        this.id,
        this.contentReference,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCommunicationRequest_Payload} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCommunicationRequest_Payload
        && equalTo((ImmutableCommunicationRequest_Payload) another);
  }

  private boolean equalTo(ImmutableCommunicationRequest_Payload another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(contentAttachment, another.contentAttachment)
        && Objects.equals(id, another.id)
        && Objects.equals(contentReference, another.contentReference)
        && Objects.equals(extension, another.extension)
        && Objects.equals(contentString, another.contentString);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code contentAttachment}, {@code id}, {@code contentReference}, {@code extension}, {@code contentString}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(contentAttachment);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(contentReference);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(contentString);
    return h;
  }

  /**
   * Prints the immutable value {@code CommunicationRequest_Payload} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CommunicationRequest_Payload{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contentAttachment != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("contentAttachment=").append(contentAttachment);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contentReference != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("contentReference=").append(contentReference);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (contentString != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("contentString=").append(contentString);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CommunicationRequest_Payload", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CommunicationRequest_Payload {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Attachment> contentAttachment = Optional.empty();
    boolean contentAttachmentIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> contentReference = Optional.empty();
    boolean contentReferenceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> contentString = Optional.empty();
    boolean contentStringIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("contentAttachment")
    public void setContentAttachment(Optional<Attachment> contentAttachment) {
      this.contentAttachment = contentAttachment;
      this.contentAttachmentIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("contentReference")
    public void setContentReference(Optional<Reference> contentReference) {
      this.contentReference = contentReference;
      this.contentReferenceIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("contentString")
    public void setContentString(Optional<String> contentString) {
      this.contentString = contentString;
      this.contentStringIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> contentAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> contentReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> contentString() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCommunicationRequest_Payload fromJson(Json json) {
    ImmutableCommunicationRequest_Payload.Builder builder = ImmutableCommunicationRequest_Payload.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.contentAttachmentIsSet) {
      builder.contentAttachment(json.contentAttachment);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.contentReferenceIsSet) {
      builder.contentReference(json.contentReference);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.contentStringIsSet) {
      builder.contentString(json.contentString);
    }
    return (ImmutableCommunicationRequest_Payload) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CommunicationRequest_Payload} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CommunicationRequest_Payload instance
   */
  public static CommunicationRequest_Payload copyOf(CommunicationRequest_Payload instance) {
    if (instance instanceof ImmutableCommunicationRequest_Payload) {
      return (ImmutableCommunicationRequest_Payload) instance;
    }
    return ImmutableCommunicationRequest_Payload.builder()
        .modifierExtension(instance.modifierExtension())
        .contentAttachment(instance.contentAttachment())
        .id(instance.id())
        .contentReference(instance.contentReference())
        .extension(instance.extension())
        .contentString(instance.contentString())
        .build();
  }

  /**
   * Creates a builder for {@link CommunicationRequest_Payload CommunicationRequest_Payload}.
   * <pre>
   * ImmutableCommunicationRequest_Payload.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CommunicationRequest_Payload#modifierExtension() modifierExtension}
   *    .contentAttachment(com.medplum.types.fhir.Attachment) // optional {@link CommunicationRequest_Payload#contentAttachment() contentAttachment}
   *    .id(String) // optional {@link CommunicationRequest_Payload#id() id}
   *    .contentReference(com.medplum.types.fhir.Reference) // optional {@link CommunicationRequest_Payload#contentReference() contentReference}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CommunicationRequest_Payload#extension() extension}
   *    .contentString(String) // optional {@link CommunicationRequest_Payload#contentString() contentString}
   *    .build();
   * </pre>
   * @return A new CommunicationRequest_Payload builder
   */
  public static ImmutableCommunicationRequest_Payload.Builder builder() {
    return new ImmutableCommunicationRequest_Payload.Builder();
  }

  /**
   * Builds instances of type {@link CommunicationRequest_Payload CommunicationRequest_Payload}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CommunicationRequest_Payload", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_CONTENT_ATTACHMENT = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_CONTENT_REFERENCE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_CONTENT_STRING = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Attachment contentAttachment;
    private @Nullable String id;
    private @Nullable Reference contentReference;
    private @Nullable List<Extension> extension;
    private @Nullable String contentString;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CommunicationRequest_Payload#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest_Payload#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest_Payload#contentAttachment() contentAttachment} to contentAttachment.
     * @param contentAttachment The value for contentAttachment
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentAttachment(Attachment contentAttachment) {
      checkNotIsSet(contentAttachmentIsSet(), "contentAttachment");
      this.contentAttachment = Objects.requireNonNull(contentAttachment, "contentAttachment");
      optBits |= OPT_BIT_CONTENT_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest_Payload#contentAttachment() contentAttachment} to contentAttachment.
     * @param contentAttachment The value for contentAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contentAttachment")
    public final Builder contentAttachment(Optional<? extends Attachment> contentAttachment) {
      checkNotIsSet(contentAttachmentIsSet(), "contentAttachment");
      this.contentAttachment = contentAttachment.orElse(null);
      optBits |= OPT_BIT_CONTENT_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest_Payload#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest_Payload#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest_Payload#contentReference() contentReference} to contentReference.
     * @param contentReference The value for contentReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentReference(Reference contentReference) {
      checkNotIsSet(contentReferenceIsSet(), "contentReference");
      this.contentReference = Objects.requireNonNull(contentReference, "contentReference");
      optBits |= OPT_BIT_CONTENT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest_Payload#contentReference() contentReference} to contentReference.
     * @param contentReference The value for contentReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contentReference")
    public final Builder contentReference(Optional<? extends Reference> contentReference) {
      checkNotIsSet(contentReferenceIsSet(), "contentReference");
      this.contentReference = contentReference.orElse(null);
      optBits |= OPT_BIT_CONTENT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest_Payload#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest_Payload#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest_Payload#contentString() contentString} to contentString.
     * @param contentString The value for contentString
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentString(String contentString) {
      checkNotIsSet(contentStringIsSet(), "contentString");
      this.contentString = Objects.requireNonNull(contentString, "contentString");
      optBits |= OPT_BIT_CONTENT_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest_Payload#contentString() contentString} to contentString.
     * @param contentString The value for contentString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contentString")
    public final Builder contentString(Optional<String> contentString) {
      checkNotIsSet(contentStringIsSet(), "contentString");
      this.contentString = contentString.orElse(null);
      optBits |= OPT_BIT_CONTENT_STRING;
      return this;
    }

    /**
     * Builds a new {@link CommunicationRequest_Payload CommunicationRequest_Payload}.
     * @return An immutable instance of CommunicationRequest_Payload
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CommunicationRequest_Payload build() {
      return new ImmutableCommunicationRequest_Payload(modifierExtension, contentAttachment, id, contentReference, extension, contentString);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean contentAttachmentIsSet() {
      return (optBits & OPT_BIT_CONTENT_ATTACHMENT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean contentReferenceIsSet() {
      return (optBits & OPT_BIT_CONTENT_REFERENCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean contentStringIsSet() {
      return (optBits & OPT_BIT_CONTENT_STRING) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CommunicationRequest_Payload is strict, attribute is already set: ".concat(name));
    }
  }
}