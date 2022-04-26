package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Communication_Payload}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCommunication_Payload.builder()}.
 */
@Generated(from = "Communication_Payload", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCommunication_Payload implements Communication_Payload {
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Attachment contentAttachment;
  private final @Nullable String contentString;
  private final @Nullable Reference contentReference;
  private final @Nullable List<Extension> extension;

  private ImmutableCommunication_Payload(
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Attachment contentAttachment,
      @Nullable String contentString,
      @Nullable Reference contentReference,
      @Nullable List<Extension> extension) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.contentAttachment = contentAttachment;
    this.contentString = contentString;
    this.contentReference = contentReference;
    this.extension = extension;
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
   * @return The value of the {@code contentString} attribute
   */
  @JsonProperty("contentString")
  @Override
  public Optional<String> contentString() {
    return Optional.ofNullable(contentString);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication_Payload#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication_Payload withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCommunication_Payload(
        newValue,
        this.modifierExtension,
        this.contentAttachment,
        this.contentString,
        this.contentReference,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication_Payload#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication_Payload withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCommunication_Payload(
        value,
        this.modifierExtension,
        this.contentAttachment,
        this.contentString,
        this.contentReference,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication_Payload#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication_Payload withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCommunication_Payload(
        this.id,
        newValue,
        this.contentAttachment,
        this.contentString,
        this.contentReference,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication_Payload#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication_Payload withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCommunication_Payload(
        this.id,
        value,
        this.contentAttachment,
        this.contentString,
        this.contentReference,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication_Payload#contentAttachment() contentAttachment} attribute.
   * @param value The value for contentAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication_Payload withContentAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "contentAttachment");
    if (this.contentAttachment == newValue) return this;
    return new ImmutableCommunication_Payload(
        this.id,
        this.modifierExtension,
        newValue,
        this.contentString,
        this.contentReference,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication_Payload#contentAttachment() contentAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication_Payload withContentAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.contentAttachment == value) return this;
    return new ImmutableCommunication_Payload(
        this.id,
        this.modifierExtension,
        value,
        this.contentString,
        this.contentReference,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication_Payload#contentString() contentString} attribute.
   * @param value The value for contentString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication_Payload withContentString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "contentString");
    if (Objects.equals(this.contentString, newValue)) return this;
    return new ImmutableCommunication_Payload(
        this.id,
        this.modifierExtension,
        this.contentAttachment,
        newValue,
        this.contentReference,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication_Payload#contentString() contentString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication_Payload withContentString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.contentString, value)) return this;
    return new ImmutableCommunication_Payload(
        this.id,
        this.modifierExtension,
        this.contentAttachment,
        value,
        this.contentReference,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication_Payload#contentReference() contentReference} attribute.
   * @param value The value for contentReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication_Payload withContentReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "contentReference");
    if (this.contentReference == newValue) return this;
    return new ImmutableCommunication_Payload(
        this.id,
        this.modifierExtension,
        this.contentAttachment,
        this.contentString,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication_Payload#contentReference() contentReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication_Payload withContentReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.contentReference == value) return this;
    return new ImmutableCommunication_Payload(
        this.id,
        this.modifierExtension,
        this.contentAttachment,
        this.contentString,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication_Payload#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication_Payload withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCommunication_Payload(
        this.id,
        this.modifierExtension,
        this.contentAttachment,
        this.contentString,
        this.contentReference,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication_Payload#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication_Payload withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCommunication_Payload(
        this.id,
        this.modifierExtension,
        this.contentAttachment,
        this.contentString,
        this.contentReference,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCommunication_Payload} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCommunication_Payload
        && equalTo((ImmutableCommunication_Payload) another);
  }

  private boolean equalTo(ImmutableCommunication_Payload another) {
    return Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(contentAttachment, another.contentAttachment)
        && Objects.equals(contentString, another.contentString)
        && Objects.equals(contentReference, another.contentReference)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code contentAttachment}, {@code contentString}, {@code contentReference}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(contentAttachment);
    h += (h << 5) + Objects.hashCode(contentString);
    h += (h << 5) + Objects.hashCode(contentReference);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Communication_Payload} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Communication_Payload{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contentAttachment != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("contentAttachment=").append(contentAttachment);
    }
    if (contentString != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("contentString=").append(contentString);
    }
    if (contentReference != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("contentReference=").append(contentReference);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Communication_Payload", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Communication_Payload {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Attachment> contentAttachment = Optional.empty();
    boolean contentAttachmentIsSet;
    @Nullable Optional<String> contentString = Optional.empty();
    boolean contentStringIsSet;
    @Nullable Optional<Reference> contentReference = Optional.empty();
    boolean contentReferenceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
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
    @JsonProperty("contentString")
    public void setContentString(Optional<String> contentString) {
      this.contentString = contentString;
      this.contentStringIsSet = true;
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
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> contentAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> contentString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> contentReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCommunication_Payload fromJson(Json json) {
    ImmutableCommunication_Payload.Builder builder = ImmutableCommunication_Payload.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.contentAttachmentIsSet) {
      builder.contentAttachment(json.contentAttachment);
    }
    if (json.contentStringIsSet) {
      builder.contentString(json.contentString);
    }
    if (json.contentReferenceIsSet) {
      builder.contentReference(json.contentReference);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableCommunication_Payload) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Communication_Payload} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Communication_Payload instance
   */
  public static Communication_Payload copyOf(Communication_Payload instance) {
    if (instance instanceof ImmutableCommunication_Payload) {
      return (ImmutableCommunication_Payload) instance;
    }
    return ImmutableCommunication_Payload.builder()
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .contentAttachment(instance.contentAttachment())
        .contentString(instance.contentString())
        .contentReference(instance.contentReference())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Communication_Payload Communication_Payload}.
   * <pre>
   * ImmutableCommunication_Payload.builder()
   *    .id(String) // optional {@link Communication_Payload#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Communication_Payload#modifierExtension() modifierExtension}
   *    .contentAttachment(com.fhir.types.fhir.Attachment) // optional {@link Communication_Payload#contentAttachment() contentAttachment}
   *    .contentString(String) // optional {@link Communication_Payload#contentString() contentString}
   *    .contentReference(com.fhir.types.fhir.Reference) // optional {@link Communication_Payload#contentReference() contentReference}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Communication_Payload#extension() extension}
   *    .build();
   * </pre>
   * @return A new Communication_Payload builder
   */
  public static ImmutableCommunication_Payload.Builder builder() {
    return new ImmutableCommunication_Payload.Builder();
  }

  /**
   * Builds instances of type {@link Communication_Payload Communication_Payload}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Communication_Payload", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_CONTENT_ATTACHMENT = 0x4L;
    private static final long OPT_BIT_CONTENT_STRING = 0x8L;
    private static final long OPT_BIT_CONTENT_REFERENCE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Attachment contentAttachment;
    private @Nullable String contentString;
    private @Nullable Reference contentReference;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Communication_Payload#id() id} to id.
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
     * Initializes the optional value {@link Communication_Payload#id() id} to id.
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
     * Initializes the optional value {@link Communication_Payload#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Communication_Payload#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Communication_Payload#contentAttachment() contentAttachment} to contentAttachment.
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
     * Initializes the optional value {@link Communication_Payload#contentAttachment() contentAttachment} to contentAttachment.
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
     * Initializes the optional value {@link Communication_Payload#contentString() contentString} to contentString.
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
     * Initializes the optional value {@link Communication_Payload#contentString() contentString} to contentString.
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
     * Initializes the optional value {@link Communication_Payload#contentReference() contentReference} to contentReference.
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
     * Initializes the optional value {@link Communication_Payload#contentReference() contentReference} to contentReference.
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
     * Initializes the optional value {@link Communication_Payload#extension() extension} to extension.
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
     * Initializes the optional value {@link Communication_Payload#extension() extension} to extension.
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
     * Builds a new {@link Communication_Payload Communication_Payload}.
     * @return An immutable instance of Communication_Payload
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Communication_Payload build() {
      return new ImmutableCommunication_Payload(id, modifierExtension, contentAttachment, contentString, contentReference, extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean contentAttachmentIsSet() {
      return (optBits & OPT_BIT_CONTENT_ATTACHMENT) != 0;
    }

    private boolean contentStringIsSet() {
      return (optBits & OPT_BIT_CONTENT_STRING) != 0;
    }

    private boolean contentReferenceIsSet() {
      return (optBits & OPT_BIT_CONTENT_REFERENCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Communication_Payload is strict, attribute is already set: ".concat(name));
    }
  }
}
