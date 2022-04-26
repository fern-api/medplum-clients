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
 * Immutable implementation of {@link Contract_Friendly}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract_Friendly.builder()}.
 */
@Generated(from = "Contract_Friendly", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract_Friendly implements Contract_Friendly {
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference contentReference;
  private final @Nullable Attachment contentAttachment;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;

  private ImmutableContract_Friendly(
      @Nullable List<Extension> extension,
      @Nullable Reference contentReference,
      @Nullable Attachment contentAttachment,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id) {
    this.extension = extension;
    this.contentReference = contentReference;
    this.contentAttachment = contentAttachment;
    this.modifierExtension = modifierExtension;
    this.id = id;
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
   * @return The value of the {@code contentReference} attribute
   */
  @JsonProperty("contentReference")
  @Override
  public Optional<Reference> contentReference() {
    return Optional.ofNullable(contentReference);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Friendly#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Friendly withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract_Friendly(newValue, this.contentReference, this.contentAttachment, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Friendly#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Friendly withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract_Friendly(value, this.contentReference, this.contentAttachment, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Friendly#contentReference() contentReference} attribute.
   * @param value The value for contentReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Friendly withContentReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "contentReference");
    if (this.contentReference == newValue) return this;
    return new ImmutableContract_Friendly(this.extension, newValue, this.contentAttachment, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Friendly#contentReference() contentReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Friendly withContentReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.contentReference == value) return this;
    return new ImmutableContract_Friendly(this.extension, value, this.contentAttachment, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Friendly#contentAttachment() contentAttachment} attribute.
   * @param value The value for contentAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Friendly withContentAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "contentAttachment");
    if (this.contentAttachment == newValue) return this;
    return new ImmutableContract_Friendly(this.extension, this.contentReference, newValue, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Friendly#contentAttachment() contentAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Friendly withContentAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.contentAttachment == value) return this;
    return new ImmutableContract_Friendly(this.extension, this.contentReference, value, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Friendly#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Friendly withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract_Friendly(this.extension, this.contentReference, this.contentAttachment, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Friendly#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Friendly withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract_Friendly(this.extension, this.contentReference, this.contentAttachment, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Friendly#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Friendly withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableContract_Friendly(this.extension, this.contentReference, this.contentAttachment, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Friendly#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Friendly withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableContract_Friendly(this.extension, this.contentReference, this.contentAttachment, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract_Friendly} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract_Friendly
        && equalTo((ImmutableContract_Friendly) another);
  }

  private boolean equalTo(ImmutableContract_Friendly another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(contentReference, another.contentReference)
        && Objects.equals(contentAttachment, another.contentAttachment)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code contentReference}, {@code contentAttachment}, {@code modifierExtension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(contentReference);
    h += (h << 5) + Objects.hashCode(contentAttachment);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Contract_Friendly} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Contract_Friendly{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (contentReference != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("contentReference=").append(contentReference);
    }
    if (contentAttachment != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("contentAttachment=").append(contentAttachment);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Contract_Friendly", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Contract_Friendly {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> contentReference = Optional.empty();
    boolean contentReferenceIsSet;
    @Nullable Optional<Attachment> contentAttachment = Optional.empty();
    boolean contentAttachmentIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("contentReference")
    public void setContentReference(Optional<Reference> contentReference) {
      this.contentReference = contentReference;
      this.contentReferenceIsSet = true;
    }
    @JsonProperty("contentAttachment")
    public void setContentAttachment(Optional<Attachment> contentAttachment) {
      this.contentAttachment = contentAttachment;
      this.contentAttachmentIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> contentReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> contentAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableContract_Friendly fromJson(Json json) {
    ImmutableContract_Friendly.Builder builder = ImmutableContract_Friendly.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.contentReferenceIsSet) {
      builder.contentReference(json.contentReference);
    }
    if (json.contentAttachmentIsSet) {
      builder.contentAttachment(json.contentAttachment);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableContract_Friendly) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Contract_Friendly} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Contract_Friendly instance
   */
  public static Contract_Friendly copyOf(Contract_Friendly instance) {
    if (instance instanceof ImmutableContract_Friendly) {
      return (ImmutableContract_Friendly) instance;
    }
    return ImmutableContract_Friendly.builder()
        .extension(instance.extension())
        .contentReference(instance.contentReference())
        .contentAttachment(instance.contentAttachment())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Contract_Friendly Contract_Friendly}.
   * <pre>
   * ImmutableContract_Friendly.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Contract_Friendly#extension() extension}
   *    .contentReference(com.fhir.types.fhir.Reference) // optional {@link Contract_Friendly#contentReference() contentReference}
   *    .contentAttachment(com.fhir.types.fhir.Attachment) // optional {@link Contract_Friendly#contentAttachment() contentAttachment}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Contract_Friendly#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link Contract_Friendly#id() id}
   *    .build();
   * </pre>
   * @return A new Contract_Friendly builder
   */
  public static ImmutableContract_Friendly.Builder builder() {
    return new ImmutableContract_Friendly.Builder();
  }

  /**
   * Builds instances of type {@link Contract_Friendly Contract_Friendly}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Contract_Friendly", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_CONTENT_REFERENCE = 0x2L;
    private static final long OPT_BIT_CONTENT_ATTACHMENT = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Reference contentReference;
    private @Nullable Attachment contentAttachment;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Contract_Friendly#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Friendly#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Friendly#contentReference() contentReference} to contentReference.
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
     * Initializes the optional value {@link Contract_Friendly#contentReference() contentReference} to contentReference.
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
     * Initializes the optional value {@link Contract_Friendly#contentAttachment() contentAttachment} to contentAttachment.
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
     * Initializes the optional value {@link Contract_Friendly#contentAttachment() contentAttachment} to contentAttachment.
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
     * Initializes the optional value {@link Contract_Friendly#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Friendly#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Friendly#id() id} to id.
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
     * Initializes the optional value {@link Contract_Friendly#id() id} to id.
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
     * Builds a new {@link Contract_Friendly Contract_Friendly}.
     * @return An immutable instance of Contract_Friendly
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Contract_Friendly build() {
      return new ImmutableContract_Friendly(extension, contentReference, contentAttachment, modifierExtension, id);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean contentReferenceIsSet() {
      return (optBits & OPT_BIT_CONTENT_REFERENCE) != 0;
    }

    private boolean contentAttachmentIsSet() {
      return (optBits & OPT_BIT_CONTENT_ATTACHMENT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Contract_Friendly is strict, attribute is already set: ".concat(name));
    }
  }
}
